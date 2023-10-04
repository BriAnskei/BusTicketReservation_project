package MyFinalProject;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import MyFinalProject.AvailableSeats;
import MyFinalProject.BuyTicket;
import MyFinalProject.Transaction;
import MyFinalProject.AvailableSeats.Destination;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import javax.swing.border.MatteBorder;

public class MyFinall extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	 
	
	
	 
	public static void main(String[] args) {
		
		
		EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				try {
					MyFinall frame = new MyFinall();
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
	public MyFinall() {
		AvailableSeats seat = new AvailableSeats();
		AvailableSeats.Destination[] destinations = new AvailableSeats.Destination[7];
		
		
		destinations[0] = seat.new Destination("", 0);
		destinations[1] = seat.new Destination("GENSAN", 400);
		destinations[2] = seat.new Destination("MATALAM", 300);
		destinations[3] = seat.new Destination("COTABATO", 350);
		destinations[4] = seat.new Destination("SURIGAO", 450);
		destinations[5] = seat.new Destination("MANGAGOY", 500);
		destinations[6] = seat.new Destination("TANDAG", 250);
		
		int distinationseat[] = new int[7];
    	String[] toStringSeat = new String[7];
    	for(int i = 0; i < distinationseat.length;++i) {
    		distinationseat[i] = destinations[i].getAvailable(i);
    		toStringSeat[i] = Integer.toString(distinationseat[i]);
    	}
    	
		
		
		setBackground(new Color(128, 128, 128));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 465, 407);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(3, 1, 80));
		contentPane.setForeground(new Color(128, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(192, 192, 192));
		panel.setBorder(new MatteBorder(0, 0, 0, 0, (Color) new Color(0, 0, 0)));
		panel.setBounds(0, 51, 456, 274);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(192, 192, 192));
		panel_1.setBorder(new MatteBorder(0, 0, 0, 1, (Color) new Color(0, 0, 0)));
		panel_1.setBounds(0, 0, 208, 278);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(128, 128, 64));
		panel_3.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		panel_3.setBounds(0, 0, 300, 37);
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("DESTINATION");
		lblNewLabel_2.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_2.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 18));
		lblNewLabel_2.setBounds(57, 11, 94, 17);
		panel_3.add(lblNewLabel_2);
		
		textField_12 = new JTextField();
		textField_12.setText((String) null);
		textField_12.setHorizontalAlignment(SwingConstants.CENTER);
		textField_12.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_12.setEditable(false);
		textField_12.setColumns(10);
		textField_12.setBackground(Color.LIGHT_GRAY);
		textField_12.setBounds(59, 58, 88, 25);
		panel_1.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setText((String) null);
		textField_13.setHorizontalAlignment(SwingConstants.CENTER);
		textField_13.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_13.setEditable(false);
		textField_13.setColumns(10);
		textField_13.setBackground(Color.LIGHT_GRAY);
		textField_13.setBounds(59, 94, 88, 25);
		panel_1.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setText((String) null);
		textField_14.setHorizontalAlignment(SwingConstants.CENTER);
		textField_14.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_14.setEditable(false);
		textField_14.setColumns(10);
		textField_14.setBackground(Color.LIGHT_GRAY);
		textField_14.setBounds(59, 130, 88, 25);
		panel_1.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setText((String) null);
		textField_15.setHorizontalAlignment(SwingConstants.CENTER);
		textField_15.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_15.setEditable(false);
		textField_15.setColumns(10);
		textField_15.setBackground(Color.LIGHT_GRAY);
		textField_15.setBounds(59, 161, 88, 25);
		panel_1.add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setText((String) null);
		textField_16.setHorizontalAlignment(SwingConstants.CENTER);
		textField_16.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_16.setEditable(false);
		textField_16.setColumns(10);
		textField_16.setBackground(Color.LIGHT_GRAY);
		textField_16.setBounds(59, 197, 88, 25);
		panel_1.add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setBounds(59, 233, 88, 25);
		panel_1.add(textField_17);
		textField_17.setText((String) null);
		textField_17.setHorizontalAlignment(SwingConstants.CENTER);
		textField_17.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_17.setEditable(false);
		textField_17.setColumns(10);
		textField_17.setBackground(Color.LIGHT_GRAY);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		
		panel_4.setBackground(new Color(128, 128, 0));
		panel_4.setBackground(new Color(128, 128, 64));
		panel_4.setBounds(206, 0, 260, 37);
		panel.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("FARE");
		lblNewLabel_3.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_3.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 18));
		lblNewLabel_3.setBounds(50, 10, 42, 17);
		panel_4.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("SEAT");
		lblNewLabel_3_1.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_3_1.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 18));
		lblNewLabel_3_1.setBounds(180, 10, 42, 17);
		panel_4.add(lblNewLabel_3_1);
		
		textField = new JTextField();
		textField.setBackground(new Color(192, 192, 192));
		textField.setEditable(false);
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setText("₱400");
		textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField.setBounds(236, 57, 88, 25);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBackground(new Color(192, 192, 192));
		textField_1.setText("₱300");
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(236, 93, 88, 25);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setBackground(new Color(192, 192, 192));
		textField_2.setText("₱350");
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(236, 127, 88, 25);
		panel.add(textField_2);
		
		textField_5 = new JTextField();
		textField_5.setBackground(new Color(192, 192, 192));
		textField_5.setText("₱250");
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBounds(236, 233, 88, 25);
		panel.add(textField_5);
		
		textField_4 = new JTextField();
		textField_4.setBounds(236, 197, 88, 25);
		panel.add(textField_4);
		textField_4.setBackground(new Color(192, 192, 192));
		textField_4.setText("₱500");
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(236, 163, 88, 25);
		panel.add(textField_3);
		textField_3.setBackground(new Color(192, 192, 192));
		textField_3.setText("₱450");
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new MatteBorder(1, 1, 0, 1, (Color) new Color(0, 0, 0)));
		panel_2.setBackground(new Color(192, 192, 192));
		panel_2.setBounds(342, 0, 114, 278);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		textField_6 = new JTextField();
		textField_6.setText(toStringSeat[1]);
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		textField_6.setBackground(Color.LIGHT_GRAY);
		textField_6.setBounds(16, 59, 88, 25);
		panel_2.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setText(toStringSeat[2]);
		textField_7.setHorizontalAlignment(SwingConstants.CENTER);
		textField_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_7.setEditable(false);
		textField_7.setColumns(10);
		textField_7.setBackground(Color.LIGHT_GRAY);
		textField_7.setBounds(16, 95, 88, 25);
		panel_2.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setText(toStringSeat[3]);
		textField_8.setHorizontalAlignment(SwingConstants.CENTER);
		textField_8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_8.setEditable(false);
		textField_8.setColumns(10);
		textField_8.setBackground(Color.LIGHT_GRAY);
		textField_8.setBounds(16, 131, 88, 25);
		panel_2.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setText(toStringSeat[4]);
		textField_9.setHorizontalAlignment(SwingConstants.CENTER);
		textField_9.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_9.setEditable(false);
		textField_9.setColumns(10);
		textField_9.setBackground(Color.LIGHT_GRAY);
		textField_9.setBounds(16, 167, 88, 25);
		panel_2.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setText(toStringSeat[5]);
		textField_10.setHorizontalAlignment(SwingConstants.CENTER);
		textField_10.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_10.setEditable(false);
		textField_10.setColumns(10);
		textField_10.setBackground(Color.LIGHT_GRAY);
		textField_10.setBounds(16, 199, 88, 25);
		panel_2.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setText(toStringSeat[6]);
		textField_11.setHorizontalAlignment(SwingConstants.CENTER);
		textField_11.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_11.setEditable(false);
		textField_11.setColumns(10);
		textField_11.setBackground(Color.LIGHT_GRAY);
		textField_11.setBounds(16, 235, 88, 25);
		panel_2.add(textField_11);
		
		JLabel lblNewLabel = new JLabel("HappyRide Bus Ticketing System");
		lblNewLabel.setForeground(Color.LIGHT_GRAY);
		lblNewLabel.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 24));
		lblNewLabel.setBounds(79, 10, 328, 31);
		contentPane.add(lblNewLabel);
		
		JButton Exit = new JButton("EXIT");
		Exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		Exit.setFont(new Font("Tw Cen MT", Font.BOLD, 14));
		Exit.setBounds(314, 335, 125, 21);
		contentPane.add(Exit);
		
		JButton btnTransaction = new JButton("TRANSACTION");
		btnTransaction.setFont(new Font("Tw Cen MT", Font.BOLD, 12));
		btnTransaction.setBounds(171, 335, 119, 21);	
		contentPane.add(btnTransaction);
		btnTransaction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Transaction transac = new Transaction();
				transac.addWindowListener(new WindowAdapter() {
		            @Override
		            public void windowClosed(WindowEvent e) {
		            	btnTransaction.setEnabled(true);
		            }
		        });
				transac.setVisible(true);
				btnTransaction.setEnabled(false);
			
				
			}
		});
		
		JButton btnBuyTicket = new JButton("BUY TICKET");
		btnBuyTicket.setBounds(23, 335, 122, 21);
		contentPane.add(btnBuyTicket);
		btnBuyTicket.setFont(new Font("Tw Cen MT", Font.BOLD, 14));
		
		
		btnBuyTicket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 BuyTicket ticket = new BuyTicket();
				ticket.addWindowListener(new WindowAdapter() {
		            @Override
		            public void windowClosed(WindowEvent e) {
		                btnBuyTicket.setEnabled(true);
		            }
		        });
		        ticket.setVisible(true);
		        btnBuyTicket.setEnabled(false);
			}
		});
	}
}
