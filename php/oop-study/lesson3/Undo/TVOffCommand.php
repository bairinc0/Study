<?php
	class TVOffCommand implements Command{
		private $tv;
		public function __construct(TV $tv){
			$this->tv=$tv;
		}
		public function execute(){
			$this->tv->off();//Выключили			
		}
		public function undo(){
			$this->tv->on();//Включили
			$this->tv->setVolume(10);//задали громкость звука
			$this->tv->setChannel(1);//Задали канал
		}
	}
?>