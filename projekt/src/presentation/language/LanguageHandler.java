package presentation.language;

public class LanguageHandler {

	private static LanguageDefinitions selectedLanguage;
	public String getFieldDescription(int type) {
		return selectedLanguage.getFieldDescription(type);
	}
	

	public LanguageHandler(String language) {
		setLanguage(language);
	}

	/**
	 * Metode til at skifte sprog, skulle det blive nødvendigt ved viderudvikling
	 * Engelsk er med som eksempel, men er kommenteret ud
	 * @param language
	 */
	public void setLanguage(String language) {
		switch(language) {
		case "Dansk": selectedLanguage = new Dansk(); break;
//		case "English": selectedLanguage = new English(); break;
		default: selectedLanguage = new Dansk();
		}
	}
	
	public String gameRules(){
		return selectedLanguage.gameRules();
	}

	public String getFieldName(int index) {
		return selectedLanguage.getFieldName(index);
	}

	public String getFieldPrice(int price) {
		return selectedLanguage.getFieldPrice(price);
	}
	
	public String getFieldRent(int rent) {
		return selectedLanguage.getFieldRent(rent);
	}

	public String AskHowManyPlayers() {
		return selectedLanguage.AskHowManyPlayer();
	}

	public String askForPlayerName() {
		return selectedLanguage.AskForPlayerName();
	}

	public String askBuyField() {
		return selectedLanguage.askBuyField();
	}


	public String no() {
		return selectedLanguage.no();
	}


	public String yes() {
		return selectedLanguage.yes();
	}


	public String GetOkMove(String s) {
		return selectedLanguage.getOkMove(s);
	}


	public String Ok() {
		return selectedLanguage.Ok();
	}


	public String GameOver(String winner) {
		return selectedLanguage.GameOver(winner);
	}


	public String playerPayTo(String payer, String recipient, int paid) {
		return selectedLanguage.playerPayTo(payer, recipient, paid);
	}
	
	public String playerTax(String name, int paid) {
		return selectedLanguage.playerTax(name, paid);
	}


	public String playerBonus(String name, int bonus) {
		return selectedLanguage.playerBonus(name, bonus);
	}


	public String askPayTax() {
		return selectedLanguage.askPayTax();
	}
	
	public String askThrowDice() {
		return selectedLanguage.askThrowDice();
	}
	
	public String askPayJail() {
		return selectedLanguage.askPayJail();
	}
	
	public String getOutJail(String name) {
		return selectedLanguage.getOutJail(name);
	}
	
	public String throwDice(){
		return selectedLanguage.throwDice();
	}
	
	public String bribeJail(String name){
		return selectedLanguage.bribeJail(name);
	}
	
	public String threeThrowsJail(String name){
		return selectedLanguage.threeThrowsJail(name);
		
	public String ChanceCard1 (){
		return selectedLanguage.ChanceCard1();
	}
	
	public String ChanceCard2 (){
		return selectedLanguage.ChanceCard2();
	}
		
	public String ChanceCard3 (){
		return selectedLanguage.ChanceCard3();
	}
	public String ChanceCard4 (){
		return selectedLanguage.ChanceCard4();
	}
	public String ChanceCard5 (){
		return selectedLanguage.ChanceCard5();
	}
	public String ChanceCard6 (){
		return selectedLanguage.ChanceCard6();
	}
	public String ChanceCard7 (){
		return selectedLanguage.ChanceCard7();
	}
	public String ChanceCard8 (){
		return selectedLanguage.ChanceCard8();
	}
	public String ChanceCard9 (){
		return selectedLanguage.ChanceCard9();
	}
	public String ChanceCard10 (){
		return selectedLanguage.ChanceCard10();
	}
	public String ChanceCard11 (){
		return selectedLanguage.ChanceCard11();
	}
	public String ChanceCard12 (){
		return selectedLanguage.ChanceCard12();
	}
	public String ChanceCard13 (){
		return selectedLanguage.ChanceCard13();
	}
	public String ChanceCard14 (){
		return selectedLanguage.ChanceCard14();
	}
	public String ChanceCard15 (){
		return selectedLanguage.ChanceCard15();
	}
	public String ChanceCard16 (){
		return selectedLanguage.ChanceCard16();
	}
	public String ChanceCard17 (){
		return selectedLanguage.ChanceCard17();
	}
	public String ChanceCard18 (){
		return selectedLanguage.ChanceCard18();
	}
	public String ChanceCard19 (){
		return selectedLanguage.ChanceCard19();
	}
	public String ChanceCard20 (){
		return selectedLanguage.ChanceCard20();
	}
	public String ChanceCard21 (){
		return selectedLanguage.ChanceCard21();
	}
	public String ChanceCard22 (){
		return selectedLanguage.ChanceCard22();
	}
	public String ChanceCard23 (){
		return selectedLanguage.ChanceCard23();
	}
	public String ChanceCard24 (){
		return selectedLanguage.ChanceCard24();
	}
	public String ChanceCard25 (){
		return selectedLanguage.ChanceCard25();
	}
	public String ChanceCard26 (){
		return selectedLanguage.ChanceCard26();
	}
	public String ChanceCard27 (){
		return selectedLanguage.ChanceCard27();
	}
	public String ChanceCard28 (){
		return selectedLanguage.ChanceCard28();
	}
	public String ChanceCard29 (){
		return selectedLanguage.ChanceCard29();
	}
	public String ChanceCard30 (){
		return selectedLanguage.ChanceCard30();
	}
	public String ChanceCard31 (){
		return selectedLanguage.ChanceCard31();
	}
	public String ChanceCard32 (){
		return selectedLanguage.ChanceCard32();
	}
	public String ChanceCard33 (){
		return selectedLanguage.ChanceCard33();
	}
	public String ChanceCard34 (){
		return selectedLanguage.ChanceCard34();
	}
}