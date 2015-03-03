<?php
	class DefaultCommand extends Command{
		function execute(){			
			$STH=$this->DBH->prepare("SELECT * FROM news ORDER BY uploaddate DESC LIMIT 1");	 
			$STH->execute();
			$STH->setFetchMode(PDO::FETCH_ASSOC);
			$row=$STH->fetch();
			$this->smarty->assign("news",$row);
		}
	}
?>