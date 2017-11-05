import java.util.Scanner;

public class WhileLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printNos();
		printEven();
		printOdd();
		printSquare();
		printCube();
		printSum();
		//printSumScanner();
	//	printProd();
		//printRev();
		printEvenSum(); 
		
	}

	public static void printNos()
	{
		System.out.println("Print Nos:");
		int i=1;
		while(i<=10)
		{
			System.out.print(i+" ");
			i++;
		}
		System.out.println();
	}
	public static void printEven()
	{
		System.out.println("Print Even:");
		int e=1;
	while(e<=10)
	{
		if(e%2==0)
		{
		System.out.print(e+" ");
		}
		e++;
	}
	System.out.println();
	}
	public static void printOdd() {
		System.out.println("Print Odd:");
		int o=1;
		while(o<=10)
		{
			if(o%2!=0) 
			{
				System.out.print(o+" ");
			}
			o++;
		}
		System.out.println();
	}
	public static void printSquare()
	{
		System.out.println("Print Squares");
		int i=1, s=1;
		while(i<=10)
		{
			s=i*i;
			System.out.print(s+" ");
			i++;
		}
		System.out.println();
	}

	public static void printCube()
	{
		System.out.println("Print Cubes:");
		int i=1, c=1;
		while(i<=10)
		{
			c=i*i*i;
			System.out.print(c+" ");
			i++;
		}
		System.out.println();
	}

	public static void printSum()
	{
		System.out.println("Print Sum:");
		int i=1, sum=0;
		while(i<=5)
		{
			sum+=i;
			i++;
		}
		System.out.print(sum+" ");
		System.out.println();
	}
	public static void printSumScanner()
	{
		System.out.println("Print Sum from User I/P:");
		Scanner console=new Scanner(System.in);
		System.out.println("Enter number1:");
		int a=console.nextInt();
		System.out.println("Enter number2:");
		int b=console.nextInt();
		int sum=a+b;
		System.out.println("Sum:"+sum);
		System.out.println();
		console.close();
	}
	public static void printProd()
	{
		Scanner console=new Scanner(System.in);
		System.out.println("Enter number1:");
		int a=console.nextInt();
		System.out.println("Enter number2:");
		int b=console.nextInt();
		int prod=a*b;
		System.out.println("Prod:"+prod);
		System.out.println();
		console.close();
	}
	
	public static void printRev()
	{
		Scanner console=new Scanner(System.in);
		System.out.println("Enter number:");
		int a=console.nextInt();
		System.out.println("Reverse:");
		
		console.close();
	}
	public static void printEvenSum()
	{
		System.out.println("Print Even Sum:");
		int e=1, sum=0;
	while(e<=10)
	{
		if(e%2==0)
		{
		sum+=e;
		}
		e++;
	}
	System.out.println("Sum of EvenNos:"+sum);
	System.out.println();
	}
	
	
}