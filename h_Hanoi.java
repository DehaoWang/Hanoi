/**
 * 	Class h_Hanoi: Solve the Hanoi Tower Problem using recursive method
 * 	Created by Dehao Wang, 10.28.14 
 */

public class h_Hanoi 
{
	// constant pole number
	private final int POLES_NUMBER = 3;

	// variable step for printing
	private int steps;
	
	// constructor
	public h_Hanoi()
	{	
		steps = 0;
	}
	
	// main method: instantiation and test case(moving 4 disks)
	public static void main(String[] args) 
	{
		h_Hanoi testH = new h_Hanoi();
		testH.moveTower(4, 0, 2);
	}
	
	// RECURSIVE method
	public void moveTower(int n, int source, int destination)
	{
		// the most basic condition
		if(n == 1)
		{
			printMovingDisk(source, destination);
		}
		
		// break down and call itself
		else
		{
			// calculate the spare pole number
			int spare = POLES_NUMBER - source - destination;
			
			// move n-1 disks from source to spare (recursive)
			moveTower(n-1, source, spare);
			
			// move 1 disk from source to destination
			printMovingDisk(source, destination);
			
			// move n-1 disks from spare to destination (recursive)
			moveTower(n-1, spare, destination);
		}
	}
	
	// print method
	public void printMovingDisk(int source, int dest)
	{
		// increment of step
		steps++;
		
		// print the step number and the moving details
		System.out.println("Steps: " + steps);
		System.out.println("Move disk from pole_" + source + " to pole_" + dest);		
	}	
}
