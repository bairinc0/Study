<?php
class Initializer{	
	private $commands=array();
	public function __construct(){
    }
    public function addCommand(Command $command){
        $this->commands[]=$command;
    }
	public function executeAll(){
		if (count($this->commands)>0){
			foreach($this->commands as $command){
				$command->doExecute();
				echo "<hr>";
			}
		}
		else{
			echo "there are no commands in list<br>";
		}
	}
}
?>