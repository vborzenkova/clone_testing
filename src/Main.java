import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Animal();
		a.age = 2;
		a.name = "Barsic";
		a.pare = new Animal();
		a.pare.age = 6;
		
		try {
			Animal a1  = (Animal)a.clone();
			System.out.println(a1.name);
			System.out.println(a1.pare.age);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*Animal a1 = null;
		Cat cat1 = new Cat();
		cat1.name = "Mayson";
		cat1.age = 6;
		cat1.voice = "Miay";
		
		Person ann = new Person();
		ann.name = "Ann";
		ann.age = 12;
		cat1.owner = ann;
		Cat cat2 = null;
		try {
			 cat2 = (Cat) cat1.clone();
		} catch (CloneNotSupportedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			 a1 = (Animal) a.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(a.name);
		System.out.println(a1.name);
		System.out.println(a1.age);
		System.out.println(cat2.age);
		System.out.println(cat2.voice);
		System.out.println(cat1.owner);
		System.out.println(cat2.owner);
*/
	}
	

}
