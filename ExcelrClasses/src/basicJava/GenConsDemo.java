package basicJava;

class GenCons {
	private double val;
	<T extends Number> GenCons(T arg){
		val = arg.doubleValue();
	}
	
	void showValue() {
		System.out.println("val: " +val);
	}
}

class GenConsDemo {
	public static void main (String args[]) {
		GenCons test = new GenCons(200);
		GenCons test1 = new GenCons(123F);
		
		test.showValue();
		test1.showValue();
	}
}

