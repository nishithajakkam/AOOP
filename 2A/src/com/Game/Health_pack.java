package com.Game;

public class Health_pack implements Power_up {
	@Override
    public void activate() {
        System.out.println("Health restored!");
    }
}

class Shield implements Power_up {
    @Override
    public void activate() {
        System.out.println("Shield activated!");
    }


}
