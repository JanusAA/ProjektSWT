package data.fieldclasses;

import java.awt.Color;

import data.PlayerDTO;

public class GoToJail extends FieldDTO {

	public GoToJail(int fieldNumber, Color color) {
		super(fieldNumber, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getType() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int landOnField(PlayerDTO player) {
		// Der skal laves en metode som flytter spilleren til f�ngslet p� felt 11 (11 grafisk)
		// Uden spilleren modtager penge ved at flytte over start.
		
		return 0;
	}

}
