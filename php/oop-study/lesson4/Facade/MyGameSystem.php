<?php
/*Паттерн Фасад*/
class MyGameSystem{
	private $console;
    private $tv;
	private $stereo;
    public function __construct($console, $tv, $stereo){
        $this->tv=$tv;
        $this->console=$console;
		$this->stereo=$stereo;
    }
    public function onSystem(){
		$this->tv->on();
		$this->tv->setVolume(0);
		$this->tv->setChannel(150);
		$this->stereo->on();
		$this->stereo->setVolume(10);
		$this->console->powerButton();
		$this->console->loadDisk("Tetris the video game");
		$this->console->loadGame();
	}
	public function offSystem(){
		$this->tv->off();
		$this->stereo->off();
		$this->console->powerButton();		
	}
} 
?>