package inheritance;

class InternQA {

	 InternQA() {

		System.out.println("Intern QA");

	}

}

class JuniorQA extends InternQA {

	JuniorQA() {

		System.out.println("Junior QA");

	}

}

class AssociateQA extends JuniorQA {

	AssociateQA() {

		System.out.println("Associate QA");

	}

}

class QA extends AssociateQA {

	QA() {

		System.out.println("QA");

	}

}

class SeniorQA extends AssociateQA {

	SeniorQA() {

		System.out.println("Senior QA");

	}

}

class LeadQA extends SeniorQA {

	LeadQA() {

		System.out.println("Lead QA");

	}

}

public class SuperCalling_NonParameterised_With_Multiple_Class_Constructor extends LeadQA {

		SuperCalling_NonParameterised_With_Multiple_Class_Constructor() {
		
		System.out.println("QA Manager");
	}

	public static void main(String[] args) {

		new SuperCalling_NonParameterised_With_Multiple_Class_Constructor();
		

	}

}
