package basicJava;

public class Students {
	
	int a,b;
	
	Students(int m1, int m2){
		a=m1; b=m2;
	}
	
	public void total() {
		System.out.println(a+b);
	}
	
	public void avg() {
		System.out.println((double) (a+b)/2);
	}
	
	public static void main(String[] args) {
		Students s1 = new Students(98,92);
		s1.total(); s1.avg();
		Students s2 = new Students(80, 85);
		s2.total(); s2.avg();
		Students s3 = new Students(65,75);
		s3.total(); 
	}

}
