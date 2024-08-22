package com.Game;

public class TheEnemy {
	// Base class for Enemies

    public void attacking() {
	}
}

// Concrete classes for different types of Enemies
class Easyenemy extends TheEnemy {
    @Override
    public void attacking() {
        System.out.println("Easy Enemy attacks weakly!");
    }
}

class Mediumenemy extends TheEnemy {
    @Override
    public void attacking() {
        System.out.println("Medium Enemy attacks moderately!");
    }
}

class Hardenemy extends TheEnemy {
    @Override
    public void attacking() {
        System.out.println("Hard Enemy attacks fiercely!");
    }
}

// Factory class for creating Enemies
abstract class EnemyFactory {
    public abstract TheEnemy createEnemy();

    public static EnemyFactory getFactory(int difficulty) {
        switch (difficulty) {
            case 1: return new EasyenemyFactory();
            case 2: return new MediumenemyFactory();
            case 3: return new HardenemyFactory();
            default: throw new IllegalArgumentException("Invalid difficulty level");
        }
    }
}

// Concrete factories for each difficulty level
class EasyenemyFactory extends EnemyFactory {
    @Override
    public TheEnemy createEnemy() {
        return new Easyenemy();
    }
}

class MediumenemyFactory extends EnemyFactory {
    @Override
    public TheEnemy createEnemy() {
        return new Mediumenemy();
    }
}

class HardenemyFactory extends EnemyFactory {
    @Override
    public TheEnemy createEnemy() {
        return new Hardenemy();
    }
}



