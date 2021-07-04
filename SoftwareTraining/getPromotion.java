package SoftwareTraining;

class CashBack1 implements Promotion{
	public double pro() { //Method implementation
		return 20;
	}
}

class CashBack2 implements Promotion{
	public double pro() { //Method implementation
		return 30;
	}
}

class Discount implements Promotion{
	public double pro() { //Method implementation
		return 5;
	}
}