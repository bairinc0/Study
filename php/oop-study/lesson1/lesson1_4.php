<?php
	class MyDestructableClass {
	   function __construct($number) {		   
		   $this->number = $number;
		   echo "������ ������ �".$this->number."<br>";
	   }
	   function __destruct() {
		   print "������������ ������ �" . $this->number . "<br>";
	   }
	}
	$obj1=new MyDestructableClass(1);
	$obj2=new MyDestructableClass(2);
	$obj2=$obj1;
	echo "<hr>";
	$obj2=new MyDestructableClass(3);
?>
