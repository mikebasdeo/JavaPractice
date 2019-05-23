package DesignPatterns.FactoryPattern;

public class EnemyFactory {

    public static Enemy makeEnemy(String newString){
        Enemy newEnemy = null;
        if(newString.equals("Ghoul")){
            newEnemy = new EnemyGhoul();
        }
        if(newString.equals("Super Mutant")){
            newEnemy = new EnemySuperMutant();
        }
        return newEnemy;
    }
}
