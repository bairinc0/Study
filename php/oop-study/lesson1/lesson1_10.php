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
	public $chorus=array();//������� ������ ��������
	function addAnimal(Animal $animal){//��������� ����� �������� � ������
		$this->chorus[]=$animal;
	}
	function sing(){//���������� ���� �������� ����
		if (count($this->chorus)>0){//���� � ������� ���� ��������
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
//��� ���� ������ ������!
//$orchestra->addAnimal($animal);
?>