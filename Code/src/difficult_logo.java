import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.Timer;
import javax.swing.JButton;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;

import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Enumeration;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;

public class difficult_logo extends JFrame {

	private JPanel contentPane;
	int ts;
	int i =180;
	String la="diff";
	Timer tm;
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
					difficult_logo frame = new difficult_logo();
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
	public difficult_logo() {
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				tm.start();
			}
		});
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 640, 640);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(6, 51, 175, 158);
		contentPane.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(this.getClass()
				.getResource("/bentley.jpg")));
		
		JLabel label = new JLabel("New label");
		label.setBounds(241, 51, 175, 158);
		contentPane.add(label);
		label.setIcon(new ImageIcon(this.getClass()
				.getResource("/gucci.jpg")));
		
		JLabel label_1 = new JLabel("New label");
		label_1.setBounds(459, 51, 175, 158);
		contentPane.add(label_1);
		label_1.setIcon(new ImageIcon(this.getClass()
				.getResource("/Hyundai-logo.jpg")));
		
		JLabel label_2 = new JLabel("New label");
		label_2.setBounds(6, 331, 175, 158);
		contentPane.add(label_2);
		label_2.setIcon(new ImageIcon(this.getClass()
				.getResource("/playboy_rabbit.jpg")));
		
		JLabel label_3 = new JLabel("New label");
		label_3.setBounds(241, 331, 175, 158);
		contentPane.add(label_3);
		label_3.setIcon(new ImageIcon(this.getClass()
				.getResource("/shell.jpg")));
		
		JLabel label_4 = new JLabel("New label");
		label_4.setBounds(459, 331, 175, 158);
		contentPane.add(label_4);
		label_4.setIcon(new ImageIcon(this.getClass()
				.getResource("/Rolex-Logo-5.jpg")));
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Bentley");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(6, 221, 141, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnAudi = new JRadioButton("Audi");
		buttonGroup.add(rdbtnAudi);
		rdbtnAudi.setBounds(6, 245, 141, 23);
		contentPane.add(rdbtnAudi);
		
		JRadioButton rdbtnBucati = new JRadioButton("Bucati");
		buttonGroup.add(rdbtnBucati);
		rdbtnBucati.setBounds(6, 271, 141, 23);
		contentPane.add(rdbtnBucati);
		
		JRadioButton rdbtnBarabus = new JRadioButton("Barabus");
		buttonGroup.add(rdbtnBarabus);
		rdbtnBarabus.setBounds(6, 296, 141, 23);
		contentPane.add(rdbtnBarabus);
		
		JRadioButton rdbtnLaurels = new JRadioButton("Laurels");
		buttonGroup_1.add(rdbtnLaurels);
		rdbtnLaurels.setBounds(241, 221, 141, 23);
		contentPane.add(rdbtnLaurels);
		
		JRadioButton rdbtnUcBenetton = new JRadioButton("UC Benetton");
		buttonGroup_1.add(rdbtnUcBenetton);
		rdbtnUcBenetton.setBounds(241, 245, 141, 23);
		contentPane.add(rdbtnUcBenetton);
		
		JRadioButton rdbtnGucci = new JRadioButton("Gucci");
		buttonGroup_1.add(rdbtnGucci);
		rdbtnGucci.setBounds(241, 271, 141, 23);
		contentPane.add(rdbtnGucci);
		
		JRadioButton rdbtnColors = new JRadioButton("Colors");
		buttonGroup_1.add(rdbtnColors);
		rdbtnColors.setBounds(241, 296, 141, 23);
		contentPane.add(rdbtnColors);
		
		JRadioButton rdbtnHonda = new JRadioButton("Honda");
		buttonGroup_2.add(rdbtnHonda);
		rdbtnHonda.setBounds(459, 221, 141, 23);
		contentPane.add(rdbtnHonda);
		
		JRadioButton rdbtnHyundai = new JRadioButton("Hyundai");
		buttonGroup_2.add(rdbtnHyundai);
		rdbtnHyundai.setBounds(459, 245, 141, 23);
		contentPane.add(rdbtnHyundai);
		
		JRadioButton rdbtnChevrolet = new JRadioButton("Chevrolet");
		buttonGroup_2.add(rdbtnChevrolet);
		rdbtnChevrolet.setBounds(459, 271, 141, 23);
		contentPane.add(rdbtnChevrolet);
		
		JRadioButton rdbtnHinoTrucks = new JRadioButton("Hino Trucks");
		buttonGroup_2.add(rdbtnHinoTrucks);
		rdbtnHinoTrucks.setBounds(459, 296, 141, 23);
		contentPane.add(rdbtnHinoTrucks);
		
		JRadioButton rdbtnPlayboy = new JRadioButton("Playboy");
		buttonGroup_3.add(rdbtnPlayboy);
		rdbtnPlayboy.setBounds(6, 501, 141, 23);
		contentPane.add(rdbtnPlayboy);
		
		JRadioButton rdbtnRabbit = new JRadioButton("Rabbit");
		buttonGroup_3.add(rdbtnRabbit);
		rdbtnRabbit.setBounds(6, 524, 141, 23);
		contentPane.add(rdbtnRabbit);
		
		JRadioButton rdbtnBaby = new JRadioButton("Baby");
		buttonGroup_3.add(rdbtnBaby);
		rdbtnBaby.setBounds(6, 548, 141, 23);
		contentPane.add(rdbtnBaby);
		
		JRadioButton rdbtnBTrendy = new JRadioButton("B Trendy");
		buttonGroup_3.add(rdbtnBTrendy);
		rdbtnBTrendy.setBounds(6, 571, 141, 23);
		contentPane.add(rdbtnBTrendy);
		
		JRadioButton rdbtnIndianoil = new JRadioButton("Indianoil");
		buttonGroup_4.add(rdbtnIndianoil);
		rdbtnIndianoil.setBounds(241, 501, 141, 23);
		contentPane.add(rdbtnIndianoil);
		
		JRadioButton rdbtnReliance = new JRadioButton("Shell");
		buttonGroup_4.add(rdbtnReliance);
		rdbtnReliance.setBounds(241, 524, 141, 23);
		contentPane.add(rdbtnReliance);
		
		JRadioButton rdbtnHp = new JRadioButton("HP");
		buttonGroup_4.add(rdbtnHp);
		rdbtnHp.setBounds(241, 548, 141, 23);
		contentPane.add(rdbtnHp);
		
		JRadioButton rdbtnBharatoil = new JRadioButton("BharatOil");
		buttonGroup_4.add(rdbtnBharatoil);
		rdbtnBharatoil.setBounds(241, 571, 141, 23);
		contentPane.add(rdbtnBharatoil);
		
		JRadioButton rdbtnCasio = new JRadioButton("Casio");
		buttonGroup_5.add(rdbtnCasio);
		rdbtnCasio.setBounds(459, 501, 141, 23);
		contentPane.add(rdbtnCasio);
		
		JRadioButton rdbtnTimex = new JRadioButton("Timex");
		buttonGroup_5.add(rdbtnTimex);
		rdbtnTimex.setBounds(459, 524, 141, 23);
		contentPane.add(rdbtnTimex);
		
		JRadioButton rdbtnArmaniExchange = new JRadioButton("Armani Exchange");
		buttonGroup_5.add(rdbtnArmaniExchange);
		rdbtnArmaniExchange.setBounds(459, 548, 141, 23);
		contentPane.add(rdbtnArmaniExchange);
		
		JRadioButton rdbtnRolex = new JRadioButton("Rolex");
		buttonGroup_5.add(rdbtnRolex);
		rdbtnRolex.setBounds(459, 571, 141, 23);
		contentPane.add(rdbtnRolex);
		
		JLabel lblNewLabel_1 = new JLabel("Timer");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		lblNewLabel_1.setBounds(6, 6, 141, 32);
		contentPane.add(lblNewLabel_1);
		JButton btnNewButton = new JButton("FINISH");
		
		tm = new Timer(1000, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				i--;
				if(i>=0) {
					lblNewLabel_1.setText(Integer.toString(i));
					btnNewButton.setVisible(true);
					btnNewButton.setEnabled(true);
					
				}
				
				
				else {
					
					lblNewLabel.setText("Test ends!");
					
					btnNewButton.setVisible(false);
					btnNewButton.setEnabled(false);
					
					tm.stop();
					if(rdbtnNewRadioButton.isSelected()) {
						ts++;
					}
					if(rdbtnRolex.isSelected()) {
						ts++;
					}
					if(rdbtnHyundai.isSelected()) {
						ts++;
					}
					if(rdbtnGucci.isSelected()) {
						ts++;
					}
					if(rdbtnReliance.isSelected()) {
						ts++;
					}
					if(rdbtnPlayboy.isSelected()) {
						ts++;
					}
					
			  		
			  		FinalScore_easyCA ox = new FinalScore_easyCA(ts,la);
			  		ox.setVisible(true);
			  		FinalScore_easyCA obj = new FinalScore_easyCA();
			  		obj.setVisible(true);
			  		dispose();
			  		
				}
				
				
				
			}
        	
        });
		
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton.isSelected()) {
					ts++;
				}
				if(rdbtnRolex.isSelected()) {
					ts++;
				}
				if(rdbtnHyundai.isSelected()) {
					ts++;
				}
				if(rdbtnGucci.isSelected()) {
					ts++;
				}
				if(rdbtnReliance.isSelected()) {
					ts++;
				}
				if(rdbtnPlayboy.isSelected()) {
					ts++;
				}
				
				FinalScore_easyCA bk = new FinalScore_easyCA(ts,la);
				bk.setVisible(true);
				FinalScore_easyCA v = new FinalScore_easyCA();
				v.setVisible(true);
				dispose();
				
				
			}
		});
		btnNewButton.setBounds(496, 9, 117, 30);
		contentPane.add(btnNewButton);
	}

}
