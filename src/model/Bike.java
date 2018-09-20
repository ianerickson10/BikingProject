package model;

public class Bike
{
	//Constructor Section
	private String rideName;
	private double distance;
	private int mins;
	private int elevationGain;
	private double avgSpeed;
	
	
	/**
	 * Default constructors
	 * sets them to -1 so I know there is no info
	 */
	public Bike()
	{
		this.rideName = "unnamed ride";
		this.distance = -1;
		this.mins = -1;
		this.elevationGain = -1;
		this.avgSpeed = -1;
	}

	public String getRideName()
	{
		return rideName;
	}
	
	public double getDistance()
	{
		return distance;
	}
	
	public int getMins()
	{
		return mins;
	}
	
	public int getElevationGain()
	{
		return elevationGain;
	}
	
	public double getAvgSpeed()
	{
		return avgSpeed;
	}
	
	public void setRideName(String rideName)
	{
		this.rideName = rideName;
	}
	
	public void setDistance(double distance)
	{
		this.distance = distance;
	}
	
	public void setMins(int mins)
	{
		this.mins = mins;
	}
	
	public void setElevationGain(int elevationGain)
	{
		this.elevationGain = elevationGain;
	}
	
	public void setAvgSpeed(double avgSpeed)
	{
		this.avgSpeed = avgSpeed;
	}
	
}
