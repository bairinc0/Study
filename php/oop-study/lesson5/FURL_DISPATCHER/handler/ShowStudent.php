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
	if (is_numeric($_GET['student_id'])){//выведем одну новость
		$STH=$DBH->prepare("SELECT * FROM observer_students WHERE student_id=".$_GET['student_id']);	 
		$STH->execute();
		if ($STH->columnCount()>0){		
			$STH->execute();
			$STH->setFetchMode(PDO::FETCH_ASSOC);
			$row=$STH->fetch();			
			echo $row['student_secname']." ".$row['student_name']." ".$row['student_patronymic'];
		}
		else{//нет такого студента
			echo "Mistake";
		}			
	}
	else{//выведем всех студентов
			
	}
?>