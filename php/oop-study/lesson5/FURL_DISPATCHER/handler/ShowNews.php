<?php
	//подключаем БД
	$host="localhost";
	$dbname="ftf_study";
	$dblogin="root";
	$dbpass="";
	try{
		$DBH=new PDO("mysql:host=".$host.";dbname=".$dbname,$dblogin,$dbpass);
		$DBH->setAttribute( PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION );
		$DBH->prepare("set character_set_client='cp1251'")->execute();
		$DBH->prepare("set character_set_results='cp1251'")->execute();
		$DBH->prepare("set collation_connection='cp1251_general_ci'")->execute();		
	}
	catch(PDOException $e){
		echo "Вы что то делаете неправильно:<br>";
		echo $e->getMessage();
	}
	//Начинаем работу 
	if (is_numeric($_GET['news_id'])){//выведем одну новость
		
		$STH->execute();
		$STH->setFetchMode(PDO::FETCH_ASSOC);		
	}
	else{//выведем все новости
		$STH=$DBH->prepare("SELECT * FROM news ORDER BY uploaddate DESC");	 
		$STH->execute();
		$STH->setFetchMode(PDO::FETCH_ASSOC);
		
		while ($row=$STH->fetch()){			
			echo "<b>".$row['title']."</b> (".$row['uploaddate'].")<br>";
			echo $row['content'];
			echo "<hr>";	
		}
		
	}
?>