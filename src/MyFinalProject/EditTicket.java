package MyFinalProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;

import MyFinalProject.AvailableSeats.CalculateTotalFee;
import MyFinalProject.AvailableSeats.Destination;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class EditTicket extends JFrame {

	private JPanel contentPane;
	private JButton btnSave;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField txtBnmbn;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextPane textPane;
	public double fee = 0;
	String name, Distination, totalfare,  totalofP, totalpwd;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EditTicket frame = new EditTicket();
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
	public EditTicket() {
		
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

		
		 //setUndecorated(true);
	    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 327);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(new Color(3, 1, 80));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(217, 10, 1, 1);
		panel_4.setLayout(null);
		panel_4.setBorder(new MatteBorder(1, 0, 1, 0, (Color) new Color(0, 0, 0)));
		panel_4.setBackground(Color.LIGHT_GRAY);
		contentPane.add(panel_4);
		
		JLabel lblDistinationNumber = new JLabel("Distination Number:");
		lblDistinationNumber.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		lblDistinationNumber.setBounds(33, 26, 124, 17);
		panel_4.add(lblDistinationNumber);
		
		JLabel lblEditTicket = new JLabel("EDIT TICKET");
		lblEditTicket.setForeground(Color.BLACK);
		lblEditTicket.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 20));
		lblEditTicket.setBounds(190, 0, 92, 31);
		panel_4.add(lblEditTicket);
		
		JLabel lblDistinationNumber_1 = new JLabel("Total Passengers:");
		lblDistinationNumber_1.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		lblDistinationNumber_1.setBounds(232, 26, 107, 17);
		panel_4.add(lblDistinationNumber_1);
		
		
		JLabel lblDistinationNumber_1_1 = new JLabel("Total Pasengers with Discounts:");
		lblDistinationNumber_1_1.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		lblDistinationNumber_1_1.setBounds(232, 50, 187, 17);
		panel_4.add(lblDistinationNumber_1_1);
	
		
		JLabel lblAvailableSeats = new JLabel("Available Seats:");
		lblAvailableSeats.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		lblAvailableSeats.setBounds(33, 52, 99, 17);
		panel_4.add(lblAvailableSeats);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(156, 50, 22, 19);
		panel_4.add(textField_2);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new MatteBorder(0, 1, 0, 0, (Color) new Color(0, 0, 0)));
		panel_5.setBackground(Color.LIGHT_GRAY);
		panel_5.setBounds(301, 91, 157, 54);
		panel_4.add(panel_5);
		
		JPanel panel_5_1 = new JPanel();
		panel_5_1.setBorder(new MatteBorder(0, 0, 0, 1, (Color) new Color(0, 0, 0)));
		panel_5_1.setBackground(Color.LIGHT_GRAY);
		panel_5_1.setBounds(0, 91, 149, 54);
		panel_4.add(panel_5_1);
		
		JPanel panel_6 = new JPanel();
		panel_6.setLayout(null);
		panel_6.setBorder(new MatteBorder(1, 0, 1, 0, (Color) new Color(0, 0, 0)));
		panel_6.setBackground(Color.LIGHT_GRAY);
		panel_6.setBounds(0, 70, 458, 21);
		panel_4.add(panel_6);
		
		JLabel lblSelectedDistination = new JLabel("Selected Distination");
		lblSelectedDistination.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		lblSelectedDistination.setBounds(10, 0, 124, 17);
		panel_6.add(lblSelectedDistination);
		
		JLabel lblFare = new JLabel("Fare");
		lblFare.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		lblFare.setBounds(205, 0, 41, 17);
		panel_6.add(lblFare);
		
		JLabel lblTotalFare = new JLabel("Total Fare");
		lblTotalFare.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		lblTotalFare.setBounds(350, 0, 69, 17);
		panel_6.add(lblTotalFare);
		
		
		JPanel panel_4_1 = new JPanel();
		panel_4_1.setLayout(null);
		panel_4_1.setBorder(new MatteBorder(1, 0, 0, 0, (Color) new Color(0, 0, 0)));
		panel_4_1.setBackground(Color.LIGHT_GRAY);
		panel_4_1.setBounds(0, 47, 458, 70);
		contentPane.add(panel_4_1);
		
		JPanel panel_6_1 = new JPanel();
		panel_6_1.setLayout(null);
		panel_6_1.setBorder(new MatteBorder(1, 0, 1, 0, (Color) new Color(0, 0, 0)));
		panel_6_1.setBackground(new Color(128, 128, 64));
		panel_6_1.setBounds(0, 0, 458, 21);
		panel_4_1.add(panel_6_1);
		
		JLabel lblSelectedDistination_1 = new JLabel("Selected Distination");
		lblSelectedDistination_1.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		lblSelectedDistination_1.setBounds(10, 0, 124, 17);
		panel_6_1.add(lblSelectedDistination_1);
		
		JLabel lblFare_1 = new JLabel("Fare");
		lblFare_1.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		lblFare_1.setBounds(194, 0, 41, 17);
		panel_6_1.add(lblFare_1);
		
		JLabel lblTotalFare_1 = new JLabel("Total Fare");
		lblTotalFare_1.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		lblTotalFare_1.setBounds(327, 0, 69, 17);
		panel_6_1.add(lblTotalFare_1);
		
		JPanel panel_5_2 = new JPanel();
		panel_5_2.setBounds(283, 17, 150, 54);
		panel_4_1.add(panel_5_2);
		panel_5_2.setBorder(new MatteBorder(0, 1, 0, 0, (Color) new Color(0, 0, 0)));
		panel_5_2.setBackground(Color.LIGHT_GRAY);
		panel_5_2.setLayout(null);
		
		textField_7 = new JTextField();
		textField_7.setHorizontalAlignment(SwingConstants.CENTER);
		textField_7.setFont(new Font("Tw Cen MT", Font.BOLD | Font.ITALIC, 14));
		textField_7.setEditable(false);
		textField_7.setColumns(10);
		textField_7.setBorder(null);
		textField_7.setBackground(Color.LIGHT_GRAY);
		textField_7.setBounds(35, 10, 74, 34);
		panel_5_2.add(textField_7);
		
		JPanel panel_5_1_1 = new JPanel();
		panel_5_1_1.setBounds(10, 17, 130, 54);
		panel_4_1.add(panel_5_1_1);
		panel_5_1_1.setBorder(new MatteBorder(0, 0, 0, 1, (Color) new Color(0, 0, 0)));
		panel_5_1_1.setBackground(Color.LIGHT_GRAY);
		panel_5_1_1.setLayout(null);
		
		txtBnmbn = new JTextField();
		txtBnmbn.setBounds(10, 10, 85, 34);
		panel_5_1_1.add(txtBnmbn);
		txtBnmbn.setHorizontalAlignment(SwingConstants.CENTER);
		txtBnmbn.setFont(new Font("Tw Cen MT", Font.BOLD | Font.ITALIC, 14));
		txtBnmbn.setEditable(false);
		txtBnmbn.setColumns(10);
		txtBnmbn.setBorder(null);
		txtBnmbn.setBackground(Color.LIGHT_GRAY);
		
		textField_6 = new JTextField();
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		textField_6.setFont(new Font("Tw Cen MT", Font.BOLD | Font.ITALIC, 14));
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		textField_6.setBorder(null);
		textField_6.setBackground(Color.LIGHT_GRAY);
		textField_6.setBounds(177, 26, 74, 34);
		panel_4_1.add(textField_6);
		
		JLabel lblEditTicket_1 = new JLabel("EDIT TRANSACTION");
		lblEditTicket_1.setBounds(141, 10, 159, 31);
		contentPane.add(lblEditTicket_1);
		lblEditTicket_1.setForeground(Color.LIGHT_GRAY);
		lblEditTicket_1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 20));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBorder(new MatteBorder(1, 0, 1, 0, (Color) new Color(0, 0, 0)));
		panel.setBounds(0, 117, 450, 109);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblDistinationNumber_2 = new JLabel("Distination Number:");
		lblDistinationNumber_2.setBounds(10, 46, 124, 17);
		panel.add(lblDistinationNumber_2);
		lblDistinationNumber_2.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		
		
		String DistinationsN[] = {"", "1", "2", "3", "4", "5", "6"};		
		JComboBox<Object> comboBox_1 = new JComboBox<Object>(DistinationsN);
		comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String SelectedDistination = (String) comboBox_1.getSelectedItem();
		    	if(SelectedDistination.equals("")) {
		    		txtBnmbn.setText("");
		    		
		    	}else {
		    	if(SelectedDistination.equals("1")) {
		    		txtBnmbn.setText(destinations[1].getName());
		    		
		    		fee = destinations[1].getFee();
		    	}
		    	if(SelectedDistination.equals("2")) {
		    		txtBnmbn.setText(destinations[2].getName());
		    		
		    		fee = destinations[2].getFee();
		    	}
		    	if(SelectedDistination.equals("3")) {
		    		txtBnmbn.setText(destinations[3].getName());
		    		
		    		fee = destinations[3].getFee();
		    	}
		    	if(SelectedDistination.equals("4")) {
		    		txtBnmbn.setText(destinations[4].getName());
		    	
		    		fee = destinations[4].getFee();
		    	}
		    	if(SelectedDistination.equals("5")) {
		    		txtBnmbn.setText(destinations[5].getName());
		    		
		    		fee = destinations[5].getFee();
		    	}
		    	if(SelectedDistination.equals("6")) {
		    		txtBnmbn.setText(destinations[6].getName());
		    		
		    		fee = destinations[6].getFee();
		    	}
		    	textField_6.setText(df.format(fee));
		    	
		    	
		    	}    		
				
			}
		});
		comboBox_1.setBounds(131, 43, 38, 21);
		panel.add(comboBox_1);
		comboBox_1.setFont(new Font("Tw Cen MT", Font.BOLD | Font.ITALIC, 17));
		
		JLabel lblDistinationNumber_1_1_1 = new JLabel("Total Pasengers with Discounts:");
		lblDistinationNumber_1_1_1.setBounds(176, 46, 187, 17);
		panel.add(lblDistinationNumber_1_1_1);
		lblDistinationNumber_1_1_1.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		
		JLabel lblDistinationNumber_1_2 = new JLabel("Total Passengers:");
		lblDistinationNumber_1_2.setBounds(256, 22, 107, 17);
		panel.add(lblDistinationNumber_1_2);
		lblDistinationNumber_1_2.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		
		textField_4 = new JTextField();
		textField_4.setBounds(373, 22, 22, 19);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(373, 46, 22, 19);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnGenerateTotal = new JButton("Edit");
		btnGenerateTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String nameS = textField.getText();

				int value1, value2;
				String text1 = textField_4.getText();
				String text2 = textField_3.getText();
				if(nameS.matches("[a-zA-Z]+")) {
				    String nameSearch = textField.getText();
				    
				    nameSearch = DataFileWriter.searchByName(nameSearch);
				    if(nameSearch.isEmpty()) {
				       textPane.setText("Name not found.");
				        textField.setText("");
				      //  btnSearch.setEnabled(true); // set enabled to true when name is not found
				        
				    }else {
				    	if(text1.matches("^[0-9]+$") && text2.matches("^[0-9]+$")) {
							 String selecteditem = comboBox_1.getSelectedItem().toString();
								text1.trim();
								text2.trim();
								value1 = Integer.parseInt(text1);
									value2 = Integer.parseInt(text2);
								boolean availableseat = false;
								
								if(selecteditem.equals("1") && value1 > 20) 
									availableseat = true;
								if(selecteditem.equals("2") && value1 > 20) 
									availableseat = true;
								if(selecteditem.equals("3") && value1 > 20) 
									availableseat = true;
								if(selecteditem.equals("4") && value1 > 20) 
									availableseat = true;
								if(selecteditem.equals("5") && value1 > 20) 
									availableseat = true;
								if(selecteditem.equals("6") && value1 > 20) 
									availableseat = true;
								
								if(availableseat) {
									textPane.setText("Sorry, We only have 20 passenger Lemit forr each reservation");
									textField_3.setText("");
							    	 textField_4.setText("");
								}else {	
								if(value2 > value1) {
									textPane.setText("Invalid Input.Please input the number of Total passenger and Total passenger that have discount!");
									textField_3.setText("");
									textField_4.setText("");
									 textField_7.setText("");
								}else {
									ctf.settotalP(value1);
									ctf.settotalPwithDiscount(value2);
									ctf.setdistinationFee(fee);	
									textField_7.setText(df.format(ctf.gettotalFee()));
									textField_3.setEditable(false);
									textField_4.setEditable(false);
									btnGenerateTotal.setEnabled(false);
									btnSave.setEnabled(true);
									
									
									
									
									
									name = textField.getText();
									Distination = txtBnmbn.getText();
									totalfare = textField_7.getText();
									totalofP = Integer.toString(value1);
									totalpwd = Integer.toString(value2);
									textPane.setText("Your Edit transaction is almost done, please press save to complete!");
									System.out.println(name + " " +  Distination + " " +totalfare +" " + totalofP + " " +totalpwd);
									
									
									
									
							
								}
				    	
				    }
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
		btnGenerateTotal.setEnabled(true);
		btnGenerateTotal.setBounds(176, 73, 85, 21);
		panel.add(btnGenerateTotal);
		
		JButton btnGenerateTotal_1 = new JButton("Cancel");
		btnGenerateTotal_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnGenerateTotal_1.setFont(new Font("Tw Cen MT", Font.PLAIN, 12));
		btnGenerateTotal_1.setEnabled(true);
		btnGenerateTotal_1.setBounds(300, 73, 85, 21);
		panel.add(btnGenerateTotal_1);
		
		btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dfw.editTransaction(name, Distination, totalofP, totalpwd, totalfare);
				textPane.setText("Ticket Successfully edited!");
				btnSave.setEnabled(false);
			}
		});
		btnSave.setFont(new Font("Tw Cen MT", Font.PLAIN, 12));
		btnSave.setEnabled(false);
		btnSave.setBounds(49, 73, 85, 21);
		panel.add(btnSave);
		
		JLabel lblDistinationNumber_2_1 = new JLabel("Name:");
		lblDistinationNumber_2_1.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		lblDistinationNumber_2_1.setBounds(85, 22, 49, 17);
		panel.add(lblDistinationNumber_2_1);
		
		textField = new JTextField();
		textField.setBounds(131, 22, 90, 19);
		panel.add(textField);
		textField.setColumns(10);
		
		textPane = new JTextPane();
		textPane.setEditable(false);
		textPane.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 16));
		textPane.setBounds(31, 236, 374, 43);
		contentPane.add(textPane);
	}
}
