package component;

public class Potentiometer extends Resistor{

	public Potentiometer(String name, double resistance) {
		super(name, resistance);
	}
	
	public Potentiometer(String name) {
		super(name, 0);
	}
	
	public void setResistance(double resistance) {
		this.resistance = resistance;
	}
}
