<?php
	session_start();//���������� ������
	$_SESSION['name']="My Name";//������������ ����������
	$arr=array('age'=>20,'gender'=>"male",'group'=>"05201");
	$_SESSION['arr']=$arr;//������������ ������
	echo "���������� ����������������<br/>";
	echo "<a href='lesson4_2.php'>������� </a>";
?>