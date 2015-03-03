<?php /* Smarty version Smarty-3.1.15, created on 2015-02-09 16:58:14
         compiled from "templates\lesson4_3.tpl" */ ?>
<?php /*%%SmartyHeaderCode:295354d8ac3311de40-40752463%%*/if(!defined('SMARTY_DIR')) exit('no direct access allowed');
$_valid = $_smarty_tpl->decodeProperties(array (
  'file_dependency' => 
  array (
    '3d7c14208bb7f4de0784276d14e5699282a50e93' => 
    array (
      0 => 'templates\\lesson4_3.tpl',
      1 => 1423486676,
      2 => 'file',
    ),
  ),
  'nocache_hash' => '295354d8ac3311de40-40752463',
  'function' => 
  array (
  ),
  'version' => 'Smarty-3.1.15',
  'unifunc' => 'content_54d8ac331eb696_96437240',
  'variables' => 
  array (
    'title' => 0,
    'show' => 0,
    'variable1' => 0,
  ),
  'has_nocache_code' => false,
),false); /*/%%SmartyHeaderCode%%*/?>
<?php if ($_valid && !is_callable('content_54d8ac331eb696_96437240')) {function content_54d8ac331eb696_96437240($_smarty_tpl) {?><!DOCTYPE html>
<html lang="ru">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
	<link href="css/bootstrap.min.css" rel="stylesheet">	
    <title><?php echo $_smarty_tpl->tpl_vars['title']->value;?>
</title>    
</head>

<body>
	<div class="container">
		<?php if ($_smarty_tpl->tpl_vars['show']->value==1) {?>
			Задана переменная №1. Значение переменной = <?php echo $_smarty_tpl->tpl_vars['variable1']->value;?>

		<?php }?>	
	
	</div>
	<script src="js/jquery.min.js"></script>
	<script src="js/bootstrap.min.js" type="text/javascript"></script>
</body>

</html>
<?php }} ?>
