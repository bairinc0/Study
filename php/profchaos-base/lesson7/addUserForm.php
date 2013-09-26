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
    //подключаем основную часть
    $smarty->display('templates/addUserForm.tpl');
    //подключаем футер
    $smarty->display('templates/footer.tpl');
  ?> 