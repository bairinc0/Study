<?php
class CeilingFan{
	private $speed;//0 - выключен, 1 - медленно, 2 - средне, 3 - быстро
    private $location;
    public function __construct($location){
        $this->location=$location;
        $this->speed=0;
    }
    public function high(){
        $this->speed=3;
    }
    public function medium(){
        $this->speed=2;
    }
    public function low(){
        $this->speed=1;
    }
    public function off(){
        $this->speed=0;
    }
    public function getSpeed(){
        return $this->speed;
    } 
	public function status(){
		echo "------------------------------------------<br>";
		echo "Location:".$this->location."<br>";
		echo "Speed:".$this->speed."<br>";
		echo "------------------------------------------<br>";
	}
} 
?>