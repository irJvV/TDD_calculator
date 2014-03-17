import java.math.BigDecimal;

public class Calculator {
	
	private OperandStack stack = new OperandStack();
	
	
	public BigDecimal getAccumulator() {
		return stack.peek();
	}

	public void setAccumulator(BigDecimal value) {
		stack.replaceTop(value);
	}

	public void enter() {
		stack.push(getAccumulator());
	}

	public void drop() {
		stack.pop();
	}

	/*public void add() {
		Operation addOperation = new AddOperation();
		addOperation.apply(stack);
	}

	public void subtract() {
		Operation subtractOperation = new SubtractOperation();
		subtractOperation.apply(stack);
	}

	public void execute(String op) {
		if(op.equals("+")){add();}
		if(op.equals("-")){subtract();}
	}*/
	
	public void execute(String op) {
		Operation operation = null;
		if(op.equals("+")){operation = new AddOperation();}
		if(op.equals("-")){operation = new SubtractOperation();}
		if(op.equals("*")){operation = new MultiplyOperation();}
		if(op.equals("/")){operation = new DivideOperation();}
		if(op.equals("^2")){operation = new SquareOperation();}
		operation.apply(stack);
	}

}
