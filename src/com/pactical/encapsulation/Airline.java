package com.pactical.encapsulation;

public class Airline {

	
	    private String name;
	    private int flightCount;
	    private double revenue;

	    public Airline(String name, int flightCount, double revenue) {
	        this.name = name;
	        this.flightCount = flightCount;
	        this.revenue = revenue;
	    }

	    // Getters and setters
	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public int getFlightCount() {
	        return flightCount;
	    }

	    public void setFlightCount(int flightCount) {
	        this.flightCount = flightCount;
	    }

	    public double getRevenue() {
	        return revenue;
	    }

	    public void setRevenue(double revenue) {
	        this.revenue = revenue;
	    }

	    // Other methods
	    public void increaseFlightCount() {
	        flightCount++;
	    }

	    public void updateRevenue(double amount) {
	        revenue += amount;
	    }
	

}
