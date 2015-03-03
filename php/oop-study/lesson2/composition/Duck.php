<?php
	abstract class Duck{
		private $flyBehaviour;
		function __construct($flyBehaviour){
			$this->setFlyBehaviour($flyBehaviour);
		}
		function setFlyBehaviour(FlyBehaviour $flyBehaviour){
			$this->flyBehaviour=$flyBehaviour;
		}
		function performFly(){
			$this->flyBehaviour->fly();
		}
		function swim(){
			echo "Ducks can swim!<br>";        
		}		
		abstract function display();
	}
?>