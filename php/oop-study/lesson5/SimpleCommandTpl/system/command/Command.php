<?php
	 abstract class Command{
		protected $smarty=false;
		//������ ������� �������
		private $header="header";
		private $footer="footer";
		private $main=false;
		protected $DBH=false;
		//������
		protected abstract function execute();
		public function doExecute(){
			$this->execute();
			if ($this->smarty){
				$this->smarty->display("application/view/".$this->header.".tpl");
				$this->smarty->display("application/view/".$this->main.".tpl");
				$this->smarty->display("application/view/".$this->footer.".tpl");
			}
		}
		function setSmarty(Smarty $smarty){
			$this->smarty=$smarty;
		}
		function setTemplate($main){
			$this->main=$main;
		}
		function setDBH(PDO $DBH){
			$this->DBH=$DBH;
		}
	 }
?>