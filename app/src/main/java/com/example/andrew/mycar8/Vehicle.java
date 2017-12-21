package com.example.andrew.mycar8;

    /**
     * Created by Andrew on 5/12/2017.
     * @author Andrew
     * @version 2.0
     */
// the default constructor
    public class Vehicle {
        public static int counter = 0;
        private String make;
        private int year;
        private String message;

        public Vehicle() {
            this.make = "Volvo";
            this.year = 2012;
            this.message = "This is the default message.";
        }
        /*
         * This constructor takes two parameters.
         */
        public Vehicle(String make, int year) {
            this.make = make;
            this.year = year;
            this.message = "Your car is a " + make + " built in " + year + ".";
            count();
        }

        /**
         * The constructor takes only the make of your car.
         * @param make make of your car.
         */
        public Vehicle(String make) {
            this();
            this.make = make;
            message = "You didn't type in year value.";
            count();
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        interface Controllable {
            void control();
        }

        @Override
        public String toString() {
            return message;
        }

        private void count(){
            this.counter++;
        }
}
