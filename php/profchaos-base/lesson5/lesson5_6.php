<?php
	if ($_POST['from']!="newsAddForm"){//���� ������ �� �� ����� ���������� �� �����
		header("Location:lesson5_6.html");
	}
	try{
		//�������� ������ � �����
		$title=$_POST['title'];
		$content=$_POST['content'];
		//���������� ������������ "������".
		$title=trim($title);
		$content=trim($content);
		//�������� ��������� � ���� ������
		$host="localhost";
		$base="testbase";
		$login="root";
		$password="";
		//������������ � ���� ������
		$DBH=new PDO("mysql:host=".$host.";dbname=".$base,$login,$password);
		$DBH->setAttribute( PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION );
		//��������� ������ �� �������   
	   $data=array($title,$content,date("Y-m-d H:i:s"));
	   $STH=$DBH->prepare("INSERT INTO news (title,content,uploaddate) values (?,?,?)");
	   $STH->execute($data);
	   echo "������� ������� ���������! <a href='lesson5_6.html'>�������� ���</a>";
	}
	catch(PDOException $e){
		echo $e->getMessage();
	}
	
?>