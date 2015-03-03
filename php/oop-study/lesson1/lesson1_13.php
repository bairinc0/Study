<?php
//����������� ���������� $count ����� ������� ������� ��� ��� ������ ����� MyStaticClass �� ����� ����� �������
class MyStaticClass{
	static public $count=0;
	function __construct(){
		self::$count++;
	}
}
$classObject1=new MyStaticClass();
$classObject2=new MyStaticClass();
//� ������ ���������!
echo "class objects created:".MyStaticClass::$count;
//� ��������� ������� �� ���������� ����������� �������
class MySecondStaticClass{
	static private $count=0;
	function __construct(){
		self::$count++;
		if (self::$count>4){
			$this->happy();
		}
	}
	static function showCount(){
		return self::$count;
	}
	function happy(){
		echo "Congritilations! More than four objects of class were created!!!!";
	}
}
$classObject1=new MySecondStaticClass();
$classObject2=new MySecondStaticClass();
$classObject3=new MySecondStaticClass();
$classObject4=new MySecondStaticClass();
echo "<br>class2 objects created:".MySecondStaticClass::showCount();
echo "<hr>";
$classObject5=new MySecondStaticClass();
?>