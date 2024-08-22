package com.Game;

public class Sword implements Weapons {
	@Override
    public void use() {
        System.out.println("Swinging a sword!");
    }
}

class Gun implements Weapons {
    @Override
    public void use() {
        System.out.println("Shooting with a gun!");
    }

	

}
