<?php
class CeilingFanMediumCommand implements Command{
	private $fan;
    private $prevSpeed;
    public function __construct(CeilingFan $fan){
        $this->fan=$fan;
    }
    public function execute(){
        $this->prevSpeed=$this->fan->getSpeed();
        $this->fan->medium();
		echo "fan speed:".$this->fan->getSpeed()."<br>";
    }
	public function undo(){
        if ($this->prevSpeed==3){
            $this->fan->high();
        }
        else if($this->prevSpeed==2){
            $this->fan->medium();
        }
        else if($this->prevSpeed==1){
            $this->fan->low();
        }
        else{
            $this->fan->off();
        }
    }  
}
?>