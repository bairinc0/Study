<!DOCTYPE html">
<html xmlns="http://www.w3.org/1999/xhtml">
 <head>
  <meta http-equiv="Content-Type" content="text/html; charset=windows-1251" />
  <title>��� ������ ������</title>
  <link rel="stylesheet" type="text/css" href="css/style.css" >
 </head>
 <body>
  <div id="head">
   <h1>��� ������ ������</h1>
  </div>
  <div id="menu">
   <div><a href="index.php">�������</a></div>
   {if !$auth}
   <div><a href="authForm.php">�����������</a></div>
   {else}
   <div><a href="logout.php">����� �� �������</a></div>	
   {/if}
   <div class="line"></div>
   {if $auth}
   <div><a href="newsTable.php">������� ��������</a></div>
   <div><a href="addUserForm.php">�������� ������������</a></div>
   {/if}
   
  </div>