<?php
	require_once('authLib.php');//Подключаем библиотеку
	if ($_POST['Location']!="Auth"){
		header("Location:authForm.php");
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
    //получаем логин и пароль
    $userLogin=$_POST['login'];   
    $userPassword=$_POST['password'];
    try{
		//получаем настройки к базе данных
		$host="localhost";
		$base="testbase";
		$login="root";
		$password="";		
		//подключаемся к базе данных
		$DBH=new PDO("mysql:host=".$host.";dbname=".$base,$login,$password);
		$DBH->setAttribute( PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION );
		//формируем запрос: считаем количество строк у которых комбинация логин/пароль идентична тому что введено в форме 
	    $STH=$DBH->prepare("SELECT COUNT(*) AS auth FROM user WHERE login=:login AND password=:password");
		$STH->bindValue(':login',$userLogin);
		$STH->bindValue(':password',md5($userPassword));//не забываем, что мы шифруем пароль при помощи md5
		$STH->execute();
		$row=$STH->fetch();
		if ($row['auth']>0){//если число строк в результирующем наборе >0 то мы верно ввели логин/пароль
			$flag=true;	
			$_SESSION['is_logged']=true;
		}    	
	    else{	    	
	    	$flag=false;
	    }   
	}
	catch(PDOException $e){
		 $flag=false;
		echo $e->getMessage();
	}    
	$smarty->assign('status',$flag);
    //подключаем основную часть
    $smarty->display('templates/authProcess.tpl');
    //подключаем футер
    $smarty->display('templates/footer.tpl');
  ?> 