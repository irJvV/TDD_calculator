import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;


public class CalculatorWithThreeValuesTest {
	
	
	private Calculator calculator;
	BigDecimal value1;
	BigDecimal value2;
	BigDecimal value3;
	
	@Before
	public void createCalculatorWithThreeValues(){
		calculator = new Calculator();
		value1 = new BigDecimal(12);
		value2 = new BigDecimal(22);
		value3 = new BigDecimal(32);
		calculator.setAccumulator(value1);
		calculator.enter();
		calculator.setAccumulator(value2);
		calculator.enter();
		calculator.setAccumulator(value3);
	}
	
	@Test
	public void testAccumulatorAferPushingThreeValues(){
		assertEquals(value3, calculator.getAccumulator());
	}
	
	@Test
	public void testAccumulatorAferPushingSingleDrop(){
		calculator.drop();
		assertEquals(value2, calculator.getAccumulator());
	}
	
	@Test
	public void testAccumulatorAferPushingTwoDrops(){
		calculator.drop();
		calculator.drop();
		assertEquals(value1, calculator.getAccumulator());
	}
}
