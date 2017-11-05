import java.util.Scanner;

public class DoWhileLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printNos();
		printEven();
		printOdd();
		printSquare();
		printCube();
		printSum();
		//printSumScanner();
	printProd();
		//printRev();
		printEvenSum(); 
		
	}

	public static void printNos()
	{
		System.out.println("Print Nos:");
		int i=1;
		do
		{
			System.out.print(i+" ");
			i++;
		}while(i<=10);
			
		System.out.println();
	}
	public static void printEven()
	{
		System.out.println("Print Even:");
		int e=1;
	do
	{
		if(e%2==0)
		{
		System.out.print(e+" ");
		}
		e++;	
	}while(e<=10);
		
	
	System.out.println();
	}
	public static void printOdd() {
		System.out.println("Print Odd:");
		int o=1;
		do
		{
			if(o%2!=0) 
			{
				System.out.print(o+" ");
			}
			o++;
		}while(o<=10);
		System.out.println();
	}
	public static void printSquare()
	{
		System.out.println("Print Squares");
		int i=1, s=0;
		do
		{
			s=i*i;
			System.out.print(s+" ");
			i++;
		}while(i<=10);
		System.out.println();
	}

	public static void printCube()
	{
		System.out.println("Print Cubes:");
		int i=1, c=0;
		do
		{
			c=i*i*i;
			System.out.print(c+" ");
			i++;
		}while(i<=10);
		System.out.println();
	}

	public static void printSum()
	{
		System.out.println("Print Sum:");
		int i=1, sum=0;
		do
		{
			sum+=i;
			i++;
		}while(i<=5);
		System.out.print(sum+" ");
		System.out.println();
	}
	public static void printSumScanner()
	{
		int sum;
		System.out.println("Print Sum from User I/P:");
		Scanner console=new Scanner(System.in);
		System.out.println("Enter number1:");
		int a=console.nextInt();
		System.out.println("Enter number2:");
		int b=console.nextInt();
		do {
		sum=a+b;
		System.out.println("Sum:"+sum);
		}while(null != null);
		
		System.out.println();
		console.close();
	}
	public static void printProd()
	{   int a,b,prod=0;
		Scanner console=new Scanner(System.in);
		do {
		System.out.println("Enter number1:");
		a=console.nextInt();
		System.out.println("Enter number2:");
		b=console.nextInt();
		prod=a*b;
		System.out.println("Prod:"+prod);
		}while(null != null);
		System.out.println();
		console.close();
	}
	
	public static void printRev()
	{
		Scanner console=new Scanner(System.in);
		System.out.println("Enter number:");
		//int a=console.nextInt();
		System.out.println("Reverse:");
		
		console.close();
	}
	public static void printEvenSum()
	{
		System.out.println("Print Even Sum:");
		int e=1, sum=0;
	do
	{
		if(e%2==0)
		{
		sum+=e;
		}
		e++;
	}while(e<=10);
	System.out.println("Sum of EvenNos:"+sum);
	System.out.println();
	}
	
	
}
