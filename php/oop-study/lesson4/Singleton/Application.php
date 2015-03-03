<?php
	require_once("Singleton.php");
	$vault=Singleton::getInstance();
	echo "<b>Class loaded:</b><br>";
	echo "show info:<br>";
	echo "dbName:<i>".$vault->getProperty("dbname")."</i><br>";
	echo "dbLogin:<i>".$vault->getProperty("dblogin")."</i><br>";
	echo "dbPassword:<i>".$vault->getProperty("dbpassword")."</i><br>";
?>