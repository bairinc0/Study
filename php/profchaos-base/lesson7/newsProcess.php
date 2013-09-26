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
    $id=$_POST['newsid'];
    //������� ������ �� �����
    $title=trim($_POST['title']);
    $content=trim($_POST['content']);   
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
	    if ($id>0){//���������	      
		   $STH=$DBH->prepare("UPDATE news SET title=:title,content=:content,uploaddate=:uploaddate WHERE id=:id");
		   $STH->bindValue(':title',$title);
		   $STH->bindValue(':content',$content);
		   $STH->bindValue(':uploaddate',date("Y-m-d H:i:s"));
		   $STH->bindValue(':id',$id);
		   $STH->execute();	
	    }
	    else{//������ ����� �������
	   	   $data=array($title,$content,date("Y-m-d H:i:s"));
		   $STH=$DBH->prepare("INSERT INTO news (title,content,uploaddate) values (?,?,?)");
		   $STH->execute($data); 	
	    }	
	    $flag=true;   
	}
	catch(PDOException $e){
		 $flag=false;
		echo $e->getMessage();
	}    
	$smarty->assign('status',$flag);
    //���������� �������� �����
    $smarty->display('templates/newsProcess.tpl');
    //���������� �����
    $smarty->display('templates/footer.tpl');
  ?> 