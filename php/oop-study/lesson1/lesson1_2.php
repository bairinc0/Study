<?php
	class ShopProduct{
		public $title="standard";
		public $producerMainName="author sec name";
		public $producerFirstName="author name";
		public $price=0;
		function getProducer(){
			return $this->producerFirstName ." + ".$this->producerMainName;
		}	
		function __construct($title,$firstName,$mainName,$price){
			$this->title=$title;
			$this->producerMainName=$mainName;
			$this->producerFirstName=$firstName;
			$this->price=$price;
		}	
	}
	$product2=new ShopProduct("Собачье сердце","Михаил","Булгаков",5);
	print $product2->getProducer();
?>