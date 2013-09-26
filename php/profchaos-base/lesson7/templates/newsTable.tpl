<div id="content">
	<h2>Новости</h2>
	<p>
		<a href="newsForm.php">[Добавить новость]</a>
	</p>
	{if $news}		
		<table border=1>	
		<tr>
		<td><b>Название</b></td><td><b>Дата загрузки</b></td><td><b>Управление</b></td>
		</tr>
		{foreach item=new from=$news}
		<tr>
		<td>{$new.title}</td><td>{$new.uploaddate}</td>
		<td><a href="newsForm.php?id={$new.id}">[Изменить]</a> <a href="newsDelete.php?id={$new.id}">[Удалить]</a></td>
		</tr>	
		{/foreach}
		</table>
	{else}
		Нет новостей в базе данных!
    {/if}
</div>