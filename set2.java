//File Name: Set.java 


//________________________________-BOM-CHE_______________________________________________-


package SetPackage1 ;

public class  set2
{
	public char[][] set_c_Array()
	{
  		char[][] c = new char[10][10];
  		for(int i=0;i<10;i++)
  		{
    		for(int j=0;j<10;j++)
    		{
        		
                
                if(i==0)
                {
                    if(j>0)
                    {    
                        c[0][j]='j';
                    }
                    else
                    {
                        c[0][1]='*';
                    }
               
                }
                if(i==3 || i==7)
                {
                    switch(j)
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
                    c[i][j]= 'O';
                    }

            }
            
            if(i>0)
            {
            c[i][0]='i';
            }
                
        }
  		return c;
	}

	public char[][] set_d_Array()
	{
  		char[][] d = new char[10][10];
  		for(int k=0;k<10;k++)
  		{
    		for(int l=0;l<7;l++)
    		{
        		
                
                if(k==0)
                {
                    if(l>0)
                    {    
                        d[0][l]='l';
                    }
                    else
                    {
                        d[0][1]='*';
                    }
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
                    d[k][l]= 'O';
                    }

            }
            
            if(k>0)
            {
            d[k][0]='k';
            }
                
        }
  		return d;
		
    }
    
    
    
//________________________________________CHE-BOM-----------------------------------------------------    
    
    public char[][] set_g_Array()
	{
  		char[][] g = new char[10][10];
  		for(int p=0;p<10;p++)
  		{
    		for(int q=0;q<10;q++)
    		{
        		
                
                if(p==0)
                {
                    if(q>0)
                    {    
                        g[0][q]='q';
                    }
                    else
                    {
                        g[0][1]='*';
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
                    g[p][q]= 'O';
                    }

            }
            
            if(p>0)
            {
            g[p][0]='p';
            }
                
        }
  		return g;
	}

	public char[][] set_h_Array()
	{
  		char[][] h = new char[10][10];
  		for(int x=0;x<10;x++)
  		{
    		for(int y=0;y<7;y++)
    		{
        		
                
                if(x==0)
                {
                    if(y>0)
                    {    
                        h[0][y]='y';
                    }
                    else
                    {
                        h[0][1]='*';
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
                    h[x][y]= 'O';
                    }

            }
            
            if(x>0)
            {
            h[x][0]='x';
            }
                
        }
  		return h;
		
}
}