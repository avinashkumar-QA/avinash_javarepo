package keywords;

public class ThisKeyword {
	
	 String name;
	 double salary;
	 int age;
	 
	 
	 void employee_details(String name, double salary, int age) {
		 
		this. name= name;
		this.salary= salary;
		this.age=age;
		 
//		 System.out.println("My name is " + name);
//		 System.out.println("My salary is " + salary);
//		 System.out.println("My age is " + age);
	 }
	
	public static void main(String[] args) {
		
		ThisKeyword tk= new ThisKeyword();
		tk.employee_details("Naresh", 90, 20);
		System.out.println(tk.name);
		System.out.println(tk.salary);
		System.out.println(tk.age);
	}
	
	
	
	

}
