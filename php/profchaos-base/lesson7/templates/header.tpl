<!DOCTYPE html">
<html xmlns="http://www.w3.org/1999/xhtml">
 <head>
  <meta http-equiv="Content-Type" content="text/html; charset=windows-1251" />
  <title>Мой первый шаблон</title>
  <link rel="stylesheet" type="text/css" href="css/style.css" >
 </head>
 <body>
  <div id="head">
   <h1>Мой первый шаблон</h1>
  </div>
  <div id="menu">
   <div><a href="index.php">Главная</a></div>
   {if !$auth}
   <div><a href="authForm.php">Авторизация</a></div>
   {else}
   <div><a href="logout.php">Выйти из системы</a></div>	
   {/if}
   <div class="line"></div>
   {if $auth}
   <div><a href="newsTable.php">Таблица новостей</a></div>
   <div><a href="addUserForm.php">Добавить пользователя</a></div>
   {/if}
   
  </div>