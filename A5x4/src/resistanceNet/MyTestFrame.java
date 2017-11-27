package resistanceNet;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import component.ParallelResistor;
import component.ResistanceNet;
import component.Resistor;
import component.SeriesResistor;

public class MyTestFrame {
	
	@Test
	public void myTest() {
		Resistor r1 = new Resistor("R1", 100);
		Resistor r2 = new Resistor("R2", 200);
		Resistor r3 = new Resistor("R3", 300);
		Resistor r4 = new Resistor("R4", 400);
		Resistor r5 = new Resistor("R5", 500);
		Resistor r6 = new Resistor("R6", 600);
		
		ResistanceNet rn13 = new ParallelResistor(r1,r3);
		ResistanceNet rn123 = new SeriesResistor(rn13, r2);
		
		ResistanceNet rn45 = new SeriesResistor(r4,r5);
		ResistanceNet rn12345 = new ParallelResistor(rn123, rn45);
		ResistanceNet rn123456 = new ParallelResistor(rn12345, r6);
		
		double delta = rn123456.getResistance() - 155.91;
		assertTrue("Expected resistance about 155.91 Ω", -1 < delta && delta < 1);
		assertTrue("Expected number of resistors is 6", rn123456.getNumberOfResistors() == 6);
		System.out.println(rn123456.getCircuit());
	}
}
