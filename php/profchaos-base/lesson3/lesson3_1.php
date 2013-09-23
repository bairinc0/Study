<?php
if ($_POST['from']!="myForm"){//проверяем, что мы пришли из формы
	echo "Вы пришли не из формы!!!";
}
else{
	$fio=$_POST['fio'];
	$birthday=$_POST['date'];
	$gender=$_POST['gender'];	
	if ($gender==1){
		$gender="Мужской";
	}
	else{
		$gender="Женский";
	}
	$actor=$_POST['actor'];
	echo "ФИО:".$fio."<br/>";
	echo "День рождения:".$birthday."<br/>";
	echo "Пол:".$gender."<br/>";
	echo "Любимый актёр:".$actor."<br/>";
}
?>