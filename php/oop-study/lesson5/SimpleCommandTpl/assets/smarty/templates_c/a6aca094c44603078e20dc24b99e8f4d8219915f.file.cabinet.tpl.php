<?php /* Smarty version Smarty-3.1.15, created on 2014-02-21 04:48:59
         compiled from "Z:\home\imibsu_ru.ru\www\standard\admin\template\cabinet.tpl" */ ?>
<?php /*%%SmartyHeaderCode:22505306dabba8ed98-57617616%%*/if(!defined('SMARTY_DIR')) exit('no direct access allowed');
$_valid = $_smarty_tpl->decodeProperties(array (
  'file_dependency' => 
  array (
    'a6aca094c44603078e20dc24b99e8f4d8219915f' => 
    array (
      0 => 'Z:\\home\\imibsu_ru.ru\\www\\standard\\admin\\template\\cabinet.tpl',
      1 => 1383800346,
      2 => 'file',
    ),
  ),
  'nocache_hash' => '22505306dabba8ed98-57617616',
  'function' => 
  array (
  ),
  'variables' => 
  array (
    'username' => 0,
    'status' => 0,
    'order' => 0,
    'panelCat' => 0,
    'panelImage' => 0,
    'panelFile' => 0,
    'panelQ' => 0,
    'panelGB' => 0,
    'albums' => 0,
    'panelNews' => 0,
  ),
  'has_nocache_code' => false,
  'version' => 'Smarty-3.1.15',
  'unifunc' => 'content_5306dabbae2432_85319208',
),false); /*/%%SmartyHeaderCode%%*/?>
<?php if ($_valid && !is_callable('content_5306dabbae2432_85319208')) {function content_5306dabbae2432_85319208($_smarty_tpl) {?>
<b>Личный кабинет</b><br>Здравствуйте <b><?php echo $_smarty_tpl->tpl_vars['username']->value;?>
</b><br>Ваш статус: <b><?php echo $_smarty_tpl->tpl_vars['status']->value;?>
</b><br><br>Доступные функции:<br>
<?php if ($_smarty_tpl->tpl_vars['order']->value==1) {?>
<h2>Каталоги</h2>
<a href="<?php echo $_smarty_tpl->tpl_vars['panelCat']->value;?>
">Управление каталогами</a><br>



<h2>Другое</h2>
<a href="<?php echo $_smarty_tpl->tpl_vars['panelImage']->value;?>
">Управление Изображениями</a><br>
<a href="<?php echo $_smarty_tpl->tpl_vars['panelFile']->value;?>
">Управление Файлами</a><br>
<a href="panelUser.php">Управление Пользователями</a><br>
<a href="<?php echo $_smarty_tpl->tpl_vars['panelQ']->value;?>
">Управление Анкетами</a><br>
<a href="<?php echo $_smarty_tpl->tpl_vars['panelGB']->value;?>
">Управление Гостевой книгой</a><br>
<a href="<?php echo $_smarty_tpl->tpl_vars['albums']->value;?>
">Управление фотогалереей</a><br>
<a href="<?php echo $_smarty_tpl->tpl_vars['panelNews']->value;?>
">Управление новостями</a><br>
<?php } else { ?>
<a href="/observer">Перейти к редактированию посещаемости</a>
<?php }?>


<?php }} ?>
