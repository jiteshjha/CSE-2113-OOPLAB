package myPackages.p1;
public class Methods 

{

    public void sort( int arr[] ){

        int N = arr.length;

        int i, j, pos, temp;

        for (i = 0; i < N-1; i++)

        {

            pos = i;

            for (j = i+1; j < N; j++)

            {

                if (arr[j] < arr[pos])

                {

                    pos = j;

                }

            }

            temp = arr[i];

            arr[i] = arr[pos];

            arr[pos]= temp;            

        }        

    }

public void Bin(int array[],int search,int n)
  {
    int  first, last, middle;
 
    first  = 0;
    last   = n - 1;
    middle = (first + last)/2;
 
    while( first <= last )
    {
      if ( array[middle] < search )
        first = middle + 1;    
      else if ( array[middle] == search ) 
      {
        System.out.println(search + " found at location " + (middle + 1) + ".");
        break;
      }
      else
         last = middle - 1;
 
      middle = (first + last)/2;
   }
   if ( first > last )
      System.out.println(search + " is not present in the list.\n");
  }
}


