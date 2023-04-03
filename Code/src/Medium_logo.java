import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Medium_logo extends JFrame {

	private JPanel contentPane;
	int ts=0;
	String la="diff";
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();
	private final ButtonGroup buttonGroup_3 = new ButtonGroup();
	private final ButtonGroup buttonGroup_4 = new ButtonGroup();
	private final ButtonGroup buttonGroup_5 = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Medium_logo frame = new Medium_logo();
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
	public Medium_logo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 640, 640);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(6, 6, 175, 158);
		contentPane.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(this.getClass()
				.getResource("/benz.jpg")));
		
		JLabel label = new JLabel("New label");
		label.setBounds(232, 6, 175, 158);
		contentPane.add(label);
		label.setIcon(new ImageIcon(this.getClass()
				.getResource("/linux.jpg")));
		
		JLabel label_1 = new JLabel("New label");
		label_1.setBounds(459, 6, 175, 158);
		contentPane.add(label_1);
		label_1.setIcon(new ImageIcon(this.getClass()
				.getResource("/rolls royce.jpg")));
		
		JLabel label_2 = new JLabel("New label");
		label_2.setBounds(6, 272, 175, 158);
		contentPane.add(label_2);
		label_2.setIcon(new ImageIcon(this.getClass()
				.getResource("/starbucks-logo1.jpg")));
		
		JLabel label_3 = new JLabel("New label");
		label_3.setBounds(232, 272, 175, 158);
		contentPane.add(label_3);
		label_3.setIcon(new ImageIcon(this.getClass()
				.getResource("/pinterest.jpg")));
		
		JLabel label_4 = new JLabel("New label");
		label_4.setBounds(436, 272, 175, 158);
		contentPane.add(label_4);
		label_4.setIcon(new ImageIcon(this.getClass()
				.getResource("/insta.jpg")));
		
		JButton btnNewButton = new JButton("FINISH");
		
		btnNewButton.setBounds(508, 555, 126, 46);
		contentPane.add(btnNewButton);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Benz");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(6, 165, 141, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnAudi = new JRadioButton("Audi");
		buttonGroup.add(rdbtnAudi);
		rdbtnAudi.setBounds(6, 189, 141, 23);
		contentPane.add(rdbtnAudi);
		
		JRadioButton rdbtnBmw = new JRadioButton("BMW");
		buttonGroup.add(rdbtnBmw);
		rdbtnBmw.setBounds(6, 213, 141, 23);
		contentPane.add(rdbtnBmw);
		
		JRadioButton rdbtnJeep = new JRadioButton("Mahindra");
		buttonGroup.add(rdbtnJeep);
		rdbtnJeep.setBounds(6, 236, 141, 23);
		contentPane.add(rdbtnJeep);
		
		JRadioButton rdbtnWindows = new JRadioButton("Windows");
		buttonGroup_1.add(rdbtnWindows);
		rdbtnWindows.setBounds(232, 165, 141, 23);
		contentPane.add(rdbtnWindows);
		
		JRadioButton rdbtnApacheServer = new JRadioButton("Apache server");
		buttonGroup_1.add(rdbtnApacheServer);
		rdbtnApacheServer.setBounds(232, 189, 141, 23);
		contentPane.add(rdbtnApacheServer);
		
		JRadioButton rdbtnOracle = new JRadioButton("Oracle");
		buttonGroup_1.add(rdbtnOracle);
		rdbtnOracle.setBounds(232, 213, 141, 23);
		contentPane.add(rdbtnOracle);
		
		JRadioButton rdbtnLinux = new JRadioButton("Linux");
		buttonGroup_1.add(rdbtnLinux);
		rdbtnLinux.setBounds(232, 237, 141, 23);
		contentPane.add(rdbtnLinux);
		
		JRadioButton rdbtnMasceretti = new JRadioButton("Masareti");
		buttonGroup_2.add(rdbtnMasceretti);
		rdbtnMasceretti.setBounds(459, 165, 141, 23);
		contentPane.add(rdbtnMasceretti);
		
		JRadioButton rdbtnFerrari = new JRadioButton("Ferrari");
		buttonGroup_2.add(rdbtnFerrari);
		rdbtnFerrari.setBounds(459, 189, 141, 23);
		contentPane.add(rdbtnFerrari);
		
		JRadioButton rdbtnRollsRoyce = new JRadioButton("Rolls Royce");
		buttonGroup_2.add(rdbtnRollsRoyce);
		rdbtnRollsRoyce.setBounds(459, 213, 141, 23);
		contentPane.add(rdbtnRollsRoyce);
		
		JRadioButton rdbtnLamborgini = new JRadioButton("Lamborghini");
		buttonGroup_2.add(rdbtnLamborgini);
		rdbtnLamborgini.setBounds(459, 237, 141, 23);
		contentPane.add(rdbtnLamborgini);
		
		JRadioButton rdbtnTataCoffee = new JRadioButton("Tata Coffee");
		buttonGroup_3.add(rdbtnTataCoffee);
		rdbtnTataCoffee.setBounds(6, 442, 141, 23);
		contentPane.add(rdbtnTataCoffee);
		
		JRadioButton rdbtnStarbucks = new JRadioButton("Starbucks");
		buttonGroup_3.add(rdbtnStarbucks);
		rdbtnStarbucks.setBounds(6, 466, 141, 23);
		contentPane.add(rdbtnStarbucks);
		
		JRadioButton rdbtnCafeCoffeeDay = new JRadioButton("Cafe Coffee day");
		buttonGroup_3.add(rdbtnCafeCoffeeDay);
		rdbtnCafeCoffeeDay.setBounds(6, 491, 141, 23);
		contentPane.add(rdbtnCafeCoffeeDay);
		
		JRadioButton rdbtnCreamstone = new JRadioButton("Creamstone");
		buttonGroup_3.add(rdbtnCreamstone);
		rdbtnCreamstone.setBounds(6, 516, 141, 23);
		contentPane.add(rdbtnCreamstone);
		
		JRadioButton rdbtnAdobe = new JRadioButton("Adobe");
		buttonGroup_4.add(rdbtnAdobe);
		rdbtnAdobe.setBounds(232, 442, 141, 23);
		contentPane.add(rdbtnAdobe);
		
		JRadioButton rdbtnQuora = new JRadioButton("Quora");
		buttonGroup_4.add(rdbtnQuora);
		rdbtnQuora.setBounds(232, 466, 141, 23);
		contentPane.add(rdbtnQuora);
		
		JRadioButton rdbtnPinterest = new JRadioButton("Pinterest");
		buttonGroup_4.add(rdbtnPinterest);
		rdbtnPinterest.setBounds(232, 491, 141, 23);
		contentPane.add(rdbtnPinterest);
		
		JRadioButton rdbtnBlogger = new JRadioButton("Blogger");
		buttonGroup_4.add(rdbtnBlogger);
		rdbtnBlogger.setBounds(232, 516, 141, 23);
		contentPane.add(rdbtnBlogger);
		
		JRadioButton rdbtnSnapchat = new JRadioButton("Snapchat");
		buttonGroup_5.add(rdbtnSnapchat);
		rdbtnSnapchat.setBounds(436, 442, 141, 23);
		contentPane.add(rdbtnSnapchat);
		
		JRadioButton rdbtnInstagram = new JRadioButton("Instagram");
		buttonGroup_5.add(rdbtnInstagram);
		rdbtnInstagram.setBounds(436, 466, 141, 23);
		contentPane.add(rdbtnInstagram);
		
		JRadioButton rdbtnFacebook = new JRadioButton("Facebook");
		buttonGroup_5.add(rdbtnFacebook);
		rdbtnFacebook.setBounds(436, 491, 141, 23);
		contentPane.add(rdbtnFacebook);
		
		JRadioButton rdbtnTwitter = new JRadioButton("Twitter");
		buttonGroup_5.add(rdbtnTwitter);
		rdbtnTwitter.setBounds(436, 516, 141, 23);
		contentPane.add(rdbtnTwitter);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton.isSelected()) {
					ts++;
				}
				if(rdbtnInstagram.isSelected()) {
					ts++;
				}
				if(rdbtnPinterest.isSelected()) {
					ts++;
				}
				if(rdbtnStarbucks.isSelected()) {
					ts++;
				}
				if(rdbtnRollsRoyce.isSelected()) {
					ts++;
				}
				if(rdbtnLinux.isSelected()) {
					ts++;
				}
				
				FinalScore_easyCA bk = new FinalScore_easyCA(ts,la);
				bk.setVisible(true);
				FinalScore_easyCA v = new FinalScore_easyCA();
				v.setVisible(true);
				dispose();
				
			}
		});
	}

}
