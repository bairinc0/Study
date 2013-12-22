abstract class Hero{
    WeaponBehavior weapon;
    protected String name;
    public Hero(String name){
        this.name=name;
    }
    public void fight(){
        weapon.useWeapon();
    }
    public abstract void battleCry();
    public void setWeapon(WeaponBehavior weapon){
        this.weapon=weapon;
    }
}