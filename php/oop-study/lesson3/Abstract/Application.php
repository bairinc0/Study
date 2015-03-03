<?php
	require_once("Command.php");
	require_once("FirstCommand.php");
	require_once("SecondCommand.php");
	require_once("Initializer.php");
	$init=new Initializer();
	$command1=new FirstCommand("Google");
	$command2=new FirstCommand("Yandex");
	$command3=new SecondCommand(250);
	$command4=new SecondCommand(35);
	$init->addCommand($command1);
	$init->addCommand($command2);
	$init->addCommand($command3);
	$init->addCommand($command4);
	$init->executeAll();
?>