package com.sandeep.account;

public class Admin extends Account{
        @Override
        public boolean resetPassword() {
                return false;
        }
        public boolean addParkingSlot(){
           return false;
        }
}
