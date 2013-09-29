public class SimpleArray{
	public static void main(String[] args){
		int[] a1={1,2,3,4,5};
		int[] a2;
		a2=a1;//на самом деле ссылка а2 теперь ссылается на а1, а память на которую ссылался а2 потеряна
		for (int i=0;i<5;i++){
			a2[i]=a2[i]+1;
		}
		for (int i=0;i<5;i++){
			System.out.println(a1[i]);
		}
	}
} 