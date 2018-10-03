import java.util.Scanner;

public class Main 
{
  
	public static void main(String[] args) 
	{

		//calculating area of rectangle

		Scanner input = new Scanner(System.in);

		System.out.println("enter the length of rectangle");

		int a = input.nextInt(); //taking the length of rectangle as input
    
		System.out.println("enter the braedth of rectangle");

		int b = input.nextInt(); //taking the breadth of rectangle as input		
    
    System.out.println("area of rectangle is"+arearec(a,b));
   }  
 
	public static int arearec(int a,int b)
  
	{
    
		return(a*b);
    //calculating the are of rectangle  
	}

}
