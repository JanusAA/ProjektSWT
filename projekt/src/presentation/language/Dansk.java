package presentation.language;

public class Dansk implements LanguageDefinitions {

	@Override
	public String gameRules() {
		return " Velkommen til Matador. Herunder ses en kort introduktion til reglerne: \n"
				+ " Ved spilstart tildeles hver spiller 30.000 kr, disse penge bruges til at opkoebe grunde, \n"
				+ " samt til at betale skat, leje og regninger. På spillebraettet findes 40 felter, som alle har \n"
				+ " nogle funktioner. Grunde, rederier og bryggerier kan alle koebes. Skat medfoerer en betaling. \n"
				+ " Hvis du lander på et felt, som en anden spiller har koebt, betales der en leje. \n "
				+ " Spillet vindes ved at vaere den sidste spiller med penge på kontoen. \n ";
		
	}
	@Override
	public String getFieldName(int index) {
		String names[] = {
				"Start",
				"Roedorvevej",
				"Proev Lykken",
				"Hvidorvevej",
				"Indkomstskat",
				"LB - faerge",
				"Roskildevej",
				"Proev lykken",
				"Valby Langgade",
				"Allégade",
				"Faengsel",
				"Frederiksberg Alle",
				"Carlsberg",
				"Bylowsvej",
				"Gl. Kongevej",
				"Danmark faerge",
				"Bernstorffsvej",
				"Proev lykken",
				"Hellerupvej",
				"Strandvej",
				"Parkering",
				"Trianglen",
				"Proev lykken",
				"Oesterbrogade",
				"Groenningen",
				"Mols-linjen - faerge",
				"Bredgade",
				"Kgs. Nytorv",
				"Coca-Cola",
				"Oestergade", 
				"De faengsles",
				"Amagertorv",
				"Vimmelskaftet",
				"Proev lykken",
				"Nygade",
				"Skandinavisk Linietrafik - faerge",
				"Proev lykken",
				"Frederiksberggade",
				"Ekstraordinaer statsskat",
				"Raadhuspladsen"};
		return names[index];
	}
	@Override
	public String getFieldRent(int rent) {
		String s;
		if (rent > 0) {
			s = "Lejen er:" + rent;
		} else {
			//hvis feltet ikke er ownable (rent = 0), så returneres en tom streng.
			s = "";
		}
		return s;
	}

	@Override
	public String getFieldPrice(int price) {
		String s;
		if (price > 0) {
			s = "Pris " + price;
		} else {
			//hvis feltet ikke er ownable (price = 0), så returneres en tom streng.
			s = "";
		}
		return s;
	}

	@Override
	public String AskHowManyPlayer() {
		return "Indtast antal oenskede spillere. (mellem 2 og 6) ";
	}
	@Override
	public String AskForPlayerName() {
		return "Indtast spillernavn: ";
	}
	@Override
	public String askBuyField() {
		return "Vil du koebe dette felt?";
	}
	@Override
	public String getFieldDescription(int type) {
		String s;
		switch (type) {
		case 1: 	s = "Rederi";		break;
		case 2: 	s = "Bryggeri";		break;
		case 3: 	s = "Helle";		break;
		case 4: 	s = "Skat";			break;
		case 5: 	s = "Grund";		break;
		case 6:		s = "Chance";		break;
		default:	s = "";				break;
		}
		return s;
	}
	@Override
	public String no() {
		return "Nej";
	}
	@Override
	public String yes() {
		return "Ja";
	}
	@Override
	public String getOkMove(String playerName) {
		return "Det er " + playerName+ "'s tur, Tryk OK for at kaste terningerne";
				
	}
	@Override
	public String Ok() {
		return "OK";
	}
	@Override
	public String GameOver(String winner) {
		return "Spillet er slut. Vinderen er: " + winner + ". Tillykke!";
	}
	@Override
	public String playerPayTo(String payer, String recipient, int paid) {
		return "Spiller '" + payer + "' betaler "+ paid + " til '" + recipient + "'.";
	}

	@Override
	public String playerTax(String name, int paid) {
		return "Spiller '" + name + "' betaler "+ paid + " i skat.";
	}
	@Override
	public String playerBonus(String name, int bonus) {
		return "Spiller '" + name + "' modtager "+ bonus+ " i bonus.";
	}
	@Override
	public String askPayTax() {
		return "Hvilket beloeb oensker du at betale til skat?";
	}
	@Override
	public String askThrowDice(){
		return "Kast terninger";
	}
	@Override
	public String askPayJail(){
		return "Betal 1000";
	}
	@Override
	public String getOutJail(String name){
		return name + "Vil du slaa med terningerne, eller betale 1000 for at komme uf af faengslet?";
	}
	@Override
	public String throwDice(){
		return "Kast terningerne, og haab paa to ens";
	}
	@Override
	public String bribeJail(String name){
		return name + "betaler 1000kr til faengselsvagten og bliver loesladt.";
	}
	@Override
	public String threeThrowsJail(String name){
		return name + "har ikke lykkedes at slaa 2 ens på tre runder, derfor betales 1000 kr. og spiller kan nu rykke igen.";
	}
	@Override
	public String ChanceCard1() {
		return "De modtager Deres aktieudbytte. Modtag 1000 kr af banken";
	}
	@Override
	public String ChanceCard2() {
		return "Ryk frem til start";
	}
	@Override
	public String ChanceCard3() {
		return "De ryger i faengsel. Selvom at De passerer start, modtages ikke 4000 kr.";
	}
	@Override
	public String ChanceCard4() {
		return "De ryger i faengsel. Selvom at De passerer start, modtages ikke 4000 kr.";
	}
	@Override
	public String ChanceCard5() {
		return "De har vaeret i udlandet og har taget for mange cigaretter med hjem. Betal 200 kr i tolden.";
	}
	@Override
	public String ChanceCard6() {
		return "De har modtaget Deres tandlaegeregning. Betal 2000 kr.";
	}
	@Override
	public String ChanceCard7() {
		return "De havde en raekke med 11 rigtige i tipning. Modtag 1000 kr.";
	}
	@Override
	public String ChanceCard8() {
		return "Deres praemieobligation er kommet ud. Modtag 1000 kr. af banken.";
	}
	@Override
	public String ChanceCard9() {
		return "Deres praemieobligation er kommet ud. Modtag 1000 kr. af banken.";
	}
	@Override
	public String ChanceCard10() {
		return "Det er Deres foedselsdag. Modtag 200 kr. af hver medspiller.";
	}
	@Override
	public String ChanceCard11() {
		return "Vaerdien af egen avl fra nyttehaven udgoer 200 kr., som De modtager af banken.";
	}
	@Override
	public String ChanceCard12() {
		return "Betal Deres bilforsikring paa 1000 kr.";
	}
	@Override
	public String ChanceCard13() {
		return "Ejendomsskatterne er steget, ekstraudgifterne er: 800 kr. pr. hus og 2300 kr. pr. hotel.";
	}
	@Override
	public String ChanceCard14() {
		return "Ryk frem til Groenningen. Hvis De passerer start indkasseres 4000 kr.";
	}
	@Override
	public String ChanceCard15() {
		return "Ryk brikken frem til det naermeste rederi og betal ejeren to gange den leje, han ellers er berettiget til. Hvis selskabet ikke ejes af nogen kan De købe det af banken.";
	}
	@Override
	public String ChanceCard16() {
		return "Ryk brikken frem til det naermeste rederi og betal ejeren to gange den leje, han ellers er berettiget til. Hvis selskabet ikke ejes af nogen kan De koebe det af banken.";
	}
	@Override
	public String ChanceCard17() {
		return "Tag med LB-faergerne --- flyt brikken frem, og hvis De passerer Start. Indkasser da 4000 kr.";
	}
	@Override
	public String ChanceCard18() {
		return "I anledning af kongens foedselsdag benaades De herved for faengsel. Dette kort kan opbevares, indtil De faar brug for det";//, eller De kan saelge det.";
	}
	@Override
	public String ChanceCard19() {
		return "I anledning af kongens foedselsdag beaades De herved for faengsel. Dette kort kan opbevares, indtil De faar brug for det";//, eller De kan saelge det.";
	}
	@Override
	public String ChanceCard20() {
		return "Grundet dyrtiden har De faaet gageforhoejelse. Modtag 1000 kr.";
	}
	@Override
	public String ChanceCard21() {
		return "Ryk frem til Frederiksberg Alle. Hvis De passerer Start inkasser 4000 kr.";
	}
	@Override
	public String ChanceCard22() {
		return "De har vundet i Klasselotteriet. Modtag 500 kr.";
	}
	@Override
	public String ChanceCard23() {
		return "Tag ind paa Raadhuspladsen.";
	}
	@Override
	public String ChanceCard24() {
		return "Ryk tre felter tilbage.";
	}
	@Override
	public String ChanceCard25() {
		return "Oliepriserne er steget, og De skal betale: 500 kr pr. hus og 2000 kr. pr. hotel.";
	}
	@Override
	public String ChanceCard26() {
		return "Betal 3000 kr for reparation af Deres vogn.";
	}
	@Override
	public String ChanceCard27() {
		return "Betal 3000 kr for reparation af Deres vogn.";
	}
	@Override
	public String ChanceCard28() {
		return "De modtager Matador-legatet for vaerdigt traengende, stort kr. 40.000 Ved vaerdigt traengende forstaas, at Deres formue, d.v.s. deres balance ikke er over 15.000"; //Deres kontante penge + skoeder + bygninger ikke overstiger kr. 15.000.";
	}
	@Override
	public String ChanceCard29() {
		return "Kommunen har eftergivet et kvartals skat. Haev i banken 3000 kr.";
	}
	@Override
	public String ChanceCard30() {
		return "Modtag udbytte af Deres aktier 1000 kr.";
	}
	@Override
	public String ChanceCard31() {
		return "Modtag udbytte af Deres aktier 1000 kr.";
	}
	@Override
	public String ChanceCard32() {
		return "De har koert frem for Fuld Stop. Betal kr. 1000 i boede.";
	}
	@Override
	public String ChanceCard33() {
		return "De har maattet vedtage en parkeringsboede. Betal 200 kr. i boede.";
	}
	
}