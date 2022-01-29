package com.sandeep.payment;

public abstract class Rates {
    private int hourlyBikeCharges;
    private int hourlyCarCharges;
    private int hourlyElectricCarCharges;
    abstract int calculateCharges();
}
