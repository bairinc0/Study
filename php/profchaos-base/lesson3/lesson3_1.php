<?php
if ($_POST['from']!="myForm"){//���������, ��� �� ������ �� �����
	echo "�� ������ �� �� �����!!!";
}
else{
	$fio=$_POST['fio'];
	$birthday=$_POST['date'];
	$gender=$_POST['gender'];	
	if ($gender==1){
		$gender="�������";
	}
	else{
		$gender="�������";
	}
	$actor=$_POST['actor'];
	echo "���:".$fio."<br/>";
	echo "���� ��������:".$birthday."<br/>";
	echo "���:".$gender."<br/>";
	echo "������� ����:".$actor."<br/>";
}
?>