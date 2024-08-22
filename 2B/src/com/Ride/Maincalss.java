package com.Ride;

public class Maincalss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehiclefactory carFactory = new Carfactory();
        Vehicle car = carFactory.createVehicle();
        car.ride();

        Vehiclefactory bikeFactory = new Bikefactory();
        Vehicle bike = bikeFactory.createVehicle();
        bike.ride();

        Vehiclefactory scooterFactory = new Scooterfactory();
        Vehicle scooter = scooterFactory.createVehicle();
        scooter.ride();

        // Abstract Factory Pattern
        Paymentmethodfactory creditCardFactory = new CreditCardfactory();
        Paymentmethod creditCard = creditCardFactory.createPaymentMethod();
        creditCard.pay(25.75);

        Paymentmethodfactory payPalFactory = new Paypalfactory();
        Paymentmethod payPal = payPalFactory.createPaymentMethod();
        payPal.pay(15.50);

        // Singleton Pattern
        userAuthentication auth = userAuthentication.getInstance();
        auth.authenticate("user", "password");


	}

}
