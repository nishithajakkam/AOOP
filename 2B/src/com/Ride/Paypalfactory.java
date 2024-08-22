package com.Ride;

public class Paypalfactory extends Paymentmethodfactory {
	  @Override
	    public Paypal createPaymentMethod() {
	        return new Paypal();
	    }


}
