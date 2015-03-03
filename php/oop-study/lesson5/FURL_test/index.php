<?php
	echo $_SERVER['REQUEST_URI'];
	echo "<hr>";
	$url=explode("/",$_SERVER['REQUEST_URI']);
	$num=count($url);
	for ($i=0;$i<$num;$i++){
		echo $url[$i]."<br>";
	}
	echo "<hr>";
	echo $url[$num-1];
?>