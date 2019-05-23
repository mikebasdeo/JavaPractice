package DesignPatterns.FactoryPattern;

public abstract class Enemy {

    //attributes
    private String name;
    private double damage;

    //methods
    public String getName(){
    return this.name;
    }
    public void setName(String name){
        this.name = name;
    }


    public double getDamage(){
        return this.damage;
    }
    public void setDamage(double damage){
        this.damage = damage;
    }

    public void enemyFollow(){
        System.out.println(getName()+ "following");
    }
    public void enemyShow(){
        System.out.println(getName()+ "onscreen.");
    }
    public void enemyShoot(){
        System.out.println(getName()+ "Shoots for " + getDamage());
    }
}
