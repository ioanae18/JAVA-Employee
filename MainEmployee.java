
public class MainEmployee {

	public static void main(String[] args) {
		System.out.println("Demo");

		Employee e1 = new Employee();// const fara param
		/*
		 * const cu param
		 */
		Employee e2 = new Employee(89, "Ana", "Ciobanu", 1200);
		System.out.println("Primul anagajat " + e1);
		System.out.println("Al doilea anagajat " + e2);

		System.out.println("Da ID-ul pentru angajatul 2: " + e2.getId());
		/*
		 * setam salariul angajatului la 100000
		 */
		e2.setSalary(100000);
		System.out.println("Al doilea angajat UPDATE: " + e2);
		/*
		 * testare getName()
		 */
		System.out.println("Testam metoda getName() " + e2.getName());
		/*
		 * testare salariu
		 */
		System.out.println("Testam metoda getAnnualSalary() " + e2.getAnnualSalary());

	}

}
