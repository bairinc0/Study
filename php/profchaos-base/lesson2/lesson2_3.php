<?php
function maxInArr($arr){
	$max=0;
	//������� ������������ ��������
	foreach($arr as $elem){
		if($max<$elem['cash']){
			$max=$elem['cash'];
		}		
	}
	//���� ���� � ������������ ��������� � ���������� � ������ $newArr	
	$newArr=array();
	foreach($arr as $elem){
		if($max==$elem['cash']){
			array_push($newArr,array( 'name'=>$elem['name'],'gender'=>$elem['gender'],'age'=>$elem['age'],'cash'=>$elem['cash']));
		}		
	}
	return $newArr;
}
//����� ������������� ������
$a=array();
array_push($a,array("name"=>"Petrov","gender"=>"male","age"=>30,"cash"=>10000));
array_push($a,array("name"=>"Ivanov","gender"=>"male","age"=>33,"cash"=>20000));
array_push($a,array("name"=>"Sidorov","gender"=>"male","age"=>35,"cash"=>20000));
array_push($a,array("name"=>"Sokolov","gender"=>"male","age"=>40,"cash"=>15000));
//���������� �������
$maxCash=maxInArr($a);
foreach($maxCash as $elem){
	echo $elem['name']." ".$elem['gender']." ".$elem['age']." ".$elem['cash']."<br/>"; 
}
?>