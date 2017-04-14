package data;

public class ChanceCard {
		private int cardID, cash;
		
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
	
}
