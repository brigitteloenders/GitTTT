package be.vdab.entities;

import java.math.BigDecimal;

/** 
 * Een rekening van een bank.
 * @author bloender
 *
 */
public class Rekening {
	private BigDecimal saldo=BigDecimal.ZERO;

	/**
	 * Het saldo ophalen.
	 * @return het saldo (BigDecimal)
	 */
	public BigDecimal getSaldo() {
		return saldo;
	}

	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}
	
	}
