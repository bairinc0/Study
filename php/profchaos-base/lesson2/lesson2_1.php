<?php
function numberValue($number){
	if (is_numeric($number)){//���������, ��� �������� ������ �����
		if ($number>0){
			return "������ ����";
		}
		elseif($number<0){
			return "������ ����";
		}
		else{
			return "����� ����";
		}
	}
	else{//�������� �� �����
		return "�������� �� �������� ������";
	}
}
$a=0;
echo "���������� =<i>".$a."</i>, numberValue: ".numberValue($a)."<br/>";
$a=10;
echo "���������� =<i>".$a."</i>, numberValue: ".numberValue($a)."<br/>";
$a=-10;
echo "���������� =<i>".$a."</i>, numberValue: ".numberValue($a)."<br/>";
$a="� �� ����� � ������";
echo "���������� =<i>".$a."</i>, numberValue: ".numberValue($a)."<br/>";
?>