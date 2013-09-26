<?php
	//выводит форму авторизации
	require_once('smarty/Smarty.class.php');
    $smarty = new Smarty();
    $smarty->template_dir = 'templates/';
    $smarty->compile_dir ='smarty/templates_c/';
    $smarty->config_dir = 'smarty/configs/';
    $smarty->cache_dir = 'smarty/cache/';
    //Подключаем хидер
    $smarty->display('templates/header.tpl');   	
    //подключаем основную часть
    $smarty->display('templates/authForm.tpl');
    //подключаем футер
    $smarty->display('templates/footer.tpl');
?>