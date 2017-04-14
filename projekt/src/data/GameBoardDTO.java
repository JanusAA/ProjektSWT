package data;
import java.awt.Color;
import java.lang.reflect.Array;

import data.fieldclasses.BreweryDTO;
import data.fieldclasses.ChanceDTO;
import data.fieldclasses.FieldDTO;
import data.fieldclasses.GoToJail;
import data.fieldclasses.JailDTO;
import data.fieldclasses.Ownable;
import data.fieldclasses.RefugeDTO;
import data.fieldclasses.ShippingCompanyDTO;
import data.fieldclasses.StaticTax;
import data.fieldclasses.StreetDTO;
import data.fieldclasses.Tax;
;
public class GameBoardDTO {
	private static FieldDTO[] field;


	public GameBoardDTO() {
		GameBoardDTO.field = new FieldDTO[40];


//		Refuge parametre: id, feltfarve, bonus (Startfelt)
		field[0] = new RefugeDTO(0, Color.RED, 4000);
//		Street parametre: id, feltfarve, feltpris, leje
		field[1] = new StreetDTO(1, Color.BLUE, 1200, 50);
//		Refuge parametre: id, feltfarve, bonus 
		field[2] = new ChanceDTO(2, Color.BLACK);
		field[3] = new StreetDTO(3, Color.BLUE, 1200, 50);
//		Tax parametre: id, feltfarve, fast skattebeløb, skatte pct.
		field[4] = new Tax(4, Color.WHITE, 4000, 10);
//		ShippingCompany parametre: id, pris
		field[5] = new ShippingCompanyDTO(5, Color.GREEN, 4000);
		field[6] = new StreetDTO(6, Color.ORANGE, 2000, 100);
		field[7] = new ChanceDTO(7, Color.BLACK);
		field[8] = new StreetDTO(8, Color.ORANGE, 2000, 100);
		field[9] = new StreetDTO(9, Color.ORANGE, 2400, 150);
		field[10] = new JailDTO(10, Color.DARK_GRAY);
		field[11] = new StreetDTO(11, Color.YELLOW, 2800, 200);
		field[12] = new BreweryDTO(12, Color.PINK, 4000);
		field[13] = new StreetDTO(13, Color.YELLOW, 2800, 200);
		field[14] = new StreetDTO(14, Color.YELLOW, 3200, 250);
		field[15] = new ShippingCompanyDTO(15, Color.GREEN, 4000);
		field[16] = new StreetDTO(16, Color.CYAN, 3600, 300);
		field[17] = new ChanceDTO(17, Color.BLACK);
		field[18] = new StreetDTO(18, Color.CYAN, 3600, 300);
		field[19] = new StreetDTO(19, Color.CYAN, 4000, 350);	
		/* Refuge bruges da der ikke er en klasse for Parkering.
		 Da feltet ikke kan ejes og der ikke sker en handling
		 kan det betragtes som et startfelt uden indkomst. */
		field[20] = new RefugeDTO(20, Color.WHITE, 0);
		field[21] = new StreetDTO(21, Color.RED, 4400, 350);
		field[22] = new ChanceDTO(22, Color.BLACK);
		field[23] = new StreetDTO(23, Color.RED, 4400, 350);
		field[24] = new StreetDTO(24, Color.RED, 4800, 400);
		field[25] = new ShippingCompanyDTO(25, Color.GREEN, 4800);
		field[26] = new StreetDTO(26, Color.LIGHT_GRAY, 5200, 450);
		field[27] = new StreetDTO(27, Color.LIGHT_GRAY, 5200, 450);
		field[28] = new BreweryDTO(28, Color.PINK, 3000);
		field[29] = new StreetDTO(29, Color.LIGHT_GRAY, 5600, 500);
		field[30] = new GoToJail(30, Color.DARK_GRAY);
		field[31] = new StreetDTO(31, Color.getHSBColor(173, 255, 47), 6000, 550);
		field[32] = new StreetDTO(32, Color.getHSBColor(173, 255, 47), 6000, 550);
		field[33] = new ChanceDTO(33, Color.BLACK);
		field[34] = new StreetDTO(34, Color.getHSBColor(173, 255, 47), 6400, 600);
		field[35] = new ShippingCompanyDTO(35, Color.GREEN, 4000);
		field[36] = new ChanceDTO(36, Color.BLACK);
		field[37] = new StreetDTO(37, Color.magenta, 7000, 700);
		// Der skal laves en ny TaxField klasse som trækker 2000 fra spilleren, Den er endu ikke lavet.
		field[38] = new StaticTax(38, Color.WHITE, 2000);
		field[39] = new StreetDTO(39, Color.magenta, 8000, 1000);
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
 * 	Metode til at fjerne ejerskab af ejendomme, nÃ¥r spiller dÃ¸r
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

