package in.dengulsun9;

public class PetrolEngine implements IEngine {

	public PetrolEngine() {
		// TODO Auto-generated constructor stub
		System.out.println("PetrolEngine.Constructor");
	}

	@Override
	public int start() {
		// TODO Auto-generated method stub
		System.out.println("Petrol Engine Started");
		return 1;
	}

}
