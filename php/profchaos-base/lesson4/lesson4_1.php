<?php
	session_start();//Инициируем сессию
	$_SESSION['name']="My Name";//регистрируем переменную
	$arr=array('age'=>20,'gender'=>"male",'group'=>"05201");
	$_SESSION['arr']=$arr;//регистрируем массив
	echo "Переменные зарегистрированы<br/>";
	echo "<a href='lesson4_2.php'>Перейти </a>";
?>