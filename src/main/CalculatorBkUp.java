import java.math.BigDecimal;
//import java.util.Stack;


public class CalculatorBkUp {
	
	private OperandStack stack = new OperandStack();

	//private Stack<BigDecimal> values = new Stack<BigDecimal>();
		

	
	
	public BigDecimal getAccumulator() {
	/* 	if(values.size() ==0){
			return BigDecimal.ZERO;
		}
		return values.peek();*/
		return stack.peek();
	}

	public void setAccumulator(BigDecimal value) {
	/*	if(values.size() > 0){
			values.pop();
		}
		values.push(value);*/
		stack.replaceTop(value);
	}

	public void enter() {
		//values.push(getAccumulator());
		stack.push(getAccumulator());
	}

	public void drop() {
		//values.pop();
		stack.pop();
	}

}
