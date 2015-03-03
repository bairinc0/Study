<?php
	$url=explode("/",$_SERVER['REQUEST_URI']);
	$num=count($url);
	if (strripos ($_SERVER['REQUEST_URI'] ,"?")){//если есть GET запрос
		$searchUrl=$url[$num-2];
	}
	else{
		$searchUrl=$url[$num-1];
	}
	switch($searchUrl){
		case 'news':
			require_once("handler/ShowNews.php");
			break;
		case 'student':
			require_once("handler/ShowStudent.php");
			break;	
		default:
			require_once("handler/Default.php");
			break;
	}
?>