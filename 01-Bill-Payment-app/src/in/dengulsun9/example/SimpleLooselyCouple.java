package in.dengulsun9.example;

class Chip {

	public String chipType() {
		return "32-Bit";
	}
}

class Robot {
	private Chip chip;

	public void setChip(Chip chip) {
		this.chip = chip;
	}

	public void doWork() {
		String type = chip.chipType();

		if (type.equals("32-Bit")) {
			System.out.println("Performance is slow");
		}
	}
}

public class SimpleLooselyCouple {
	public static void main(String[] args) {
		Robot robot = new Robot();
		robot.setChip(new Chip());
		robot.doWork();
	}
}
