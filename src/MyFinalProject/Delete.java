package MyFinalProject;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextPane;
import java.awt.Label;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class Delete extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextPane textPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Delete frame = new Delete();
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
	public Delete() {
		DataFileWriter dfw = new DataFileWriter();
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 388, 192);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(new Color(3, 1, 80));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 374, 31);
		panel.setBackground(new Color(128, 128, 64));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblDeleteTicket = new JLabel("DELETE TICKET");
		lblDeleteTicket.setBounds(102, 0, 200, 31);
		panel.add(lblDeleteTicket);
		lblDeleteTicket.setForeground(Color.LIGHT_GRAY);
		lblDeleteTicket.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 30));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 32, 374, 61);
		panel_1.setBackground(new Color(192, 192, 192));
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name:");
		lblNewLabel.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		lblNewLabel.setBounds(30, 10, 53, 17);
		panel_1.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(70, 10, 88, 19);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Delete");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String namettodelete = textField.getText();
				
			
					
					if(namettodelete.equals("")) {
						textPane.setText(" = = = Input name to delete! = = = ");
						textField.setText("");
					}else {
						namettodelete = DataFileWriter.searchByName(namettodelete);
					if(namettodelete.isEmpty()) {
						textPane.setText("= = = Name not found. = = =");
						textField.setText("");
					
					}else {
						String name = textField.getText();
						String status = dfw.GetStatus();
						if(status.equals("PAID")) {
							textPane.setText(" = = = This Name are already been Paid! = = = " + status);
						}
						
						dfw.clearDataForName(name);
					
					textPane.setText(" = = = Data Succsesfully Deleted! = = = ");
					}
					}
				}
			      
		});
		btnNewButton.setBounds(30, 37, 85, 21);
		panel_1.add(btnNewButton);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dfw.clearFile();
				textPane.setText("\n= = = All the Data has been Deleted = = =");
				
				
			}
		});
		btnDelete.setBounds(279, 9, 85, 21);
		panel_1.add(btnDelete);
		
		JLabel lblDeleteAll = new JLabel("Delete all: ");
		lblDeleteAll.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		lblDeleteAll.setBounds(207, 10, 73, 17);
		panel_1.add(lblDeleteAll);
		
		JButton btnNewButton_1 = new JButton("Exit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  dispose();
			}
		});
		btnNewButton_1.setBounds(279, 37, 85, 21);
		panel_1.add(btnNewButton_1);
		
		textPane = new JTextPane();
		textPane.setEditable(false);
		textPane.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 16));
		StyledDocument doc = textPane.getStyledDocument();
	    SimpleAttributeSet center = new SimpleAttributeSet();
	    StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
	    doc.setParagraphAttributes(0, doc.getLength(), center, false);
		textPane.setBounds(10, 102, 354, 43);
		contentPane.add(textPane);
		
		JLabel label = new JLabel("New label");
		label.setBounds(95, 116, 45, 13);
		contentPane.add(label);
	}
}