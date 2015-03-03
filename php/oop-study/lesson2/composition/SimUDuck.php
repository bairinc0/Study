<?php
	//Подключаем файлы
	require_once("Duck.php");
	require_once("MallardDuck.php");
	require_once("RedHeadDuck.php");	
	require_once("RubberDuck.php");
	require_once("FlyNoWay.php");
	require_once("FlyWithWings.php");
	//----------------------------------
	$duck=new MallardDuck(new FlyWithWings());
	$duck->performFly();
	$duck->setFlyBehaviour(new FlyNoWay());
	$duck->performFly();
	echo "<hr>";
	$duck=new RubberDuck(new FlyNoWay());
	$duck->performFly();
	
?>