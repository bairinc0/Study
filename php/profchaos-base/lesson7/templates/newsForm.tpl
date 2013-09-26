<div id="content">
	<p>
	<form action="newsProcess.php" method="POST">
		Название: <input name="title" value="{$news.title}" placeholder="Введите название новости"/><br/>
		Текст новости: <br/><textarea name="content" placeholder="Введите новость" cols="40" rows="5">{$news.content}</textarea><br/>
		<input type="hidden" name="newsid" value="{$newsid}">
		<input type="submit" value="Сохранить изменения">
	</form>
	</p>
</div>