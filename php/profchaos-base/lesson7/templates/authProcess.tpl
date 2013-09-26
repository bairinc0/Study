<div id="content">
	{if $status}
		Вы успешно авторизовались!<br/>
		<a href="newsTable.php">К таблице новостей</a>
	{else}
		Неправильно введён логин или пароль, попробуйте <a href="authForm.php">снова</a>.
    {/if}
    
    
</div>