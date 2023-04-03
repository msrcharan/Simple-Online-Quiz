import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.awt.event.ActionEvent;

public class easystartII extends JFrame {

	private JPanel contentPane;
	int scor,y;
	public static int x;
	public static int o;
	public static int q;
	public static int n;
	String select ="";
	String la ="";
	List<String> list_ques = new ArrayList<String>();
	List<String> list_correctans = new ArrayList<String>();
	List<String> list_ans = new ArrayList<String>();
	
	public JLabel lblNewLabel;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();
	private final ButtonGroup buttonGroup_3 = new ButtonGroup();
	private final ButtonGroup buttonGroup_4 = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	
	public easystartII(int score,int n,int o,int q) {
		this.x = score;
		this.o = o;
		this.n = n;
		this.q = q;
		System.out.println("Second"+x+"n"+n+"o"+o+"q"+q);
		
	}
	
	public static void main(String[] args) {
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					easystartII frame = new easystartII();
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
	public easystartII() {
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
		                scor = list_ans.size();
		                
		         
		            }
		              System.out.println("options"+scor);
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
		                y = list_correctans.size();
		                
		         
		            }
		              System.out.println("actual"+y);
		              br2.close();
		              
		        } catch (FileNotFoundException e) {
		            System.out.println("File not found");
		        } catch (IOException e) {
		            System.out.println("Unable to read the file.");
		        }
		
		JLabel lblNewLabel = new JLabel("L");
		lblNewLabel.setBounds(39, 33, 567, 31);
		contentPane.add(lblNewLabel);
		lblNewLabel.setText(list_ques.get(q++));
		System.out.println(""+x);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("New radio button");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(39, 76, 141, 23);
		contentPane.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setText(list_ans.get(n++));
		
		JRadioButton radioButton = new JRadioButton("New radio button");
		buttonGroup.add(radioButton);
		radioButton.setBounds(180, 76, 141, 23);
		contentPane.add(radioButton);
		radioButton.setText(list_ans.get(n++));
		
		JRadioButton radioButton_1 = new JRadioButton("New radio button");
		buttonGroup.add(radioButton_1);
		radioButton_1.setBounds(333, 76, 141, 23);
		contentPane.add(radioButton_1);
		radioButton_1.setText(list_ans.get(n++));
		
		JRadioButton radioButton_2 = new JRadioButton("New radio button");
		buttonGroup.add(radioButton_2);
		radioButton_2.setBounds(486, 76, 141, 23);
		contentPane.add(radioButton_2);
		radioButton_2.setText(list_ans.get(n++));
		
		JLabel label = new JLabel("");
		label.setBounds(39, 111, 567, 31);
		contentPane.add(label);
		label.setText(list_ques.get(q++));
		
		JRadioButton radioButton_3 = new JRadioButton("New radio button");
		buttonGroup_1.add(radioButton_3);
		radioButton_3.setBounds(39, 142, 141, 23);
		contentPane.add(radioButton_3);
		radioButton_3.setText(list_ans.get(n++));
		
		JRadioButton radioButton_4 = new JRadioButton("New radio button");
		buttonGroup_1.add(radioButton_4);
		radioButton_4.setBounds(184, 142, 141, 23);
		contentPane.add(radioButton_4);
		radioButton_4.setText(list_ans.get(n++));
		
		JRadioButton radioButton_5 = new JRadioButton("New radio button");
		buttonGroup_1.add(radioButton_5);
		radioButton_5.setBounds(333, 142, 141, 23);
		contentPane.add(radioButton_5);
		radioButton_5.setText(list_ans.get(n++));
		
		JRadioButton radioButton_6 = new JRadioButton("New radio button");
		buttonGroup_1.add(radioButton_6);
		radioButton_6.setBounds(486, 142, 141, 23);
		contentPane.add(radioButton_6);
		radioButton_6.setText(list_ans.get(n++));
		
		JLabel lblL = new JLabel("L");
		lblL.setBounds(39, 184, 567, 31);
		contentPane.add(lblL);
		lblL.setText(list_ques.get(q++));
		
		JRadioButton radioButton_7 = new JRadioButton("New radio button");
		buttonGroup_2.add(radioButton_7);
		radioButton_7.setBounds(39, 223, 141, 23);
		contentPane.add(radioButton_7);
		radioButton_7.setText(list_ans.get(n++));
		
		JRadioButton radioButton_8 = new JRadioButton("New radio button");
		buttonGroup_2.add(radioButton_8);
		radioButton_8.setBounds(184, 223, 141, 23);
		contentPane.add(radioButton_8);
		radioButton_8.setText(list_ans.get(n++));
		
		JRadioButton radioButton_9 = new JRadioButton("New radio button");
		buttonGroup_2.add(radioButton_9);
		radioButton_9.setBounds(333, 223, 141, 23);
		contentPane.add(radioButton_9);
		radioButton_9.setText(list_ans.get(n++));
		
		JRadioButton radioButton_10 = new JRadioButton("New radio button");
		buttonGroup_2.add(radioButton_10);
		radioButton_10.setBounds(486, 223, 141, 23);
		contentPane.add(radioButton_10);
		radioButton_10.setText(list_ans.get(n++));
		
		JLabel label_1 = new JLabel("L");
		label_1.setBounds(39, 268, 567, 31);
		contentPane.add(label_1);
		label_1.setText(list_ques.get(q++));
		
		JRadioButton radioButton_11 = new JRadioButton("New radio button");
		buttonGroup_3.add(radioButton_11);
		radioButton_11.setBounds(39, 311, 141, 23);
		contentPane.add(radioButton_11);
		radioButton_11.setText(list_ans.get(n++));
		
		JRadioButton radioButton_12 = new JRadioButton("New radio button");
		buttonGroup_3.add(radioButton_12);
		radioButton_12.setBounds(184, 311, 141, 23);
		contentPane.add(radioButton_12);
		radioButton_12.setText(list_ans.get(n++));
		
		JRadioButton radioButton_13 = new JRadioButton("New radio button");
		buttonGroup_3.add(radioButton_13);
		radioButton_13.setBounds(337, 311, 141, 23);
		contentPane.add(radioButton_13);
		radioButton_13.setText(list_ans.get(n++));
		
		
		JRadioButton radioButton_14 = new JRadioButton("New radio button");
		buttonGroup_3.add(radioButton_14);
		radioButton_14.setBounds(486, 311, 141, 23);
		contentPane.add(radioButton_14);
		radioButton_14.setText(list_ans.get(n++));
		
		JLabel label_2 = new JLabel("L");
		label_2.setBounds(39, 347, 567, 31);
		contentPane.add(label_2);
		label_2.setText(list_ques.get(q++));
		
		JRadioButton radioButton_15 = new JRadioButton("New radio button");
		buttonGroup_4.add(radioButton_15);
		radioButton_15.setBounds(39, 390, 141, 23);
		contentPane.add(radioButton_15);
		radioButton_15.setText(list_ans.get(n++));
		
		JRadioButton radioButton_16 = new JRadioButton("New radio button");
		buttonGroup_4.add(radioButton_16);
		radioButton_16.setBounds(184, 390, 141, 23);
		contentPane.add(radioButton_16);
		radioButton_16.setText(list_ans.get(n++));
		
		JRadioButton radioButton_17 = new JRadioButton("New radio button");
		buttonGroup_4.add(radioButton_17);
		radioButton_17.setBounds(337, 390, 141, 23);
		contentPane.add(radioButton_17);
		radioButton_17.setText(list_ans.get(n++));
		
		JRadioButton radioButton_18 = new JRadioButton("New radio button");
		buttonGroup_4.add(radioButton_18);
		radioButton_18.setBounds(493, 390, 141, 23);
		contentPane.add(radioButton_18);
		radioButton_18.setText(list_ans.get(n++));
		
		JButton btnNewButton = new JButton("FINISH");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String select1="";
          		String select2="";
          		String select3="";
          		String select4="";
          		for (Enumeration<AbstractButton> buttons = buttonGroup.getElements();
          				buttons.hasMoreElements();) {
                    AbstractButton button = buttons.nextElement();
                    if (button.isSelected()) {
                    	select = button.getText().toString().trim();
                    }
                }
          		if(select.equalsIgnoreCase(list_correctans.get(o++))) {
            	x++;
            	              		
          		}
          		for (Enumeration<AbstractButton> buttons = buttonGroup_1.getElements();
          				buttons.hasMoreElements();) {
                    AbstractButton button = buttons.nextElement();
                    if (button.isSelected()) {
                    	select = button.getText().toString().trim();
                    }
                }
          		if(select.equalsIgnoreCase(list_correctans.get(o++))) {
                	x++;
                	             		
              		}
          		for (Enumeration<AbstractButton> buttons = buttonGroup_2.getElements();
          				buttons.hasMoreElements();) {
                    AbstractButton button = buttons.nextElement();
                    if (button.isSelected()) {
                    	select = button.getText().toString().trim();
                    }
                }
          		if(select.equalsIgnoreCase(list_correctans.get(o++))) {
                	x++;
                	              		
              		}
          		for (Enumeration<AbstractButton> buttons = buttonGroup_3.getElements();
          				buttons.hasMoreElements();) {
                    AbstractButton button = buttons.nextElement();
                    if (button.isSelected()) {
                    	select = button.getText().toString().trim();
                    }
                }
          		if(select.equalsIgnoreCase(list_correctans.get(o++))) {
                	x++;
                	              		
              		}
          		for (Enumeration<AbstractButton> buttons = buttonGroup_4.getElements();
          				buttons.hasMoreElements();) {
                    AbstractButton button = buttons.nextElement();
                    if (button.isSelected()) {
                    	select = button.getText().toString().trim();
                    }
                }
          		if(select.equalsIgnoreCase(list_correctans.get(o++))) {
                	x++;
                	              		
              		}
          		System.out.println(""+x);
          		FinalScore_easyCA eln = new FinalScore_easyCA(x,la);
          		eln.setVisible(true);
          		FinalScore_easyCA obj = new FinalScore_easyCA();
          		obj.setVisible(true);
				
			}
		});
		btnNewButton.setBounds(517, 425, 117, 29);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("<--");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				easystart d = new easystart();
				d.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(6, 0, 117, 29);
		contentPane.add(btnNewButton_1);
		
		
	}
}
