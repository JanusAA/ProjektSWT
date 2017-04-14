package data.fieldclasses;
import java.awt.Color;

import data.PlayerDTO;
public class BreweryDTO extends Ownable {
	int rent, BreweriesOwned;

	/**Constructor til Brewery felt.
	 * @param fieldNumber
	 * @param color
	 * @param price
	 */
	public BreweryDTO(int fieldNumber, Color color, int price) {
		super(fieldNumber, color, price);
	}

	/**
	 *  Hvis man lander p� et bryggeri som er ejet,
	 * skal man betale en variabel leje til ejeren.
	 * Lejen er bestemt efter hvor mange af denne type ejendom man ejer
	 * dvs. at n�r der kr�ves leje, er det p� baggrund af antallt af ejet
	 * bryggerier og hvilket slag der er sl�et for at lande p� bruggeriet.
	 * Bel�bet udregnes s�ledes og metoden returnerer det betalte bel�b,
	 * som bruges til at t�lle balancen ned i GUIen
	 */
	@Override
	public int landOnField(PlayerDTO player) {
		int rent = 0;
		if (this.owner != null){
			BreweriesOwned = this.owner.getBreweriesOwned(); 
			rent = BreweriesOwned * 100*player.getDiceSum();			
			}
		player.payTo(this.owner, rent); 
		return rent;		
	}
	
	/**
	 * Superklassens metode til at købe feltet genbruges
	 * derudover registreres det at denne spiller har købt 
	 * endnu en LaborCamps, da dette skal bruges til at beregne leje
	 */
	@Override
	public void buyField(PlayerDTO player) {
		super.buyField(player);
		player.setBreweriesOwned(1+player.getBreweriesOwned());
	}


	
	@Override
	public int getPrice() {
		return this.price;
	}

	@Override
	public int getRent() {
		// Kan evt. udvides til at returnere 100 gange terningkast
		return 0;
	}

	/**
	 * Returnerer unik id, 
	 * som identificerer denne klasse som Labor Camp
	 */
	@Override
	public int getType() {
		return 2;	// Labor Camp
	}
}
