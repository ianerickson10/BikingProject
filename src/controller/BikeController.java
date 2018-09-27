package controller;

//Import section
import model.Bike;
import javax.swing.JOptionPane;

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
		//loopy();
		AskUser();
	}
	

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
		//userRide.setMins(int.parseInt(response));
		
		response = JOptionPane.showInputDialog(null, "What was your average speed?");
		while(!validDouble(response))
		{
			response = JOptionPane.showInputDialog(null, "Type a valid number. Ex: 8.4");
		}
		userRide.setAvgSpeed(Double.parseDouble(response));
		
		
		
		
		
		
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
