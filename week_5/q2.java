import java.util.Scanner;

class q2 {
	static String CommasToNumericString(String digits)
	{
    	String result = "";
    	int len = digits.length();
    	int n = 0;

    	for (int i = len - 1; i >= 0; i--)                      
    	{
       		result = digits.charAt(i) + result;                 
        	n++;                                          
        	if (((n % 3) == 0) && (i > 0))                
        	{
           	 result = "," + result;
        	}
    	}
    	return (result);
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number");
		String number = in.nextLine();
		System.out.println("Altered number :" + CommasToNumericString(number));
	}
}

