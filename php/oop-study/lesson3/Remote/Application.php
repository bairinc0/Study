<?php
	require_once("devices/Light.php");
	require_once("devices/GarageDoor.php");
	require_once("devices/TV.php");
	require_once("Command.php");
	require_once("NoCommand.php");
	require_once("LightOnCommand.php");
	require_once("TVOffCommand.php");
	require_once("TVOnCommand.php");
	require_once("CloseDoorCommand.php");
	require_once("OpenDoorCommand.php");
	require_once("LightOffCommand.php");
	require_once("RemoteControl.php");
	//--------------------------------------------------------
	//Создаём пульт управления
	$remoteControl=new RemoteControl();
	echo "<b>Start remote control.</b><hr>";
	//Создаём команды для освещения
	$light=new Light();	
	$lightOn=new LightOnCommand($light);
	$lightOff=new LightOffCommand($light);
	//Создаём команды для двери
	$door=new GarageDoor();	
	$doorOpen=new OpenDoorCommand($door);
	$doorClose=new CloseDoorCommand($door);
	//Создаём команды для телевизора
	$tv=new TV();	
	$tvOn=new TVOnCommand($tv);
	$tvOff=new TVOffCommand($tv);
	//Назначаем команды
	$remoteControl->setCommand(0,$doorOpen,$doorClose);
    $remoteControl->setCommand(1,$lightOn,$lightOff);
    $remoteControl->setCommand(2,$tvOn,$tvOff);
	echo "<b>Remote control initialized.</b><hr>";
	//----- тестируем пульт
	echo "<b>Test remote control.</b><hr>";
	echo "<i>All device online:<br></i>";
	$remoteControl->onButtonWasPressed(0);
	$remoteControl->onButtonWasPressed(1);
	$remoteControl->onButtonWasPressed(2);
	echo "<i>All device offline:<br></i>";
	$remoteControl->offButtonWasPressed(0);
	$remoteControl->offButtonWasPressed(1);
	$remoteControl->offButtonWasPressed(2);
?>