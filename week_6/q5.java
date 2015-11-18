import com.course.buildings.House;
import com.course.buildings.School;
public class q5 {
	public static void main(String[] args) {
		House h = new House();
		School s = new School();
		System.out.println("House: ");
		h.Input();
		System.out.println("School: ");
		s.Input();
		System.out.println("\nHouse: ");
		System.out.println("Details :");
		h.Display();
		System.out.println("\nSchool: ");
		System.out.println("Details :");
		s.Display();
	}
}
