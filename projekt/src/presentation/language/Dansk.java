package presentation.language;

public class Dansk implements LanguageDefinitions {

	@Override
	public String gameRules() {
		return "\t Dette spil kan spilles af 2-6 spillere. \n"
				+ "\t Spillet tabes ved at gÃ¥ bankerot, den sidste spiller med likvide midler vinder spillet. \n"
				+ "\t Alle spillere starter med en balance pÃ¥ 30.000. \n"
				+ "\t Visse felter kan kÃ¸bes, andre kan medfÃ¸re en betaling. \n"
				+ "\t Hvis en spiller lander pÃ¥ et ejet felt, betales en sum til ejeren. \n " ;
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
				"Østergade", // Er det korrekt??? 
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
			//hvis feltet ikke er ownable (rent = 0), sÃ¥ returneres en tom streng.
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
			//hvis feltet ikke er ownable (price = 0), sÃ¥ returneres en tom streng.
			s = "";
		}
		return s;
	}

	@Override
	public String AskHowManyPlayer() {
		return "Hvor mange spillere? (mellem 2 og 6) ";
	}
	@Override
	public String AskForPlayerName() {
		return "Indtast spillernavn: ";
	}
	@Override
	public String askBuyField() {
		return "Vil du kÃ¸be dette felt?";
	}
	@Override
	public String getFieldDescription(int type) {
		String s;
		switch (type) {
		case 1: 	s = "FlÃ¥de";		break;
		case 2: 	s = "Arbejdslejr";	break;
		case 3: 	s = "Helle";		break;
		case 4: 	s = "Skat";			break;
		case 5: 	s = "Territorie";	break;
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
		return "Det er " + playerName+ "'s tur, Tryk OK for at kaste terningerne og rykke";
				
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
		return "Hvilket belÃ¸b skal der betales i skat?";
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
		return name + "betaler 1000kr til fængselsvagten, og blev løsladt.";
	}
	@Override
	public String threeThrowsJail(String name){
		return name + "har ikke kunne slå 2 ens på tre runder, derfor betales, og derefter slås med terningerne.";
	}
}