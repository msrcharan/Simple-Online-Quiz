import java.awt.BorderLayout;
import java.awt.EventQueue;
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
import javax.swing.JTextArea;
import javax.swing.Timer;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class easy_AP extends JFrame {

	private JPanel contentPane;
	int ts=0;
	
	int n=0;
	int q=0;
	int o=0,z=0;
	int i=120;
	int x;
	int y;
	
	String select ="";
	String la="";
	
	
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
					easy_AP frame = new easy_AP();
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
	public easy_AP() {
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
            		 nm + "/bank_all/easyquestions_AP.txt"));
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
            		 nm1 + "/bank_all/easyoptions_AP.txt"));
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
            		nm2 + "/bank_all/easyanswers_AP.txt"));
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
		
		JTextArea textArea = new JTextArea();
		textArea.setWrapStyleWord(true);
		textArea.setLineWrap(true);
		textArea.setEditable(false);
		textArea.setBounds(17, 17, 603, 34);
		contentPane.add(textArea);
		textArea.append
		(list_ques.get(q++).trim());
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setWrapStyleWord(true);
		textArea_1.setLineWrap(true);
		textArea_1.setEditable(false);
		textArea_1.setBounds(17, 96, 603, 34);
		contentPane.add(textArea_1);
		textArea_1.append
		(list_ques.get(q++).trim());
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setWrapStyleWord(true);
		textArea_2.setLineWrap(true);
		textArea_2.setEditable(false);
		textArea_2.setBounds(17, 183, 603, 34);
		contentPane.add(textArea_2);
		textArea_2.append
		(list_ques.get(q++).trim());
		
		JTextArea textArea_3 = new JTextArea();
		textArea_3.setWrapStyleWord(true);
		textArea_3.setLineWrap(true);
		textArea_3.setEditable(false);
		textArea_3.setBounds(17, 268, 603, 34);
		contentPane.add(textArea_3);
		textArea_3.append
		(list_ques.get(q++).trim());
		
		JTextArea textArea_4 = new JTextArea();
		textArea_4.setWrapStyleWord(true);
		textArea_4.setLineWrap(true);
		textArea_4.setEditable(false);
		textArea_4.setBounds(17, 348, 603, 34);
		contentPane.add(textArea_4);
		textArea_4.append
		(list_ques.get(q++).trim());
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("New radio button");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(17, 61, 141, 23);
		contentPane.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setText(list_ans.get(n++).trim());
		
		JRadioButton radioButton = new JRadioButton("New radio button");
		buttonGroup.add(radioButton);
		radioButton.setBounds(170, 63, 141, 23);
		contentPane.add(radioButton);
		radioButton.setText(list_ans.get(n++).trim());
		
		JRadioButton radioButton_1 = new JRadioButton("New radio button");
		buttonGroup.add(radioButton_1);
		radioButton_1.setBounds(323, 61, 141, 23);
		contentPane.add(radioButton_1);
		radioButton_1.setText(list_ans.get(n++).trim());
		
		JRadioButton radioButton_2 = new JRadioButton("New radio button");
		buttonGroup.add(radioButton_2);
		radioButton_2.setBounds(476, 63, 141, 23);
		contentPane.add(radioButton_2);
		radioButton_2.setText(list_ans.get(n++).trim());
		
		JRadioButton radioButton_3 = new JRadioButton("New radio button");
		buttonGroup_1.add(radioButton_3);
		radioButton_3.setBounds(17, 148, 141, 23);
		contentPane.add(radioButton_3);
		radioButton_3.setText(list_ans.get(n++).trim());
		
		JRadioButton radioButton_4 = new JRadioButton("New radio button");
		buttonGroup_1.add(radioButton_4);
		radioButton_4.setBounds(170, 148, 141, 23);
		contentPane.add(radioButton_4);
		radioButton_4.setText(list_ans.get(n++).trim());
		
		JRadioButton radioButton_5 = new JRadioButton("New radio button");
		buttonGroup_1.add(radioButton_5);
		radioButton_5.setBounds(323, 148, 141, 23);
		contentPane.add(radioButton_5);
		radioButton_5.setText(list_ans.get(n++).trim());
		
		JRadioButton radioButton_6 = new JRadioButton("New radio button");
		buttonGroup_1.add(radioButton_6);
		radioButton_6.setBounds(476, 148, 141, 23);
		contentPane.add(radioButton_6);
		radioButton_6.setText(list_ans.get(n++).trim());
		
		JRadioButton radioButton_7 = new JRadioButton("New radio button");
		buttonGroup_2.add(radioButton_7);
		radioButton_7.setBounds(17, 233, 141, 23);
		contentPane.add(radioButton_7);
		radioButton_7.setText(list_ans.get(n++).trim());
		
		JRadioButton radioButton_8 = new JRadioButton("New radio button");
		buttonGroup_2.add(radioButton_8);
		radioButton_8.setBounds(170, 233, 141, 23);
		contentPane.add(radioButton_8);
		radioButton_8.setText(list_ans.get(n++).trim());
		
		JRadioButton radioButton_9 = new JRadioButton("New radio button");
		buttonGroup_2.add(radioButton_9);
		radioButton_9.setBounds(323, 233, 141, 23);
		contentPane.add(radioButton_9);
		radioButton_9.setText(list_ans.get(n++).trim());
		
		JRadioButton radioButton_10 = new JRadioButton("New radio button");
		buttonGroup_2.add(radioButton_10);
		radioButton_10.setBounds(476, 233, 141, 23);
		contentPane.add(radioButton_10);
		radioButton_10.setText(list_ans.get(n++).trim());
		
		JRadioButton radioButton_11 = new JRadioButton("New radio button");
		buttonGroup_3.add(radioButton_11);
		radioButton_11.setBounds(17, 314, 141, 23);
		contentPane.add(radioButton_11);
		radioButton_11.setText(list_ans.get(n++).trim());
		
		JRadioButton radioButton_12 = new JRadioButton("New radio button");
		buttonGroup_3.add(radioButton_12);
		radioButton_12.setBounds(170, 314, 141, 23);
		contentPane.add(radioButton_12);
		radioButton_12.setText(list_ans.get(n++).trim());
		
		JRadioButton radioButton_13 = new JRadioButton("New radio button");
		buttonGroup_3.add(radioButton_13);
		radioButton_13.setBounds(323, 314, 141, 23);
		contentPane.add(radioButton_13);
		radioButton_13.setText(list_ans.get(n++).trim());
		
		JRadioButton radioButton_14 = new JRadioButton("New radio button");
		buttonGroup_3.add(radioButton_14);
		radioButton_14.setBounds(476, 314, 141, 23);
		contentPane.add(radioButton_14);
		radioButton_14.setText(list_ans.get(n++).trim());
		
		JRadioButton radioButton_15 = new JRadioButton("New radio button");
		buttonGroup_4.add(radioButton_15);
		radioButton_15.setBounds(17, 394, 141, 23);
		contentPane.add(radioButton_15);
		radioButton_15.setText(list_ans.get(n++).trim());
		
		JRadioButton radioButton_16 = new JRadioButton("New radio button");
		buttonGroup_4.add(radioButton_16);
		radioButton_16.setBounds(170, 394, 141, 23);
		contentPane.add(radioButton_16);
		radioButton_16.setText(list_ans.get(n++).trim());
		
		JRadioButton radioButton_17 = new JRadioButton("New radio button");
		buttonGroup_4.add(radioButton_17);
		radioButton_17.setBounds(323, 394, 141, 23);
		contentPane.add(radioButton_17);
		radioButton_17.setText(list_ans.get(n++).trim());
		
		JRadioButton radioButton_18 = new JRadioButton("New radio button");
		buttonGroup_4.add(radioButton_18);
		radioButton_18.setBounds(476, 394, 141, 23);
		contentPane.add(radioButton_18);
		radioButton_18.setText(list_ans.get(n++).trim());
		
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
          		if(select.equalsIgnoreCase(list_correctans1.get(o++).trim())) {
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
          		
          		if(select.equalsIgnoreCase(list_correctans1.get(o++).trim())) {
          		
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
          		
          		if(select.equalsIgnoreCase(list_correctans1.get(o++).trim())) {
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
          		if(select.equalsIgnoreCase(list_correctans1.get(o++).trim())) {
                	ts=ts+1;         		
              		}
          		
          		easy_AP_2 es = new easy_AP_2(ts,o,q,n);
          		es.setVisible(true);
				easy_AP_2 obj = new easy_AP_2();
				obj.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(503, 429, 117, 29);
		contentPane.add(btnNewButton);
	}
}
