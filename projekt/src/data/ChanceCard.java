package data;

public class ChanceCard {
		public int cardID, cash;
		
		public ChanceCard(int cardID, int cash){
			this.cardID = cardID;
			this.cash = cash;
		}
			public int getID(){
				return this.cardID;
			}
			public int getCash(){
				return this.cash;
			
		}
	
		public ChanceCard[] chance; 
		public void Chance(){
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
		chance[24] = new ChanceCard(25, 0); // Oliepriserne er steget, Betal 500kr pr. hus og 2000kr per hotel.
		chance[25] = new ChanceCard(26, 3000); // Betal 3k for rep af vogn.
		chance[26] = new ChanceCard(27, 3000); // Betak 3k for rep af vogn. 
		chance[27] = new ChanceCard(28, 0); // Matador-legat, Modtag 40k, hvis formue ikke overstiger 15k.
		chance[28] = new ChanceCard(29, -3000); //kvatalskat fra kommunen modtag 3k af banken.
		chance[29] = new ChanceCard(30, -1000); //Aktieudbytte, modtag 1k af banken.
		chance[30] = new ChanceCard(31, -1000); //Aktieudbytte, modtag 1k af banken.
		chance[31] = new ChanceCard(32, 1000); //Kørt frem for fuld stop, betal 1000kr i bøde. 
		chance[32] = new ChanceCard(33, 200); //Parkeringsbøde, betal 200kr i bøde.
		
		
		// TODO: Kort vaerdierne er lagt ind med beskrivelser, og tekst ligger i sprogpakken
		// Det som mangler er metoden til ud fra kort ID'et at påvirke spiller. De skal skrives i ChanceDTO.
		// Der skal formegentlig ogsaa en Controller til at styrre kortene (Dette er ikke sikkert).
		}
	
		
}