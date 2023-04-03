import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FinalScore_mediumCA extends JFrame {

	private JPanel contentPane;
	public static int ts;

	/**
	 * Launch the application.
	 */
	public FinalScore_mediumCA(int ts) {
		this.ts=ts;
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FinalScore_mediumCA frame = new FinalScore_mediumCA();
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
	public FinalScore_mediumCA() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 640, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(6, 19, 390, 406);
		contentPane.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(this.getClass().getResource("/spb.jpg")));
		
		JLabel lblNewLabel_1 = new JLabel("You Scored:");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(446, 45, 177, 93);
		contentPane.add(lblNewLabel_1);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setFont(new Font("Malayalam MN", Font.PLAIN, 26));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(446, 164, 173, 172);
		contentPane.add(lblNewLabel_2);
		lblNewLabel_2.setText(ts+" /10");
		
		JButton btnNewButton = new JButton("EXIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton.setBounds(470, 380, 135, 45);
		contentPane.add(btnNewButton);
	}
}
