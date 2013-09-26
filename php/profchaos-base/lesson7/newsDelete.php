<?php
	require_once('authLib.php');//Подключаем библиотеку
	if (!is_logged()){//если не залогинен идёт на страницу с ошибкой
		header('Location:404.php');	
	}
 	require_once('smarty/Smarty.class.php');
    $smarty = new Smarty();
    $smarty->template_dir = 'templates/';
    $smarty->compile_dir ='smarty/templates_c/';
    $smarty->config_dir = 'smarty/configs/';
    $smarty->cache_dir = 'smarty/cache/';
    //Подключаем хидер
    require_once('header.php');
    $smarty->display('templates/header.tpl');
    //получаем идентификатор новости для удаления
    $id=$_GET['id'];   
    try{
		//получаем настройки к базе данных
		$host="localhost";
		$base="testbase";
		$login="root";
		$password="";
		//подключаемся к базе данных
		$DBH=new PDO("mysql:host=".$host.";dbname=".$base,$login,$password);
		$DBH->setAttribute( PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION );
		//формируем запрос 
	    $STH=$DBH->prepare("DELETE FROM news WHERE id=:id");
		$STH->bindValue(':id',$id);
		$STH->execute();    	
	    $flag=true;   
	}
	catch(PDOException $e){
		 $flag=false;
		echo $e->getMessage();
	}    
	$smarty->assign('status',$flag);
    //подключаем основную часть
    $smarty->display('templates/newsDelete.tpl');
    //подключаем футер
    $smarty->display('templates/footer.tpl');
  ?> 