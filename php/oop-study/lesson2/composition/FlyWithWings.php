<?php
	require_once("FlyBehaviour.php");
	class FlyWithWings implements FlyBehaviour{
		public function fly(){
			echo "I fly with wings!!<br>";
		}
	}
?>