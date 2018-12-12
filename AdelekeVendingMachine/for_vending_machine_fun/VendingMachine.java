package for_vending_machine_fun;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class VendingMachine extends JFrame{
	private JButton[][] rowColumnB, numberPadB;
	private JButton payB, newItemB, cancelB, numbersB ;
	private JTextField eAmountTF; 
	private JTextArea messageTA;
	private Container myCP;
private int x, y, w, h;

	public VendingMachine() {
		super("Vending Machine");
		setSize(750, 550);
		setLocation(150, 150);
		myCP = getContentPane(); // gets reference content pane
		myCP.setLayout(null);
		myCP.setBackground(Color.ORANGE);
		myCP.setForeground(Color.white);


		rowColumnB = new JButton [4][4];
		for (int r = 0;r <4; r++) {
			RowColumnBHandler rcBH = new RowColumnBHandler(r);
			for(int c = 0; c<4; c++) {
				rowColumnB[r][c] = new JButton("");
				rowColumnB[r][c].setLocation(40+100*c, 10+100*r);
				rowColumnB[r][c].setSize(80, 90);
				rowColumnB[r][c].setIcon(null);
				myCP.add(rowColumnB[r][c]);
				rowColumnB[r][c].addActionListener(rcBH);
			}//for rows
		}// for columns

//		private JButton numbersB(String textOnButton int w, int h,
//				ActionListener theHandler){
//			JButton toReturn = new JButton (textOnButton);
//			toReturn.setLocation(x, y);
//			toReturn.setSize( w, h);
//			myCP.add(toReturn);
//			toReturn.addActionListener(theHandler);
//			return toReturn;
//		}//makeButton
//
//		
//		
		numberPadB = new JButton [3][4];
//		numberPadB[0][0].numbersB(7, 40, 40 );
//		//[0][0]= new JButton ("7");
//		
		//numberPadB[0][1].setText("8");

		for (int n = 0; n<3; n++) {//over 3
			numberPadBHandler  nPBH = new numberPadBHandler(n);
			for (int p = 0; p<4; p++) {// down 4
				numberPadB[n][p] = new JButton("");
				numberPadB[n][p].setLocation(500+70*n, 130+50*p);
				numberPadB[n][p].setSize(40, 40);
				numberPadB[n][p].setIcon(null);
				myCP.add(numberPadB[n][p]);
				numberPadB[n][p].addActionListener(nPBH);

			}
		}


		messageTA = new JTextArea ("\n\n 	          PICK UP YOUR ITEMS");
		messageTA.setLocation(30, 420);
		messageTA.setSize(400, 90);
		messageTA.setEditable(false);
		myCP.add(messageTA);

		eAmountTF = new JTextField("Select the option, key in amount");
		eAmountTF.setLocation(490, 50);
		eAmountTF.setSize(195, 50);
		eAmountTF.setEditable(false);
		myCP.add(eAmountTF);

		newItemB = new JButton ("NEW ITEM");
		newItemB.setLocation(490,350);
		newItemB.setSize(80, 20);
		newItemB.addActionListener(new NewItemBHandler());
		myCP.add(newItemB);

		payB = new JButton ("PAY");
		payB.setLocation(575, 350);
		payB.setSize(35, 20);
		payB.addActionListener(new PayBHandler());
		myCP.add(payB);

		cancelB = new JButton ("CANCEL");
		cancelB.setLocation(615, 350);
		cancelB.setSize(70, 20);
		cancelB.addActionListener(new CancelBHandler());
		myCP.add(cancelB);



		setVisible(true);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}// windowClosing
		});//end of definition of WindowAdapter
	}//constructor

	public class RowColumnBHandler implements ActionListener{
		public RowColumnBHandler(int i) {

		}
		public void actionPerformed(ActionEvent e) {

		}
	}
	public class numberPadBHandler implements ActionListener{
		public numberPadBHandler(int i) {

		}
		public void actionPerformed(ActionEvent e) {

		}
	}
	public class NewItemBHandler implements ActionListener{
		public void actionPerformed (ActionEvent e) {

		}
	}

	public class PayBHandler implements ActionListener{
		public void actionPerformed (ActionEvent e) {

		}
	}

	public class CancelBHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {

		}
	}

	public static void main(String args[]) {
		VendingMachine myAppf = new VendingMachine();
	}

}