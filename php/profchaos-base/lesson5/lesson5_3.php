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
		//���������� ������ � �������������� ������� �������������
		$STH=$DBH->prepare("SELECT * FROM news WHERE id=:id");
		$STH->bindValue(':id',1);
		$STH->execute();
		$STH->setFetchMode(PDO::FETCH_ASSOC);
		//������� ���������� ������� �� �����
		$row=$STH->fetch();
		echo "������� ������������:<br/>";
		echo "id=".$row['id']." title=".$row['title']." <br/>".$row['content']." <br/>Date: ".$row['uploaddate']."<hr/>";
		//���������� ������ � �������������� �������� ������������
		$STH=$DBH->prepare("SELECT * FROM news WHERE uploaddate>? AND id<?");
		$STH->execute(array('2013-09-16','2'));
		$STH->setFetchMode(PDO::FETCH_ASSOC);
		//������� ���������� ������� �� �����
		$row=$STH->fetch();
		echo "������� ������������:<br/>";
		echo "id=".$row['id']." title=".$row['title']." <br/>".$row['content']." <br/>Date: ".$row['uploaddate']."<hr/>";
	}
	catch(PDOException $e){
		echo $e->getMessage();
	}
?>