import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Font;

public class difficult_CA extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	int ts=0;
	
	int n=0;
	int q=0;
	int o=0,z=0;
	int i=180;
	int x;
	int y;
	Timer tm;
	String select ="";
	String la="diff";
	
	
	List<String> list_ques = new ArrayList<String>();
	List<String> list_correctans1 = new ArrayList<String>();
	List<String> list_ans = new ArrayList<String>();
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();
	private final ButtonGroup buttonGroup_3 = new ButtonGroup();
	private final ButtonGroup buttonGroup_4 = new ButtonGroup();
	private final ButtonGroup buttonGroup_5 = new ButtonGroup();
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					difficult_CA frame = new difficult_CA();
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
	public difficult_CA() {
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
		
		//For retrieving questions
		StringBuilder sb = new StringBuilder();
        String strLine = "";
        String nm = (System.getProperty("user.dir"));
        
        try {
             BufferedReader br = new BufferedReader(new FileReader(
            		 nm + "/bank_all/difficultCA_quesbank.txt"));
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
            		 nm1 + "/bank_all/difficultCA_ansbank.txt"));
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
            		nm2 + "/bank_all/difficultCA_correctans.txt"));
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
              
              //System.out.println("hi"+list_correctans1.get(0));
              //System.out.println("hi"+list_correctans1.get(1));
              //System.out.println("actual size"+y);
              br2.close();
              
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Unable to read the file.");
        }
        
		JLabel lblNewLabel = new JLabel("Timer");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(332, 6, 302, 58);
		contentPane.add(lblNewLabel);
		
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(21, 76, 599, 43);
		contentPane.add(lblNewLabel_1);
		lblNewLabel_1.setText(list_ques.get(q++).trim());
		
		JLabel label = new JLabel("New label");
		label.setBounds(21, 178, 613, 30);
		contentPane.add(label);
		label.setText(list_ques.get(q++));
		
		JLabel label_1 = new JLabel("New label");
		label_1.setBounds(21, 262, 613, 30);
		contentPane.add(label_1);
		label_1.setText(list_ques.get(q++));
		
		JLabel label_2 = new JLabel("New label");
		label_2.setBounds(21, 347, 613, 30);
		contentPane.add(label_2);
		label_2.setText(list_ques.get(q++));
		
		JLabel label_3 = new JLabel("New label");
		label_3.setBounds(21, 433, 613, 30);
		contentPane.add(label_3);
		label_3.setText(list_ques.get(q++));
		
		JLabel label_4 = new JLabel("New label");
		label_4.setBounds(21, 513, 613, 30);
		contentPane.add(label_4);
		label_4.setText(list_ques.get(q++));
		
		JButton btnNewButton = new JButton("NEXT");
		
		btnNewButton.setBounds(519, 590, 115, 29);
		contentPane.add(btnNewButton);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("New radio button");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(21, 131, 141, 23);
		contentPane.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setText(list_ans.get(n++).trim());
		
		JRadioButton radioButton = new JRadioButton("New radio button");
		buttonGroup.add(radioButton);
		radioButton.setBounds(174, 131, 141, 23);
		contentPane.add(radioButton);
		radioButton.setText(list_ans.get(n++).trim());
		
		JRadioButton radioButton_1 = new JRadioButton("New radio button");
		buttonGroup.add(radioButton_1);
		radioButton_1.setBounds(327, 131, 141, 23);
		contentPane.add(radioButton_1);
		radioButton_1.setText(list_ans.get(n++).trim());
		
		JRadioButton radioButton_2 = new JRadioButton("New radio button");
		buttonGroup.add(radioButton_2);
		radioButton_2.setBounds(480, 131, 141, 23);
		contentPane.add(radioButton_2);
		radioButton_2.setText(list_ans.get(n++).trim());
		
		
		JRadioButton radioButton_3 = new JRadioButton("New radio button");
		buttonGroup_1.add(radioButton_3);
		radioButton_3.setBounds(21, 220, 141, 23);
		contentPane.add(radioButton_3);
		radioButton_3.setText(list_ans.get(n++).trim());
		
		JRadioButton radioButton_4 = new JRadioButton("New radio button");
		buttonGroup_1.add(radioButton_4);
		radioButton_4.setBounds(174, 220, 141, 23);
		contentPane.add(radioButton_4);
		radioButton_4.setText(list_ans.get(n++).trim());
		
		JRadioButton radioButton_5 = new JRadioButton("New radio button");
		buttonGroup_1.add(radioButton_5);
		radioButton_5.setBounds(327, 220, 141, 23);
		contentPane.add(radioButton_5);
		radioButton_5.setText(list_ans.get(n++).trim());
		
		JRadioButton radioButton_6 = new JRadioButton("New radio button");
		buttonGroup_1.add(radioButton_6);
		radioButton_6.setBounds(478, 220, 141, 23);
		contentPane.add(radioButton_6);
		radioButton_6.setText(list_ans.get(n++).trim());
		
		JRadioButton radioButton_7 = new JRadioButton("New radio button");
		buttonGroup_2.add(radioButton_7);
		radioButton_7.setBounds(21, 304, 141, 23);
		contentPane.add(radioButton_7);
		radioButton_7.setText(list_ans.get(n++).trim());
		
		JRadioButton radioButton_8 = new JRadioButton("New radio button");
		buttonGroup_2.add(radioButton_8);
		radioButton_8.setBounds(174, 304, 141, 23);
		contentPane.add(radioButton_8);
		radioButton_8.setText(list_ans.get(n++).trim());
		
		JRadioButton radioButton_9 = new JRadioButton("New radio button");
		buttonGroup_2.add(radioButton_9);
		radioButton_9.setBounds(327, 304, 141, 23);
		contentPane.add(radioButton_9);
		radioButton_9.setText(list_ans.get(n++).trim());
		
		JRadioButton radioButton_10 = new JRadioButton("New radio button");
		buttonGroup_2.add(radioButton_10);
		radioButton_10.setBounds(480, 304, 141, 23);
		contentPane.add(radioButton_10);
		radioButton_10.setText(list_ans.get(n++).trim());
		
		JRadioButton radioButton_11 = new JRadioButton("New radio button");
		buttonGroup_3.add(radioButton_11);
		radioButton_11.setBounds(21, 389, 141, 23);
		contentPane.add(radioButton_11);
		radioButton_11.setText(list_ans.get(n++).trim());
		
		JRadioButton radioButton_12 = new JRadioButton("New radio button");
		buttonGroup_3.add(radioButton_12);
		radioButton_12.setBounds(174, 389, 141, 23);
		contentPane.add(radioButton_12);
		radioButton_12.setText(list_ans.get(n++).trim());
		
		JRadioButton radioButton_13 = new JRadioButton("New radio button");
		buttonGroup_3.add(radioButton_13);
		radioButton_13.setBounds(327, 389, 141, 23);
		contentPane.add(radioButton_13);
		radioButton_13.setText(list_ans.get(n++).trim());
		
		JRadioButton radioButton_14 = new JRadioButton("New radio button");
		buttonGroup_3.add(radioButton_14);
		radioButton_14.setBounds(478, 389, 141, 23);
		contentPane.add(radioButton_14);
		radioButton_14.setText(list_ans.get(n++).trim());
		
		JRadioButton radioButton_15 = new JRadioButton("New radio button");
		buttonGroup_4.add(radioButton_15);
		radioButton_15.setBounds(21, 475, 141, 23);
		contentPane.add(radioButton_15);
		radioButton_15.setText(list_ans.get(n++).trim());
		
		JRadioButton radioButton_16 = new JRadioButton("New radio button");
		buttonGroup_4.add(radioButton_16);
		radioButton_16.setBounds(174, 475, 141, 23);
		contentPane.add(radioButton_16);
		radioButton_16.setText(list_ans.get(n++).trim());
		
		JRadioButton radioButton_17 = new JRadioButton("New radio button");
		buttonGroup_4.add(radioButton_17);
		radioButton_17.setBounds(327, 475, 141, 23);
		contentPane.add(radioButton_17);
		radioButton_17.setText(list_ans.get(n++).trim());
		
		JRadioButton radioButton_18 = new JRadioButton("New radio button");
		buttonGroup_4.add(radioButton_18);
		radioButton_18.setBounds(480, 475, 141, 23);
		contentPane.add(radioButton_18);
		radioButton_18.setText(list_ans.get(n++).trim());
		
		JRadioButton radioButton_19 = new JRadioButton("New radio button");
		buttonGroup_5.add(radioButton_19);
		radioButton_19.setBounds(21, 555, 141, 23);
		contentPane.add(radioButton_19);
		radioButton_19.setText(list_ans.get(n++).trim());
		
		JRadioButton radioButton_20 = new JRadioButton("New radio button");
		buttonGroup_5.add(radioButton_20);
		radioButton_20.setBounds(174, 555, 141, 23);
		contentPane.add(radioButton_20);
		radioButton_20.setText(list_ans.get(n++).trim());
		
		JRadioButton radioButton_21 = new JRadioButton("New radio button");
		buttonGroup_5.add(radioButton_21);
		radioButton_21.setBounds(327, 555, 141, 23);
		contentPane.add(radioButton_21);
		radioButton_21.setText(list_ans.get(n++).trim());
		
		JRadioButton radioButton_22 = new JRadioButton("New radio button");
		buttonGroup_5.add(radioButton_22);
		radioButton_22.setBounds(480, 555, 141, 23);
		contentPane.add(radioButton_22);
		radioButton_22.setText(list_ans.get(n++).trim());
		
		JLabel lblNewLabel_2 = new JLabel("You Guys having fun ah XD");
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(21, 16, 200, 48);
		contentPane.add(lblNewLabel_2);
		
		
		
		
		tm = new Timer(1000, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				i--;
				if(i>=0) {
					lblNewLabel.setText(Integer.toString(i));
					btnNewButton.setVisible(true);
					btnNewButton.setEnabled(true);
					
				}
				
				
				else {
					
					lblNewLabel.setText("Guys! Good luck");
					btnNewButton.setVisible(false);
					btnNewButton.setEnabled(false);
					
					tm.stop();
					for (Enumeration<AbstractButton> buttons = buttonGroup.getElements();
			  				buttons.hasMoreElements();) {
			            AbstractButton button = buttons.nextElement();
			            if (button.isSelected()) {
			            	select = button.getText().toString().trim();
			            	
			            }
			        }
					
			  		if(select.equalsIgnoreCase(list_correctans1.get(0).trim())) {
			    	ts=ts+1;
			    	
			    	         		
			  		}
			  		System.out.println(ts); 
			  		
			  		for (Enumeration<AbstractButton> buttons = buttonGroup_1.getElements();
			  				buttons.hasMoreElements();) {
			            AbstractButton button = buttons.nextElement();
			            if (button.isSelected()) {
			            	select = button.getText().toString().trim();
			            	
			            }
			        }
			  		if(select.equalsIgnoreCase(list_correctans1.get(1).trim())) {
			        	ts=ts+1;
			        	         		
			      		}
			  		System.out.println(ts); 
			  		
			  		for (Enumeration<AbstractButton> buttons = buttonGroup_2.getElements();
			  				buttons.hasMoreElements();) {
			            AbstractButton button = buttons.nextElement();
			            if (button.isSelected()) {
			            	select = button.getText().toString().trim();
			            	
			            }
			        }
			  		
			  		if(select.equalsIgnoreCase(list_correctans1.get(2).trim())) {
			  		
			        	ts=ts+1;
			        	           		
			      		}
			  		System.out.println(ts); 
			  		for (Enumeration<AbstractButton> buttons = buttonGroup_3.getElements();
			  				buttons.hasMoreElements();) {
			            AbstractButton button = buttons.nextElement();
			            if (button.isSelected()) {
			            	select = button.getText().toString().trim();
			            }
			        }
			  		
			  		if(select.equalsIgnoreCase(list_correctans1.get(3).trim())) {
			        	ts=ts+1;
			        	            		
			      		}
			  		System.out.println(ts); 
			  		for (Enumeration<AbstractButton> buttons = buttonGroup_4.getElements();
			  				buttons.hasMoreElements();) {
			            AbstractButton button = buttons.nextElement();
			            if (button.isSelected()) {
			            	select = button.getText().toString().trim();
			            	
			            }
			        }
			  		if(select.equalsIgnoreCase(list_correctans1.get(4).trim())) {
			        	ts=ts+1;         		
			      		}
			  		for (Enumeration<AbstractButton> buttons = buttonGroup_4.getElements();
			  				buttons.hasMoreElements();) {
			            AbstractButton button = buttons.nextElement();
			            if (button.isSelected()) {
			            	select = button.getText().toString().trim();
			            	
			            }
			        }
			  		if(select.equalsIgnoreCase(list_correctans1.get(5).trim())) {
			        	ts=ts+1;         		
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
				tm.stop();
				for (Enumeration<AbstractButton> buttons = buttonGroup.getElements();
		  				buttons.hasMoreElements();) {
		            AbstractButton button = buttons.nextElement();
		            if (button.isSelected()) {
		            	select = button.getText().toString().trim();
		            	
		            }
		        }
				
		  		if(select.equalsIgnoreCase(list_correctans1.get(0).trim())) {
		    	ts=ts+1;
		    	        		
		  		}
		  		System.out.println(ts); 
		  		
		  		for (Enumeration<AbstractButton> buttons = buttonGroup_1.getElements();
		  				buttons.hasMoreElements();) {
		            AbstractButton button = buttons.nextElement();
		            if (button.isSelected()) {
		            	select = button.getText().toString().trim();
		            	
		            }
		        }
		  		if(select.equalsIgnoreCase(list_correctans1.get(1).trim())) {
		        	ts=ts+1;
		        	         		
		      		}
		  		System.out.println(ts); 
		  		
		  		for (Enumeration<AbstractButton> buttons = buttonGroup_2.getElements();
		  				buttons.hasMoreElements();) {
		            AbstractButton button = buttons.nextElement();
		            if (button.isSelected()) {
		            	select = button.getText().toString().trim();
		            	
		            }
		        }
		  		
		  		if(select.equalsIgnoreCase(list_correctans1.get(2).trim())) {
		  		
		        	ts=ts+1;
		        	           		
		      		}
		  		System.out.println(ts); 
		  		for (Enumeration<AbstractButton> buttons = buttonGroup_3.getElements();
		  				buttons.hasMoreElements();) {
		            AbstractButton button = buttons.nextElement();
		            if (button.isSelected()) {
		            	select = button.getText().toString().trim();
		            }
		        }
		  		
		  		if(select.equalsIgnoreCase(list_correctans1.get(3).trim())) {
		        	ts=ts+1;
		        	            		
		      		}
		  		System.out.println(ts); 
		  		for (Enumeration<AbstractButton> buttons = buttonGroup_4.getElements();
		  				buttons.hasMoreElements();) {
		            AbstractButton button = buttons.nextElement();
		            if (button.isSelected()) {
		            	select = button.getText().toString().trim();
		            	
		            }
		        }
		  		if(select.equalsIgnoreCase(list_correctans1.get(4).trim())) {
		        	ts=ts+1;         		
		      		}
		  		for (Enumeration<AbstractButton> buttons = buttonGroup_4.getElements();
		  				buttons.hasMoreElements();) {
		            AbstractButton button = buttons.nextElement();
		            if (button.isSelected()) {
		            	select = button.getText().toString().trim();
		            	
		            }
		        }
		  		if(select.equalsIgnoreCase(list_correctans1.get(5).trim())) {
		        	ts=ts+1;         		
		      		}
		  		System.out.println("Non: "+ts);
				
		  		FinalScore_easyCA ol = new FinalScore_easyCA(ts,la);
		  		ol.setVisible(true);
		  		FinalScore_easyCA ob = new FinalScore_easyCA();
		  		ob.setVisible(true);
		  		dispose();
				
			}
		});
		
		
		
	}
}
