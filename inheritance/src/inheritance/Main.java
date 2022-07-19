package inheritance;

public class Main {

	public static void main(String[] args) {
		
		IndividualCustomer iUser = new IndividualCustomer();
		iUser.customerNumber = "12345";
		CorporateCustomer cUser = new CorporateCustomer();
		cUser.customerNumber = "78910";
		
		CustomerManager customerManager = new CustomerManager();
		
		Customer[] customers = {iUser,cUser};
		
		customerManager.addMultiple(customers);
	}

}
