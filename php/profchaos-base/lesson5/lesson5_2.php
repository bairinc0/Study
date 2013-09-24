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
		//���������� ������
		$STH=$DBH->prepare("SELECT * FROM news");
		$STH->execute();
		$STH->setFetchMode(PDO::FETCH_ASSOC);
		//������� ���������� ������� �� �����
		while($row=$STH->fetch()){
			echo "id=".$row['id']." title=".$row['title']." <br/>".$row['content']." <br/>Date: ".$row['uploaddate']."<hr/>";
		}
	}
	catch(PDOException $e){
		echo $e->getMessage();
	}
?>