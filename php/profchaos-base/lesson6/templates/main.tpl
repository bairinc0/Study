<div id="content">
	{if $news}
		<h2>�������</h2>
		{foreach item=new from=$news}
		<p>
			<h3>{$new.title} - {$new.uploaddate}</h3>
			{$new.content}
		</p>
		{/foreach}
	{else}
		��� �������� � ���� ������!
    {/if}
</div>