public class Test{
    public static void main(String [] args){
        Tea tea=new Tea();
        tea.prepareRecipe();
        Coffee coffee=new Coffee();
        coffee.prepareRecipe();
        System.out.println("-------------------------");
        CoffeeWithHook c=new CoffeeWithHook();
        c.prepareRecipe();
    }
}