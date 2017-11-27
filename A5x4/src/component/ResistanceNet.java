package component;

public abstract class ResistanceNet {
	protected double resistance;
	
	public abstract double getResistance();
	public abstract int getNumberOfResistors();
	public abstract String getCircuit();
}
