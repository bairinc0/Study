<?php
	class SimpleRemoteControl{	
		private $commandSlot;
		public function setCommand(Command $commandSlot){
			$this->commandSlot=$commandSlot;
		}
		public function buttonWasPressed(){
			$this->commandSlot->execute();
		}
	}
?>