<?php
	class Console{
	//Класс управления игровой приставкой
	private $status=0;
	private $disk="";
	public function powerButton() {
		if ($this->status==0){
			echo "Console is online<br>";
			$this->status=1;
		}
		else{
			echo "Console is offline<br>";
			$this->status=0;
		}
	}
	public function loadDisk($disk){
		$this->disk=$disk;
	}
	public function ejectDisk(){
		$this->disk="";
	}
	public function loadGame(){
		if ($this->disk!=""){
			echo "Playing game:".$this->disk."<br>";
		}
		else{
			echo "Error:Load disk at first<br>";
		}
	}
} 
?>