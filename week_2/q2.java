import java.util.Scanner;

class q2 {
	public static void main(String[] args)
	{
		int n, c, d, swap, choice;
		
    		Scanner ins = new Scanner(System.in);
 
    		System.out.println("Input number of integers to sort");
    		n = ins.nextInt();
 
    		int array[] = new int[n];
 
    		System.out.println("Enter " + n + " integers");
 
    		for (c = 0; c < n; c++) 
      			array[c] = ins.nextInt();
		
		System.out.println("Ascending(Press 1) or descending(Press 0)?\n");
		choice = ins.nextInt();
		
 		if(choice == 0) {
   		for (c = 0; c < ( n - 1 ); c++) {
      			for (d = 0; d < n - c - 1; d++) {
        			if (array[d] < array[d+1]) /* For descending order */
        			{
					  swap       = array[d];
					  array[d]   = array[d+1];
					  array[d+1] = swap;
        			}
      			}
   	 	}
		}
		else if(choice == 1) {
		for (c = 0; c < ( n - 1 ); c++) {
      			for (d = 0; d < n - c - 1; d++) {
        			if (array[d] > array[d+1]) /* For ascending order */
        			{
					  swap       = array[d];
					  array[d]   = array[d+1];
					  array[d+1] = swap;
        			}
      			}
   	 	}
		}
		else { System.out.println("Wrong input!"); System.exit(0); }
    		System.out.println("Sorted list of numbers");
 
    		for (c = 0; c < n; c++) 
      			System.out.println(array[c]);
  	}
}
