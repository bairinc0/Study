<?php	
	class Student extends DomainObject{		
		public $name;
		public $secondName;
		public $patronymic;
		public $group;
		/*Сеттеры и геттеры*/
		public function setGroup(Group $group){
			$this->group=$group;
		}
	}
?>