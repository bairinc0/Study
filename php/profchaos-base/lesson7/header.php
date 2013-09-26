<?php
	//делаем проверку авторизации и записываем в смарти авторизован текущий посетитель или нет
	if (is_logged()){
		$authorized=true;
	}
	else{
		$authorized=false;
	}
	$smarty->assign('auth',$authorized);
?>