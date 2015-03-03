<?php
	class Singleton{
		private static $instance;
		private $properties=array();
		private function setProperty($key,$val){
			$this->properties[$key]=$val;
		}	
		public function getProperty($key){
			return $this->properties[$key];
		}
		private function __construct(){
		}
		public static function getInstance(){
			if (empty($instance)){
				self::$instance=new Singleton();
				self::$instance->loadValues();
			}
			return self::$instance;
		}
		private function loadValues(){
			$this->setProperty("dbname","mybase");
			$this->setProperty("dblogin","superUser");
			$this->setProperty("dbpassword","Unknown_words");
		}
	}
?>