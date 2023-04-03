import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.GridLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class logo_1 extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();
	private final ButtonGroup buttonGroup_3 = new ButtonGroup();
	private final ButtonGroup buttonGroup_4 = new ButtonGroup();
	int ts=0;
	String la="diff";
	private final ButtonGroup buttonGroup_5 = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					logo_1 frame = new logo_1();
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
	public logo_1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 640, 640);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(6, 6, 175, 158);
		contentPane.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(this.getClass()
				.getResource("/nike.jpg")));
		//1200px-McDonald's_Golden_Arches.svg
		JLabel label = new JLabel("New label");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(214, 6, 175, 158);
		contentPane.add(label);
		label.setIcon(new ImageIcon(this.getClass()
				.getResource("/1200px-McDonald's_Golden_Arches.svg.jpg")));
		
		JLabel label_1 = new JLabel("New label");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(459, 6, 175, 158);
		contentPane.add(label_1);
		label_1.setIcon(new ImageIcon(this.getClass()
				.getResource("/snapchat.jpg")));
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Adidas");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(6, 165, 141, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnReebok = new JRadioButton("Reebok");
		buttonGroup.add(rdbtnReebok);
		rdbtnReebok.setBounds(6, 237, 141, 23);
		contentPane.add(rdbtnReebok);
		
		JRadioButton rdbtnNike = new JRadioButton("Nike");
		buttonGroup.add(rdbtnNike);
		rdbtnNike.setBounds(6, 189, 141, 23);
		contentPane.add(rdbtnNike);
		
		
		JRadioButton rdbtnFila = new JRadioButton("Fila");
		buttonGroup.add(rdbtnFila);
		rdbtnFila.setBounds(6, 214, 141, 23);
		contentPane.add(rdbtnFila);
		
		JRadioButton rdbtnTacoBells = new JRadioButton("Taco Bell");
		buttonGroup_1.add(rdbtnTacoBells);
		rdbtnTacoBells.setBounds(228, 237, 141, 23);
		contentPane.add(rdbtnTacoBells);
		
		JRadioButton rdbtnMcdonalds = new JRadioButton("McDonalds");
		buttonGroup_1.add(rdbtnMcdonalds);
		rdbtnMcdonalds.setBounds(228, 165, 141, 23);
		contentPane.add(rdbtnMcdonalds);
		
		
		JRadioButton rdbtnBurgerKing = new JRadioButton("Burger King");
		buttonGroup_1.add(rdbtnBurgerKing);
		rdbtnBurgerKing.setBounds(228, 189, 141, 23);
		contentPane.add(rdbtnBurgerKing);
		
		JRadioButton rdbtnParadise = new JRadioButton("Paradise");
		buttonGroup_1.add(rdbtnParadise);
		rdbtnParadise.setBounds(228, 214, 141, 23);
		contentPane.add(rdbtnParadise);
		
		JRadioButton rdbtnSnapchat = new JRadioButton("Snapchat");
		buttonGroup_2.add(rdbtnSnapchat);
		rdbtnSnapchat.setBounds(459, 237, 141, 23);
		contentPane.add(rdbtnSnapchat);
		
		
		JRadioButton rdbtnFacebook = new JRadioButton("Facebook");
		buttonGroup_2.add(rdbtnFacebook);
		rdbtnFacebook.setBounds(459, 165, 141, 23);
		contentPane.add(rdbtnFacebook);
		
		JRadioButton rdbtnInstagram = new JRadioButton("Instagram");
		buttonGroup_2.add(rdbtnInstagram);
		rdbtnInstagram.setBounds(459, 189, 141, 23);
		contentPane.add(rdbtnInstagram);
		
		JRadioButton rdbtnWhatsapp = new JRadioButton("Whatsapp");
		buttonGroup_2.add(rdbtnWhatsapp);
		rdbtnWhatsapp.setBounds(459, 214, 141, 23);
		contentPane.add(rdbtnWhatsapp);
		
		JLabel label_2 = new JLabel("New label");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBounds(6, 292, 175, 158);
		contentPane.add(label_2);
		label_2.setIcon(new ImageIcon(this.getClass()
			.getResource("/volkswagen-new-logo.jpg")));
		
		JLabel label_3 = new JLabel("New label");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setBounds(214, 292, 175, 158);
		contentPane.add(label_3);
		label_3.setIcon(new ImageIcon(this.getClass()
				.getResource("/python logo.jpg")));
		
		JLabel label_4 = new JLabel("New label");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setBounds(459, 292, 175, 158);
		contentPane.add(label_4);
		label_4.setIcon(new ImageIcon(this.getClass()
				.getResource("/Axis-Bank-Logo-1200x1200.jpg")));
		
		JRadioButton rdbtnVolkswagen = new JRadioButton("Volkswagen");
		buttonGroup_3.add(rdbtnVolkswagen);
		rdbtnVolkswagen.setBounds(6, 459, 141, 23);
		contentPane.add(rdbtnVolkswagen);
		
		
		JRadioButton rdbtnSkoda = new JRadioButton("Skoda");
		buttonGroup_3.add(rdbtnSkoda);
		rdbtnSkoda.setBounds(6, 484, 141, 23);
		contentPane.add(rdbtnSkoda);
		
		JRadioButton rdbtnKia = new JRadioButton("Kia");
		buttonGroup_3.add(rdbtnKia);
		rdbtnKia.setBounds(6, 509, 141, 23);
		contentPane.add(rdbtnKia);
		
		JRadioButton rdbtnCheverolet = new JRadioButton("Chevrolet");
		buttonGroup_3.add(rdbtnCheverolet);
		rdbtnCheverolet.setBounds(6, 534, 141, 23);
		contentPane.add(rdbtnCheverolet);
		
		JRadioButton rdbtnJava = new JRadioButton("Java");
		buttonGroup_4.add(rdbtnJava);
		rdbtnJava.setBounds(228, 462, 141, 23);
		contentPane.add(rdbtnJava);
		
		
		JRadioButton rdbtnMysql = new JRadioButton("MySQL");
		buttonGroup_4.add(rdbtnMysql);
		rdbtnMysql.setBounds(228, 484, 141, 23);
		contentPane.add(rdbtnMysql);
		
		JRadioButton rdbtnNodejs = new JRadioButton("Nodejs");
		buttonGroup_4.add(rdbtnNodejs);
		rdbtnNodejs.setBounds(228, 509, 141, 23);
		contentPane.add(rdbtnNodejs);
		
		JRadioButton rdbtnPython = new JRadioButton("Python");
		buttonGroup_4.add(rdbtnPython);
		rdbtnPython.setBounds(228, 534, 141, 23);
		contentPane.add(rdbtnPython);
		
		
		JRadioButton rdbtnHdfc = new JRadioButton("HDFC");
		buttonGroup_5.add(rdbtnHdfc);
		rdbtnHdfc.setBounds(459, 462, 141, 23);
		contentPane.add(rdbtnHdfc);
		
		JRadioButton rdbtnAxisBank = new JRadioButton("Axis Bank");
		buttonGroup_5.add(rdbtnAxisBank);
		rdbtnAxisBank.setBounds(459, 484, 141, 23);
		contentPane.add(rdbtnAxisBank);
		
		
		JRadioButton rdbtnIcici = new JRadioButton("ICICI");
		buttonGroup_5.add(rdbtnIcici);
		rdbtnIcici.setBounds(459, 509, 141, 23);
		contentPane.add(rdbtnIcici);
		
		JRadioButton rdbtnYesBank = new JRadioButton("Yes Bank");
		buttonGroup_5.add(rdbtnYesBank);
		rdbtnYesBank.setBounds(459, 534, 141, 23);
		contentPane.add(rdbtnYesBank);
		
		JButton btnNewButton = new JButton("FINISH");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnAxisBank.isSelected()) {
					ts++;
				}
				if(rdbtnSnapchat.isSelected()) {
					ts++;
				}
				if(rdbtnMcdonalds.isSelected()) {
					ts++;
				}
				if(rdbtnNike.isSelected()) {
					ts++;
				}
				if(rdbtnPython.isSelected()) {
					ts++;
				}
				if(rdbtnVolkswagen.isSelected()) {
					ts++;
				}
				FinalScore_easyCA bk = new FinalScore_easyCA(ts,la);
				bk.setVisible(true);
				FinalScore_easyCA v = new FinalScore_easyCA();
				v.setVisible(true);
				dispose();
				
				
			}
		});
		btnNewButton.setBounds(501, 570, 117, 29);
		contentPane.add(btnNewButton);
	}

}
