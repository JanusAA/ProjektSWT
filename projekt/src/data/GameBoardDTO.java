package data;
import java.awt.Color;
import java.lang.reflect.Array;

import data.fieldclasses.BreweryDTO;
import data.fieldclasses.FieldDTO;
import data.fieldclasses.Ownable;
import data.fieldclasses.RefugeDTO;
import data.fieldclasses.ShippingCompanyDTO;
import data.fieldclasses.StreetDTO;
import data.fieldclasses.Tax;
;
public class GameBoardDTO {
	private static FieldDTO[] field;


	public GameBoardDTO() {
		GameBoardDTO.field = new FieldDTO[40];

//		Territory parametre: id, feltfarve, feltpris, leje
		field[0] = new StreetDTO(0, Color.RED, 1000, 100);
		field[1] = new StreetDTO(1, Color.RED, 1500, 300);
//		Refuge parametre: id, feltfarve, bonus 
		field[2] = new RefugeDTO(2, Color.CYAN, 5000);
//		ShippingCompany parametre: id, pris
		field[3] = new ShippingCompanyDTO(3, Color.BLUE, 4000);
		field[4] = new StreetDTO(4, Color.RED, 2000, 500);
		field[5] = new StreetDTO(5, Color.RED, 3000, 700);
		field[6] = new BreweryDTO(6, Color.GREEN, 2500);
//		Tax parametre: id, feltfarve, fast skattebeløb, skatte pct.
		field[7] = new Tax(7, Color.YELLOW, 2000, 0);
		field[8] = new StreetDTO(8, Color.RED, 4000, 1000);
		field[9] = new StreetDTO(9, Color.RED, 4300, 1300);
		field[10] = new ShippingCompanyDTO(10, Color.BLUE, 4000);
		field[11] = new BreweryDTO(11, Color.GREEN, 2500);
		field[12] = new StreetDTO(12, Color.RED, 4750, 1600);
		field[13] = new StreetDTO(13, Color.RED, 5000, 2000);
		field[14] = new RefugeDTO(14, Color.CYAN, 500);
		field[15] = new ShippingCompanyDTO(15, Color.BLUE, 4000);
		field[16] = new StreetDTO(16, Color.RED, 5500, 2600);
		field[17] = new StreetDTO(17, Color.RED, 6000, 3200);
		field[18] = new Tax(18, Color.YELLOW, 4000, 10);
		field[19] = new StreetDTO(19, Color.RED, 8000, 4000);	
		field[20] = new ShippingCompanyDTO(20, Color.BLUE, 4000);
		field[21] = new StreetDTO(21, Color.RED, 100, 100);
		field[22] = new StreetDTO(22, Color.RED, 100, 100);
		field[23] = new StreetDTO(23, Color.RED, 100, 100);
		field[24] = new StreetDTO(24, Color.RED, 100, 100);
		field[25] = new StreetDTO(25, Color.RED, 100, 100);
		field[26] = new StreetDTO(26, Color.RED, 100, 100);
		field[27] = new StreetDTO(27, Color.RED, 100, 100);
		field[28] = new StreetDTO(28, Color.RED, 100, 100);
		field[29] = new StreetDTO(29, Color.RED, 100, 100);
		field[30] = new StreetDTO(30, Color.RED, 100, 100);
		field[31] = new StreetDTO(31, Color.RED, 100, 100);
		field[32] = new StreetDTO(32, Color.RED, 100, 100);
		field[33] = new StreetDTO(33, Color.RED, 100, 100);
		field[34] = new StreetDTO(34, Color.RED, 100, 100);
		field[35] = new StreetDTO(35, Color.RED, 100, 100);
		field[36] = new StreetDTO(36, Color.RED, 100, 100);
		field[37] = new StreetDTO(37, Color.RED, 100, 100);
		field[38] = new StreetDTO(38, Color.RED, 100, 100);
		field[39] = new StreetDTO(39, Color.RED, 100, 100);
	}	
	public int getNumberOfFields () {
		return Array.getLength(field);
	}
	public Color getFieldColor(int index) {
		return field[index].getColor();
	}
	public int getFieldRent(int index) {
		return field[index].getRent();
	}
	public int getFieldPrice(int index) {
		return field[index].getPrice();
	}
	public int getFieldType(int index) {
		return field[index].getType();
	}

	public FieldDTO getField(int i ) {
		return field[i];
	}
/**
 *  Metode til at finde et felts index ved at bruge felt id, det bliver aldrig brugt.
 * @param f
 * @return
 */
	public int getFieldNumber(FieldDTO f) {
		int i;
		for (i = 0; i< getNumberOfFields(); i++){
			if (f.getID() == field[i].getID())
				break;
		}
		return i;
	}

/**
 * 	Metode til at fjerne ejerskab af ejendomme, når spiller dør
 * @param n
 * @param player
 * @return
 */
	public boolean removeFieldOwner(int n, PlayerDTO player) {
		boolean freed = false;
		if (field[n].getPrice() > 0) {	// hvis feltet kan ejes
			Ownable ofield = (Ownable) field[n]; 
			PlayerDTO owner = ofield.getOwner();
			if (owner == player) {	
				ofield.setOwner(null);
				freed = true;
			}
		}
		return freed;
	}
}

