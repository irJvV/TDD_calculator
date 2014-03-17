import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

# testing

public class OperationsTest {
	private Calculator calculator;
	
	@Before
	public void createCalculatorWithTwoValues(){
		calculator = new Calculator();
		calculator.setAccumulator(new BigDecimal(20));
		calculator.enter();
		calculator.setAccumulator(new BigDecimal(4));
	}
	
	/*@Test
	public void testAdd(){
		calculator.add();
		assertEquals(new BigDecimal(24),calculator.getAccumulator());
	}*/
	
	@Test
	public void testAddExecution(){
		calculator.execute("+");
		assertEquals(new BigDecimal(24),calculator.getAccumulator());
	}
	
	/*@Test
	public void testSubtract(){
		calculator.subtract();
		assertEquals(new BigDecimal(16),calculator.getAccumulator());
	}*/
	
	@Test
	public void testSubtractExecution(){
		calculator.execute("-");
		assertEquals(new BigDecimal(16),calculator.getAccumulator());
	}
	
	@Test
	public void testMultiplyExecution(){
		calculator.execute("*");
		assertEquals(new BigDecimal(80),calculator.getAccumulator());
	}
	
	@Test
	public void testDevideExecution(){
		calculator.execute("/");
		assertEquals(new BigDecimal(5),calculator.getAccumulator());
	}
	
	@Test
	public void testSquareExecution(){
		calculator.execute("^2");
		assertEquals(new BigDecimal(400),calculator.getAccumulator());
	}
	
}
