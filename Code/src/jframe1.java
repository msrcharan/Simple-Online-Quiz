import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;

public class jframe1 extends JFrame {
	
	

	private JPanel contentPane;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					jframe1 frame = new jframe1();
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
	public jframe1() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 640, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel startImg = new JLabel("");
		startImg.setBounds(5, 34, 630, 419);
		startImg.setIcon(new ImageIcon(this.getClass().getResource("/rsz_quiz.jpg")));
		
		
		
		contentPane.add(startImg);
		
		JButton btnNewButton = new JButton("LETS GO!!");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SECOND next = new SECOND();
				next.setVisible(true);
				dispose();
			}
		});
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton();
		
		btnNewButton.setBounds(5, 5, 630, 29);
		contentPane.add(btnNewButton);
	}

}
