<?php
	require_once("system/Command.php");
	
	$url=explode("/",$_SERVER['REQUEST_URI']);
	$num=count($url);
	$depth=5;
	switch($url[$depth]){
		case 'news':
			$commandName="ShowNewsCommand";
			break;
		case 'student':
			$commandName="ShowStudentCommand";
			break;	
		default:
			$commandName="DefaultCommand";
			break;
	}
	require_once($searchUrl."/application/command/".$commandName.".php");
	$class = new ReflectionClass($commandName); 
	$command=$class->newInstance();
	$command->doExecute();
?>