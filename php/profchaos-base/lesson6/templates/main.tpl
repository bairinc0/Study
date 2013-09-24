<div id="content">
	{if $news}
		<h2>Новости</h2>
		{foreach item=new from=$news}
		<p>
			<h3>{$new.title} - {$new.uploaddate}</h3>
			{$new.content}
		</p>
		{/foreach}
	{else}
		Нет новостей в базе данных!
    {/if}
</div>