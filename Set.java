//File Name: Set.java 


//________________________________-BOM-DEL_______________________________________________-


package SetPackage ;

public class Set
{
	public char[][] set_a_Array()//creating a seat matrix for economy class
	{
  		char[][] a = new char[10][10];
  		for(int i=0;i<10;i++)
  		{
    		for(int j=0;j<10;j++)
    		{
        		
                
                if(i==0)
                {
                    if(j>0)
                    {    
                        a[0][j]='j';
                    }
                    else
                    {
                        a[0][1]='*';
                    }
     
                }
                if(i==3 || i==7)
                {
                    switch(j)
                    {
                  
                    case 1 : System.out.print("_"); 
                            break;
                    case 2 : System.out.print("_"); 
                            break;
                    case 3 : System.out.print("_"); 
                            break;
                    case 4 : System.out.print("_"); 
                            break;
                    case 5 : System.out.print("_"); 
                            break;
                    case 6 : System.out.print("_"); 
                            break;
                    case 7 : System.out.print("_"); 
                            break;
                    case 8 : System.out.print("_"); 
                            break;
                    case 9 : System.out.print("_"); 
                            break;
                        
                        
                    default : System.out.print("0"); 
                }
                }

                
                else{
                    a[i][j]= 'O';//displaying seats 
                    }

            }
            
            if(i>0)
            {
            a[i][0]='i';//row number
            }
                
        }
  		return a;
	}

	public char[][] set_b_Array()// for first class
	{
  		char[][] b = new char[10][10];
  		for(int k=0;k<10;k++)
  		{
    		for(int l=0;l<7;l++)
    		{
        		
                
                if(k==0)
                {
                    if(l>0)
                    {    
                        b[0][l]='l';
                    }
                    else
                    {
                        b[0][1]='*';
                    }
            /*             switch(l)
                {
                    case 0 : System.out.print("*"); 
                            break;
                    case 1 : System.out.print("1"); 
                            break;
                    case 2 : System.out.print("2"); 
                            break;
                    case 3 : System.out.print("3"); 
                            break;
                    case 4 : System.out.print("4"); 
                            break;
                    case 5 : System.out.print("5"); 
                            break;
                    case 6 : System.out.print("6"); 
                            break;
                  
                    default : System.out.print("0"); 
           
                }
                */
                }
                if(k==3 || k==7)
                {
                
                switch(l)
                {
                  
                    case 1 : System.out.print("_"); 
                            break;
                    case 2 : System.out.print("-"); 
                            break;
                    case 3 : System.out.print("_"); 
                            break;
                    case 4 : System.out.print("_"); 
                            break;
                    case 5 : System.out.print("_"); 
                            break;
                    case 6 : System.out.print("_"); 
                            break;
                        
                    default :break;
                }
                
                }
            
                else{
                    b[k][l]= 'O';
                    }

            }
            
            if(k>0)
            {
            b[k][0]='k';
            }
                
        }
  		return b;
		
    }
    
    
    
//________________________________________DEL-BOM-----------------------------------------------------    
    
    public char[][] set_e_Array()//for 
	{	int i;
  		char[][] e = new char[10][10];
  		for(int p=0;p<10;p++)
  		{
    		for(int q=0;q<10;q++)
    		{
        		
                
                if(p==0)
                {
                    if(q>0)
                    {    
                        e[0][q]='q';
                    }
                    else
                    {
                        e[0][1]='*';
                    }
           
                }
                if(p==3 || p==7)
                {
                    switch(q)
                    {
                  
                    case 1 : System.out.print("_"); 
                            break;
                    case 2 : System.out.print("-"); 
                            break;
                    case 3 : System.out.print("_"); 
                            break;
                    case 4 : System.out.print("_"); 
                            break;
                    case 5 : System.out.print("_"); 
                            break;
                    case 6 : System.out.print("_"); 
                            break;
                    case 7 : System.out.print("_"); 
                            break;
                    case 8 : System.out.print("_"); 
                            break;
                    case 9 : System.out.print("_"); 
                            break;
                        
                        
                    default : System.out.print("0"); 
                }
                }

                
                else{
                    e[p][q]= 'O';
                    }

            }
            
            if(p>0)
            {
            e[p][0]='p';
            }
                
        }
  		return e;
	}

	public char[][] set_f_Array()
	{
  		char[][] f = new char[10][10];
  		for(int x=0;x<10;x++)
  		{
    		for(int y=0;y<7;y++)
    		{
        		
                
                if(x==0)
                {
                    if(y>0)
                    {    
                        f[0][y]='y';
                    }
                    else
                    {
                        f[0][1]='*';
                    }
           
                }
                
                if(x==3 || x==7)
                {
                
                switch(y)
                {
                  
                    case 1 : System.out.print("_"); 
                            break;
                    case 2 : System.out.print("-"); 
                            break;
                    case 3 : System.out.print("_"); 
                            break;
                    case 4 : System.out.print("_"); 
                            break;
                    case 5 : System.out.print("_"); 
                            break;
                    case 6 : System.out.print("_"); 
                            break;
                        
                    default :break;
                }
                
                }
            
                else{
                    f[x][y]= 'O';
                    }

            }
            
            if(x>0)
            {
            f[x][0]='x';
            }
                
        }
  		return f;
		
}
}