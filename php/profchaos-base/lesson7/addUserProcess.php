<?php
	require_once('authLib.php');//���������� ����������
	if (!is_logged()){//���� �� ��������� ��� �� �������� � �������
		header('Location:404.php');	
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
    //��� ������ �������� ��� �� ����� ������ �� ���� ����� id
    $userLogin=trim($_POST['login']);
    $userPassword=trim($_POST['password']);   
    try{
		//�������� ��������� � ���� ������
		$host="localhost";
		$base="testbase";
		$login="root";
		$password="";
		//������������ � ���� ������
		$DBH=new PDO("mysql:host=".$host.";dbname=".$base,$login,$password);
		$DBH->setAttribute( PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION );
		//��������� ������ 
	    $data=array($userLogin,md5($userPassword));
		$STH=$DBH->prepare("INSERT INTO user (login,password) values (?,?)");
		$STH->execute($data); 
	    	
	    $flag=true;   
	}
	catch(PDOException $e){
		 $flag=false;
		echo $e->getMessage();
	}    
	$smarty->assign('status',$flag);
    //���������� �������� �����
    $smarty->display('templates/addUserProcess.tpl');
    //���������� �����
    $smarty->display('templates/footer.tpl');
  ?> 