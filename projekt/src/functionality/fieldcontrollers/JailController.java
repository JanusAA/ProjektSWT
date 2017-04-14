package functionality.fieldcontrollers;
import data.DiceCup;
import data.PlayerDTO;
import data.fieldclasses.FieldDTO;
import presentation.GUIHandler;
import presentation.language.LanguageHandler;

public class JailController {
	public static void JailRules(GUIHandler GUIh, LanguageHandler language, int fieldNumber, FieldDTO field, PlayerDTO player, DiceCup dice) {

		if(player.getNumberOfThrows() == 3){
			GUIh.getButtonPressed(language.threeThrowsJail(player.getName()), language.Ok());
			GUIh.getButtonPressed(language.bribeJail(player.getName()), language.Ok());
			player.Transaction(1000); 
			player.setNumberOfThrows(0);
		}else{

			//Viser tekst til spiller om han vil betale 1000, eller prøve at slå to ens med terningerne.
			if(GUIh.getYesNo(language.getOutJail(player.getName()), language.askThrowDice(), language.askPayJail())){

				GUIh.getButtonPressed(language.throwDice(), language.Ok());
				dice.rollDiceCup();
				int[] d = dice.getDiceValue();
				GUIh.showDice(d[0], d[1]);
				player.addNumberOfThrows();
			} else {
				GUIh.getButtonPressed(language.bribeJail(player.getName()), language.Ok());
				player.Transaction(1000);

			}

		}
	}
}