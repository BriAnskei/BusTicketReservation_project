package MyFinalProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import java.awt.Component;

import javax.swing.border.MatteBorder;
import javax.swing.text.DefaultCaret;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;

public class Transaction extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	JButton btnSearch_2_1, btnSearch_1,  btnSearch_2;
	String nameS; 

	/**
	 * Launch the application.ta
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Transaction frame = new Transaction();
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
	public Transaction() {
		DataFileWriter dfw = new DataFileWriter();
		
		setBounds(100, 100, 472, 368);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(3, 1, 80));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(192, 192, 192));
		panel.setBounds(0, 51, 482, 229);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(0, 1, 0, 0, (Color) new Color(0, 0, 0)));
		panel_1.setBackground(new Color(192, 192, 192));
		panel_1.setBounds(228, 29, 280, 200);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 18));
		textArea.setEditable(false);
		textArea.setBounds(21, 10, 191, 181);
		panel_1.add(textArea);
		
		
		JLabel lblNewLabel = new JLabel("Name:");
		lblNewLabel.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		lblNewLabel.setBounds(55, 55, 45, 17);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(110, 55, 99, 19);
		panel.add(textField);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		panel_2.setBackground(new Color(128, 128, 64));
		panel_2.setBounds(0, 0, 482, 29);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblTransaction = new JLabel("TRANSACTION");
		lblTransaction.setForeground(Color.LIGHT_GRAY);
		lblTransaction.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 20));
		lblTransaction.setBounds(189, 0, 123, 31);
		panel_2.add(lblTransaction);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 nameS = textField.getText();
				 
				if(nameS.matches("[a-zA-Z]+")) {// will only accepts words
				    String nameSearch = textField.getText();
				    
				    nameSearch = DataFileWriter.searchByName(nameSearch);
				    if(nameSearch.isEmpty()) {// Name is not found in the file data
				        textArea.setText("Name not found.");
				        textField.setText("");
				        btnSearch.setEnabled(true); // set enabled to true when name is not found
				        
				    } else {
				    	String status = dfw.GetStatus();
				    	textField.setHorizontalAlignment(SwingConstants.CENTER);
				    	textField.setEditable(false);
				        System.out.println(nameSearch);
				        textArea.setText(nameSearch);
				        btnSearch_2_1.setEnabled(true);
				        btnSearch.setEnabled(false); // set enabled to false when name is found
				        textField_2.setEditable(true);
				        if(status.equals("PAID")) {
				        	textField_2.setEditable(false);
				        	btnSearch_1.setEnabled(false);
					        btnSearch_2.setEnabled(false);
					        btnSearch_2_1.setEnabled(false);
				        	JOptionPane.showMessageDialog(null, "Paid acounts cannot be edited/deleted");
				        }else {
				        	
				        	btnSearch_1.setEnabled(true);
				        	btnSearch_2.setEnabled(true);
				      
				        	
				        }
				        
				        
				    } 
				} else if(nameS.equals("")) {
			    	  textField.setText("");
					    textArea.setText("Please input your name");
				
				}else {
				    textField.setText("");
				    textArea.setText("Invalid Input");
				}
			}
		});
		btnSearch.setFont(new Font("Tw Cen MT", Font.PLAIN, 12));
		btnSearch.setBounds(118, 96, 85, 21);
		panel.add(btnSearch);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new MatteBorder(1, 0, 1, 0, (Color) new Color(0, 0, 0)));
		panel_3.setBackground(new Color(192, 192, 192));
		panel_3.setBounds(0, 127, 230, 75);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblAmount = new JLabel("Enter Amount:");
		lblAmount.setBounds(10, 10, 85, 17);
		panel_3.add(lblAmount);
		lblAmount.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setBounds(108, 10, 99, 19);
		panel_3.add(textField_2);
		textField_2.setColumns(10);
		
		btnSearch_2_1 = new JButton("PAY");
		btnSearch_2_1.setEnabled(false);
		btnSearch_2_1.setBounds(118, 39, 85, 21);
		panel_3.add(btnSearch_2_1);
		btnSearch_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = textField_2.getText();
				if(text.matches("^[0-9]+$")) {// Only Accepts numbers
					double valueofPayment = Double.parseDouble(textField_2.getText());
					double totalfee = dfw.gettotal();
					if(valueofPayment >= totalfee) {
						JOptionPane.showMessageDialog(null, "Payment Succesfull!");
						double change = valueofPayment - totalfee;
						String Schange = Double.toString(change);
						textField_3.setText(Schange);
						textField_2.setHorizontalAlignment(SwingConstants.CENTER);
						textField_2.setEditable(false);
						btnSearch_2_1.setEnabled(false);
						btnSearch_1.setEnabled(false);
						btnSearch_2.setEnabled(false);
						dfw.updateStatus(nameS);
						textArea.setText("Paid acounts cannot be edited/deleted");
						
					}else {
						JOptionPane.showMessageDialog(null, "Error, Insuficent payment!");
					}
					
					
				}else {
					textArea.setText("Invalid Input!");
				}
				
				
			}
		});
		btnSearch_2_1.setFont(new Font("Tw Cen MT", Font.PLAIN, 12));
		
		JLabel lblChange = new JLabel("Change:");
		lblChange.setBounds(42, 200, 58, 29);
		panel.add(lblChange);
		lblChange.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		
		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setEditable(false);
		textField_3.setBounds(104, 204, 99, 24);
		textField_3.setBorder(null);
		panel.add(textField_3);
		textField_3.setBackground(new Color(192, 192, 192));
		textField_3.setColumns(10);
		
		JLabel lblHappyride = new JLabel("HappyRide Bus");
		lblHappyride.setForeground(Color.LIGHT_GRAY);
		lblHappyride.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 30));
		lblHappyride.setBounds(149, 10, 200, 31);
		contentPane.add(lblHappyride);
		
		btnSearch_2 = new JButton("DELETE");
		btnSearch_2.setEnabled(false);
		btnSearch_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Delete del = new Delete();
				del.addWindowListener(new WindowAdapter() {
		            @Override
		            public void windowClosed(WindowEvent e) {
		            	btnSearch_1.setEnabled(true);
		            }
		        });
				del.setVisible(true);
				btnSearch_1.setEnabled(false);
			
				
			}
				
			
		});
		btnSearch_2.setBounds(186, 295, 85, 21);
		contentPane.add(btnSearch_2);
		btnSearch_2.setFont(new Font("Tw Cen MT", Font.PLAIN, 12));
		
		btnSearch_1 = new JButton("EDIT");
		btnSearch_1.addActionListener(new ActionListener() {
			
				public void actionPerformed(ActionEvent e) {
					EditTicket editT = new EditTicket();
					editT.addWindowListener(new WindowAdapter() {
			            @Override
			            public void windowClosed(WindowEvent e) {
			            	btnSearch_1.setEnabled(true);
			            	textArea.setText("");
			            	btnSearch.setEnabled(true);
			            	textField.setText("");
			            	textField.setEditable(true);
			            	textField_2.setEditable(false);
							btnSearch_2_1.setEnabled(false);
			            }
			        });
					editT.setVisible(true);
					btnSearch_1.setEnabled(false);
				
					
				}
			
		});
		btnSearch_1.setEnabled(false);
		btnSearch_1.setBounds(38, 295, 85, 21);
		contentPane.add(btnSearch_1);
		btnSearch_1.setFont(new Font("Tw Cen MT", Font.PLAIN, 12));
		
		JButton btnSearch_3 = new JButton("EXIT");
		btnSearch_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  dispose();
			}
		});
		btnSearch_3.setBounds(333, 295, 85, 21);
		contentPane.add(btnSearch_3);
		btnSearch_3.setFont(new Font("Tw Cen MT", Font.PLAIN, 12));
	}
}
