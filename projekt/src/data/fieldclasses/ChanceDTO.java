package data.fieldclasses;

import java.awt.Color;
import data.ChanceCard;
import data.PlayerDTO;

public class ChanceDTO extends FieldDTO {

	private static ChanceCard[] chance;
	
//	 chance = new ChanceCard[34]{
//			chance[0] = new Chancecard(1, 1000),
//					
//			chance[1]= 

	
	public ChanceDTO(int fieldNumber, Color color) {
		super(fieldNumber, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getType() {
		// TODO Auto-generated method stub
		return 6; //Lav "chancekort" i dansk
	}

	@Override
	public int landOnField(PlayerDTO player) {
		// TODO Auto-generated method stub
		return 0;
	}

}
