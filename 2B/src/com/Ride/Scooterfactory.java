package com.Ride;

public class Scooterfactory extends Vehiclefactory{
	 @Override
	    public Vehicle createVehicle() {
	        return new Scooter();
	    }
}
