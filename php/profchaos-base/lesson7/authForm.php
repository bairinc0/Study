<?php
	//������� ����� �����������
	require_once('smarty/Smarty.class.php');
    $smarty = new Smarty();
    $smarty->template_dir = 'templates/';
    $smarty->compile_dir ='smarty/templates_c/';
    $smarty->config_dir = 'smarty/configs/';
    $smarty->cache_dir = 'smarty/cache/';
    //���������� �����
    $smarty->display('templates/header.tpl');   	
    //���������� �������� �����
    $smarty->display('templates/authForm.tpl');
    //���������� �����
    $smarty->display('templates/footer.tpl');
?>