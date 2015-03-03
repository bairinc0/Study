<?php /* Smarty version Smarty-3.1.15, created on 2014-05-10 07:19:08
         compiled from "template\panelUser.tpl" */ ?>
<?php /*%%SmartyHeaderCode:4722536dd2ec1702c9-89093045%%*/if(!defined('SMARTY_DIR')) exit('no direct access allowed');
$_valid = $_smarty_tpl->decodeProperties(array (
  'file_dependency' => 
  array (
    'cb57461a79101d49c64081203dc3aba5a6015174' => 
    array (
      0 => 'template\\panelUser.tpl',
      1 => 1340615711,
      2 => 'file',
    ),
  ),
  'nocache_hash' => '4722536dd2ec1702c9-89093045',
  'function' => 
  array (
  ),
  'variables' => 
  array (
    'sitefolder' => 0,
    'data' => 0,
    'elem' => 0,
  ),
  'has_nocache_code' => false,
  'version' => 'Smarty-3.1.15',
  'unifunc' => 'content_536dd2ec23a7a1_81066429',
),false); /*/%%SmartyHeaderCode%%*/?>
<?php if ($_valid && !is_callable('content_536dd2ec23a7a1_81066429')) {function content_536dd2ec23a7a1_81066429($_smarty_tpl) {?><td valign="top">
<a href="registerForm.php"><img src="<?php echo $_smarty_tpl->tpl_vars['sitefolder']->value;?>
/images/new.gif" alt="Добавить пользователя"></a><br>
<?php  $_smarty_tpl->tpl_vars['elem'] = new Smarty_Variable; $_smarty_tpl->tpl_vars['elem']->_loop = false;
 $_from = $_smarty_tpl->tpl_vars['data']->value; if (!is_array($_from) && !is_object($_from)) { settype($_from, 'array');}
foreach ($_from as $_smarty_tpl->tpl_vars['elem']->key => $_smarty_tpl->tpl_vars['elem']->value) {
$_smarty_tpl->tpl_vars['elem']->_loop = true;
?>
<?php echo $_smarty_tpl->tpl_vars['elem']->value['login'];?>
 <a href="registerForm.php?id=<?php echo $_smarty_tpl->tpl_vars['elem']->value['id'];?>
">[Редактировать]</a> <a href="deleteUser.php?id=<?php echo $_smarty_tpl->tpl_vars['elem']->value['id'];?>
">[Удалить]</a><br>
<?php } ?>
</td>

<?php }} ?>
