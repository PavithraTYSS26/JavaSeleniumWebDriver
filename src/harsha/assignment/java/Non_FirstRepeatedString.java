package harsha.assignment.java;

public class Non_FirstRepeatedString {
	
    public static int[] firstNonRepeating(String str) 
    { 
       char[] first=str.toCharArray();
       first[0]=str.charAt(0);
       int f=0;
       int n=-1;
       
        for (int i = 0; i < str.length();  i++) 
        { 
        	for(int j=1;j<str.length();j++)
        	{ 
        		if(first[i]!=first[j])
                System.out.println(first[i]+"        -> "+"non repeated");
                ++n;
       
               if (first[i] == first[j] ) 
               System.out.println(first[i]+"            -> "+"repeated");	
               ++f;
              // break;
             }  }  
        
       int a[]= {f,n};
       return a;
    } 
  
    public static void main (String[] args) 
    { 
        String str = "geeksforgeeks"; 
        int[] index =  firstNonRepeating(str); 
        System.out.println(index[0]);
        System.out.println(index[1]);
          
       }
}
