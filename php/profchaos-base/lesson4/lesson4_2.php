<?php
	session_start();//���������� ������
	//�������� �������� ���������� ���������� � ������� ���
	echo "���������� myName=".$_SESSION['name']."<br/>";
	//������� ������
	echo "������:";
	print_r($_SESSION);
	unset($_SESSION['name']);//������� ����������
	session_destroy();//��������� ������
?>
