package component;

public class ParallelResistor extends ComposedResistor{
	
	public ParallelResistor(ResistanceNet... subnets) {
		super(subnets);
	}

	@Override
	public String getCircuit() {
		String circuit = "";
		for(int i = 0; i < getSubNets().length; i++) {
			if(i > 0)
				circuit += " | ";
			circuit +=  getSubNets()[i].getCircuit();
		}
		
		return String.format("(%s)", circuit);
	}
	
	/**
	* Reimplements ResistanceNet.getResistance. 
	* resistance is used as local variable here because changes from potentiometers won't be processed properly
	* Calculates the resistance of series resistors with 1/R = 1/R1 + 1/R2 + ... + 1/Rn
	* @return the calculated resistance
	*/
	@Override
	public double getResistance() {
		double resistance = 0;
		for(ResistanceNet subnet : getSubNets()){
			resistance += (1/subnet.getResistance());
		}
		
		return 1/resistance; 
	}
}
