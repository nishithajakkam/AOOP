package com.Ride;

public class CreditCard implements Paymentmethod{
	@Override
    public Vehicle createVehicle() {
        return new Car();
    }

	@Override
	public void pay(double amount) {
		// TODO Auto-generated method stub
		
	}


}
