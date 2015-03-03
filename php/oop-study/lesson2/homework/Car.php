<?php
	//Класс Car - абстрактный класс
	abstract class Car{
		private $model;// Модель
		private $weight;// Вес
		private $speed; // скорость
		protected $gasolinePrice=40;//Стоимость бензина за литр
		//Сеттеры и геттеры
		public function setGasolinePrice($gasolinePrice){
			$this->gasolinePrice=$gasolinePrice;
		}
		public function setModel($model){
			$this->model=$model;
		}
		public function getModel(){
			return $this->model;
		}
		public function setWeight($weight){
			if ($weight>0){
				$this->weight=$weight;
			}
		}
		public function getWeight(){
			return $this->weight;
		}
		public function setSpeed($speed){
			if ($speed>0){
				$this->speed=$speed;
			}
		}
		public function getSpeed(){
			return $this->speed;
		}
		//Определяем абстрактные функции
		public abstract function rentPricePerHour();
		public abstract function fuelSpend();
		public abstract function rentPrice($time);
	}
?>