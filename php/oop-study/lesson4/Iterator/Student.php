<?php	
	class Student extends DomainObject{		
		public $name;
		public $secondName;
		public $patronymic;
		public $group;
		/*������� � �������*/
		public function setGroup(Group $group){
			$this->group=$group;
		}
	}
?>