<div id="content">
	<p>
	<form action="newsProcess.php" method="POST">
		��������: <input name="title" value="{$news.title}" placeholder="������� �������� �������"/><br/>
		����� �������: <br/><textarea name="content" placeholder="������� �������" cols="40" rows="5">{$news.content}</textarea><br/>
		<input type="hidden" name="newsid" value="{$newsid}">
		<input type="submit" value="��������� ���������">
	</form>
	</p>
</div>