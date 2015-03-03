<?php
	abstract class Duck{
		function quack(){
			echo "Quack<br>";        
		}
		function swim(){
			echo "Swimming!<br>";        
		}
		function fly(){
			echo "I can fly!<br>";        
		}
		abstract function display();
	}
?>