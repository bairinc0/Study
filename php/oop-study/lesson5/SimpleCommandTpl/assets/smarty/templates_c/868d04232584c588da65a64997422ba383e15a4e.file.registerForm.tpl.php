<?php /* Smarty version Smarty-3.1.15, created on 2014-05-10 07:19:15
         compiled from "template\registerForm.tpl" */ ?>
<?php /*%%SmartyHeaderCode:24571536dd2f3382936-32577342%%*/if(!defined('SMARTY_DIR')) exit('no direct access allowed');
$_valid = $_smarty_tpl->decodeProperties(array (
  'file_dependency' => 
  array (
    '868d04232584c588da65a64997422ba383e15a4e' => 
    array (
      0 => 'template\\registerForm.tpl',
      1 => 1340615711,
      2 => 'file',
    ),
  ),
  'nocache_hash' => '24571536dd2f3382936-32577342',
  'function' => 
  array (
  ),
  'variables' => 
  array (
    'message' => 0,
    'user' => 0,
    'userid' => 0,
  ),
  'has_nocache_code' => false,
  'version' => 'Smarty-3.1.15',
  'unifunc' => 'content_536dd2f346f196_15596099',
),false); /*/%%SmartyHeaderCode%%*/?>
<?php if ($_valid && !is_callable('content_536dd2f346f196_15596099')) {function content_536dd2f346f196_15596099($_smarty_tpl) {?><td valign="top">
<form name="reg" action="registerProcess.php" method="POST">
<b><?php echo $_smarty_tpl->tpl_vars['message']->value;?>
</b><br>
Логин: <input name="login" value="<?php echo $_smarty_tpl->tpl_vars['user']->value['login'];?>
"><br>
Пароль: <input type="password" name="password"><br>
Пароль (Повторите ввод): <input type="password" name="password2"><br>
Описание:<br>
<textarea name="descr"><?php echo $_smarty_tpl->tpl_vars['user']->value['description'];?>
</textarea>
<input type="hidden" name="id" value="<?php echo $_smarty_tpl->tpl_vars['userid']->value;?>
"><br>
<input type="submit" value="Изменить">
</form>
</td>

<?php }} ?>
