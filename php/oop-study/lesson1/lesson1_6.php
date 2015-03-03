<?php
class ShopProduct{
	public $title="standard";
	public $producerMainName="author sec name";
	public $producerFirstName="author name";
	public $price=0;
	
	function getProducer(){
		return "{$this->producerFirstName}  "."{$this->producerMainName}";
	}
	function getSummaryLine(){
		$base="$this->title({$this->producerMainName},";
		$base.="{$this->producerFirstName})";
		return $base;
	}
	function __construct($title,$firstName,$mainName,$price){
		$this->title=$title;
		$this->producerMainName=$mainName;
		$this->producerFirstName=$firstName;
		$this->price=$price;
		
	}
}
class CDProduct extends ShopProduct{
	public $playLength;
	function __construct($title,$firstName,$mainName,$price,$playLength){
		$this->title=$title;
		$this->producerMainName=$mainName;
		$this->producerFirstName=$firstName;
		$this->price=$price;
		$this->playLength=$playLength;
	}
	function getPlayLength(){
		return $this->playLength;
	}
	function getSummaryLine(){
		$base=parent::getSummaryLine();	
		$base.=" Time:{$this->playLength}";
		return $base;
	}
}

$product1=new CDProduct ("Бурятские песни","Фольклор","Мэдэгма Доржиева",12.99,30.33);
print "Singer: {$product1->getProducer()}\n <br>";
print "Play length:{$product1->getPlayLength()}<br>";
print "summary line: {$product1->getSummaryLine()}";

?>