<?php
	require_once('authLib.php');//���������� ����������
	if ($_POST['Location']!="Auth"){
		header("Location:authForm.php");
	}	
 	require_once('smarty/Smarty.class.php');
    $smarty = new Smarty();
    $smarty->template_dir = 'templates/';
    $smarty->compile_dir ='smarty/templates_c/';
    $smarty->config_dir = 'smarty/configs/';
    $smarty->cache_dir = 'smarty/cache/';
    //���������� �����
    require_once('header.php');
    $smarty->display('templates/header.tpl');
    //�������� ����� � ������
    $userLogin=$_POST['login'];   
    $userPassword=$_POST['password'];
    try{
		//�������� ��������� � ���� ������
		$host="localhost";
		$base="testbase";
		$login="root";
		$password="";		
		//������������ � ���� ������
		$DBH=new PDO("mysql:host=".$host.";dbname=".$base,$login,$password);
		$DBH->setAttribute( PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION );
		//��������� ������: ������� ���������� ����� � ������� ���������� �����/������ ��������� ���� ��� ������� � ����� 
	    $STH=$DBH->prepare("SELECT COUNT(*) AS auth FROM user WHERE login=:login AND password=:password");
		$STH->bindValue(':login',$userLogin);
		$STH->bindValue(':password',md5($userPassword));//�� ��������, ��� �� ������� ������ ��� ������ md5
		$STH->execute();
		$row=$STH->fetch();
		if ($row['auth']>0){//���� ����� ����� � �������������� ������ >0 �� �� ����� ����� �����/������
			$flag=true;	
			$_SESSION['is_logged']=true;
		}    	
	    else{	    	
	    	$flag=false;
	    }   
	}
	catch(PDOException $e){
		 $flag=false;
		echo $e->getMessage();
	}    
	$smarty->assign('status',$flag);
    //���������� �������� �����
    $smarty->display('templates/authProcess.tpl');
    //���������� �����
    $smarty->display('templates/footer.tpl');
  ?> 