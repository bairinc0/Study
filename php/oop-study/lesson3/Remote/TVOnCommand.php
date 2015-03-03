<?php
	class TVOnCommand implements Command{
		private $tv;
		public function __construct(TV $tv){
			$this->tv=$tv;
		}
		public function execute(){
			$this->tv->on();//Включили
			$this->tv->setVolume(10);//задали громкость звука
			$this->tv->setChannel(1);//Задали канал
		}
	}
?>