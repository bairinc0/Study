<?php
class Stereo{
	private $status;
	private $volume;
    private $disk;
	private $track;
    public function __construct(){
        $this->status=0;
        $this->volume=0;
		$this->disk="";
		$this->track=0;
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
	public function setDisk($disk){
		$this->disk=$disk;
		$this->track=0;
	}
	public function setTrack($track){
		$this->track=$track;
	}
} 
?>