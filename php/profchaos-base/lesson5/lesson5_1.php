<?php 
//Обработка исключений
	//Определяем функцию
	function inverse($x){
		if ($x==0){//если аргумент = 0, то выбрасываем исключение
			throw new Exception("Деление на ноль!");
		}
		else return 1/$x;
	}	
	//пробуем поймать исключение
	try{
		inverse(0);
	}
	catch(Exception $e){
		echo "Выброшено исключение: ".$e->getMessage();
	}
?>