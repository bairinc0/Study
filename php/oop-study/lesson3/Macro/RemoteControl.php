<?php
class RemoteControl{	
	private $onCommands=array();
    private $offCommands=array();
	private $lastCommand;//Последняя операция
    public function __construct(){
        $noCommand=new NoCommand();
        for ($i=0;$i<3;$i++){//Инициализируем массив пустыми командами
            $this->onCommands[i]=$noCommand;
            $this->offCommands[i]=$noCommand;
        }
		$this->lastCommand=$noCommand;
    }
    public function setCommand($slot,Command $onCommand,Command $offCommand){
        $this->onCommands[$slot]=$onCommand;
        $this->offCommands[$slot]=$offCommand;
    }
    public function onButtonWasPressed($slot){
        echo "Somebody pressed on button in slot ".$slot." (command:<i>".get_class($this->onCommands[$slot])."</i>)"."<br>";
        $this->onCommands[$slot]->execute();
		//Меняем последнюю выполненную команду
		$this->lastCommand=$this->onCommands[$slot];
    }
    public function offButtonWasPressed($slot){
        echo "Somebody pressed off button in slot ".$slot." (command:<i>".get_class($this->offCommands[$slot])."</i>)"."<br>";
        $this->offCommands[$slot]->execute();
		//Меняем последнюю выполненную команду
		$this->lastCommand=$this->offCommands[$slot];
    }   
	public function undoButtonWasPressed(){//Отменяем последнюю выполненную команду
		echo "----------------------------------------------------------<br>";
        echo "<b>undo operation:</b> <i>".get_class($this->lastCommand)."</i><br>";
        $this->lastCommand->undo();
		echo "----------------------------------------------------------<br>";
    } 	
}
?>