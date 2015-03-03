<?php
	require_once("devices/Light.php");	
	require_once("devices/TV.php");
	require_once("devices/CeilingFan.php");
	require_once("Command.php");
	require_once("NoCommand.php");
	require_once("LightOnCommand.php");
	require_once("TVOffCommand.php");
	require_once("TVOnCommand.php");
	require_once("MacroCommand.php");
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
	$fanHigh=new CeilingFanHighCommand($fan);
	$fanOff=new CeilingFanOffCommand($fan);
	//Создаём команды для освещения	
	$light=new Light();	
	$lightOn=new LightOnCommand($light);
	$lightOff=new LightOffCommand($light);	
	//Создаём команды для телевизора
	$tv=new TV();	
	$tvOn=new TVOnCommand($tv);
	$tvOff=new TVOffCommand($tv);	
	//Создаём Макрокоманду - начать вечеринку
	$startParty=new MacroCommand(array($fanHigh,$lightOff,$tvOn));
	//Создаём Макрокоманду - закончить вечеринку
	$closeParty=new MacroCommand(array($fanOff,$lightOn,$tvOff));
	//------назначаем пульт
	$remoteControl->setCommand(0,$startParty,$closeParty);
	//----- тестируем пульт
	echo "<b>Start party.</b><hr>";	
	$remoteControl->onButtonWasPressed(0);	
	echo "<b>Close party.</b><hr>";	
	$remoteControl->offButtonWasPressed(0);
	
	
?>