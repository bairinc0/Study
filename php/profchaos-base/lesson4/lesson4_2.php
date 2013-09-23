<?php
	session_start();//»нициируем сессию
	//получаем значение сессионной переменной и выводим его
	echo "ѕеременна€ myName=".$_SESSION['name']."<br/>";
	//выводим массив
	echo "ћассив:";
	print_r($_SESSION);
	unset($_SESSION['name']);//удалили переменную
	session_destroy();//разрушаем сессию
?>
