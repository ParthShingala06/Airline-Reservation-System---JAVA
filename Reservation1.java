//File Name: Reseration1.java

package makeReservation;
import java.util.*;

public class Reservation1
{
	public void display(char[][] n) //display function to display the current seat matrix
    {
      int row = n.length;
      int col = n[0].length;

     	for(int i=0;i<row;i++)
      	{
	        for(int j=0;j<col;j++)
	        {
	          System.out.print(n[i][j] + " ");
	        }
	        System.out.println();
      	}
	}

	public void chose_seat(char[][] n,int i)
  	{

	  	display(n);//display the seat matrix

	  	System.out.println("price of ticket is " + i);//price of ticket display
	  	System.out.println("Enter the seat number you want to book (row 1st then column )");//user input seat number 
	  	Scanner sq=new Scanner(System.in);
	  	int g=sq.nextInt();
	  	int h=sq.nextInt();

	  	while(true)//checking the seat availibility
	  	{
	  		if(full(n))
	  		{
	    		if(n[g][h]=='O')//seat available
				{
	  		
	  				System.out.println("Confirm seat booking?(y/n)");//confirming seat
	   				char r = sq.next().charAt(0);
	  				if(r=='y')
	  				{
	    				System.out.println("Congrats");
	    				n[g][h]='X';  //seat unavailable for the next person
	    				break;
	 	 			}
				}
	  			else
	  			{
	    			System.out.println("Try booking different seat");
	    			break;
				}
			}
			else
			{
	    		System.out.println("Seats full!,try other class");//full flight is booked
	    		break;
			}
		}
	}

public boolean full(char [][] l)//function to check availability of seats 
{
  	int row = l.length;
  	int col = l[0].length;
  	int c=0;

  	for(int i=0;i<row;i++)
  	{
    	for(int j=0;j<col;j++)
    	{
        	if(l[i][j]=='O')
          	c++;
    	}
    }
    
    if(c>0)
    {
      	return true;
    }
    else
    {
      	return false;
    }
}

}

