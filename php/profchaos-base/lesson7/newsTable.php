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
    //������ ������� � ������ ������� �� ���� ������
   	try{
		//�������� ��������� � ���� ������
		$host="localhost";
		$base="testbase";
		$login="root";
		$password="";
		//������������ � ���� ������
		$DBH=new PDO("mysql:host=".$host.";dbname=".$base,$login,$password);
		$DBH->setAttribute( PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION );
		//���������� ������
		$STH=$DBH->prepare("SELECT * FROM news");
		$STH->execute();
		$STH->setFetchMode(PDO::FETCH_ASSOC);
		//���������� �������������� ����� � ������
		$data=array();
		while($row=$STH->fetch()){
			array_push($data,$row);
		}
		//���������� ������ � ���������� ������
		$smarty->assign('news',$data);
	}
	catch(PDOException $e){
		 file_put_contents('PDOErrors.txt', $e->getMessage(), FILE_APPEND);
	}
    //���������� �������� �����
    $smarty->display('templates/newsTable.tpl');
    //���������� �����
    $smarty->display('templates/footer.tpl');
  ?> 