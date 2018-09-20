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
		String userInput = JOptionPane.showInputDialog("Good job, you just went on a ride. What would you like to title it?");
		
		String userInput = JOptionPane.showInputDialog("How many miles did you ride?");
		
		
	}
}
