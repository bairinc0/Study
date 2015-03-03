<?php
	require_once("Lorry.php");
	class Organizer{
		private static $carList=array();
		public function addToList(Car $car, $time){
			//Формируем заявку
			$listItem['car']=$car;
			$listItem['time']=$time;
			//Добавляем
			self::$carList[]=$listItem;			
		}
		public function showList(){
			if (count(self::$carList)>0){
				foreach(self::$carList as $item){
					$car=$item['car'];
					echo "model: ".$car->getModel()."<br>";
					echo "speed: ".$car->getSpeed()."<br>";
					echo "rent price:".$car->rentPrice($item['time']);
					echo "<hr>";
				}
			}			
		}
	}
	
	$lorry=new Lorry();
	$lorry->setModel("Камаз 5490");
	$lorry->setCapacity(600);
	$lorry->setSpeed(600);
	$lorry->setCarryingWeight(300);
	Organizer::addToList($lorry,2.0);
	$lorry1=new Lorry();
	$lorry1->setModel("Газ 66");	
	$lorry1->setCapacity(500);
	$lorry1->setSpeed(500);
	$lorry1->setGasolinePrice(45);
	$lorry1->setCarryingWeight(400);
	Organizer::addToList($lorry1,4.0);
	Organizer::showList();
?>