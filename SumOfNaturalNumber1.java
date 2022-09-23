public class SumOfNaturalNumber1  
{  
	public static void main(String[] args)   
	{  
		int i, num = 50, sum = 0;  
		//executes until the condition returns true  
		for(i = 1; i <= num; ++i)  
			{  
		//adding the value of i into sum variable  
				sum = sum + i; 
				
				System.out.println(i);
			}
			System.out.println("Series are executes here");
	//prints the sum 
	
	System.out.println("Sum of First 50 Natural Numbers is = " + sum);  
	}  
}  