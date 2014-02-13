package be.vdab.entities;

import java.math.BigDecimal;

public class Rekening {
	private BigDecimal saldo=BigDecimal.ZERO;

	public BigDecimal getSaldo() {
		return saldo;
	}

	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}
	
	}
