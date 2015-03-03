<?php
	class NoCommand implements Command{
		public function execute(){
			echo "Mistake!";		
		}
	}
?>