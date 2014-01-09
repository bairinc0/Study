public abstract class CaffeineBeverage{
    final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()){
            addCondiments();
        }
        else{
            System.out.println("Without condiments");
        }
        
    }
    boolean customerWantsCondiments(){
        return true;
    }
    abstract void brew();
    abstract void addCondiments();
    final void boilWater(){
        System.out.println("Boiling water!");
    }
    final void pourInCup(){
        System.out.println("Pouring into cup!");
    }
}