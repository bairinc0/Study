import java.util.*;
/** Моя первая программа на Java
* Выводит приветствие и текущее число
*@author Profchaos
*@author profchaos.ru
*@version 2.0
*/
import ru.profchaos.java.print.*;
public class HelloDate{
	/**
	*Точка входа в приложение
	*@param args Массив строковых аргументов
	*@throws exceptions Исключения не выдаются
	*/
	public static void main(String[] args){
		Print.print("Hello World!");
		Print.printnb(new Date());
		//! Класс PrintClosed не объявлен как public поэтому доступен только внутри пакета
		//!PrintClosed Test=new PrintClosed();
		
	}
} 