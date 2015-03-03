<?php
class ShopProduct{
	private $price=-1;
	private $discount=10;
	function setPrice($price){//Задаём цену. Цена не может быть меньше нуля!!!
		if ($price>0){
			$this->price=$price;
		}
	}
	function getPrice(){//Возвращаем цену со скидкой!
		return $this->price*(100-$this->discount)/100;
	}
}
?>