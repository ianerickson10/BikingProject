package controller;

//Import section
import model.Bike;
import javax.swing.JOptionPane;

public class BikeController
{
	//Declarations
	private Bike bikeDefault;
	private Bike bikeUser;
	
	
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
		
		
		
	}
	

	private void loopy()
	{
		//define variable before the loop
		boolean isFinished = false;
		int aNumber = 0;
		Bike distance = new Bike();
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
		
		String response = JOptionPane.showInputDialog(null, "How many miles did you ride?");
		while(!validDouble(response))
		{
			response = JOptionPane.showInputDialog(null, "Type a valid number. Ex: 2.3");
		}
		distance.setDistance(Double.parseDouble(response));
		
		response = JOptionPane.showInputDialog(null, "How long was your ride, in mins?");
		while(!validInt(response))
		{
			response = JOptionPane.showInputDialog(null, "Type a valid number. Ex: 65");
		}
		
	}

	
}
