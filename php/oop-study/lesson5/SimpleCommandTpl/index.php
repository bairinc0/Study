<?php
	 header("Content-type: text/html; charset=utf-8");
	/*Подключаем и настраиваем всё необходимое*/
	require_once("system/command/Command.php");
	require_once("assets/smarty/Smarty.class.php");
	/*Разбираем URL*/
	$url=explode("/",$_SERVER['REQUEST_URI']);
	$num=count($url);
	$depth=5;
	$dbNeed=false;
	switch($url[$depth]){
		case 'news':
			$commandName="ShowNewsCommand";
			$dbNeed=true;
			$tpl="ShowNewsCommand";	
			break;
		case 'student':
			$commandName="ShowStudentCommand";
			$tpl="ShowStudentCommand";
			$dbNeed=true;
			break;	
		default:
			$commandName="DefaultCommand";
			$tpl="DefaultCommand";
			$dbNeed=true;
			break;
	}
	/*Подключаем БД*/	
	if ($dbNeed){
		$host="localhost";
		$dbname="ftf_study";
		$dblogin="root";
		$dbpass="";
		try{
			$DBH=new PDO("mysql:host=".$host.";dbname=".$dbname,$dblogin,$dbpass);
			$DBH->setAttribute( PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION );
			$DBH->prepare("set character_set_client='utf8'")->execute();
			$DBH->prepare("set character_set_results='utf8'")->execute();
			$DBH->prepare("set collation_connection='utf8_general_ci'")->execute();		
		}
		catch(PDOException $e){
			echo "Вы что то делаете неправильно:<br>";
			echo $e->getMessage();
		}
	}
	/*включаем Smarty*/
	$smarty = new Smarty();
    $smarty->template_dir = 'application/view/';
    $smarty->compile_dir ='assets/smarty/templates_c/';
    $smarty->config_dir = 'assets/smarty/configs/';
    $smarty->cache_dir = 'assets/smarty/cache/';
	/*Запускаем команду*/
	require_once($searchUrl."/application/command/".$commandName.".php");
	$class = new ReflectionClass($commandName); 
	$command=$class->newInstance();
	$command->setSmarty($smarty);
	$command->setTemplate($tpl);	
	if ($dbNeed){
		$command->setDBH($DBH);
	}
	$command->doExecute();
	
?>