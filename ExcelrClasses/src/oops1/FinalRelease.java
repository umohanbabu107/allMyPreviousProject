package oops1;

abstract class FirstRelease {
	public void classRoom() {
		System.out.println("Class room training is started");
	}

	abstract void onlineTraining();

	abstract void corporateTraining();

}

abstract class SecondRelease extends FirstRelease {
	public void onlineTraining() {
		System.out.println("Online training is started");
	}

}

public class FinalRelease extends SecondRelease {

	public void corporateTraining() {
		System.out.println("Corporate training is started");
	}

	public static void main(String[] args) {
		SecondRelease f = new FinalRelease();
		f.classRoom();
		f.onlineTraining();
		f.corporateTraining(); 

	}

}
