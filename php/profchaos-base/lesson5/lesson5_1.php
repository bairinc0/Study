<?php 
//��������� ����������
	//���������� �������
	function inverse($x){
		if ($x==0){//���� �������� = 0, �� ����������� ����������
			throw new Exception("������� �� ����!");
		}
		else return 1/$x;
	}	
	//������� ������� ����������
	try{
		inverse(0);
	}
	catch(Exception $e){
		echo "��������� ����������: ".$e->getMessage();
	}
?>