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
    //���������� �������� �����
    $smarty->display('templates/addUserForm.tpl');
    //���������� �����
    $smarty->display('templates/footer.tpl');
  ?> 