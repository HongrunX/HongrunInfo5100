package assignment7.Q2;

public class DecodeString {
	static String times(String s,int n)
	{
	String wd="";
	int i;

	    for(i=0;i<n;i++)
	    {
	        wd=wd+s;
	    }
	    
	    return wd;
	    
	}
	public static String decodeString(String s) 
	{
	    
	    int i,j;
	    
	    int f=1;
	    
	    while(f==1)
	    {
	        int l=s.length();
	        
	        f=0;
	        
	        for(i=0;i<l;i++)
	        {
	            char ch=s.charAt(i);
	            if(Character.isDigit(ch))
	            {
	                int k=i;
	                while(Character.isDigit(s.charAt(k)))
	                {
	                    k++;
	                }
	                
	                int v=Integer.parseInt(s.substring(i,k));
	                int g=i;
	                i=k-1;
	              
	                f=1;
	                int y=0,x=0;
	                
	                for(j=i+1;j<l;j++)
	                {
	                    char h=s.charAt(j);
	                    
	                    if(h=='[')
	                    {
	                        x++;
	                    }
	                    
	                    if(h==']')
	                    {
	                        y++;
	                    }
	                    
	                    if(x==y)
	                    {
	                        break;
	                    }
	                    
	                }
	                System.out.println((i+2)+"   "+j);
	                if((i+2)>j)
	                    return s;
	                String q=s.substring(i+2,j);
	                String w=times(q,v);
	                
	                s=s.substring(0,g)+w+s.substring(j+1);
	               
	                break;
	            }
	            
	    
	        }
	        
	    }
	    
	    return s;
	    
	}
    public static void main(String[] args) {
		String s = "3[a]2[bc]";
		System.out.println(decodeString(s));
	}
}
