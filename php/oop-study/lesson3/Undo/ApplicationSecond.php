<?php
	require_once("devices/Light.php");
	require_once("devices/GarageDoor.php");
	require_once("devices/TV.php");
	require_once("devices/CeilingFan.php");
	require_once("Command.php");
	require_once("NoCommand.php");
	require_once("LightOnCommand.php");
	require_once("TVOffCommand.php");
	require_once("TVOnCommand.php");
	require_once("CloseDoorCommand.php");
	require_once("OpenDoorCommand.php");
	require_once("LightOffCommand.php");
	require_once("CeilingFanOffCommand.php");
	require_once("CeilingFanLowCommand.php");
	require_once("CeilingFanMediumCommand.php");
	require_once("CeilingFanHighCommand.php");
	require_once("RemoteControl.php");
	//--------------------------------------------------------
	//Создаём пульт управления
	$remoteControl=new RemoteControl();
	echo "<b>Start remote control.</b><hr>";
	//Создаём команды для вентилятора	
	$fan=new CeilingFan("GuestRoom");	
	$fanLow=new CeilingFanLowCommand($fan);
	$fanMedium=new CeilingFanMediumCommand($fan);
	$fanHigh=new CeilingFanHighCommand($fan);
	$fanOff=new CeilingFanOffCommand($fan);	
	//Назначаем команды
	$remoteControl->setCommand(0,$fanLow,$fanOff);
	$remoteControl->setCommand(1,$fanMedium,$fanOff);
   $remoteControl->setCommand(2,$fanHigh,$fanOff);
	echo "<b>Remote control initialized.</b><hr>";
	//----- тестируем пульт
	echo "<b>Test remote control.</b><hr>";
	echo "<i>All device online:<br></i>";
	$remoteControl->onButtonWasPressed(0);
	$remoteControl->onButtonWasPressed(1);	
	$remoteControl->undoButtonWasPressed();
	$remoteControl->onButtonWasPressed(2);
	$remoteControl->undoButtonWasPressed();
	echo "fan status:<br>";
	$fan->status();
	
?>