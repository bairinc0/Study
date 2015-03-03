<?php
abstract class Figure{
	protected $centerX;
	protected $centerY;
	function __construct($centerX,$centerY){
		$this->centerX=$centerX;
		$this->centerY=$centerY;
	}
	abstract function draw();	
}
class Circle extends Figure{
	private $radius;
	function __construct($centerX,$centerY,$radius){
		parent::__construct($centerX,$centerY);
		$this->radius=$radius;
	}
	function draw(){
		echo "I'm drawing circle, middle in (".$this->centerX.",".$this->centerY."), radius=".$this->radius."<hr>";
	}
}
class Square extends Figure{
	private $side;
	function __construct($centerX,$centerY,$side){
		parent::__construct($centerX,$centerY);
		$this->side=$side;
	}
	function draw(){
		echo "I'm drawing Square, middle in (".$this->centerX.",".$this->centerY."), side=".$this->side."<hr>";
	}
}

class Paint{
	private static $figures=array();
	static function addFigure(Figure $figure){
		self::$figures[]=$figure;
	}
	static function drawFigures(){
		foreach(self::$figures as $figure){
			$figure->draw();
		}
	}
}
Paint::addFigure(new Circle(1,0,23));
Paint::addFigure(new Circle(0,0,10));
Paint::addFigure(new Square(10,10,2));
if ($_GET['figure_id']==1){//Òèï îáúåêòà îïğåäåëÿåòñÿ ÄÈÍÀÌÈ×ÅÑÊÈ!!!
	Paint::addFigure(new Square(100,100,200));
}
else{
	Paint::addFigure(new Circle(100,100,200));
}
Paint::drawFigures();
?>