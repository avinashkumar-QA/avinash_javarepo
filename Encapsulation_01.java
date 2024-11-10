package EnCapSulation_Program;

//Assignment no: 74
class Animal{

	private int animal;

	public void set_animal_count(int x) {


		animal =x;
		
	}

		public int get_animal_count() {

			return ++animal;
		}


	}


	public class Encapsulation_01 {

		public static void main(String[] args) {


			Animal ecp= new Animal();
			ecp.set_animal_count(100);
			System.out.println(ecp.get_animal_count());


		}

	}
