<?php /* Smarty version Smarty-3.1.15, created on 2014-02-01 08:45:38
         compiled from "template\index.tpl" */ ?>
<?php /*%%SmartyHeaderCode:3120552ecb432459383-32806440%%*/if(!defined('SMARTY_DIR')) exit('no direct access allowed');
$_valid = $_smarty_tpl->decodeProperties(array (
  'file_dependency' => 
  array (
    'c1330b55f35665f430ce9b8167feebce9b68bc0a' => 
    array (
      0 => 'template\\index.tpl',
      1 => 1384084578,
      2 => 'file',
    ),
  ),
  'nocache_hash' => '3120552ecb432459383-32806440',
  'function' => 
  array (
  ),
  'variables' => 
  array (
    'news' => 0,
    'new' => 0,
    'tags' => 0,
    'tag' => 0,
  ),
  'has_nocache_code' => false,
  'version' => 'Smarty-3.1.15',
  'unifunc' => 'content_52ecb4325bbcd9_69562248',
),false); /*/%%SmartyHeaderCode%%*/?>
<?php if ($_valid && !is_callable('content_52ecb4325bbcd9_69562248')) {function content_52ecb4325bbcd9_69562248($_smarty_tpl) {?>
<div class="row-fluid">
				<div class="span4">
					<div class="well sidebar-nav news">
						<div id="news">
							<!-- Подгружаем скрипт новостей для ажакса -->
							<script src="/code/js/ajax/newsLoader.js" type="text/javascript"></script>
							<!-- ============================================================ -->
							<?php  $_smarty_tpl->tpl_vars['new'] = new Smarty_Variable; $_smarty_tpl->tpl_vars['new']->_loop = false;
 $_from = $_smarty_tpl->tpl_vars['news']->value; if (!is_array($_from) && !is_object($_from)) { settype($_from, 'array');}
foreach ($_from as $_smarty_tpl->tpl_vars['new']->key => $_smarty_tpl->tpl_vars['new']->value) {
$_smarty_tpl->tpl_vars['new']->_loop = true;
?>
								<strong><?php echo $_smarty_tpl->tpl_vars['new']->value['uploaddate'];?>
</strong><br/>
									<br/> <a href="/news/<?php echo $_smarty_tpl->tpl_vars['new']->value['furl'];?>
"><?php echo $_smarty_tpl->tpl_vars['new']->value['alt'];?>
</a>
									<br/><br/>
							<?php } ?>	
						</div>					
						<hr/>
						Выберите теги:<br/><br/>						
						<form class="form-horizontal" id="news_form">																			
						    <select data-placeholder="Теги" id="newsTags" class="form-control chzn-select news-tags" multiple tabindex="6">
							<option value=""></option>
							<?php  $_smarty_tpl->tpl_vars['tag'] = new Smarty_Variable; $_smarty_tpl->tpl_vars['tag']->_loop = false;
 $_from = $_smarty_tpl->tpl_vars['tags']->value; if (!is_array($_from) && !is_object($_from)) { settype($_from, 'array');}
foreach ($_from as $_smarty_tpl->tpl_vars['tag']->key => $_smarty_tpl->tpl_vars['tag']->value) {
$_smarty_tpl->tpl_vars['tag']->_loop = true;
?>
								<option value="<?php echo $_smarty_tpl->tpl_vars['tag']->value['tag_en'];?>
"><?php echo $_smarty_tpl->tpl_vars['tag']->value['tag_ru'];?>
</option>
							<?php } ?>
							</select>
							<input type="hidden" id="ajaxFormTest" value="formAjaxMarker">																																	        												
						</form>				
					</div> 
				</div> 
				<!--  Блок статей по 3 статьи в строке потом повторяем-->
				<div class="span8">
					<div class="row-fluid">
						<ul class="thumbnails">
						    <li class="span4">
						    <a href="#" class="thumbnail">
						    <img src="/img/main_slider/test.jpg" alt="">
						    </a>
						    <p>Что такое наука и зачем ей заниматься? 
								Читайте новый материал о научной работе студентов!</p>						    
						    </li>
						    <li class="span4">
						    <a href="#" class="thumbnail">
						    <img src="/img/main_slider/test2.jpg" alt="">
						    </a>
						    <p>Почему престижно спортивное программирование? Вы узнаете в сенсационном материале нашего портала!</p>						    
						    </li>
						    <li class="span4">
						    <a href="#" class="thumbnail">
						    <img src="/img/main_slider/test.jpg" alt="">
						    </a>
						    <p>Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. </p>						    
						    </li>
						    
						    </ul>
					</div>
				</div>
			</div><?php }} ?>
