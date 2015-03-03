<?php
	//����� Car - ����������� �����
	abstract class Car{
		private $model;// ������
		private $weight;// ���
		private $speed; // ��������
		protected $gasolinePrice=40;//��������� ������� �� ����
		//������� � �������
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
		//���������� ����������� �������
		public abstract function rentPricePerHour();
		public abstract function fuelSpend();
		public abstract function rentPrice($time);
	}
?>