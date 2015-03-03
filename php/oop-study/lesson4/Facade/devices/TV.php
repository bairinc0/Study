<?php
class TV{
	private $on;
    private $volume;
    private $channel;
    public function __construct(){
        $this->volume=0;
        $this->on=false;
        $this->channel=0;
    }
    public function setVolume($volume){
        $this->volume=$volume;
    }
    public function setChannel($channel){
        $this->channel=$channel;
    }
    public function on() {
        if ($this->on){
            echo "TV is already works<br>";
        }
        else{
            $this->on=true;
            echo "On tv!<br>";
        }
	
    }
    public function off() {
		if ($this->on){
            $this->on=false;
            echo "Switch off TV<br>";
        }
        else{
            echo "TV is not working";
        }
    }   
} 
?>