import java.util.*;

public class MimicSignIn {

	public static Scanner console;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fCount=0;
		for(int i=1;i<=3;i++)
		{
		console = new Scanner(System.in);

System.out.println("Enter UName:");
String userName=console.nextLine();
//System.out.println("UName:"+userName);
System.out.println("Enter Pwd:");
String passWord=console.nextLine();
//System.out.println("Pwd:"+passWord);
if (userName.equals("ramya") && passWord.equals("kakakak"))
		{

	System.out.println("Successful!!");
		
		}
else
fCount++;
System.out.println("Invalid Login!");
if(fCount==3)
{
	System.out.println("User ID Disabled");
	
}

	}

//console.close();	
		}
}

