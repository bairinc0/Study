<?php
	//����� Lorry - ��������
	require_once("Car.php");
	class Lorry extends Car{
		private $capacity; //����������������
		private $carryingWeight;//��� ������������ �����		
		//������� � �������
		public function setCapacity($capacity){
			if ($capacity>0){
				$this->capacity=$capacity;
			}
		}
		public function getCapacity(){
			return $this->capacity;
		}
		public function setCarryingWeight($carryingWeight){
			if ($carryingWeight>0){
				$this->carryingWeight=$carryingWeight;
			}
		}
		public function getCarryingWeight(){
			return $this->carryingWeight;
		}
		//���������� ����������� �������
		public function rentPricePerHour(){
			return $this->getCarryingWeight()*10;
		}
		public function fuelSpend(){
			return $this->getCarryingWeight()/100;
		}
		public function rentPrice($time){
			return ($this->rentPricePerHour()+$this->fuelSpend()*$this->gasolinePrice)*$time;
		}
	}
?>