package MyFinalProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.text.DecimalFormat;


import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.border.MatteBorder;

public class BuyTicket extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField textField;
	private JLabel lblSelectedDistination;
	private JTextField textField_1;
	private JTextPane textPane;
	private JButton btnGenerateTotal;
	public double fee = 0;
	private JLabel lblSelectedDistination_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_6;
	private JTextField textField_5;
	int[] seatfrDistination = new int[7];
	String DistinationsN[] = {"", "1", "2", "3", "4", "5", "6"};		
	JComboBox<Object> comboBox = new JComboBox<Object>(DistinationsN);	
	int distinationseat[] = new int[7];
	String[] toStringSeat = new String[7];
	int d = 0, value1, value2;;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BuyTicket frame = new BuyTicket();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public BuyTicket() {
		DataFileWriter dfw = new DataFileWriter();
		DecimalFormat df = new DecimalFormat("#,###.00");
		AvailableSeats seat = new AvailableSeats();
		AvailableSeats.Destination[] destinations = new AvailableSeats.Destination[7];
		
		
		destinations[0] = seat.new Destination("", 0);
		destinations[1] = seat.new Destination("GENSAN", 400);
		destinations[2] = seat.new Destination("MATALAM", 300);
		destinations[3] = seat.new Destination("COTABATO", 350);
		destinations[4] = seat.new Destination("SURIGAO", 450);
		destinations[5] = seat.new Destination("MANGAGOY", 500);
		destinations[6] = seat.new Destination("TANDAG", 250);
		
		

		
	
		AvailableSeats.CalculateTotalFee ctf = seat.new CalculateTotalFee();

	
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 449, 316);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(3, 1, 80));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 128, 64));
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(-21, 42, 508, 63);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(192, 192, 192));
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(20, 20, 113, 43);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblHappyride = new JLabel("HappyRide Bus");
		lblHappyride.setForeground(Color.LIGHT_GRAY);
		lblHappyride.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 30));
		lblHappyride.setBounds(128, 1, 200, 31);
		contentPane.add(lblHappyride);
		
		
		textField_2 = new JTextField();
		textField_2.setBorder(null);
		textField_2.setBackground(new Color(192, 192, 192));
		textField_2.setBounds(10, 10, 85, 19);
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setFont(new Font("Tw Cen MT", Font.BOLD | Font.ITALIC, 14));
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		panel_1.add(textField_2);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(new Color(192, 192, 192));
		panel_1_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1_1.setBounds(125, 20, 113, 43);
		panel_1_1.setLayout(null);
		panel.add(panel_1_1);
		
		textField_1 = new JTextField();
		textField_1.setBackground(new Color(192, 192, 192));
		textField_1.setBounds(18, 11, 85, 19);
		textField_1.setBorder(null);
		textField_1.setFont(new Font("Tw Cen MT", Font.BOLD | Font.ITALIC, 14));
		textField_1.setEditable(false);
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setColumns(10);
		panel_1_1.add(textField_1);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setBackground(new Color(192, 192, 192));
		panel_1_2.setBorder(new MatteBorder(1, 0, 1, 0, (Color) new Color(0, 0, 0)));
		panel_1_2.setBounds(351, 20, 113, 43);
		panel.add(panel_1_2);
		panel_1_2.setLayout(null);
		
		textField_6 = new JTextField();
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		textField_6.setFont(new Font("Tw Cen MT", Font.BOLD | Font.ITALIC, 14));
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		textField_6.setBorder(null);
		textField_6.setBackground(Color.LIGHT_GRAY);
		textField_6.setBounds(10, 10, 85, 19);
		panel_1_2.add(textField_6);
		
		lblSelectedDistination_1 = new JLabel("Fare");
		lblSelectedDistination_1.setBackground(new Color(192, 192, 192));
		lblSelectedDistination_1.setBounds(30, 0, 33, 21);
		panel.add(lblSelectedDistination_1);
		lblSelectedDistination_1.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		
		lblSelectedDistination = new JLabel("Selected Distination");
		lblSelectedDistination.setBackground(new Color(192, 192, 192));
		lblSelectedDistination.setBounds(125, 0, 122, 21);
		panel.add(lblSelectedDistination);
		lblSelectedDistination.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		
		JLabel lblSelectedDistination_1_1 = new JLabel("Total fee");
		lblSelectedDistination_1_1.setBackground(new Color(192, 192, 192));
		lblSelectedDistination_1_1.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		lblSelectedDistination_1_1.setBounds(391, 0, 60, 21);
		panel.add(lblSelectedDistination_1_1);
		
		JPanel panel_1_2_1 = new JPanel();
		panel_1_2_1.setLayout(null);
		panel_1_2_1.setBorder(new MatteBorder(1, 0, 1, 1, (Color) new Color(0, 0, 0)));
		panel_1_2_1.setBackground(Color.LIGHT_GRAY);
		panel_1_2_1.setBounds(238, 20, 113, 43);
		panel.add(panel_1_2_1);
		
		textField_5 = new JTextField();
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setFont(new Font("Tw Cen MT", Font.BOLD | Font.ITALIC, 14));
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBorder(null);
		textField_5.setBackground(Color.LIGHT_GRAY);
		textField_5.setBounds(10, 11, 85, 19);
		panel_1_2_1.add(textField_5);
		
		JLabel lblAvailableseat = new JLabel("Availableseat");
		lblAvailableseat.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		lblAvailableseat.setBackground(Color.LIGHT_GRAY);
		lblAvailableseat.setBounds(258, 0, 93, 21);
		panel.add(lblAvailableseat);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(192, 192, 192));
		panel_2.setBounds(-11, 116, 462, 104);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		
		lblNewLabel = new JLabel("Name:");
		lblNewLabel.setBounds(26, 10, 53, 17);
		panel_2.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		
		textField = new JTextField();
		textField.setBounds(89, 10, 99, 19);
		panel_2.add(textField);
		textField.setColumns(10);
		
		JLabel lblDistinationNumber = new JLabel("Distination Number:");
		lblDistinationNumber.setBounds(26, 37, 122, 21);
		panel_2.add(lblDistinationNumber);
		lblDistinationNumber.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		
		
				comboBox.setBounds(150, 36, 38, 21);
		panel_2.add(comboBox);
		comboBox.setFont(new Font("Tw Cen MT", Font.BOLD | Font.ITALIC, 17));
		
		
		

		JButton btnNewButton = new JButton("Save");
		btnNewButton.setFont(new Font("Tw Cen MT", Font.PLAIN, 12));
		btnNewButton.setBounds(117, 73, 85, 21);
		btnNewButton.setEnabled(false);
		panel_2.add(btnNewButton);
		
		ActionListener listener = new  ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				boolean isTextFieldFilled = textField.getText().length() > 0;
				boolean isComboBoxFilled = comboBox.getSelectedIndex() > 0;
				
				
				if(isTextFieldFilled && isComboBoxFilled) {
					btnNewButton.setEnabled(true);
					
				}else {
					btnNewButton.setEnabled(false);
			
				}
				
			}
			
		};
		btnNewButton.addActionListener(new ActionListener() {;
		public void actionPerformed(ActionEvent e) {
			String name = textField.getText();
			name = DataFileWriter.searchByName(name);
			if(name.isEmpty()) {
				comboBox.setEditable(false);
				comboBox.setEnabled(false);
				textField.setEditable(false);
				textField.setHorizontalAlignment(SwingConstants.CENTER);
				textPane.setText("= = = PWD, STUDENT, & SENIOR CITIZEN with 20% DISCOUNT!!! = = =\nPlease Input the Total Passengers and Total passengers that have Discount!");
				btnNewButton.setEnabled(false);
				textField_3.setEditable(true);
				textField_4.setEditable(true);
				btnGenerateTotal.setEnabled(true);
			}else {
				comboBox.setSelectedItem("");
				textPane.setText(" = = = Name Already Exist = = = ");
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_5.setText("");
			}
			
				
				
			}
			});
		
		textField.addActionListener(listener);
		comboBox.addActionListener(listener);
		
		textPane = new JTextPane();
		textPane.setEditable(false);
		textPane.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 16));
		StyledDocument doc = textPane.getStyledDocument();
	    SimpleAttributeSet center = new SimpleAttributeSet();
	    StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
	    doc.setParagraphAttributes(0, doc.getLength(), center, false);
		textPane.setBounds(30, 225, 374, 43);
		contentPane.add(textPane);
	
		
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setBackground(new Color(192, 192, 192));
		panel_3.setBounds(226, 0, 226, 104);
		panel_2.add(panel_3);
		panel_3.setLayout(null);
		
		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setEditable(false);
		textField_3.setBounds(166, 15, 27, 19);
		panel_3.add(textField_3);
		textField_3.setColumns(10);
		
		
		JLabel lblTotalPassengers = new JLabel("Total Passengers:");
		lblTotalPassengers.setBounds(10, 13, 122, 21);
		panel_3.add(lblTotalPassengers);
		lblTotalPassengers.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		
		textField_4 = new JTextField();
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBounds(166, 44, 27, 19);
		panel_3.add(textField_4);
		
		btnGenerateTotal = new JButton("Reserve");
		btnGenerateTotal.setEnabled(false);
		btnGenerateTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String text1 = textField_3.getText();
				String text2 = textField_4.getText();
				
				if(text1.matches("^[0-9]+$") && text2.matches("^[0-9]+$")) {// Only accepts numbers
					for(int i = 0; i < distinationseat.length;++i) {
			    		distinationseat[i] = destinations[i].getAvailable(i);
			    		toStringSeat[i] = Integer.toString(distinationseat[i]);
			    		seatfrDistination[i] = distinationseat[i];
			    	}
			
			    	
					 String selecteditem = comboBox.getSelectedItem().toString();
						text1.trim();
						text2.trim();
						value1 = Integer.parseInt(text1);
						value2 = Integer.parseInt(text2);
						boolean availableseat = false;
						
						if(selecteditem.equals("1") && value1 > seatfrDistination[1])
							availableseat = true;
						if(selecteditem.equals("2") && value1 > seatfrDistination[2]) 
							availableseat = true;
						if(selecteditem.equals("3") && value1 > seatfrDistination[3]) 
							availableseat = true;
						if(selecteditem.equals("4") && value1 >  seatfrDistination[4]) 
							availableseat = true;
						if(selecteditem.equals("5") && value1 >  seatfrDistination[5]) 
							availableseat = true;
						if(selecteditem.equals("6") && value1 >  seatfrDistination[6]) 
							availableseat = true;
						
						if(availableseat) {							
							d = Integer.parseInt(selecteditem);
							textPane.setText("Sorry, We only have " + toStringSeat[d]  +" available seat to " + destinations[d].getName());
							textField_3.setText("");
					    	 textField_4.setText("");
						}else {	
						if(value2 > value1) {
							textPane.setText("Invalid Input.Please input the number of Total passenger and Total passenger that have discount!");
							textField_3.setText("");
							textField_4.setText("");
						}else {
							ctf.settotalP(value1);
							ctf.settotalPwithDiscount(value2);
							ctf.setdistinationFee(fee);	
							textField_6.setText(df.format(ctf.gettotalFee()));
							textField_3.setEditable(false);
							textField_4.setEditable(false);
							btnGenerateTotal.setEnabled(false);
							
							
							
							String name, Distination, totalfare,  totalofP = null, totalpwd, status = "NOT_PAID";
							
							
							name = textField.getText();
							Distination = textField_1.getText();
							totalfare = textField_6.getText();
							totalofP = Integer.toString(value1);
							totalpwd = Integer.toString(value2);
							
							
							
							try {
								destinations[d].rAvaibleSeat(d, value1);
								dfw.writemyFile(name, Distination, totalofP, totalpwd, status ,totalfare);
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();// Prints to standard error of the Program.
							}
							
							textPane.setText("= = = = Thank you! = = = =\nPlease procced to Transaction for the payment!");
						}
						}
				}else {
					textPane.setText("Please input  the number of Total passenger and Total passenger that have discount!");
			    	  textField_3.setText("");
			    	  textField_4.setText("");
				}
				
			}
		});
		btnGenerateTotal.setFont(new Font("Tw Cen MT", Font.PLAIN, 12));
		btnGenerateTotal.setBounds(10, 73, 85, 21);
		panel_3.add(btnGenerateTotal);
		
		JButton btnCancel = new JButton("Exit");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  dispose();
			}
		});
		btnCancel.setFont(new Font("Tw Cen MT", Font.PLAIN, 12));
		btnCancel.setBounds(105, 73, 85, 21);
		panel_3.add(btnCancel);
		
		JLabel lblDiscoutedPassengers = new JLabel("Discounted Passengers:");
		lblDiscoutedPassengers.setBounds(10, 37, 147, 30);
		panel_3.add(lblDiscoutedPassengers);
		lblDiscoutedPassengers.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
				
		
		
		comboBox.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    	String SelectedDistination = (String) comboBox.getSelectedItem();
		    	for(int i = 0; i < distinationseat.length;++i) {
		    		distinationseat[i] = destinations[i].getAvailable(i);
		    		toStringSeat[i] = Integer.toString(distinationseat[i]);
		    		seatfrDistination[i] = distinationseat[i];
		    	}
		    	
		    	
		    	
		    	if(SelectedDistination.equals("")) {
		    		textField_1.setText("");
		    		textField_2.setText("");
		    
		    	}else {
		    	if(SelectedDistination.equals("1")) {
		    		textField_1.setText(destinations[1].getName());
		    		textField_5.setText(toStringSeat[1]);
		    		fee = destinations[1].getFee();
		    	}
		    	if(SelectedDistination.equals("2")) {
		    		textField_1.setText(destinations[2].getName());
		    		textField_5.setText(toStringSeat[2]);
		    		fee = destinations[2].getFee();
		    	}
		    	if(SelectedDistination.equals("3")) {
		    		textField_1.setText(destinations[3].getName());
		    		textField_5.setText(toStringSeat[3]);
		    		fee = destinations[3].getFee();
		    	}
		    	if(SelectedDistination.equals("4")) {
		    		textField_1.setText(destinations[4].getName());
		    		textField_5.setText(toStringSeat[4]);
		    		fee = destinations[4].getFee();
		    	}
		    	if(SelectedDistination.equals("5")) {
		    		textField_1.setText(destinations[5].getName());
		    		textField_5.setText(toStringSeat[5]);
		    		fee = destinations[5].getFee();
		    	}
		    	if(SelectedDistination.equals("6")) {
		    		textField_5.setText(toStringSeat[6]);
		    		textField_1.setText(destinations[6].getName());
		    		fee = destinations[6].getFee();
		    	}
		    	textField_2.setText(df.format(fee));
		    	
		    	}    		
		    }

		});	
		
	}
}
