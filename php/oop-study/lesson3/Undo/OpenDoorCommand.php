<?php
	class OpenDoorCommand implements Command{
		private $door;
		public function __construct(GarageDoor $door){
			$this->door=$door;
		}
		public function execute(){
			$this->door->open();
		}
		public function undo(){
			$this->door->close();
		}
	}
?>