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
		//Формируем запрос на удаление
		$STH=$DBH->prepare("DELETE FROM news WHERE id>:id");
	    $STH->bindValue(':id',2);   
	    $STH->execute();   
	}
	catch(PDOException $e){
		echo $e->getMessage();
	}
?>