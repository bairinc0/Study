/** Пакет для печати
* Выводит приветствие и текущее число
*@author Profchaos
*@author profchaos.ru
*@version 2.0
*/
package ru.profchaos.java.print;
import java.io.*;
public class Print{
	/**
	*Печатаем в консоль
	*/
	public static void print(Object obj){
		PrintClosed.printClosed("HERE COMES PRINT");
		System.out.println(obj);
	}
	public static void printS(){
		System.out.println();
	}
	public static void printnb(Object obj){
		System.out.print(obj);
	}
	
} 