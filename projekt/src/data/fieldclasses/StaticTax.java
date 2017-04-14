package data.fieldclasses;
import java.awt.Color;

import data.PlayerDTO;

/**
 * Man kan ikke eje tax og dens superklasse er derfor Field.	
 * Når man lander på dette felt,
 * skal man betale en pris.
 * Prisen er den mindste af enten
 * den faste betalingssum, eller skatteprocenten.
 */
public class StaticTax extends FieldDTO{
	private int taxAmount;	
	public StaticTax(int fieldNumber, Color color, int taxAmount) {
		super(fieldNumber, color);
		this.taxAmount = taxAmount;
	}
	/**
	 *  Hvis man lander på tax skal man i denne metode
	 *  betale et fast beløb
	 */
	@Override
	public int landOnField(PlayerDTO player) {
		int payment = this.taxAmount;
		player.Transaction(-payment);
		return payment;
	}
	/**
	 *  ikke relevant idet feltet ikke er ownable
	 */
	@Override
	public int getRent() {
		return 0;
	}
	/**
	 *  ikke relevant idet feltet ikke er ownable
	 */
	@Override
	public int getPrice() {
		return 0;
	}

	/**
	 * Returnerer unik id,  som identificerer denne klasse som tax
	 */
	@Override
	public int getType() {
		return 4;	// Tax
	}
	
}