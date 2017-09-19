// CMIS 242 
// Duane J. Jarc
// September 13, 2016
// Week 4 Examples

// GUI for the soda machine class

package soda;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SodaMachineGUI extends JFrame
{
	private enum Container {CAN, BOTTLE};
	private static final int NICKEL = 5, DIME = 10, QUARTER = 25;
	private static final int INITIAL_NUMBER_OF_CANS = 50, INITIAL_NUMBER_OF_BOTTLES = 40;
	private JButton purchaseBottleButton = new JButton("Purchase Bottle"), 
		purchaseCanButton = new JButton("Purchase Can"), insertBillButton = new JButton("Insert Bill"),
		insertCoin = new JButton("InsertCoin");
	private JRadioButton nickel = new JRadioButton("Nickel", false), dime = new JRadioButton("Dime"),
		quarter = new JRadioButton("Quarter", true); 
	private SodaMachine sodaMachine = new SodaMachine(INITIAL_NUMBER_OF_CANS, INITIAL_NUMBER_OF_BOTTLES);
	public SodaMachineGUI()
	{
		super("Soda Machine");
		setSize(400, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(2, 2, 10, 10));
		buttonPanel.add(purchaseCanButton);
		buttonPanel.add(purchaseBottleButton);
		buttonPanel.add(insertBillButton);
		buttonPanel.add(insertCoin);
		add(buttonPanel);
		JPanel radioPanel = new JPanel();
		radioPanel.setLayout(new GridLayout(1, 3, 10, 10));
		radioPanel.add(nickel);
		radioPanel.add(dime);
		radioPanel.add(quarter);
		add(radioPanel);
		ButtonGroup group = new ButtonGroup();
		group.add(nickel);
		group.add(dime);
		group.add(quarter);
		purchaseCanButton.addActionListener((ActionEvent event) ->
		{
			purchase(Container.CAN);
		});
		purchaseBottleButton.addActionListener((ActionEvent event) ->
		{
			purchase(Container.BOTTLE);
		});		
		insertBillButton.addActionListener((ActionEvent event) ->
		{
					System.out.println("bill");

			sodaMachine.insertBill();
		});
		insertCoin.addActionListener((ActionEvent event) ->
		{
			int coinAmount;
			if (nickel.isSelected())
				coinAmount = NICKEL;
			else if (dime.isSelected())
				coinAmount = DIME;
			else
				coinAmount = QUARTER;
			sodaMachine.insertCoin(coinAmount);
		});
	}
	
	public void purchase(Container container)
	{
		try
		{
			switch(container)
			{
				case CAN:
					sodaMachine.purchaseCan();
					break;
				case BOTTLE:
					sodaMachine.purchaseBottle();
					break;
			}
			JOptionPane.showMessageDialog(null, container.name() + " dispensed");
		}
		catch (InsufficientAmount exception)
		{
			JOptionPane.showMessageDialog(null, exception.getMessage() + " cents more needed");
		}
		catch (SoldOut exception)
		{
			JOptionPane.showMessageDialog(null, "Sold Out, Make Another Selection");
		}
	}
	
	public static void main(String[] args)
	{
		SodaMachineGUI frame = new SodaMachineGUI();
		frame.setVisible(true);
	}

}
