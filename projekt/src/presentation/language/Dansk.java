package presentation.language;

public class Dansk implements LanguageDefinitions {

	@Override
	public String gameRules() {
		return "\t Velkommen til Matador. Herunder ses en kort introduktion til reglerne: \n"
				+ "\t Ved spilstart tildeles hver spiller 30.000 kr, disse penge bruges til at opkøbe grunde, \n"
				+ "\t samt til at betale skat, leje og regninger. På spillebrættet findes 40 felter, som alle har \n"
				+ "\t nogle funktioner. Grunde, rederier og bryggerier kan alle købes. Skat medfører en betaling. \n"
				+ "\t Hvis du lander på et felt, som en anden spiller har købt, betales der en leje. \n "
				+ "\t Spillet vindes ved at være den sidste spiller med penge på kontoen. \n ";
		
	}
	@Override
	public String getFieldName(int index) {
		String names[] = {
				"Start",
				"Rødorvevej",
				"Prøv Lykken",
				"Hvidorvevej",
				"Indkomstskat",
				"LB - færge",
				"Roskildevej",
				"Prøv lykken",
				"Valby Langgade",
				"Allégade",
				"Fængsel",
				"Frederiksberg Alle",
				"Carlsberg",
				"Bülowsvej",
				"Gl. Kongevej",
				"Danmark færge",
				"Bernstorffsvej",
				"Prøv lykken",
				"Hellerupvej",
				"Strandvej",
				"Parkering",
				"Trianglen",
				"Prøv lykken",
				"Østerbrogade",
				"Grønningen",
				"Mols-linjen - færge",
				"Bredgade",
				"Kgs. Nytorv",
				"Coca-Cola",
				"Østergade", 
				"De fængsles",
				"Amagertorv",
				"Vimmelskaftet",
				"Prøv lykken",
				"Nygade",
				"Skandinavisk Linietrafik - færge",
				"Prøv lykken",
				"Frederiksberggade",
				"Ekstraordinær statsskat",
				"Rådhuspladsen"};
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
		return "Indtast antal ønskede spillere. (mellem 2 og 6) ";
	}
	@Override
	public String AskForPlayerName() {
		return "Indtast spillernavn: ";
	}
	@Override
	public String askBuyField() {
		return "Vil du købe dette felt?";
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
		return "Hvilket beløb ønsker du at betale til skat?";
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
		return name + "Vil du slå med terningerne, eller betale 1000 for at komme uf af fængslet?";
	}
	@Override
	public String throwDice(){
		return "Kast terningerne, og håb på to ens";
	}
	@Override
	public String bribeJail(String name){
		return name + "betaler 1000kr til fængselsvagten og bliver løsladt.";
	}
	@Override
	public String threeThrowsJail(String name){
		return name + "har ikke lykkedes at slå 2 ens på tre runder, derfor betales 1000 kr. og spiller kan nu rykke igen.";
	}
}