<?php
	class SecondCommand extends Command{
		private $counter;
		function __construct($counter=0){
			$this->counter=$counter;
		}
		public function execute(){
			echo "Counter is equal:".$this->counter."<br>";
		}		
	}
?>