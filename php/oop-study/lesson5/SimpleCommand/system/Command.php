<?php
	 abstract class Command{
		protected abstract function execute();
		public function doExecute(){
			$this->execute();
		}
	 }
?>