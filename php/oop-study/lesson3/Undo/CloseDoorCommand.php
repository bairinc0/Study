<?php
	class CloseDoorCommand implements Command{
		private $door;
		public function __construct(GarageDoor $door){
			$this->door=$door;
		}
		public function execute(){
			$this->door->close();
		}
		public function undo(){
			$this->door->open();
		}
	}
?>