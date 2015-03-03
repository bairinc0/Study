<?php
	require_once("FlyBehaviour.php");
	class FlyNoWay implements FlyBehaviour{
		public function fly(){
			echo "I can't fly!<br>";
		}
	}
?>