package com.Ride;

public class Bikefactory extends Vehiclefactory{
	@Override
    public Vehicle createVehicle() {
        return new Bike();
    }


}
