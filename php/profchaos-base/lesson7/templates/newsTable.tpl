<div id="content">
	<h2>�������</h2>
	<p>
		<a href="newsForm.php">[�������� �������]</a>
	</p>
	{if $news}		
		<table border=1>	
		<tr>
		<td><b>��������</b></td><td><b>���� ��������</b></td><td><b>����������</b></td>
		</tr>
		{foreach item=new from=$news}
		<tr>
		<td>{$new.title}</td><td>{$new.uploaddate}</td>
		<td><a href="newsForm.php?id={$new.id}">[��������]</a> <a href="newsDelete.php?id={$new.id}">[�������]</a></td>
		</tr>	
		{/foreach}
		</table>
	{else}
		��� �������� � ���� ������!
    {/if}
</div>