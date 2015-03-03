<?php
class MacroCommand implements Command{
	private $commands=array();
    public function __construct($commands){
        $this->commands=$commands;
    }
    public function execute(){
		if (count($this->commands)>0){
			foreach($this->commands as $command){
				$command->execute();
			}        
		}
    }
    public function undo(){
		if (count($this->commands)>0){
			foreach($this->commands as $command){
				$command->undo();
			}
		}
    }
}
?>