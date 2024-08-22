package com.Ride;

public class Paypal implements Paymentmethod{
	@Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using PayPal.");
    }

	@Override
	public Vehicle createVehicle() {
		// TODO Auto-generated method stub
		return null;
	}


}
