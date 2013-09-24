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
		//производим запрос
		$STH=$DBH->prepare("SELECT * FROM news");
		$STH->execute();
		$STH->setFetchMode(PDO::FETCH_ASSOC);
		//выводим результаты запроса на экран
		while($row=$STH->fetch()){
			echo "id=".$row['id']." title=".$row['title']." <br/>".$row['content']." <br/>Date: ".$row['uploaddate']."<hr/>";
		}
	}
	catch(PDOException $e){
		echo $e->getMessage();
	}
?>