<?php
	class MyDestructableClass {
	   function __construct() {
		   print "�����������<br>";
		   $this->name = "MyDestructableClass";
	   }

	   function __destruct() {
		   print "������������ " . $this->name . "\n";
	   }
	}
	$obj = new MyDestructableClass();
?>
