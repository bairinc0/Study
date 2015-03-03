<?php
class RemoteControl{	
	private $onCommands=array();
    private $offCommands=array();
    public function __construct(){
        $noCommand=new NoCommand();
        for ($i=0;$i<3;$i++){//Инициализируем массив пустыми командами
            $this->onCommands[i]=$noCommand;
            $this->offCommands[i]=$noCommand;
        }
    }
    public function setCommand($slot,Command $onCommand,Command $offCommand){
        $this->onCommands[$slot]=$onCommand;
        $this->offCommands[$slot]=$offCommand;
    }
    public function onButtonWasPressed($slot){
        echo "Somebody pressed on button in slot ".$slot."<br>";
        $this->onCommands[$slot]->execute();
    }
    public function offButtonWasPressed($slot){
        echo "Somebody pressed off button in slot ".$slot."<br>";
        $this->offCommands[$slot]->execute();
    }   
}
?>