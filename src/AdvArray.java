
public class AdvArray {
public static void main(String[] args) {
	//maxArray();
	//minArray();
	twoDArrayMax();
	twoDArrayMin();
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

}
