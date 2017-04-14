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
		return "Kast terningerne, og haab på to ens";
	}
	@Override
	public String bribeJail(String name){
		return name + "betaler 1000kr til faengselsvagten og bliver loesladt.";
	}
	@Override
	public String threeThrowsJail(String name){
		return name + "har ikke lykkedes at slå 2 ens på tre runder, derfor betales 1000 kr. og spiller kan nu rykke igen.";
	}
}