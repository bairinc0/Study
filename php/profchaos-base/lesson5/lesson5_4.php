<?php
	try{
		//�������� ��������� � ���� ������
		$host="localhost";
		$base="testbase";
		$login="root";
		$password="";
		//������������ � ���� ������
		$DBH=new PDO("mysql:host=".$host.";dbname=".$base,$login,$password);
		$DBH->setAttribute( PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION );
		//��������� ������ �� �������
		//������� ������
	   $STH=$DBH->prepare("INSERT INTO news (title,content,uploaddate) values ('������� �1','��� ������� ��������� ����� ���','".date("Y-m-d H:i:s")."')");
	   $STH->execute();
	   //������� � ��������������
	   $data=array("������� �2","� ��� �� �������� � ��������������",date("Y-m-d H:i:s"));
	   $STH=$DBH->prepare("INSERT INTO news (title,content,uploaddate) values (?,?,?)");
	   $STH->execute($data);
	}
	catch(PDOException $e){
		echo $e->getMessage();
	}
?>