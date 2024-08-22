package com.Ride;

public class Carfactory extends Vehiclefactory {
	 @Override
	    public Vehicle createVehicle() {
	        return new Car();
	    }


}
