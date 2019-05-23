package DesignPatterns.FactoryPattern;

import org.junit.Assert;
import org.junit.Test;

public class Tests {

    @Test
    public void TestManualEnemyCreation(){

        // TODO: Assert for object type practice.
        //lets try to make a ghoul
        Enemy testGhoul = new EnemyGhoul();
        System.out.println(testGhoul.getName());

        Enemy testSuperMutant = new EnemySuperMutant();
        System.out.println(testSuperMutant.getName());

    }

    @Test
    public void TestEnemyFactory(){

        Enemy testGhoul = EnemyFactory.makeEnemy("Ghoul");
        Enemy testSuperMutant = EnemyFactory.makeEnemy("Super Mutant");
        System.out.println(testGhoul.getName());
        System.out.println(testSuperMutant.getName());

    }

}
