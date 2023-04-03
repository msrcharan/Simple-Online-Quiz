import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FinalScore_easyCA extends JFrame {

	private JPanel contentPane;
	public static int x;
	public static int ts;
	public static int hj;
	public static String la;

	/**
	 * Launch the application.
	 */
	
	
	 public FinalScore_easyCA(int x) { 
		 this.x = x; 
		 System.out.println("Second"+x);
	  
	  }
	 
	
	  public FinalScore_easyCA(int l,String la) { 
		  this.hj=l; 
		  this.la=la;
	  
	  }
	 
	
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FinalScore_easyCA frame = new FinalScore_easyCA();
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
	public FinalScore_easyCA() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 640, 480);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(6, 23, 390, 394);
		contentPane.add(lblNewLabel);
		//lblNewLabel.setIcon(new ImageIcon(this.getClass().getResource("/spb.jpg")));
		
		JLabel lblNewLabel_1 = new JLabel("You Scored:");
		lblNewLabel_1.setFont(new Font("Mishafi Gold", Font.PLAIN, 19));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(402, 23, 214, 97);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("S");
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(412, 113, 192, 169);
		contentPane.add(lblNewLabel_2);
		
		System.out.println("Display"+x);
		System.out.println("Display"+hj);
		if(la.equalsIgnoreCase("diff")) {
			lblNewLabel_2.setText(" "+hj+" /6");
			
				lblNewLabel.setIcon(new ImageIcon(
						this.getClass().getResource("/spb.jpg")));
				
			
		}
		else {
			lblNewLabel_2.setText(" "+hj+" /10");
				
					lblNewLabel.setIcon(new ImageIcon(
							this.getClass().getResource("/spb.jpg")));
					
				
		}
		
		JButton btnNewButton = new JButton("EXIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
			
		});
		btnNewButton.setBounds(459, 351, 140, 39);
		contentPane.add(btnNewButton);
	}
}
