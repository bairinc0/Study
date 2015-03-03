<?php /* Smarty version Smarty-3.1.15, created on 2014-05-10 07:06:41
         compiled from "Z:\home\imibsu_ru.ru\www\standard\admin\template\loginForm.tpl" */ ?>
<?php /*%%SmartyHeaderCode:20662536dd00106aab9-03578185%%*/if(!defined('SMARTY_DIR')) exit('no direct access allowed');
$_valid = $_smarty_tpl->decodeProperties(array (
  'file_dependency' => 
  array (
    '452d94d562807139c27112978cefc8233df0b797' => 
    array (
      0 => 'Z:\\home\\imibsu_ru.ru\\www\\standard\\admin\\template\\loginForm.tpl',
      1 => 1382098357,
      2 => 'file',
    ),
  ),
  'nocache_hash' => '20662536dd00106aab9-03578185',
  'function' => 
  array (
  ),
  'has_nocache_code' => false,
  'version' => 'Smarty-3.1.15',
  'unifunc' => 'content_536dd00124fcc8_83306073',
),false); /*/%%SmartyHeaderCode%%*/?>
<?php if ($_valid && !is_callable('content_536dd00124fcc8_83306073')) {function content_536dd00124fcc8_83306073($_smarty_tpl) {?><!DOCTYPE html>
<html lang="ru">
  <head>
    <meta charset="UTF-8">
    <title>Login Page</title>
    <link rel="stylesheet" href="/code/bootstrap.css">
    <link rel="stylesheet" href="/code/login.css">
    <link rel="stylesheet" href="/code/magic.css">
      </head>
  <body>

	      
<div class="container">
      <div class="tab-content">
        <div id="login" class="tab-pane active">
            <form action="/loginProcess" method="POST" class="form-signin">
                <p class="text-muted text-center">
                    Введите имя пользователя и пароль
                </p>
                <input name="login" type="text" placeholder="Логин" class="form-control">
                <input name="password" type="password" placeholder="Пароль" class="form-control">
                <input type="hidden" name="Location" value="loginForm">
                <button class="btn btn-lg btn-primary btn-block" type="submit">Авторизоваться</button>
            </form>
        </div>
 


</div> <!-- /container -->

	      
	      
    
  </body>
</html>
<?php }} ?>
