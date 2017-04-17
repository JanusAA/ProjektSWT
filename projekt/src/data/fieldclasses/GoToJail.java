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
		// Der skal laves en metode som flytter spilleren til fængslet på felt 11 (11 grafisk)
		// Uden spilleren modtager penge ved at flytte over start.
		// Med set/get receive income kan det bestemmes om en spiller skal modtage penge eller ej.
		// TODO: der skal laves en metode som evaluere og ændre boolean value når start passeres. 
		if(player.getReceiveIncome()== true)
			player.setReceiveIncome(false);
		
		
		return 0;
	}

}
