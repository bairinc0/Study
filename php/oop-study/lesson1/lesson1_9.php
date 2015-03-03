<?php
class ParentClass{
	private $prVar="I'm private variable from ParentClass!";
	protected $prVar2="I'm private variable2 from ParentClass!";
	public function myFunctionA(){
		echo "public function from ParentClass<br>";
	}
	protected function myFunctionB(){
		return $this->prVar;
	}
}
class ChildClass extends ParentClass{
	public function myFunctionC(){
		//MISTAKE!!!
		return "USING parent value1:".$this->prVar." <br>"."USING parent value2:".$this->prVar2;
	}
}
$child=new ChildClass();
//ERROR!
//$child->myFunctionB();
echo "<hr>";
$child->myFunctionA();
echo "<hr>";
//ERROR!
echo $child->myFunctionC();
?>