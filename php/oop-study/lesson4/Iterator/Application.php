<?php
	require_once("DomainObject.php");
	require_once("Collection.php");
	require_once("Group.php");
	require_once("Student.php");
	$collection=new Collection();
	$s=new Student();
	$s->setId(1);
	$g=new Group();
	$g->setId(2);
	$s->setGroup($g);
	$collection->add($s);
	$s=new Student();
	$s->setId(2);
	$g=new Group();
	$g->setId(4);
	$s->setGroup($g);
	$collection->add($s); 
	$collection->add($g);
	foreach ($collection as $item){
		print_r($item);
		echo "<hr>";
	}
?>