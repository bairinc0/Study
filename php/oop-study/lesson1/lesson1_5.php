<?php
class ShopProduct{
	public $title="standard";
	public $producerMainName="author sec name";
	public $producerFirstName="author name";
	public $price=0;
	function getProducer(){
		return "{$this->producerFirstName}  "."{$this->producerMainName}";
	}
	function __construct($title,$firstName,$mainName,$price){
		$this->title=$title;
		$this->producerMainName=$mainName;
		$this->producerFirstName=$firstName;
		$this->price=$price;
	}
}
class ShopProductWriter{
	function write(ShopProduct $shopProduct){
		$str="{$shopProduct->title}:".$shopProduct->getProducer()."({$shopProduct->price})\n";
		print $str;
	}
}

class Wrong{
	public $variable=1;
}

$product2=new ShopProduct("Собачье сердце","Михаил","Булгаков",5);
$writer=new ShopProductWriter();
$writer->write($product2);
echo "<hr>";
$wrongClass=new Wrong;
$writer->write($wrongClass);
?>