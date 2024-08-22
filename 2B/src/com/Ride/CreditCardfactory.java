package com.Ride;

public class CreditCardfactory extends Paymentmethodfactory{
	@Override
    public Paymentmethod createPaymentMethod() {
        return new CreditCard();
    }


}
