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
		//производим запрос с использованием именных плейсхолдеров
		$STH=$DBH->prepare("SELECT * FROM news WHERE id=:id");
		$STH->bindValue(':id',1);
		$STH->execute();
		$STH->setFetchMode(PDO::FETCH_ASSOC);
		//выводим результаты запроса на экран
		$row=$STH->fetch();
		echo "именные плейсхолдеры:<br/>";
		echo "id=".$row['id']." title=".$row['title']." <br/>".$row['content']." <br/>Date: ".$row['uploaddate']."<hr/>";
		//производим запрос с использованием простого плейсхолдера
		$STH=$DBH->prepare("SELECT * FROM news WHERE uploaddate>? AND id<?");
		$STH->execute(array('2013-09-16','2'));
		$STH->setFetchMode(PDO::FETCH_ASSOC);
		//выводим результаты запроса на экран
		$row=$STH->fetch();
		echo "простые плейсхолдеры:<br/>";
		echo "id=".$row['id']." title=".$row['title']." <br/>".$row['content']." <br/>Date: ".$row['uploaddate']."<hr/>";
	}
	catch(PDOException $e){
		echo $e->getMessage();
	}
?>