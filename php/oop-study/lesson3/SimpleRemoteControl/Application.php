<?php
	require_once("devices/Light.php");
	require_once("Command.php");
	require_once("LightOnCommand.php");
	require_once("SimpleRemoteControl.php");
	//--------------------------------------------------------
	//Создаём пульт управления
	$simpleRemoteControl=new SimpleRemoteControl();
	echo "<b>Start remote control.</b><hr>";
	//Создаём новую команду - включить свет
	$light=new Light();	
	$myCommand=new LightOnCommand($light);
	$simpleRemoteControl->setCommand($myCommand);
	$simpleRemoteControl->buttonWasPressed();
?>