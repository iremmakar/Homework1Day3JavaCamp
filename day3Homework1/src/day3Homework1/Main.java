package day3Homework1;

public class Main {

	public static void main(String[] args) {
		int number1 = 10;
		int number2 = 20;
		number1 = number2;
		number2 = 100;
		System.out.println(number1);
		
		int[] numbers1 = new int[] {1,2,3};
		int[] numbers2 = new int[] {10,20,30};
		
		numbers1 = numbers2;
		numbers2[0]=1000;
		System.out.println(numbers1[0]);
		
		CreditManager creditManager = new CreditManager(); 
		creditManager.calculate();
		creditManager.save();
		
		Customer customer = new Customer();
		customer.setId(1);
		
		
		customer.setCity("istanbul");
		
	
		
		Company company = new Company();
		company.setTaxNumber("100000");
		company.setCompanyName("A");
		company.setId(100);
		
		Person person = new Person();
		person.setNatioanlIdentity("23244");
		
		CustomerManager customerManager = new CustomerManager(new Customer(),new TeacherCreditManager());
		customerManager.giveCredit();
		
		
	}

}
