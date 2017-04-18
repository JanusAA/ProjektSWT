package data.fieldclasses;

import java.awt.Color;
import data.PlayerDTO;
import data.ChanceCard;

public class ChanceDTO extends FieldDTO {
	public ChanceDTO(int fieldNumber, Color color) {
		super(fieldNumber, color);
		// TODO Auto-generated constructor stub
	}

	
	public ChanceCard[] chance;{
	chance = new ChanceCard[33];
	// Første parametre er kort ID, anden er Cash altså beløbet, hvis det indgår
	
	// Det kan overvejes om Cash int'en skal ændres til at være
	// negativ når der skal modtages penge, da player.transacation() påvirker balancen negativt som standard
	chance[0] = new ChanceCard(1, -1000); // modtag 1000 af banken
	chance[1] = new ChanceCard(2, 0); //Ryk frem til start
	chance[2] = new ChanceCard(3, 0); //Ryk til fængsel % 4000 ved passering af start
	chance[3] = new ChanceCard(4, 0); //Ryk til fængsel % 4000 ved passering af start
	chance[4] = new ChanceCard(5, 200); // Betal told - 200.
	chance[5] = new ChanceCard(6, 2000); // Tandlaegeregning betal 2k.
	chance[6] = new ChanceCard(7, -1000); // Tipping vundet modtag 1000kr.
	chance[7] = new ChanceCard(8, -1000); //primieobligationer modtag 1000kr.
	chance[8] = new ChanceCard(9, -1000); //primieobligationer modtag 1000kr.
	chance[9] = new ChanceCard(10, 200); // Fødselsdag modtag 200kr af hver medspiller (bliver 'spændende' at lave
	chance[10] = new ChanceCard(11, -200); //egen avl fra nyttehaven modtag 200kr af banken.
	chance[11] = new ChanceCard(12, 1000); //Bilforsikring betal 1000 kr til bank. 
	chance[12] = new ChanceCard(13, 5000); //Ejendomsskat, udgifter 800kr pr. hus og 2300kr pr hotel -- Sættes umildbart til 5k da huse ikke er implementeret endnu.
	chance[13] = new ChanceCard(14, 0); // Ryk til feltet Groenningen (Felt 24 - index fra 0), passeres start modtages 4000kr. 
	chance[14] = new ChanceCard(15, 0); //Ryk frem til nærmeste redderi (Fieldtype: 1) og betal 2x leje hvis feltet ejes, ellers kan det købes.
	chance[15] = new ChanceCard(16, 0); //Ryk frem til nærmeste redderi (Fieldtype: 1) og betal 2x leje hvis feltet ejes, ellers kan det købes.
	chance[16] = new ChanceCard(17, 0); //Ryk til LB-faergerne passeres start modtages 4k. 
	chance[17] = new ChanceCard(18, 0); // I andledning af kongens fødselsdag... - Fængsels frikort. Skal gemmes i player klassen?
	chance[18] = new ChanceCard(19, 0); // I andledning af kongens fødselsdag... - Fængsels frikort. Skal gemmes i player klassen?
	chance[19] = new ChanceCard(20, -1000); //Gageforhoejelse modtag 1000 kr. 
	chance[20] = new ChanceCard(21, 0); // Ryk frem til Frederiksberg Alle, modtag 4k hvis start passeres.
	chance[21] = new ChanceCard(22, -500); // Vundet klasselotteriet, Modtag 500 kr. 
	chance[22] = new ChanceCard(23, 0); // Tag ind til rådhuspladsen.
	chance[23] = new ChanceCard(24, 0); // Ryk tre felter tilbage. 
	chance[24] = new ChanceCard(25, 5000); // Oliepriserne er steget, Betal 500kr pr. hus og 2000kr per hotel.
	chance[25] = new ChanceCard(26, 3000); // Betal 3k for rep af vogn.
	chance[26] = new ChanceCard(27, 3000); // Betak 3k for rep af vogn. 
	chance[27] = new ChanceCard(28, 0); // Matador-legat, Modtag 40k, hvis formue ikke overstiger 15k.
	chance[28] = new ChanceCard(29, -3000); //kvatalskat fra kommunen modtag 3k af banken.
	chance[29] = new ChanceCard(30, -1000); //Aktieudbytte, modtag 1k af banken.
	chance[30] = new ChanceCard(31, -1000); //Aktieudbytte, modtag 1k af banken.
	chance[31] = new ChanceCard(32, 1000); //Kørt frem for fuld stop, betal 1000kr i bøde. 
	chance[32] = new ChanceCard(33, 200); //Parkeringsbøde, betal 200kr i bøde.
	}
	@Override
	public int getType() {
		// returnerer 6 til dansk som viser "Chance".
		return 6; 
	}
	
	@Override
	public int landOnField(PlayerDTO player) {
		
		// Lav Que som trækker et ChanceCard, der derefter skal evalueres via if statements hernuder.
		// Husk at når spiller instansieres skal Array'et shuffeles. 
		
		return 0;
	}

	//Kode som skal udføres på baggrund af chancekortene:
	//Hvis spilelren skal modtage penge af banken:
	
	if(chance.getID() == 0 || 5 || 6 || 7 || 8 || 9 || 10 || 11 || 12 || 13 || 20 || 22 || 24 || 26 || 27 || 29 || 30 || 31 || 32 || 33){
		player.transaction(chance.getCash());
	}
	//Ryk frem til start:
	if(chance.getID() == 2){
		player.setCurrentField(0);
	}
	// De fængsles, rykker spileren til jail, efter at ReceiveIncome er sat til false.
	// Spilleren modtager ikke penge selvom start er passeret. 
	if(chance.getID() == 3 || 4){
		player.setReceiveIncome(false);
		player.setCurrentField(10);
	}
	//Ryk frem til grønningen. 
	if(chance.getID() == 14){
		player.setCurentField(24);
	}
	//Ryk frem til nærmeste redderi:
	int i;
	if(chance.getID() == 15 || 16){
		player.getCurrentField() = i;
			if(i < 5){
				player.setCurrentField(5);
			}
			if(i > 5 && i < 15){
				player.setCurrentField(15);
			}
			if(i > 15 && i < 25){
				player.setCurrentField(25);
			}
			if(i > 25 && i < 35){
				player.setCurrentField(35);
			}
			// Metoden når en spiller passere start skal forsat laves og fungere med denne if statement.
			else if(i > 35){
				player.setCurrentField(5);
			}
	//Ryk brikken til LB-færgerne. Rykkes over start skal spilleren modtage 4k. 
	if(chance.getID() == 17){
		player.setCurrentField(5)
	}
	
	//Get out of jail free card, boolean value som skal evalueres inden man bliver sat i fængsel. Personen skal dog flyttes til feltet og truen skal afsluttes.
	if(chance.getID() == 18 || 19){
		player.setPrisonFreeCard(true);
	}
	// ryk frem til frederiksberk alle:
	if(chance.getID() == 21){
		player.setCurrentField(12);
	}
	if(chance.getID() == 23){
		player.setCurrentField(40);
	}
	if(chance.getID() == 24){
		player.setCurrentField(player.getCurrentField()-3);
		
	}
	if(chance.getID() == 28){
		if(playet.getBalance < 15000){
			player.transaction(-40000);
		}else;
	}
	// git upload issue, proever igen. 
	}
}
