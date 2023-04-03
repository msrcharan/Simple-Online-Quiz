import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JCheckBox;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class easyques extends JFrame {

	private JPanel contentPane;
	int flag,ca,logo;
	public static int dl;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public easyques(int dx) {
		this.dl=dx;
		System.out.println("next"+dl);
	}
	
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					easyques frame = new easyques();
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
	public easyques() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 640, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Select Category");
		lblNewLabel.setFont(new Font("Lao MN", Font.PLAIN, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(222, 23, 163, 28);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("<--");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SECOND se = new SECOND();
				se.setVisible(true);
				dispose();
				
				
			}
		});
		btnNewButton.setBounds(36, 22, 117, 29);
		contentPane.add(btnNewButton);
		
		
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Logo Identification");
		rdbtnNewRadioButton.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(rdbtnNewRadioButton.isSelected()==true) {
					logo =1;
				}
			}
		});
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(36, 97, 195, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Aptitiude Questions");
		rdbtnNewRadioButton_1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(rdbtnNewRadioButton_1.isSelected()==true) {
					flag =1;
				}
			}
		});
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(36, 151, 163, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Current Affairs");
		rdbtnNewRadioButton_2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(rdbtnNewRadioButton_2.isSelected()==true) {
					ca =1;
				}
			}
		});
		buttonGroup.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.setBounds(36, 206, 141, 23);
		contentPane.add(rdbtnNewRadioButton_2);
		JButton btnNewButton_1 = new JButton("NEXT");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ca==1 && dl ==1) {
				easystart s1 = new easystart();
				s1.setVisible(true);
				dispose();
				}
				else if(ca==1 && dl==2) {
					medium_CA s2 = new medium_CA();
					s2.setVisible(true);
					dispose();
					
				}
				else if(ca==1 && dl==3) {
					difficult_CA s3 = new difficult_CA();
					s3.setVisible(true);
					dispose();
				}
				else if(flag==1 && dl==1) {
					easy_AP ec = new easy_AP();
					ec.setVisible(true);
					dispose();
					
				}
				else if(flag==1 && dl==2) {
					medium_AP ec = new medium_AP();
					ec.setVisible(true);
					dispose();
					
				}
				else if(flag==1 && dl==3) {
					difficult_AP ec = new difficult_AP();
					ec.setVisible(true);
					dispose();
					
				}
				else if(logo ==1 && dl==1) {
					logo_1 el = new logo_1();
					el.setVisible(true);
					dispose();
				}
				
				else if(logo ==1 && dl==2) {
					Medium_logo el = new Medium_logo();
					el.setVisible(true);
					dispose();
				}
					
				else if(logo ==1 && dl==3) {
					
					difficult_logo el = new difficult_logo();
					el.setVisible(true);
					dispose();
					
				}
				else {
					JOptionPane.showMessageDialog(null,"Select an option","Okay",
							JOptionPane.INFORMATION_MESSAGE);
					
				}
			}
		});
		btnNewButton_1.setBounds(475, 382, 117, 29);
		contentPane.add(btnNewButton_1);
		
	}
}
