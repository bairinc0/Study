<?php
function numberValue($number){
	if (is_numeric($number)){//проверяем, что аргумент вообще число
		if ($number>0){
			return "Больше нуля";
		}
		elseif($number<0){
			return "Меньше нуля";
		}
		else{
			return "Равно нулю";
		}
	}
	else{//Аргумент не число
		return "Аргумент не является числом";
	}
}
$a=0;
echo "Переменная =<i>".$a."</i>, numberValue: ".numberValue($a)."<br/>";
$a=10;
echo "Переменная =<i>".$a."</i>, numberValue: ".numberValue($a)."<br/>";
$a=-10;
echo "Переменная =<i>".$a."</i>, numberValue: ".numberValue($a)."<br/>";
$a="Я не число а строка";
echo "Переменная =<i>".$a."</i>, numberValue: ".numberValue($a)."<br/>";
?>