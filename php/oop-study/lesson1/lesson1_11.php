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
		parent::__construct ($title,$firstName,$mainName,$price);
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

?>