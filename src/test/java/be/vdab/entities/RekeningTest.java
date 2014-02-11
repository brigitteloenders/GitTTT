package be.vdab.entities;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class RekeningTest {
	private Rekening rekening;
	
	@Before
	public void before() {
		rekening = new Rekening();
	}
	
	@Test
	public void getSaldo() {
		Assert.assertEquals(BigDecimal.ZERO,rekening.getSaldo());		
	}

}
