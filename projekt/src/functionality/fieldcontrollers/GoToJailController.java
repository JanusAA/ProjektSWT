package functionality.fieldcontrollers;
import data.DiceCup;
import data.PlayerDTO;
import data.fieldclasses.FieldDTO;
import presentation.GUIHandler;
import presentation.language.LanguageHandler;


	

public class GoToJailController {
	public static void JailRules(GUIHandler GUIh, LanguageHandler language, int fieldNumber, FieldDTO field, PlayerDTO player, DiceCup dice) {

		//Skal aktiveres når en spiller lander på et "de faengsles" feltet:
		// Der vises en besked (samme som på chancekoret, de fængsles og modtager ikke 4000 hvis start passeres
		GUIh.getButtonPressed(language.ChanceCard4(), language.Ok());
		//Når spilleren klikken ok, fjernes bilen fra hvor den er på GUI'en
		GUIh.removeCar(player.getCurrentField(), player.getName());
		//En lokal spillervariabel sættes til fængslets lokation field 11:
		player.setCurrentField(11);
		//bilen flyttes til fængslet. 
		GUIh.setCar(player.getCurrentField(), player.getName());
		
		// TODO: en metode som først når det er spillerens tur igen starter som en land on field metode i fængslet, som starter JailControlleren.
	}
}
