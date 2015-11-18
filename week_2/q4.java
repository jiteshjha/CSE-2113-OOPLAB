import java.util.Scanner;
 
public class q4
{
  public static void main(String args[])
  	{
		    int size, search, arr[], i;
		 
		    Scanner in = new Scanner(System.in);
		    System.out.println("Enter size");
		    size = in.nextInt(); 
		    arr = new int[size];
		 
		    System.out.println("Enter the elements:");
		 
		    for (i = 0; i <size; i++)
		      arr[i] = in.nextInt();
		 
		    System.out.println("Enter value to find");
		    search = in.nextInt();
		    System.out.println("\n");	
		    for (i = 0; i < size; i++)
		    {
		      if (arr[i] == search)     
		      {
			 System.out.println(search+" found at postion "+(i+1));
			  break;
		      }
		   }
		   if (i == size)  
		      System.out.println(search + " is absent");
  	}
}
