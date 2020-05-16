package com.arrays.ul;

public class StringOccurence 

{
	public static void occ(String s1)
	{
	  char[] ch1=s1.toCharArray();
	   int n=ch1.length;
	  for(int i=0;i<n;i++)
	  {
  		int counter=1;
  		for(int j=i+1;j<n;j++)
  		{
  			if(ch1[i]==ch1[j])
  				{
  					counter++;
  					int k=j;
  					while(k<n-1)
  					{
  						ch1[k]=ch1[k+1];
  						k++;
  					}
  					n--;
  					j--;
  			    }
  		}
  				
           System.out.println(ch1[i]+"is occuring"+counter+"times");
  			
  	}

	}
	public static void main(String[] args)
	{
		String s1="leela";
		occ(s1);
	}
}