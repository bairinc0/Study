<?php
	class FirstCommand extends Command{
		private $dbName;
		public function __construct($dbName){
			$this->dbName=$dbName;
		}
		public function execute(){
			echo "Connected to DB:".$this->dbName."<br>";
		}		
	}
?>