<?php
	interface Movable{
		public function moveLeft();
		public function moveRight();
	}
	interface Noise{
		public function makeNoise();
	}
	abstract class ParentClass{
		abstract function someMethod();
	}
	class ChildClass extends ParentClass implements Noise{
		function someMethod(){}
		public function makeNoise(){
			echo "ChildClass make some noise!!!<br>";
		}
	}
	class Cat implements Noise,Movable{
		private $name;
		function __construct($name){
			$this->name=$name;
		}
		public function makeNoise(){
			echo $this->name." say: Meow<br>";
		}
		public function moveLeft(){
			echo $this->name." moves left<br>";
		}
		public function moveRight(){
			echo $this->name." moves right<br>";
		}
	}
	class Tester{
		static public function makeNoise(Noise $noiseClass){
			$noiseClass->makeNoise();
		}
	}
	Tester::makeNoise(new ChildClass());
	$c=new Cat("Tom");
	Tester::makeNoise($c);
	echo "<hr>And cat may do some things:<br>";
	$c->moveLeft();
	$c->moveRight();
?>