<?php
	session_start();
	function is_logged(){
		if ($_SESSION['is_logged']){
			return true;			
		}
		else{
			return false;
		}
	}	
?>