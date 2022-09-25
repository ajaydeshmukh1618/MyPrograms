package castingprogram;

public class Palindrome {

	public static void main(String[] args)
	{
		int num=121;
		int rem,sum=0;
		int num1=num;
		while(num!=0)
		{
			rem=num%10;
			
			sum=sum*10+rem;
			
			num=num/10;
			
		}
		
		if(num1==sum)
		{
			System.out.println("Number is palindrome");
		}
		else
		{
			System.out.println("Number is not Palindrome");
		}
		

	}

}
