package controller;

//Import section
import model.Bike;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class BikeController
{
	//Declarations
	
	
	/**
	 * Builds controller
	 */
	public BikeController()
	{
		
	}
	
	/**
	 * Where the program calls methods to run
	 */
	public void start()
	{
		loopy();
		AskUser();
		ForLoop();
		MultiRide();
		ArrayMethod();
	}
	
	/**
	 * Testing out loops
	 */
	private void loopy()
	{
		//define variable before the loop
		boolean isFinished = false;
		int aNumber = 0;
		while (!isFinished)
		{
			
			JOptionPane.showMessageDialog(null, aNumber);
			
			aNumber += 1;
			
			if(aNumber > 25)
			{
				isFinished = true;
			}	
			
			if(isFinished)
			{
				JOptionPane.showMessageDialog(null, "Yaaaaaaaaaaayyyyyyyy");
			}
		}
		
		
	}
	
	/**
	 * This is where the user input is taken and stored
	 */
	private void AskUser()
	{
		Bike userRide = new Bike();
		
		String response = JOptionPane.showInputDialog(null, "How many miles did you ride?");
		while(!validDouble(response))
		{
			response = JOptionPane.showInputDialog(null, "Type a valid number. Ex: 2.3");
		}
		userRide.setDistance(Double.parseDouble(response));
		
		response = JOptionPane.showInputDialog(null, "How long was your ride, in mins?");
		while(!validInt(response))
		{
			response = JOptionPane.showInputDialog(null, "Type a valid number. Ex: 65");
		}
		userRide.setMins(Integer.parseInt(response));
		
		response = JOptionPane.showInputDialog(null, "What was your average speed?");
		while(!validDouble(response))
		{
			response = JOptionPane.showInputDialog(null, "Type a valid number. Ex: 8.4");
		}
		userRide.setAvgSpeed(Double.parseDouble(response));
		
		response = JOptionPane.showInputDialog(null, "What was your elevation gain?");
		while(!validInt(response))
		{
			response = JOptionPane.showInputDialog(null, "Type a valid number. Ex: 726");
		}
		userRide.setElevationGain(Integer.parseInt(response));
		
		
		
	}
	
	/**
	 * this tests out a for loop
	 */
	private void ForLoop()
	{
		for(int loop = 1; loop < 10; loop +=1)
		{
			JOptionPane.showMessageDialog(null, "test");
		}
	}
	
	/**
	 * makes it possible to store multiple rides using an array list
	 */
	private void MultiRide()
	{
		ArrayList<Bike> userRides = new ArrayList<Bike>();
		
		Bike sampleBike = new Bike();
		Bike otherBike = new Bike();
		
		userRides.add(sampleBike);
		userRides.add(sampleBike);
		userRides.add(otherBike);
			
		for (Bike current : userRides)
		{
			JOptionPane.showMessageDialog(null, "This ride is named " + current.getRideName());
		}
		
		
	}
	
	private void ArrayMethod()
	{
		
		
	}
	
	public boolean validInt(String maybeInt)
	{
		boolean isValid = false;
				
		try
		{
			Integer.parseInt(maybeInt);
			isValid = true;
		}
		catch (NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "You need to type in a whole number");
		}
		
		return isValid;
	}
	
	public boolean validDouble(String mightBeDouble)
	{
		Boolean isValid = false;
		
		try
		{
			Double.parseDouble(mightBeDouble);
			isValid = true;
		}
		catch (NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "Type in a decimal");
		}
		
		return isValid;
	}
 
}
