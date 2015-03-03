<?php
	//Подключаем файлы
	require_once("Duck.php");
	require_once("MallardDuck.php");
	require_once("RedHeadDuck.php");	
	class SimUDuck{
		//класс приложения
		private static $ducks=array();
		public static function addDuck(Duck $duck){
			//Добавляем утку
			self::$ducks[]=$duck;
		}
		public static function test(){
			//выводим весь массив уток на экран
			foreach (self::$ducks as $duck){
				echo "duck type:".get_class($duck)."<br>";
				$duck->quack();
				$duck->swim();
				$duck->display();				
				echo "<hr>";			
			}
		}
	}
	SimUDuck::addDuck(new MallardDuck());
	SimUDuck::addDuck(new RedHeadDuck());
	SimUDuck::addDuck(new RedHeadDuck());
	SimUDuck::addDuck(new MallardDuck());
	SimUDuck::test();
?>