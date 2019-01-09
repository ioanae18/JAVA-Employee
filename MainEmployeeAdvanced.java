import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MainEmployeeAdvanced {

	private static Scanner sc;

	public static void main(String[] args) throws FileNotFoundException {

		/*
		 * Se da un sir de angajati: 
		 * - cati au numele inceput cu litera mare 
		 * - cati au salariul peste 4000 
		 * - sa se afiseze angajatul cu salariul cel mai mare
		 */

		sc = new Scanner(new File("intrare.txt"));

		System.out.println("Cati angajati vrei?");
		int dim = sc.nextInt();

		Employee[] sir = new Employee[dim];

		for (int i = 0; i < dim; i++) {
			System.out.println("Da id: ");
			int id_citit = sc.nextInt();
			System.out.println("Da prenume: ");
			String firstName_citit = sc.next();
			System.out.println("Da nume: ");
			String lastName_citit = sc.next();
			System.out.println("Da salariu");
			int salary_citit = sc.nextInt();

			sir[i] = new Employee(id_citit, firstName_citit, lastName_citit, salary_citit);
		}

		for (int i = 0; i < dim; i++)
			System.out.println(sir[i]);

		int count = 0;
		for (int i = 0; i < dim; i++)
			if (sir[i].getFirstName().charAt(0) >= 'A' && sir[i].getFirstName().charAt(0) <= 'Z') {
				count++;
			}

		System.out.println("Sunt " + count + " angajati cu firstName inceput cu litera mare");

		int max = Integer.MIN_VALUE;
		int pozMax = -1;
		for (int i = 0; i < dim; i++) {
			if (sir[i].getSalary() > max) {
				max = sir[i].getSalary();
				pozMax = i;
			}
		}
		System.out.println("Angajatul cu salariul maxim este: " + sir[pozMax]);
		
	}

}
