<?php /* Smarty version Smarty-3.1.15, created on 2014-05-10 07:19:07
         compiled from "template\cabHeader.tpl" */ ?>
<?php /*%%SmartyHeaderCode:4989536dd2ebecbb36-07937018%%*/if(!defined('SMARTY_DIR')) exit('no direct access allowed');
$_valid = $_smarty_tpl->decodeProperties(array (
  'file_dependency' => 
  array (
    '5567be01c5c8f339f37a5f92151cdf0a8d6f2479' => 
    array (
      0 => 'template\\cabHeader.tpl',
      1 => 1385292797,
      2 => 'file',
    ),
  ),
  'nocache_hash' => '4989536dd2ebecbb36-07937018',
  'function' => 
  array (
  ),
  'variables' => 
  array (
    'MCE' => 0,
    'sitefolder' => 0,
    'login' => 0,
    'status' => 0,
  ),
  'has_nocache_code' => false,
  'version' => 'Smarty-3.1.15',
  'unifunc' => 'content_536dd2ec1475a6_54089820',
),false); /*/%%SmartyHeaderCode%%*/?>
<?php if ($_valid && !is_callable('content_536dd2ec1475a6_54089820')) {function content_536dd2ec1475a6_54089820($_smarty_tpl) {?><!DOCTYPE html>
<html lang="ru">
    <head>
        <meta charset="windows-1251">
        <title>Личный кабинет</title>
        <link rel="stylesheet" href="/code/bootstrap.css">
        <link rel="stylesheet" href="/code/main.css"/>
        <link rel="stylesheet" href="/code/font-awesome.css"/>
        <!-- Таблички -->
        <link rel="stylesheet" href="/code/demo_page.css">
		<link rel="stylesheet" href="/code/DT_bootstrap.css">
		<script src="/code/js/jquery-2.0.3.min.js"></script>
        <script src="/code/modernizr-2.6.2-respond-1.1.0.min.js"></script>
        <!-- Old Header Info -->
        <!-- TinyMCE -->
		<script type="text/javascript" src="<?php echo $_smarty_tpl->tpl_vars['MCE']->value;?>
"></script>
		<script type="text/javascript">
		        tinyMCE.init({
		                // General options
						mode : "specific_textareas",
						editor_selector : "mceEditor",
		                theme : "advanced",
		                plugins : "imagemanager,filemanager,safari,pagebreak,style,layer,table,save,advhr,advimage,advlink,emotions,iespell,inlinepopups,insertdatetime,preview,media,searchreplace,print,contextmenu,paste,directionality,fullscreen,noneditable,visualchars,nonbreaking,xhtmlxtras,template",
		
		                // Theme options
		                theme_advanced_buttons1 : "save,newdocument,|,bold,italic,underline,strikethrough,|,justifyleft,justifycenter,justifyright,justifyfull,styleselect,formatselect,fontselect,fontsizeselect",
		                theme_advanced_buttons2 : "cut,copy,paste,pastetext,pasteword,|,search,replace,|,bullist,numlist,|,outdent,indent,blockquote,|,undo,redo,|,link,unlink,anchor,image,cleanup,help,code,|,insertdate,inserttime,preview,|,forecolor,backcolor",
		                theme_advanced_buttons3 : "tablecontrols,|,hr,removeformat,visualaid,|,sub,sup,|,charmap,emotions,iespell,media,advhr,|,print,|,ltr,rtl,|,fullscreen",
		                theme_advanced_buttons4 : "insertlayer,moveforward,movebackward,absolute,|,styleprops,|,cite,abbr,acronym,del,ins,attribs,|,visualchars,nonbreaking,template,pagebreak",
		                theme_advanced_toolbar_location : "top",
		                theme_advanced_toolbar_align : "left",
		                theme_advanced_statusbar_location : "bottom",
		                theme_advanced_resizing : true,
		               
		                // Drop lists for link/image/media/template dialogs
		                template_external_list_url : "examples/lists/template_list.js",
		                external_link_list_url : "examples/lists/link_list.js",
		                external_image_list_url : "examples/lists/image_list.js",
		                media_external_list_url : "examples/lists/media_list.js"
		
		               
		        });
		</script>
		 <!-- Old Header Info -->
    </head>
    <body>
        <div id="wrap">

            <div id="top">
                <!-- .navbar -->
<nav class="navbar navbar-inverse navbar-static-top">
    <!-- Brand and toggle get grouped for better mobile display -->
  

    <div class="topnav">
<!--правое верхнее меню  -->
        <div class="btn-toolbar">
            <div class="btn-group">
                <a data-placement="bottom" data-original-title="Show / Hide Sidebar" data-toggle="tooltip" class="btn btn-success btn-sm" id="changeSidebarPos">
                    <i class="icon-resize-horizontal"></i>
                </a>
            </div>
            <!-- 
            <div class="btn-group">
                <a data-placement="bottom" data-original-title="E-mail" data-toggle="tooltip" class="btn btn-default btn-sm">
                    <i class="icon-envelope"></i>
                    <span class="label label-warning">5</span>
                </a>
                <a data-placement="bottom" data-original-title="Messages" href="#" data-toggle="tooltip" class="btn btn-default btn-sm">
                    <i class="icon-comments"></i>
                    <span class="label label-danger">4</span>
                </a>
            </div>
             -->
            <div class="btn-group">
                
                <a data-toggle="modal" data-original-title="Помощь" data-placement="bottom" class="btn btn-default btn-sm" href="#helpModal">
                    <i class="icon-question-sign"></i>
                </a>
            </div>
            <div class="btn-group">
                <a href="<?php echo $_smarty_tpl->tpl_vars['sitefolder']->value;?>
/standard/admin/logOut.php" data-toggle="tooltip" data-original-title="Выйти" data-placement="bottom" class="btn btn-metis-1 btn-sm">
		  <i class="icon-off"></i>
                </a>
            </div>
        </div>
    </div>
<!--правое верхнее меню  конец-->





    <!-- /.topnav -->
    <div class="collapse navbar-collapse navbar-ex1-collapse">
    <!--левое верхнее меню-->
        <!-- .nav -->
        <ul class="nav navbar-nav">
            <li><a href="/cabinet">Сводка</a></li>
            
            
            <li class='dropdown '>
                <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                    Form Elements <b class="caret"></b>
                </a>
                <ul class="dropdown-menu">
                    <li><a href="#">General</a></li>
                    <li><a href="#">Validation</a></li>
                    <li><a href="#">WYSIWYG</a></li>
                    <li><a href="#">Wizard &amp; File Upload</a></li>
                </ul>
            </li>
        </ul>
        <!-- /.nav -->
    </div>
    <!--левое верхнее меню  конец-->
</nav>
<!-- /.navbar -->

                <!-- header.head -->
                <header class="head">
                    <div class="search-bar">
                        

                        

                    </div>
                    <!-- ."main-bar -->
                    <div class="main-bar">
                        <h3><i class="icon-home"></i> Личный кабинет ИМИ</h3>
                    </div>
                    <!-- /.main-bar -->
                </header>
                <!-- end header.head -->


            </div>
            <!-- /#top -->

            <div id="left">
                <div class="media user-media">
				        <div class="media-body">
					<h5 class="media-heading"><?php echo $_smarty_tpl->tpl_vars['login']->value;?>
</h5>
					<ul class="list-unstyled user-info">
					    <li><?php echo $_smarty_tpl->tpl_vars['status']->value;?>
</li>
					    
					</ul>
				    </div>
				</div>
				<!-- #menu Левое меню-->
				<ul id="menu" class="collapse">
				    <li class="nav-header">Меню</li>
				     <li class="nav-divider"></li>	
				     <li><a href="/cabinet"><i class="icon-dashboard"></i> Сводка</a></li>
				     <li><a href="/observer"><i class="icon-table"></i> Заполнить данные</a></li>
				    
				    <li class="nav-divider"></li>				    
				    <li><a href="<?php echo $_smarty_tpl->tpl_vars['sitefolder']->value;?>
/standard/admin/logOut.php"><i class="icon-signin"></i> Выйти</a></li>
				</ul>
<!-- /#menu -->
            </div>
            <!-- /#left -->



            <div id="content">
                <div class="outer">
                    <div class="inner"><?php }} ?>
