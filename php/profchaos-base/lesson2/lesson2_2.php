<?php
function maxInArr($arr,$n){
	$max=$arr[0];
 	for ($i=1;$i<$n;$i++){
		if ($max<$arr[$i]){
			$max=$arr[$i];
		}
	}
	return $max;
}
//����� ������ �� 10 ���������
$a=array();
for ($i=0;$i<10;$i++){
	$a[$i]=rand(0,100);
}
//������� ����������������� ������
for ($i=0;$i<10;$i++){
	echo $a[$i]." ";
}
echo "<br/>";
//���������� ������� ��� ������ ������������� ��������
$max=maxInArr($a,10);
echo "������������ �������� =".$max;
?>