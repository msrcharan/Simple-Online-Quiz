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
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class medium_CA_2 extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();
	private final ButtonGroup buttonGroup_3 = new ButtonGroup();
	private final ButtonGroup buttonGroup_4 = new ButtonGroup();
	int scor,y;
	public static int score;
	public static int o;
	public static int q;
	public static int n;
	public static int ts;
	
	int z=0;
	
	int x;
	String la="";
	String select ="";
	
	List<String> list_ques = new ArrayList<String>();
	List<String> list_correctans1 = new ArrayList<String>();
	List<String> list_ans = new ArrayList<String>();

	/**
	 * Launch the application.
	 */
	
	public medium_CA_2(int score,int o, int q, int n ) {
		this.ts = score;
		this.o=o;
		this.q=q;
		this.n=n;
		System.out.println("N value: "+n);
		System.out.println("O value: "+o);
		System.out.println("score value: "+score);
		
		
	}
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					medium_CA_2 frame = new medium_CA_2();
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
	public medium_CA_2() {
		
		System.out.println(q+" "+o);
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
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 640, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(18, 16, 616, 25);
		contentPane.add(lblNewLabel);
		lblNewLabel.setText(list_ques.get(q++));
		
		JLabel label = new JLabel("New label");
		label.setBounds(18, 91, 616, 25);
		contentPane.add(label);
		label.setText(list_ques.get(q++).trim());
		
		JLabel label_1 = new JLabel("New label");
		label_1.setBounds(18, 173, 616, 25);
		contentPane.add(label_1);
		label_1.setText(list_ques.get(q++).trim());
		
		JLabel label_2 = new JLabel("New label");
		label_2.setBounds(18, 260, 616, 25);
		contentPane.add(label_2);
		label_2.setText(list_ques.get(q++).trim());
		
		JLabel label_3 = new JLabel("New label");
		label_3.setBounds(18, 342, 616, 25);
		contentPane.add(label_3);
		label_3.setText(list_ques.get(q++).trim());
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("New radio button");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(6, 56, 141, 23);
		contentPane.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setText(list_ans.get(n++).trim());
		
		JRadioButton radioButton = new JRadioButton("New radio button");
		buttonGroup.add(radioButton);
		radioButton.setBounds(159, 56, 141, 23);
		contentPane.add(radioButton);
		radioButton.setText(list_ans.get(n++).trim());
		
		JRadioButton radioButton_1 = new JRadioButton("New radio button");
		buttonGroup.add(radioButton_1);
		radioButton_1.setBounds(312, 56, 141, 23);
		contentPane.add(radioButton_1);
		radioButton_1.setText(list_ans.get(n++).trim());
		
		JRadioButton radioButton_2 = new JRadioButton("New radio button");
		buttonGroup.add(radioButton_2);
		radioButton_2.setBounds(465, 56, 141, 23);
		contentPane.add(radioButton_2);
		radioButton_2.setText(list_ans.get(n++).trim());
		
		JRadioButton radioButton_3 = new JRadioButton("New radio button");
		buttonGroup_1.add(radioButton_3);
		radioButton_3.setBounds(18, 128, 141, 23);
		contentPane.add(radioButton_3);
		radioButton_3.setText(list_ans.get(n++).trim());
		
		JRadioButton radioButton_4 = new JRadioButton("New radio button");
		buttonGroup_1.add(radioButton_4);
		radioButton_4.setBounds(169, 128, 141, 23);
		contentPane.add(radioButton_4);
		radioButton_4.setText(list_ans.get(n++));
		
		JRadioButton radioButton_5 = new JRadioButton("New radio button");
		buttonGroup_1.add(radioButton_5);
		radioButton_5.setBounds(312, 128, 141, 23);
		contentPane.add(radioButton_5);
		radioButton_5.setText(list_ans.get(n++));
		
		JRadioButton radioButton_6 = new JRadioButton("New radio button");
		buttonGroup_1.add(radioButton_6);
		radioButton_6.setBounds(465, 128, 141, 23);
		contentPane.add(radioButton_6);
		radioButton_6.setText(list_ans.get(n++));
		
		JRadioButton radioButton_7 = new JRadioButton("New radio button");
		buttonGroup_2.add(radioButton_7);
		radioButton_7.setBounds(18, 221, 141, 23);
		contentPane.add(radioButton_7);
		radioButton_7.setText(list_ans.get(n++));
		
		JRadioButton radioButton_8 = new JRadioButton("New radio button");
		buttonGroup_2.add(radioButton_8);
		radioButton_8.setBounds(169, 221, 141, 23);
		contentPane.add(radioButton_8);
		radioButton_8.setText(list_ans.get(n++));
		
		JRadioButton radioButton_9 = new JRadioButton("New radio button");
		buttonGroup_2.add(radioButton_9);
		radioButton_9.setBounds(312, 225, 141, 23);
		contentPane.add(radioButton_9);
		radioButton_9.setText(list_ans.get(n++));
		
		JRadioButton radioButton_10 = new JRadioButton("New radio button");
		buttonGroup_2.add(radioButton_10);
		radioButton_10.setBounds(465, 225, 141, 23);
		contentPane.add(radioButton_10);
		radioButton_10.setText(list_ans.get(n++));
		
		JRadioButton radioButton_11 = new JRadioButton("New radio button");
		buttonGroup_3.add(radioButton_11);
		radioButton_11.setBounds(18, 307, 141, 23);
		contentPane.add(radioButton_11);
		radioButton_11.setText(list_ans.get(n++));
		
		JRadioButton radioButton_12 = new JRadioButton("New radio button");
		buttonGroup_3.add(radioButton_12);
		radioButton_12.setBounds(169, 307, 141, 23);
		contentPane.add(radioButton_12);
		radioButton_12.setText(list_ans.get(n++));
		
		JRadioButton radioButton_13 = new JRadioButton("New radio button");
		buttonGroup_3.add(radioButton_13);
		radioButton_13.setBounds(312, 307, 141, 23);
		contentPane.add(radioButton_13);
		radioButton_13.setText(list_ans.get(n++));
		
		JRadioButton radioButton_14 = new JRadioButton("New radio button");
		buttonGroup_3.add(radioButton_14);
		radioButton_14.setBounds(465, 307, 141, 23);
		contentPane.add(radioButton_14);
		radioButton_14.setText(list_ans.get(n++));
		
		JRadioButton radioButton_15 = new JRadioButton("New radio button");
		buttonGroup_4.add(radioButton_15);
		radioButton_15.setBounds(18, 379, 141, 23);
		contentPane.add(radioButton_15);
		radioButton_15.setText(list_ans.get(n++));
		
		JRadioButton radioButton_16 = new JRadioButton("New radio button");
		buttonGroup_4.add(radioButton_16);
		radioButton_16.setBounds(169, 379, 141, 23);
		contentPane.add(radioButton_16);
		radioButton_16.setText(list_ans.get(n++));
		
		JRadioButton radioButton_17 = new JRadioButton("New radio button");
		buttonGroup_4.add(radioButton_17);
		radioButton_17.setBounds(322, 379, 141, 23);
		contentPane.add(radioButton_17);
		radioButton_17.setText(list_ans.get(n++));
		
		JRadioButton radioButton_18 = new JRadioButton("New radio button");
		buttonGroup_4.add(radioButton_18);
		radioButton_18.setBounds(477, 379, 141, 23);
		contentPane.add(radioButton_18);
		radioButton_18.setText(list_ans.get(n++));
		
		JButton btnNewButton = new JButton("FINSIH");
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
          		System.out.println("Value sent out: "+ts);
          		FinalScore_easyCA obj = new FinalScore_easyCA(ts,la);
          		obj.setVisible(true);
          		FinalScore_easyCA bk = new FinalScore_easyCA();
          		bk.setVisible(true);
          		dispose();
			}
		});
		btnNewButton.setBounds(487, 414, 117, 29);
		contentPane.add(btnNewButton);
	}

}
