<?php
	require_once('authLib.php');//Подключаем библиотеку
 	require_once('smarty/Smarty.class.php');
    $smarty = new Smarty();
    $smarty->template_dir = 'templates/';
    $smarty->compile_dir ='smarty/templates_c/';
    $smarty->config_dir = 'smarty/configs/';
    $smarty->cache_dir = 'smarty/cache/';
    //Подключаем хидер
    require_once('header.php');
    $smarty->display('templates/header.tpl');
    //теперь выведем в шаблон новости из базы данных
   	try{
		//получаем настройки к базе данных
		$host="localhost";
		$base="testbase";
		$login="root";
		$password="";
		//подключаемся к базе данных
		$DBH=new PDO("mysql:host=".$host.";dbname=".$base,$login,$password);
		$DBH->setAttribute( PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION );
		//производим запрос
		$STH=$DBH->prepare("SELECT * FROM news ORDER BY uploaddate desc");
		$STH->execute();
		$STH->setFetchMode(PDO::FETCH_ASSOC);
		//Записываем результирующий набор в массив
		$data=array();
		while($row=$STH->fetch()){
			array_push($data,$row);
		}
		//Записываем массив в переменную смарти
		$smarty->assign('news',$data);
	}
	catch(PDOException $e){
		 file_put_contents('PDOErrors.txt', $e->getMessage(), FILE_APPEND);
	}
    //подключаем основную часть
    $smarty->display('templates/main.tpl');
    //подключаем футер
    $smarty->display('templates/footer.tpl');
  ?> 