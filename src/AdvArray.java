
public class AdvArray {
public static void main(String[] args) {
	//maxArray();
	//minArray();
	//twoDArrayMax();
	//twoDArrayMin();
	//arrayRev();
	//arraySum();
	//arrayDiff();
	//arrayPrintEven();
	//arrayPrintOdd();
	//arrayPrintPositive();
	//arrayPrintNegative();
	arrayPrintPrime();
	}

	public static void maxArray()
	{
		System.out.println("Max in Array:");
		int[] arr= {2,7,4,8,3,9};
		int max=arr[0];
		for(int i=1;i<arr.length;i++)
		{
		if(arr[i]>max) {
			max=arr[i];
		}		
		}
		System.out.println(max+" is max");
		
	}

	public static void minArray()
	{
		System.out.println("Min in Array:");
		int[] arr= {2,7,4,0,1,8,3,9};
		int min=arr[0], i;
		for(i=1;i<arr.length;i++)
		{
		if(arr[i]<min) {
			min=arr[i];
		}		
		}
		System.out.println(i+" is min");
		System.out.println("val @ idx "+ i +" is min");		
		
	}
	public static void twoDArrayMax()
	{
		int[][] a={{5,6,7,8},
				   {1,2,3,4}};
		int max=a[0][0];
		System.out.println("Default Max Value is "+max);
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if (a[i][j]>max)
					max=a[i][j];
				System.out.print(a[i][j]+" ");
			}
		}
		System.out.println("");
		System.out.println("Final Max Value is "+max);
				
	}

	public static void twoDArrayMin()
	{
		int[][] a={{5,6,7,8},
				   {1,2,3,4}};
		int min=a[0][0];
		System.out.println("Default Min Value is "+min);
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if (a[i][j]<min)
					min=a[i][j];
				System.out.print(a[i][j]+" ");
			}
		}
		System.out.println("");
		System.out.println("Final Min Value is "+min);
				
	}
	public static void arrayRev() {
		int[] arr= {1,2,3,4,5};
			for(int i=arr.length-1;i>=0;i--) {
				System.out.println(arr[i]);
			}
	}
	public static void arraySum() {
		int[] a= {1,2,3,4,5};
		int[] b= {6,7,8,9,1};
		int[] sum=new int[5];
			
		for(int i=0;i<5;i++) {	
				sum[i]=a[i]+b[i];
				System.out.println(sum[i]);
		}
	}

	public static void arrayDiff() {
		int[] a= {1,2,3,4,5};
		int[] b= {6,7,8,9,1};
		int[] diff=new int[5];
			
		for(int i=0;i<5;i++) {	
				diff[i]=b[i]-a[i];
				System.out.println(diff[i]);
		}
	}
	
	public static void arrayPrintEven() {
		int[] a= {1,2,3,4,5};
		
		for(int i=0;i<5;i++) {
			if(a[i]%2==0) {
				System.out.println(a[i]);
			}
		}
	}
	
	public static void arrayPrintOdd() {
		int[] a= {1,2,3,4,5};
		
		for(int i=0;i<5;i++) {
			if(a[i]%2!=0) {
				System.out.println(a[i]);
			}
		}
	}
	
	public static void arrayPrintPositive() {
		int[] a= {1,-2,3,-4,-5};
		
		for(int i=0;i<5;i++) {
			if(a[i]>0) {
				System.out.println(a[i]);
			}
		}
	}
	
	public static void arrayPrintNegative() {
		int[] a= {1,-2,3,-4,-5};
		
		for(int i=0;i<5;i++) {
			if(a[i]<0) {
				System.out.println(a[i]);
			}
		}
	}
	
	public static void arrayPrintPrime() {
		int[] a= new int[25];
		int i=0;
		boolean isPrime=true;
		while(i<=24) {
				a[i]=i+1;
				System.out.println(a[i]);
				i++;
		}
			for(i=0;i<=a.length;i++) {
				for(int j=2;j<=5;j++) {
					if(a[i]%j!=0) {
						isPrime=true;
					}
					else {
						isPrime=false;
					}
				}
			}
				for(i=0;i<a.length;i++) {
					if(isPrime)
						System.out.println(a[i]);
				}
	}
	
}