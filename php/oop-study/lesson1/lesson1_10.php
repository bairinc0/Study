<?php
class Animal{
	public function makeSound(){
		echo "Animal makes sound!<br>";
	}
}
class Cat extends Animal{
	public function makeSound(){
		echo "Cat say Meow!<br>";
	}
}
class Cow extends Animal{
	public function makeSound(){
		echo "Cow say Moo!<br>";
	}
}
class MysticAnimal{
	public function makeSound(){
		echo "Mystic sounds<br>";
	}
}
class Orchestra{
	public $chorus=array();//заводим массив животных
	function addAnimal(Animal $animal){//добавл€ем новое животное в массив
		$this->chorus[]=$animal;
	}
	function sing(){//заставл€ем всех животных петь
		if (count($this->chorus)>0){//если в массиве есть элементы
			foreach ($this->chorus as $animal){
				$animal->makeSound();
				echo "<hr>";
			}
		}
	}
}

$orchestra=new Orchestra();
$animal=new Cat();
$orchestra->addAnimal($animal);
$animal=new Cow();
$orchestra->addAnimal($animal);
$animal=new Animal();
$orchestra->addAnimal($animal);
$orchestra->sing();
//------------------
$animal=new MysticAnimal();
//код ниже выдаст ошибку!
//$orchestra->addAnimal($animal);
?>