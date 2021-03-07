public class Main {
	
	public static void main (String[] args) {

	Person one = new Person();
	one.setFN("J Sylle");
	one.setLN("Tubola");
	System.out.println("First Person: " + one.getFN() + " " + one.getLN());
	
	Person two = new Person();
	two.setFN("America");
	two.setLN("Singer");
	System.out.println("Second Person: " + two.getFN() + " " + two.getLN());
	
	Person three = new Person();
	three.setFN("Ethan");
	three.setLN("Valero");
	System.out.println("Third Person: " + three.getFN() + " " + three.getLN());
	
	Person four = new Person();
	four.setFN("Ace");
	four.setLN("Craige");
	System.out.println("Fourth Person: " + four.getFN() + " " + four.getLN());
	
	Person five = new Person();
	five.setFN("Carmela");
	five.setLN("Montecarlos");
	System.out.println("Fifth Person: " + five.getFN() + " " + five.getLN());
	
	}
}