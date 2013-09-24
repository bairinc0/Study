<?php
	if ($_POST['from']!="newsAddForm"){//если пришёл не из формы отправляем на форму
		header("Location:lesson5_6.html");
	}
	try{
		//получаем данные с формы
		$title=$_POST['title'];
		$content=$_POST['content'];
		//производим элементарную "чистку".
		$title=trim($title);
		$content=trim($content);
		//получаем настройки к базе данных
		$host="localhost";
		$base="testbase";
		$login="root";
		$password="";
		//подключаемся к базе данных
		$DBH=new PDO("mysql:host=".$host.";dbname=".$base,$login,$password);
		$DBH->setAttribute( PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION );
		//формируем запрос на вставку   
	   $data=array($title,$content,date("Y-m-d H:i:s"));
	   $STH=$DBH->prepare("INSERT INTO news (title,content,uploaddate) values (?,?,?)");
	   $STH->execute($data);
	   echo "Новость успешно добавлена! <a href='lesson5_6.html'>Добавить ещё</a>";
	}
	catch(PDOException $e){
		echo $e->getMessage();
	}
	
?>