package data.fieldclasses;

import java.awt.Color;
import data.PlayerDTO;
import data.ChanceCard;


public class ChanceDTO extends FieldDTO {
	public ChanceDTO(int fieldNumber, Color color) {
		super(fieldNumber, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getType() {
		// returnerer 6 til dansk som viser "Chance".
		return 6; 
	}

	@Override
	public int landOnField(PlayerDTO player) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
