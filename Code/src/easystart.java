import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class easystart extends JFrame {

	private JPanel contentPane;
	int n=0;
	int q=0;
	int o=0;
	int score =0;
	int x;
	int y;
	String select ="";
	
	List<String> list_ques = new ArrayList<String>();
	List<String> list_correctans = new ArrayList<String>();
	List<String> list_ans = new ArrayList<String>();
	
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();
	private final ButtonGroup buttonGroup_3 = new ButtonGroup();
	private final ButtonGroup buttonGroup_4 = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					easystart frame = new easystart();
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
	public easystart() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 640, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(25, 34, 565, 35);
		contentPane.add(lblNewLabel);
		//For retrieving questions
		StringBuilder sb = new StringBuilder();
        String strLine = "";
        String nm = (System.getProperty("user.dir"));
        
        try {
             BufferedReader br = new BufferedReader(new FileReader(
            		 nm + "/bank_all/easy_quebank.txt"));
              while (strLine != null)
               {
                strLine = br.readLine();
                sb.append(strLine);
                sb.append(System.lineSeparator());
                strLine = br.readLine();
                if (strLine==null)
                   break;
                list_ques.add(strLine);
            }
              br.close();
        } catch (FileNotFoundException e) {
            System.out.println("quebank File not found");
        } catch (IOException e) {
            System.out.println("Unable to read the file.");
        }
              
           //for retrieving multiple options
        StringBuilder sb1 = new StringBuilder();
        String strLine1 = "";
        String nm1 = (System.getProperty("user.dir"));
        
        try {
             BufferedReader br1 = new BufferedReader(new FileReader(
            		 nm1 + "/bank_all/easy_ansbank.txt"));
              while (strLine1 != null)
               {
                strLine1 = br1.readLine();
                sb1.append(strLine1);
                sb1.append(System.lineSeparator());
                strLine1 = br1.readLine();
                if (strLine1==null)
                   break;
                list_ans.add(strLine1);
                x = list_ans.size();
                
         
            }
              System.out.println("options"+x);
              br1.close();
              
        } catch (FileNotFoundException e) {
            System.out.println("ansbank File not found");
        } catch (IOException e) {
            System.out.println("Unable to read the file.");
        }
        
        //for comparing the user answers with right solutions
        StringBuilder sb2 = new StringBuilder();
        String strLine2 = "";
        String nm2 = (System.getProperty("user.dir"));
        
        try {
             BufferedReader br2 = new BufferedReader(new FileReader(
            		nm2 + "/bank_all/easy_correctans.txt"));
              while (strLine2 != null)
               {
                strLine2 = br2.readLine();
                sb2.append(strLine2);
                sb2.append(System.lineSeparator());
                strLine2 = br2.readLine();
                if (strLine2==null)
                   break;
                list_correctans.add(strLine2);
                
                
         
            }
              
              br2.close();
              
        } catch (FileNotFoundException e) {
            System.out.println(" correct options File not found");
        } catch (IOException e) {
            System.out.println("Unable to read the file.");
        }
        
              
         
              
              lblNewLabel.setText(list_ques.get(q++));
              
              JRadioButton rdbtnNewRadioButton = new JRadioButton("New radio button");
              buttonGroup.add(rdbtnNewRadioButton);
              rdbtnNewRadioButton.setBounds(25, 68, 153, 23);
              contentPane.add(rdbtnNewRadioButton);
              
              
              JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("New radio button");
              buttonGroup.add(rdbtnNewRadioButton_1);
              rdbtnNewRadioButton_1.setBounds(178, 68, 141, 23);
              contentPane.add(rdbtnNewRadioButton_1);
              
              JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("New radio button");
              buttonGroup.add(rdbtnNewRadioButton_2);
              rdbtnNewRadioButton_2.setBounds(331, 68, 141, 23);
              contentPane.add(rdbtnNewRadioButton_2);
              
              JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("New radio button");
              buttonGroup.add(rdbtnNewRadioButton_3);
              rdbtnNewRadioButton_3.setBounds(484, 68, 141, 23);
              contentPane.add(rdbtnNewRadioButton_3);
              rdbtnNewRadioButton.setText(list_ans.get(n++));
              rdbtnNewRadioButton_1.setText(list_ans.get(n++));
              rdbtnNewRadioButton_2.setText(list_ans.get(n++));
              rdbtnNewRadioButton_3.setText(list_ans.get(n++));
              
              
              JLabel lblNewLabel_1 = new JLabel("New label");
              lblNewLabel_1.setBounds(25, 114, 565, 35);
              contentPane.add(lblNewLabel_1);
              lblNewLabel_1.setText(list_ques.get(q++));
              
              JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("New radio button");
              buttonGroup_1.add(rdbtnNewRadioButton_4);
              rdbtnNewRadioButton_4.setBounds(25, 147, 153, 23);
              contentPane.add(rdbtnNewRadioButton_4);
              
              JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("New radio button");
              buttonGroup_1.add(rdbtnNewRadioButton_5);
              rdbtnNewRadioButton_5.setBounds(178, 147, 153, 23);
              contentPane.add(rdbtnNewRadioButton_5);
              
              JRadioButton rdbtnNewRadioButton_6 = new JRadioButton("New radio button");
              buttonGroup_1.add(rdbtnNewRadioButton_6);
              rdbtnNewRadioButton_6.setBounds(331, 147, 153, 23);
              contentPane.add(rdbtnNewRadioButton_6);
              
              JRadioButton rdbtnNewRadioButton_7 = new JRadioButton("New radio button");
              buttonGroup_1.add(rdbtnNewRadioButton_7);
              rdbtnNewRadioButton_7.setBounds(484, 147, 150, 23);
              contentPane.add(rdbtnNewRadioButton_7);
              
              rdbtnNewRadioButton_4.setText(list_ans.get(n++));
              rdbtnNewRadioButton_5.setText(list_ans.get(n++));
              rdbtnNewRadioButton_6.setText(list_ans.get(n++));
              rdbtnNewRadioButton_7.setText(list_ans.get(n++));
              
              JLabel label = new JLabel("New label");
              label.setBounds(25, 182, 565, 35);
              contentPane.add(label);
              label.setText(list_ques.get(q++));
              
              JLabel label_1 = new JLabel("New label");
              label_1.setBounds(25, 250, 565, 35);
              contentPane.add(label_1);
              label_1.setText(list_ques.get(q++));
              
              JRadioButton radioButton = new JRadioButton("New radio button");
              buttonGroup_2.add(radioButton);
              radioButton.setBounds(25, 215, 141, 23);
              contentPane.add(radioButton);
              
              JRadioButton radioButton_1 = new JRadioButton("New radio button");
              buttonGroup_2.add(radioButton_1);
              radioButton_1.setBounds(178, 215, 141, 23);
              contentPane.add(radioButton_1);
              
              JRadioButton radioButton_2 = new JRadioButton("New radio button");
              buttonGroup_2.add(radioButton_2);
              radioButton_2.setBounds(331, 215, 141, 23);
              contentPane.add(radioButton_2);
              
              JRadioButton radioButton_3 = new JRadioButton("New radio button");
              buttonGroup_2.add(radioButton_3);
              radioButton_3.setBounds(484, 215, 141, 23);
              contentPane.add(radioButton_3);
              radioButton.setText(list_ans.get(n++));
              radioButton_1.setText(list_ans.get(n++));
              radioButton_2.setText(list_ans.get(n++));
              radioButton_3.setText(list_ans.get(n++));
              
              JRadioButton radioButton_4 = new JRadioButton("New radio button");
              buttonGroup_3.add(radioButton_4);
              radioButton_4.setBounds(25, 283, 141, 23);
              contentPane.add(radioButton_4);
              
              JRadioButton radioButton_5 = new JRadioButton("New radio button");
              buttonGroup_3.add(radioButton_5);
              radioButton_5.setBounds(178, 283, 141, 23);
              contentPane.add(radioButton_5);
              
              JRadioButton radioButton_6 = new JRadioButton("New radio button");
              buttonGroup_3.add(radioButton_6);
              radioButton_6.setBounds(343, 283, 141, 23);
              contentPane.add(radioButton_6);
              
              JRadioButton radioButton_7 = new JRadioButton("New radio button");
              buttonGroup_3.add(radioButton_7);
              radioButton_7.setBounds(484, 283, 141, 23);
              contentPane.add(radioButton_7);
              
              radioButton_4.setText(list_ans.get(n++));
              radioButton_5.setText(list_ans.get(n++));
              radioButton_6.setText(list_ans.get(n++));
              radioButton_7.setText(list_ans.get(n++));
              
              JLabel label_2 = new JLabel("New label");
              label_2.setBounds(25, 330, 565, 35);
              contentPane.add(label_2);
              label_2.setText(list_ques.get(q++));
              
              JRadioButton radioButton_8 = new JRadioButton("New radio button");
              buttonGroup_4.add(radioButton_8);
              radioButton_8.setBounds(25, 364, 141, 23);
              contentPane.add(radioButton_8);
              
              JRadioButton radioButton_9 = new JRadioButton("New radio button");
              buttonGroup_4.add(radioButton_9);
              radioButton_9.setBounds(178, 364, 141, 23);
              contentPane.add(radioButton_9);
              
              JRadioButton radioButton_10 = new JRadioButton("New radio button");
              buttonGroup_4.add(radioButton_10);
              radioButton_10.setBounds(343, 364, 141, 23);
              contentPane.add(radioButton_10);
              
              JRadioButton radioButton_11 = new JRadioButton("New radio button");
              buttonGroup_4.add(radioButton_11);
              radioButton_11.setBounds(484, 364, 141, 23);
              contentPane.add(radioButton_11);
              
              radioButton_8.setText(list_ans.get(n++));
              
              radioButton_9.setText(list_ans.get(n++));
              radioButton_10.setText(list_ans.get(n++));
              radioButton_11.setText(list_ans.get(n++));
              
              JLabel lblNewLabel_2 = new JLabel("ACE IT!");
              lblNewLabel_2.setFont(new Font("American Typewriter", Font.PLAIN, 15));
              lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
              lblNewLabel_2.setBounds(178, 6, 283, 23);
              contentPane.add(lblNewLabel_2);
              
              
              JButton btnNewButton = new JButton("NEXT");
              btnNewButton.addActionListener(new ActionListener() {
              	public void actionPerformed(ActionEvent e) {
              		
              		for (Enumeration<AbstractButton> buttons = buttonGroup.getElements();
              				buttons.hasMoreElements();) {
                        AbstractButton button = buttons.nextElement();
                        if (button.isSelected()) {
                        	select = button.getText().toString().trim();
                        }
                    }
              		if(select.equalsIgnoreCase(list_correctans.get(o++))) {
                	score++;
                	              		
              		}
              		for (Enumeration<AbstractButton> buttons = buttonGroup_1.getElements();
              				buttons.hasMoreElements();) {
                        AbstractButton button = buttons.nextElement();
                        if (button.isSelected()) {
                        	select = button.getText().toString().trim();
                        }
                    }
              		if(select.equalsIgnoreCase(list_correctans.get(o++))) {
                    	score++;
                    	             		
                  		}
              		for (Enumeration<AbstractButton> buttons = buttonGroup_2.getElements();
              				buttons.hasMoreElements();) {
                        AbstractButton button = buttons.nextElement();
                        if (button.isSelected()) {
                        	select = button.getText().toString().trim();
                        }
                    }
              		if(select.equalsIgnoreCase(list_correctans.get(o++))) {
                    	score++;
                    	              		
                  		}
              		for (Enumeration<AbstractButton> buttons = buttonGroup_3.getElements();
              				buttons.hasMoreElements();) {
                        AbstractButton button = buttons.nextElement();
                        if (button.isSelected()) {
                        	select = button.getText().toString().trim();
                        }
                    }
              		if(select.equalsIgnoreCase(list_correctans.get(o++))) {
                    	score++;
                    	              		
                  		}
              		for (Enumeration<AbstractButton> buttons = buttonGroup_4.getElements();
              				buttons.hasMoreElements();) {
                        AbstractButton button = buttons.nextElement();
                        if (button.isSelected()) {
                        	select = button.getText().toString().trim();
                        }
                    }
              		if(select.equalsIgnoreCase(list_correctans.get(o++))) {
                    	score++;
                    	              		
                  		}
              		System.out.println("first"+score);
              		easystartII es = new easystartII(score,n,o,q);
              		es.setVisible(true);
              		easystartII ob = new easystartII();
              		ob.setVisible(true);
              		dispose();
              	}
              });
              btnNewButton.setBounds(494, 409, 117, 29);
              contentPane.add(btnNewButton);
        
        
	}
}
