package OopsAssignment;

interface Rewardable
{
	void calculateRewardPoints(double amount);
}

abstract class PrepaidCard
{
	int cardNo;
	double availableBalance;
	double swipeLimit;
	
	abstract boolean swipeCard(double amount);

	@Override
	public String toString() {
		return "PrepaidCard [cardNo=" + cardNo + ", availableBalance=" + availableBalance + ", swipeLimit=" + swipeLimit
				+ "]";
	}
	
	public void rechargeCard(double amount)
	{
		this.availableBalance = this.availableBalance + amount;
		System.out.println("Your balance: "+this.availableBalance);
	}
	
}

class TravelCard extends PrepaidCard implements Rewardable
{

	double rewardPoints;
	
	@Override
	boolean swipeCard(double amount) {
		// TODO Auto-generated method stub
		if(availableBalance > amount && swipeLimit >= amount)
			return true;
		return false;
	}
	
	
	public void calculateRewardPoints(double amount)
	{
		if(amount > 100)
		{
			rewardPoints = (amount / 100) * 5;
		}
		System.out.println("Reward Points added: "+rewardPoints);
	}
	
	public void swiped(double amount)
	{
		if(swipeCard(amount))
		{
			availableBalance = (availableBalance - (amount + (amount * 0.05 )));
		}
		System.out.println("Amount withdrawn: "+amount);
		System.out.println("Balance available: "+availableBalance);
		calculateRewardPoints(amount);
	}
	
}


public class TestCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TravelCard tc = new TravelCard();
		tc.cardNo = 851125005;
		tc.availableBalance = 900000.00;
		tc.swipeLimit = 20000.00;
		tc.swiped(20000);

	}

}
