package component;

public abstract class ComposedResistor extends ResistanceNet {

	private ResistanceNet[] subnets = null;
	
	
	
	public ComposedResistor(ResistanceNet... subnets) {
		this.subnets = subnets;
	}
	
	@Override
	public int getNumberOfResistors() {
		int count = 0;
		for(ResistanceNet subnet : subnets) {
			if(subnet.getNumberOfResistors() == 1) {
				count++;
				continue;
			}
			
			count += subnet.getNumberOfResistors();
		}
		return count;
	}
	
	public ResistanceNet[] getSubNets() {
		return subnets;
	}
}
