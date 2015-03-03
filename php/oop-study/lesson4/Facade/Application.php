<?php
	require_once("devices/Stereo.php");
	require_once("devices/TV.php");
	require_once("devices/Console.php");
	require_once("MyGameSystem.php");
	//---------------------------------------------------------
	$myGameSystem=new MyGameSystem(new Console(),new TV(),new Stereo());
	echo "<b>System inialized now start it</b>:<hr>";
	$myGameSystem->onSystem();
	echo "<br><b>It's too late go to bed</b>:<hr>";
	$myGameSystem->offSystem();
?>