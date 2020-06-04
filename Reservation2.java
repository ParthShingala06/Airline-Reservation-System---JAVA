//File Name: Reseration1.java

package makeReservation1;
import java.util.*;

public class Reservation2
{
	public void display(char[][] n)
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

	  	display(n);

	  	System.out.println("price of ticket is " + i);
	  	System.out.println("Enter the seat number you want to book (row 1st then column )");
	  	Scanner sq=new Scanner(System.in);
	  	int g=sq.nextInt();
	  	int h=sq.nextInt();

	  	while(true)
	  	{
	  		if(full(n))
	  		{
	    		if(n[g][h]=='O')
				{
	  		//		System.out.println("Ticket price is 100$");
	  				System.out.println("Confirm seat booking?(y/n)");
	   				char r = sq.next().charAt(0);
	  				if(r=='y')
	  				{
	    				System.out.println("Congrats");
	    				n[g][h]='X';
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
	    		System.out.println("Seats full!,try other class");
	    		break;
			}
		}
	}

public boolean full(char [][] l)
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
