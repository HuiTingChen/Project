package SoftwareTraining;

class TotalFee implements PaymentF{ //implementing an interface for fee
	
	public double getPayment(double f) { //Method implementation
		Promotion cb1 = new CashBack1();
		double totalF = f-cb1.pro(); //join 2 classes of software training will get RM20 cash back
		return totalF; 
	}
	
	public double getPayment(double f, double d) { //Method implementation
		Promotion cb2 = new CashBack2();
		double totalF = (f -cb2.pro()) * (1-(d/100));//join 3 classes of software training will get RM30 cash back and 5% discount
		return totalF; 
	}
}

class TotalSalary implements Payment{ //implementing an interface for salary
	
	public double getPayment(double f, int n) { //Method implementation
		double totalS = f * 3 / 5 * n; //the employee can get 3/5 of the income of that particular type of software training
		return totalS; 
	}	
}

