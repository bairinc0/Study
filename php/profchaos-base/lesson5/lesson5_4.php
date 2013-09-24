<?php
	try{
		//получаем настройки к базе данных
		$host="localhost";
		$base="testbase";
		$login="root";
		$password="";
		//подключаемся к базе данных
		$DBH=new PDO("mysql:host=".$host.";dbname=".$base,$login,$password);
		$DBH->setAttribute( PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION );
		//формируем запрос на вставку
		//Обычный запрос
	   $STH=$DBH->prepare("INSERT INTO news (title,content,uploaddate) values ('Новость №1','Эта новость вставлена через код','".date("Y-m-d H:i:s")."')");
	   $STH->execute();
	   //вставка с плейсхолдерами
	   $data=array("Новость №2","А эту мы вставили с плейсхолдерами",date("Y-m-d H:i:s"));
	   $STH=$DBH->prepare("INSERT INTO news (title,content,uploaddate) values (?,?,?)");
	   $STH->execute($data);
	}
	catch(PDOException $e){
		echo $e->getMessage();
	}
?>