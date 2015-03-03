<?php
class ParentClass{
	public function myFunctionA(){
		echo "parent function A call!<br>";
	}
}
class ChildClass extends ParentClass{
	public function myFunctionB(){
		echo "<b>child function B calls parent function:</b> ";
		parent::myFunctionA();
	}
	public function myFunctionA(){
		echo "child function A call!<br>";
	}
}
$child=new ChildClass();
$child->myFunctionB();
echo "<hr>";
$child->myFunctionA();
?>