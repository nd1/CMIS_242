// CMIS 242 
// Duane J. Jarc
// September 13, 2016
// Week 4 Examples

// Class that implementa a soda machine that dispenses cans and bottles

package soda;

class SodaMachine
{
	private int amountDeposited;
	private int numberOfCans, numberOfBottles;
	private static final int CAN_COST = 100;
	private static final int BOTTLE_COST = 125;
	private static final int DOLLAR_BILL = 100;

	public SodaMachine(int numberOfCans, int numberOfBottles)
	{
		this.numberOfCans = numberOfCans;
		this.numberOfBottles = numberOfBottles;
	}

	public void insertCoin(int amount)
	{
		amountDeposited += amount;
	}

	public void insertBill()
	{
		amountDeposited += DOLLAR_BILL;
	}

	public void purchaseCan() throws InsufficientAmount, SoldOut
	{
		System.out.println(amountDeposited + " CC " + CAN_COST);
		if (amountDeposited < CAN_COST)
			throw new InsufficientAmount("" + (CAN_COST - amountDeposited));
		if (numberOfCans == 0)
			throw new SoldOut();
		numberOfCans--;
		amountDeposited -= CAN_COST;
	}

	public void purchaseBottle() throws InsufficientAmount, SoldOut
	{
		if (amountDeposited < BOTTLE_COST)
			throw new InsufficientAmount("" + (BOTTLE_COST - amountDeposited));
 		if (numberOfBottles == 0)
			throw new SoldOut();
		numberOfBottles--;
		amountDeposited -= BOTTLE_COST;
	}
}
