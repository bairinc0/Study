<?php
	abstract class Command{
		public abstract function execute();		
		public final function doExecute(){
			//Тут выполняется блок инструкций до выполнения команды
			echo "Command ".get_class($this)." now be executed. Pre actions done!<br>";
			$this->execute();
		}
	}
?>