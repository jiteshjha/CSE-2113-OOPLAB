import java.util.Scanner;

class Mixer {
	int arr[];
	int n;
	public void accept() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter size:\n");
		n = in.nextInt();
		arr = new int[n];
		System.out.println("Enter the elements:\n");
		for(int i=0; i < arr.length; i++)
			arr[i] = in.nextInt();
	}
	public Mixer mix(Mixer A) {
		Mixer m = new Mixer();
		m.arr = new int[arr.length + A.arr.length];
		int i = 0, j =0, k =0;
		while (i < arr.length && j < A.arr.length) 
			m.arr[k++] = arr[i] < A.arr[j] ? arr[i++] : A.arr[j++];
		while (i < arr.length)
		    {
			m.arr[k] = arr[i];
			i++;
			k++;
		    }

		 while (j < A.arr.length)
		    {
			m.arr[k] = A.arr[j];
			j++;
			k++;
		    }
		return m;
	}
	public void display() {
		for(int num :arr) {
			System.out.println(num + " ");
		}
	}
}

class q3 {
	public static void main(String[] args) {
		Mixer m1 = new Mixer();
		Mixer m2 = new Mixer();
		m1.accept();
		m2.accept();
		m1 = m1.mix(m2);
		m1.display();
	}
}

