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
    if (is_numeric($_GET['id'])){//выясняем какой нам нужен режим вставки или обновления
    	//тут мы верим что забит id существующей новости, в реальной ситуации НЕОБХОДИМО такое проверять
    	$id=$_GET['id'];
    	//так как редактируем, то дёргаем из базы информацию 
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
			$STH=$DBH->prepare("SELECT * FROM news WHERE id=:id");
			$STH->bindValue(':id',$id);
			$STH->execute();
			$STH->setFetchMode(PDO::FETCH_ASSOC);
			//Записываем результирующий набор в переменную смарти
			$smarty->assign('news',$STH->fetch());
		}
		catch(PDOException $e){
			 file_put_contents('PDOErrors.txt', $e->getMessage(), FILE_APPEND);
		}    	
    }
    else{
    	$id=-1;//редактирование	
    }
	$smarty->assign('newsid',$id);
    //подключаем основную часть
    $smarty->display('templates/newsForm.tpl');
    //подключаем футер
    $smarty->display('templates/footer.tpl');
  ?> 