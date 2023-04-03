import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.awt.event.ActionEvent;

public class medium_CA extends JFrame {

	private JPanel contentPane;
	public static int dl;
	public static int ts=0;
	
	int n=0;
	int q=0;
	int o=0,z=0;
	
	int x;
	int y;
	String select ="";
	
	List<String> list_ques = new ArrayList<String>();
	List<String> list_correctans1 = new ArrayList<String>();
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
					medium_CA frame = new medium_CA();
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
	public medium_CA() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 640, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		//For retrieving questions
				StringBuilder sb = new StringBuilder();
		        String strLine = "";
		        String nm = (System.getProperty("user.dir"));
		        
		        try {
		             BufferedReader br = new BufferedReader(new FileReader(
		            		 nm + "/bank_all/medium_quebank.txt"));
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
		            System.out.println("File not found");
		        } catch (IOException e) {
		            System.out.println("Unable to read the file.");
		        }
		              
		           //for retrieving multiple options
		        StringBuilder sb1 = new StringBuilder();
		        String strLine1 = "";
		        String nm1 = (System.getProperty("user.dir"));
		        
		        try {
		             BufferedReader br1 = new BufferedReader(new FileReader(
		            		 nm1 + "/bank_all/mediumCA_ansbank.txt"));
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
		            System.out.println("File not found");
		        } catch (IOException e) {
		            System.out.println("Unable to read the file.");
		        }
		        
		        //for comparing the user answers with right solutions
		        StringBuilder sb2 = new StringBuilder();
		        String strLine2 = "";
		        String nm2 = (System.getProperty("user.dir"));
		        
		        try {
		             BufferedReader br2 = new BufferedReader(new FileReader(
		            		nm2 + "/bank_all/mediumCA_correctans.txt"));
		              while (strLine2 != null)
		               {
		            	  
		                strLine2 = br2.readLine();
		                sb2.append(strLine2);
		                sb2.append(System.lineSeparator());
		                strLine2 = br2.readLine();
		                if (strLine2==null)
		                   break;
		                list_correctans1.add(strLine2);
		                y = list_correctans1.size();
		                
		         
		            }
		              System.out.println("hi"+list_correctans1.get(0));
		              System.out.println("hi"+list_correctans1.get(1));
		              System.out.println("actual size"+y);
		              br2.close();
		              
		        } catch (FileNotFoundException e) {
		            System.out.println("File not found");
		        } catch (IOException e) {
		            System.out.println("Unable to read the file.");
		        }
		
		JLabel lblNewLabel = new JLabel("ACE IT !");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(283, 6, 127, 16);
		contentPane.add(lblNewLabel);
		
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(29, 42, 567, 33);
		contentPane.add(lblNewLabel_1);
		lblNewLabel_1.setText(list_ques.get(q++));
		
		JLabel label = new JLabel("New label");
		label.setBounds(29, 110, 567, 33);
		contentPane.add(label);
		label.setText(list_ques.get(q++));
		
		JLabel label_1 = new JLabel("New label");
		label_1.setBounds(29, 183, 567, 33);
		contentPane.add(label_1);
		label_1.setText(list_ques.get(q++));
		
		JLabel label_2 = new JLabel("New label");
		label_2.setBounds(29, 259, 567, 33);
		contentPane.add(label_2);
		label_2.setText(list_ques.get(q++));
		
		JLabel label_3 = new JLabel("New label");
		label_3.setBounds(29, 336, 567, 33);
		contentPane.add(label_3);
		label_3.setText(list_ques.get(q++));
		
		
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("New radio button");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(29, 87, 141, 23);
		contentPane.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setText(list_ans.get(n++));
		
		JRadioButton radioButton = new JRadioButton("New radio button");
		buttonGroup.add(radioButton);
		radioButton.setBounds(182, 87, 141, 23);
		contentPane.add(radioButton);
		radioButton.setText(list_ans.get(n++));
		
		JRadioButton radioButton_1 = new JRadioButton("New radio button");
		buttonGroup.add(radioButton_1);
		radioButton_1.setBounds(338, 87, 141, 23);
		contentPane.add(radioButton_1);
		radioButton_1.setText(list_ans.get(n++));
		
		JRadioButton radioButton_2 = new JRadioButton("New radio button");
		buttonGroup.add(radioButton_2);
		radioButton_2.setBounds(491, 87, 141, 23);
		contentPane.add(radioButton_2);
		radioButton_2.setText(list_ans.get(n++));
		
		JRadioButton radioButton_3 = new JRadioButton("New radio button");
		buttonGroup_1.add(radioButton_3);
		radioButton_3.setBounds(29, 155, 141, 23);
		contentPane.add(radioButton_3);
		radioButton_3.setText(list_ans.get(n++));
		
		JRadioButton radioButton_4 = new JRadioButton("New radio button");
		buttonGroup_1.add(radioButton_4);
		radioButton_4.setBounds(182, 155, 141, 23);
		contentPane.add(radioButton_4);
		radioButton_4.setText(list_ans.get(n++));
		
		JRadioButton radioButton_5 = new JRadioButton("New radio button");
		buttonGroup_1.add(radioButton_5);
		radioButton_5.setBounds(338, 155, 141, 23);
		contentPane.add(radioButton_5);
		radioButton_5.setText(list_ans.get(n++));
		
		JRadioButton radioButton_6 = new JRadioButton("New radio button");
		buttonGroup_1.add(radioButton_6);
		radioButton_6.setBounds(491, 155, 141, 23);
		contentPane.add(radioButton_6);
		radioButton_6.setText(list_ans.get(n++));
		
		JRadioButton radioButton_7 = new JRadioButton("New radio button");
		buttonGroup_2.add(radioButton_7);
		radioButton_7.setBounds(29, 224, 141, 23);
		contentPane.add(radioButton_7);
		radioButton_7.setText(list_ans.get(n++));
		
		JRadioButton radioButton_8 = new JRadioButton("New radio button");
		buttonGroup_2.add(radioButton_8);
		radioButton_8.setBounds(182, 224, 141, 23);
		contentPane.add(radioButton_8);
		radioButton_8.setText(list_ans.get(n++));
		
		JRadioButton radioButton_9 = new JRadioButton("New radio button");
		buttonGroup_2.add(radioButton_9);
		radioButton_9.setBounds(338, 224, 141, 23);
		contentPane.add(radioButton_9);
		radioButton_9.setText(list_ans.get(n++));
		
		JRadioButton radioButton_10 = new JRadioButton("New radio button");
		buttonGroup_2.add(radioButton_10);
		radioButton_10.setBounds(491, 224, 141, 23);
		contentPane.add(radioButton_10);
		radioButton_10.setText(list_ans.get(n++));
		
		JRadioButton radioButton_11 = new JRadioButton("New radio button");
		buttonGroup_3.add(radioButton_11);
		radioButton_11.setBounds(29, 301, 141, 23);
		contentPane.add(radioButton_11);
		radioButton_11.setText(list_ans.get(n++));
		
		JRadioButton radioButton_12 = new JRadioButton("New radio button");
		buttonGroup_3.add(radioButton_12);
		radioButton_12.setBounds(182, 301, 141, 23);
		contentPane.add(radioButton_12);
		radioButton_12.setText(list_ans.get(n++));
		
		JRadioButton radioButton_13 = new JRadioButton("New radio button");
		buttonGroup_3.add(radioButton_13);
		radioButton_13.setBounds(338, 301, 141, 23);
		contentPane.add(radioButton_13);
		radioButton_13.setText(list_ans.get(n++));
		
		JRadioButton radioButton_14 = new JRadioButton("New radio button");
		buttonGroup_3.add(radioButton_14);
		radioButton_14.setBounds(493, 301, 141, 23);
		contentPane.add(radioButton_14);
		radioButton_14.setText(list_ans.get(n++));
		
		JRadioButton radioButton_15 = new JRadioButton("New radio button");
		buttonGroup_4.add(radioButton_15);
		radioButton_15.setBounds(29, 383, 141, 23);
		contentPane.add(radioButton_15);
		radioButton_15.setText(list_ans.get(n++));
		
		JRadioButton radioButton_16 = new JRadioButton("New radio button");
		buttonGroup_4.add(radioButton_16);
		radioButton_16.setBounds(182, 381, 141, 23);
		contentPane.add(radioButton_16);
		radioButton_16.setText(list_ans.get(n++));
		
		JRadioButton radioButton_17 = new JRadioButton("New radio button");
		buttonGroup_4.add(radioButton_17);
		radioButton_17.setBounds(338, 381, 141, 23);
		contentPane.add(radioButton_17);
		radioButton_17.setText(list_ans.get(n++));
		
		JRadioButton radioButton_18 = new JRadioButton("New radio button");
		buttonGroup_4.add(radioButton_18);
		radioButton_18.setBounds(493, 381, 141, 23);
		contentPane.add(radioButton_18);
		radioButton_18.setText(list_ans.get(n++));
		
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
				
          		if(select.equalsIgnoreCase(list_correctans1.get(o++).trim())) {
            	ts++;
            	
            	         		
          		}
          		 
          		
          		for (Enumeration<AbstractButton> buttons = buttonGroup_1.getElements();
          				buttons.hasMoreElements();) {
                    AbstractButton button = buttons.nextElement();
                    if (button.isSelected()) {
                    	select = button.getText().toString().trim();
                    	
                    }
                }
          		if(select.equalsIgnoreCase(list_correctans1.get(o++).trim())) {
                	ts++;
                	         		
              		}
          		 
          		
          		for (Enumeration<AbstractButton> buttons = buttonGroup_2.getElements();
          				buttons.hasMoreElements();) {
                    AbstractButton button = buttons.nextElement();
                    if (button.isSelected()) {
                    	select = button.getText().toString().trim();
                    	
                    }
                }
          		
          		if(select.equalsIgnoreCase(list_correctans1.get(o++).trim())) {
          		
                	ts++;
                	           		
              		}
          		 
          		for (Enumeration<AbstractButton> buttons = buttonGroup_3.getElements();
          				buttons.hasMoreElements();) {
                    AbstractButton button = buttons.nextElement();
                    if (button.isSelected()) {
                    	select = button.getText().toString().trim();
                    }
                }
          		
          		if(select.equalsIgnoreCase(list_correctans1.get(o++).trim())) {
                	ts++;
                	            		
              		}
          		 
          		for (Enumeration<AbstractButton> buttons = buttonGroup_4.getElements();
          				buttons.hasMoreElements();) {
                    AbstractButton button = buttons.nextElement();
                    if (button.isSelected()) {
                    	select = button.getText().toString().trim();
                    	
                    }
                }
          		if(select.equalsIgnoreCase(list_correctans1.get(o++).trim())) {
                	ts++;
                	           		
              		}
          		
          		medium_CA_2 es = new medium_CA_2(ts,o,q,n);
          		es.setVisible(true);
          		medium_CA_2 bk = new medium_CA_2();
          		bk.setVisible(true);
          		dispose();
				
			}
		});
		btnNewButton.setBounds(503, 416, 117, 29);
		contentPane.add(btnNewButton);
	}
}
