<?php
class Stereo{
	private $status;
	private $volume;   
    public function __construct(){
        $this->status=0;
        $this->volume=0;		
    }
	public function on(){
		if ($this->status){
			echo "System already online<br>";
		}
		else{
			$this->status=1;
			echo "System online<br>";
		}
	}
	public function off(){
		if ($this->status){
			echo "System offline<br>";
			$this->status=0;
		}
		else{			
			echo "System already offline<br>";
		}
	}
	public function setVolume($volume){
		if ($volume>0){
			$this->volume=$volume;
		}
	}	
} 
?>