<?php
	//������ �������� ����������� � ���������� � ������ ����������� ������� ���������� ��� ���
	if (is_logged()){
		$authorized=true;
	}
	else{
		$authorized=false;
	}
	$smarty->assign('auth',$authorized);
?>