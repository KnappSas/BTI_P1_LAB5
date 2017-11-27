package resistanceNet;

import component.ParallelResistor;
import component.Potentiometer;
import component.ResistanceNet;
import component.Resistor;
import component.SeriesResistor;

public class MyTestFrame2 {
	public static void main(String[] args) {
		final Resistor      fr01 = new Resistor( "r1", 100 );                                       // Fixed Resistor
        final Resistor      fr02 = new Resistor( "r2", 200 );                                       // Fixed Resistor
        final ResistanceNet fr03 = new Resistor( "r3", 300 );                                       // Fixed Resistor
        final Potentiometer vr04 = new Potentiometer( "r4" );                                       // Variable Resistor
        final Potentiometer tmp1 = new Potentiometer( "r5", 280 );                                  // ...
        final Resistor      fr05 = tmp1;                                                            // Fixed Resistor
        final Potentiometer tmp2 = new Potentiometer( "r6", 600 );                                  // ...
        final ResistanceNet fr06 = tmp2;                                                           // Fixed Resistor
        
        vr04.setResistance( 400 );
        tmp1.setResistance( 500 );
        
        final ResistanceNet rn01 = new SeriesResistor( new ParallelResistor( fr01, fr03 ), fr02 );  // Resitance Net
        final ResistanceNet rn02 = new SeriesResistor( vr04, fr05 );                                // Resitance Net
        final ResistanceNet rn03 = new ParallelResistor( rn01, rn02, fr06 );                        // Resitance Net
        
        System.out.println(rn03.getResistance());
	}
}
