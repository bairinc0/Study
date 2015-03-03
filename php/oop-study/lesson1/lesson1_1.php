<?php
	//Создаём класс ShopProduct
	class ShopProduct{
		public $title="standard good";
		public $producerMainName="author name";
		public $producerSecondName="author second name";
		public $price=0;
		public function showInfo(){
			echo "Title:".$this->title." Name:".$this->producerMainName;
			echo " SecondName:".$this->producerSecondName." price:".$this->price;
		}
	}
	//Создаём Экземпляры класса и работаем с ними
	$product1=new ShopProduct();
	$product1->title="Книга Война и Мир";
	$product1->producerMainName="Лев";
	$product1->producerSecondName="Толстой";
	$product1->price=2560;
	$product1->showInfo();
	echo "<hr>";
	$product2=new ShopProduct();
	$product2->showInfo();
?>