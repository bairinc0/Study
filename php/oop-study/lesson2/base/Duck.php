<?php
	abstract class Duck{
		function quack(){
			echo "Quack<br>";        
		}
		function swim(){
			echo "Swimming!<br>";        
		}		
		abstract function display();
	}
?>