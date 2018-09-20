package model;

public class Bike
{
	//Declaration Section
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
}
