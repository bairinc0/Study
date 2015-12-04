public abstract class Command{
	public void logAction(){
		String time="current datetime";
		//поток вывода в файл!
		System.out.println(time+": command executed - "+this.getClass());	
	}
	public abstract void doExecute();
	public void execute(){
		logAction();
		doExecute();
	}
}