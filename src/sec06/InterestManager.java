package sec06;

public class InterestManager {

	
	
	public static void main(String[] args) {
		InterestManager manage = new InterestManager();
		for(int day=1; day<366; day++) {
			double amount = manage.calculateAmount(day, 1000000);
			System.out.println(day+ " " +amount+ " ");
			if(day%20==0) System.out.println();
		}
		

	}
	
	public double getInterestRate(int day) {
		double rate;
	
		
		if(day>=90) {
			rate = 0.5;
			}else if(91<day && day >=180) {
				rate = 1;
			}else if(181<day && day >=364) {
				rate = 2;
			}else {
				rate = 5.6; 
			}
		
		
			return rate;
			
			
			}
	
	public double calculateAmount(int day, long amount) {
		double total;
		double rate = getInterestRate(day);
		double rateAmount = (amount *rate) / 100;
		total = amount + rateAmount;
		return total;
		 
	} 
}
