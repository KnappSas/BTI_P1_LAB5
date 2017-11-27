package component;

public class Resistor extends ResistanceNet {

	protected String name;
	
	public Resistor(String name, double resistance) {
		this.name = name;
		this.resistance = resistance;
	}

	@Override
	public double getResistance() {
		return resistance;
	}

	/**
	 * One Resistor is also a simple ResistanceNet with 1 resistor.
	 * @return returns the number of resistors which is always 1.
	 */
	@Override
	public int getNumberOfResistors() {
		return 1;
	}

	@Override
	public String getCircuit() {
		return name;
	}
}
