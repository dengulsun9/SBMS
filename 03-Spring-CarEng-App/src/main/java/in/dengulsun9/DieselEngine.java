package in.dengulsun9;

public class DieselEngine implements IEngine {

	public DieselEngine() {
		// TODO Auto-generated constructor stub
		System.out.println("DieselEngine.Constructor");
	}

	@Override
	public int start() {
		// TODO Auto-generated method stub
		System.out.println("Diesel Engine Started");
		return 1;
	}

}
