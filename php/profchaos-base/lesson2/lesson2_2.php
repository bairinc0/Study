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
//Задаём массив из 10 элементов
$a=array();
for ($i=0;$i<10;$i++){
	$a[$i]=rand(0,100);
}
//выводим сгенерерированный массив
for ($i=0;$i<10;$i++){
	echo $a[$i]." ";
}
echo "<br/>";
//используем функцию для поиска максимального элемента
$max=maxInArr($a,10);
echo "Максимальное значение =".$max;
?>