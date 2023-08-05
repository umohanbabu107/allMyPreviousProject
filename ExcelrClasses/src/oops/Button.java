package oops;

public class Button {

	// Creating variables
	int a, b;
	String c;

	public Button(int height, int width, String name) {
		a = height;
		b = width;
		c = name;
	}

	// Creating method
	public void createButton() {
		System.out.println("Button is created with Height, Width, Name: " + a + ", " + b + ", " + c);
	}

	void buttonClickable() {
		System.out.println(c + " button is clickable");
	}

	public static void main(String[] args) {

		Button ok = new Button(15, 30, "OK");
		ok.createButton();
		ok.buttonClickable();

		Button cancel = new Button(20, 40, "CANCEL");
		cancel.createButton();
		cancel.buttonClickable();

		Button save = new Button(10, 20, "SAVE");
		save.createButton();
		save.buttonClickable();
	}

}
