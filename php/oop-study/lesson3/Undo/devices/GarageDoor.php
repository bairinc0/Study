<?php
class GarageDoor{
	//Класс управления дверью гаража
	private $open=false;
	public function open() {//Открыть дверь
		if ($this->open){
			echo "Door is already opened<br>";
		}
		else{
			$this->open=true;
			echo "Open the door<br>";
		}		
	}
	public function close() {//Закрыть дверь
		if ($this->open){
			$this->open=false;
			echo "Close the door!<br>";
		}
		else{
			echo "Door is already closed<br>";
		}
	} 
} 
?>