<?php
	class TVOffCommand implements Command{
		private $tv;
		public function __construct(TV $tv){
			$this->tv=$tv;
		}
		public function execute(){
			$this->tv->off();//Выключили			
		}
	}
?>