<?php
class ShopProduct{
	private $price=-1;
	private $discount=10;
	function setPrice($price){//����� ����. ���� �� ����� ���� ������ ����!!!
		if ($price>0){
			$this->price=$price;
		}
	}
	function getPrice(){//���������� ���� �� �������!
		return $this->price*(100-$this->discount)/100;
	}
}
?>