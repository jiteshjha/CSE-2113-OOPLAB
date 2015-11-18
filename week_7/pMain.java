   import myPackages.p1.Methods;
   import java.util.Scanner;
   public class pMain{ 
   public static void main(String[] args) 

    {

        Scanner scan = new Scanner( System.in );
	Methods m = new Methods();
 

        System.out.println("Selection Sort Test\n");

        int n, i;

        

        System.out.println("Enter number of integer elements");

        n = scan.nextInt();

      

        int arr[] = new int[ n ];

       

        System.out.println("\nEnter "+ n +" integer elements");

        for (i = 0; i < n; i++)

            arr[i] = scan.nextInt();

        

        m.sort(arr);

        

        System.out.println("\nElements after sorting ");        

        for (i = 0; i < n; i++)

            System.out.print(arr[i]+" ");            

        System.out.println();            

    
      System.out.println("Binary Search Test \n");
      System.out.println("enter the element to be searched");
      int pos;
      pos=scan.nextInt();
      m.Bin(arr,pos,n);
}
} 
