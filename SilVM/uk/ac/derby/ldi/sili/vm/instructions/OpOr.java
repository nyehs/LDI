package uk.ac.derby.ldi.sili.vm.instructions;

import uk.ac.derby.ldi.sili.vm.Context;
import uk.ac.derby.ldi.sili.vm.Instruction;

public class OpOr extends Instruction {
	public final void execute(Context context) {
		context.or();
	}
}
