package functionality.fieldcontrollers;
import data.DiceCup;
import data.PlayerDTO;
import data.fieldclasses.FieldDTO;
import presentation.GUIHandler;
import presentation.language.LanguageHandler;


	

public class GoToJailController {
	public static void JailRules(GUIHandler GUIh, LanguageHandler language, int fieldNumber, FieldDTO field, PlayerDTO player, DiceCup dice) {

		//Skal aktiveres n�r en spiller lander p� et "de faengsles" feltet:
		// Der vises en besked (samme som p� chancekoret, de f�ngsles og modtager ikke 4000 hvis start passeres
		GUIh.getButtonPressed(language.ChanceCard4(), language.Ok());
		//N�r spilleren klikken ok, fjernes bilen fra hvor den er p� GUI'en
		GUIh.removeCar(player.getCurrentField(), player.getName());
		//En lokal spillervariabel s�ttes til f�ngslets lokation field 11:
		player.setCurrentField(11);
		//bilen flyttes til f�ngslet. 
		GUIh.setCar(player.getCurrentField(), player.getName());
		
		// TODO: en metode som f�rst n�r det er spillerens tur igen starter som en land on field metode i f�ngslet, som starter JailControlleren.
		// Det skal nok skrives i hovedcontrolleren som viser er spiller's tur. if(player.getCurrentField() == 11){
	}
}
