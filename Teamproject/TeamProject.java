package Teamproject;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JSpinner;
import java.awt.FlowLayout;
//import com.jgoodies.forms.layout.FormLayout;
//import com.jgoodies.forms.layout.ColumnSpec;
//import com.jgoodies.forms.layout.FormSpecs;
//import com.jgoodies.forms.layout.RowSpec;
//import javax.swing.SpringLayout;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.ImageIcon;


public class TeamProject extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
    private Order order;
    private static TeamProject frame;
    public Report report;
    private int sales;
    JButton btnNewButton = new JButton("Order");
    JButton btnNewButton_1 = new JButton("Report");
    JButton btnNewButton_2 = new JButton("Exit");
    JLabel lblStockTA;
	JLabel lblStockTC;
	JLabel lblStockGM;
    JLabel lblStockKF94;
    JLabel lblStockKF80;
    
    public int[] stock = {120, 140, 160, 150, 110}; //general mask, kf94, kf80
	/**
	 * Launch the application.
	 */
    
    
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new TeamProject();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	JSpinner spinnerGeneralMask = new JSpinner();
    JSpinner spinnerKF90 = new JSpinner();
    JSpinner spinnerKF80 = new JSpinner();
    JCheckBox chckbxChildren = new JCheckBox("Children");
    JCheckBox chckbxAdult = new JCheckBox("Adult");
    JComboBox comboBox = new JComboBox();
	JComboBox comboBox_1 = new JComboBox();
	JComboBox comboBox_2 = new JComboBox();
	JRadioButton rdbtnDelivery = new JRadioButton("Delivery");
	JRadioButton rdbtnPickUp = new JRadioButton("Pick Up");
    
	/**
	 * Create the frame.
	 */
	public TeamProject() {
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(90, 90, 959, 704);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("Button.highlight"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel orderPanel = new JPanel();
		orderPanel.setBounds(637, 21, 299, 313);
		orderPanel.setBackground(SystemColor.inactiveCaption);
		contentPane.add(orderPanel);
		orderPanel.setLayout(null);
		
		String sa = Integer.toString(stock[0]);
		String sc = Integer.toString(stock[1]);
		String sgm = Integer.toString(stock[2]);
		String skf94 = Integer.toString(stock[3]);
		String skf80 = Integer.toString(stock[4]);
		
		
		//JButton btnNewButton = new JButton("Order");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String freegift = comboBox.getSelectedItem().toString();
				String CommentsforDeliveryman = comboBox_2.getSelectedItem().toString();
				String Payment = comboBox_1.getSelectedItem().toString();
				char Delivery;
				if (rdbtnDelivery.isSelected())
				Delivery  = 'D';
				else 
				Delivery = 'P';

				boolean A;
				if (chckbxAdult.isSelected())
				  A = true;
				else
				  A = false;
				boolean C;
				if(chckbxChildren.isSelected())
					C = true;
				else 
					C = false;

				
				int GeneralMask = (Integer) spinnerGeneralMask.getValue();
				int KF94 = (Integer)spinnerKF90.getValue();
				int KF80 =(Integer)spinnerKF80.getValue();
				//Make a new object
				order = new Order(A,C,GeneralMask, KF94, KF80, Delivery, Payment,freegift,CommentsforDeliveryman);
				sales = order.getTotal();
				textField.setText(Integer.toString(sales));
				
				if(A) {
					int updatestocka=stock[0]-1;
					stock[0]=stock[0]-1;
					lblStockTA.setText(Integer.toString(updatestocka));
				}
				if(C) {
					int updatestockc=stock[1]-1;
					stock[1]=stock[1]-1;
					lblStockTC.setText(Integer.toString(updatestockc));
				}
				
				
				int updatestockgm = stock[2] - GeneralMask;
				stock[2] = stock[2] - GeneralMask;
				lblStockGM.setText(Integer.toString(updatestockgm));
				
				int updatestockkf94 = stock[3] - KF94;
				stock[3] = stock[3] - KF94;
				lblStockKF94.setText(Integer.toString(updatestockkf94));
				
				int updatestockkf80 = stock[4] - KF80;
				stock[4] = stock[4] - KF80;
				lblStockKF80.setText(Integer.toString(updatestockkf80));
				
			}
		});
		btnNewButton.setBackground(UIManager.getColor("Button.darkShadow"));
		btnNewButton.setFont(new Font("FZYaoTi", Font.PLAIN, 20));
		btnNewButton.setBounds(96, 34, 97, 53);
		orderPanel.add(btnNewButton);
		
		//JButton btnNewButton_1 = new JButton("Report");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				report = new Report();
				try{
					frame.setVisible(false);
					report.send(order,frame);
				}catch (FileNotFoundException e1) {
					e1.printStackTrace();
				}
				report.setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("FZYaoTi", Font.PLAIN, 20));
		btnNewButton_1.setBackground(UIManager.getColor("Button.shadow"));
		btnNewButton_1.setBounds(96, 119, 97, 53);
		orderPanel.add(btnNewButton_1);
		
		//JButton btnNewButton_2 = new JButton("Exit");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);

			}
		});
		btnNewButton_2.setFont(new Font("FZYaoTi", Font.PLAIN, 20));
		btnNewButton_2.setBackground(UIManager.getColor("Button.shadow"));
		btnNewButton_2.setBounds(96, 207, 97, 53);
		orderPanel.add(btnNewButton_2);
		
		JPanel menuPanel = new JPanel();
		menuPanel.setBounds(26, 21, 599, 438);
		menuPanel.setBackground(SystemColor.inactiveCaption);
		contentPane.add(menuPanel);
		menuPanel.setLayout(null);
		
		JLabel lblMenu = new JLabel("Menu");
		lblMenu.setFont(new Font("Verdana", Font.PLAIN, 20));
		lblMenu.setBounds(41, 48, 106, 29);
		menuPanel.add(lblMenu);
		
		JPanel panel = new JPanel();
		panel.setBounds(27, 33, 279, 364);
		menuPanel.add(panel);
		panel.setLayout(null);
		
		//Group the radio buttons.
	    ButtonGroup group = new ButtonGroup();

		
		
		rdbtnDelivery.setBounds(18, 255, 121, 23);
		panel.add(rdbtnDelivery);
		rdbtnDelivery.setFont(new Font("FZShuTi", Font.PLAIN, 12));
		group.add(rdbtnDelivery);
		
		rdbtnPickUp.setBounds(18, 292, 121, 23);
		panel.add(rdbtnPickUp);
		rdbtnPickUp.setFont(new Font("FZShuTi", Font.PLAIN, 12));
		group.add(rdbtnPickUp);
		
		
		JLabel lblTylenol = new JLabel("Tylenol");
		lblTylenol.setFont(new Font("FZYaoTi", Font.PLAIN, 14));
		lblTylenol.setBounds(18, 62, 57, 15);
		panel.add(lblTylenol);
		
		JLabel lblMask = new JLabel("Mask");
		lblMask.setFont(new Font("FZYaoTi", Font.PLAIN, 14));
		lblMask.setBounds(18, 126, 57, 15);
		panel.add(lblMask);
		
		
		spinnerGeneralMask.setBounds(113, 134, 57, 36);
		panel.add(spinnerGeneralMask);
		
		
		spinnerKF90.setBounds(98, 172, 40, 36);
		panel.add(spinnerKF90);
		
		
		spinnerKF80.setBounds(219, 174, 41, 34);
		panel.add(spinnerKF80);
		
		JLabel lblGeneralMask = new JLabel("General Mask");
		lblGeneralMask.setFont(new Font("FZShuTi", Font.PLAIN, 12));
		lblGeneralMask.setBounds(18, 151, 110, 15);
		panel.add(lblGeneralMask);
		
		JLabel lblKF94 = new JLabel("KF 94");
		lblKF94.setFont(new Font("FZShuTi", Font.PLAIN, 12));
		lblKF94.setBounds(18, 176, 57, 15);
		panel.add(lblKF94);
		
		JLabel lblKF80 = new JLabel("KF 80");
		lblKF80.setFont(new Font("FZShuTi", Font.PLAIN, 12));
		lblKF80.setBounds(150, 176, 57, 15);
		panel.add(lblKF80);
		
		
		chckbxChildren.setFont(new Font("FZShuTi", Font.PLAIN, 12));
		chckbxChildren.setBounds(145, 83, 115, 23);
		panel.add(chckbxChildren);
		
		
		chckbxAdult.setFont(new Font("FZShuTi", Font.PLAIN, 12));
		chckbxAdult.setBounds(18, 82, 115, 23);
		panel.add(chckbxAdult);
		
		JLabel lblDelivery = new JLabel("Delivery");
		lblDelivery.setBounds(18, 222, 57, 15);
		panel.add(lblDelivery);
		lblDelivery.setFont(new Font("FZYaoTi", Font.PLAIN, 14));
		

		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(341, 33, 212, 262);
		menuPanel.add(panel_1);
		panel_1.setLayout(null);
		
		
		
		JLabel lblfreegift = new JLabel("free gift");
		lblfreegift.setFont(new Font("FZYaoTi", Font.PLAIN, 14));
		lblfreegift.setBounds(25, 30, 131, 15);
		panel_1.add(lblfreegift);
		
		
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "Vita500", "Tenten"}));
		comboBox.setFont(new Font("FZShuTi", Font.PLAIN, 12));
		comboBox.setBounds(25, 66, 153, 23);
		panel_1.add(comboBox);
		
		JLabel lblPayment = new JLabel("Payment");
		lblPayment.setFont(new Font("FZShuTi", Font.PLAIN, 14));
		lblPayment.setBounds(25, 175, 104, 15);
		panel_1.add(lblPayment);
		
		comboBox_1.setFont(new Font("FZShuTi", Font.PLAIN, 12));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"", "Cash", "Card"}));
		comboBox_1.setBounds(25, 200, 153, 23);
		panel_1.add(comboBox_1);
		
		JLabel lblComments02 = new JLabel("Comments for deliveryman");
		lblComments02.setFont(new Font("FZYaoTi", Font.PLAIN, 14));
		lblComments02.setBounds(25, 104, 153, 15);
		panel_1.add(lblComments02);
		
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"", "Please drive safely", "Please put it in front of the door and press the bell", "Don't press the bell, knock please", "Please call me when you arrive"}));
		comboBox_2.setFont(new Font("FZShuTi", Font.PLAIN, 12));
		comboBox_2.setBounds(25, 129, 153, 23);
		panel_1.add(comboBox_2);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("FZYaoTi", Font.PLAIN, 14));
		lblTotal.setBounds(351, 309, 57, 68);
		menuPanel.add(lblTotal);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(401, 335, 132, 21);
		menuPanel.add(textField);
		textField.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(26, 480, 601, 164);
		panel_2.setBackground(SystemColor.activeCaption);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Price");
		lblNewLabel.setBounds(256, 0, 95, 61);
		panel_2.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 23));
		
		JLabel lblNewLabel_1 = new JLabel("Tylenol_A ");
		lblNewLabel_1.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(75, 52, 85, 40);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Tylenol_C");
		lblNewLabel_2.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 17));
		lblNewLabel_2.setBounds(185, 50, 85, 44);
		panel_2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("GeneralMask");
		lblNewLabel_3.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 17));
		lblNewLabel_3.setBounds(303, 55, 113, 34);
		panel_2.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("KF94");
		lblNewLabel_4.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 17));
		lblNewLabel_4.setBounds(428, 60, 60, 25);
		panel_2.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("KF80");
		lblNewLabel_5.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 17));
		lblNewLabel_5.setBounds(527, 65, 50, 15);
		panel_2.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("3500");
		lblNewLabel_6.setFont(new Font("»ﬁ∏’µ’±Ÿ«ÏµÂ∂Û¿Œ", Font.PLAIN, 17));
		lblNewLabel_6.setForeground(SystemColor.text);
		lblNewLabel_6.setBounds(85, 102, 60, 25);
		panel_2.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("2500");
		lblNewLabel_7.setFont(new Font("»ﬁ∏’µ’±Ÿ«ÏµÂ∂Û¿Œ", Font.PLAIN, 17));
		lblNewLabel_7.setForeground(SystemColor.text);
		lblNewLabel_7.setBounds(195, 105, 60, 19);
		panel_2.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("1500");
		lblNewLabel_8.setFont(new Font("»ﬁ∏’µ’±Ÿ«ÏµÂ∂Û¿Œ", Font.PLAIN, 17));
		lblNewLabel_8.setForeground(SystemColor.text);
		lblNewLabel_8.setBounds(325, 104, 75, 20);
		panel_2.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("2000");
		lblNewLabel_9.setFont(new Font("»ﬁ∏’µ’±Ÿ«ÏµÂ∂Û¿Œ", Font.PLAIN, 17));
		lblNewLabel_9.setForeground(SystemColor.text);
		lblNewLabel_9.setBounds(428, 100, 60, 28);
		panel_2.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("1800");
		lblNewLabel_10.setFont(new Font("»ﬁ∏’µ’±Ÿ«ÏµÂ∂Û¿Œ", Font.PLAIN, 17));
		lblNewLabel_10.setForeground(SystemColor.text);
		lblNewLabel_10.setBounds(517, 100, 60, 28);
		panel_2.add(lblNewLabel_10);
		
		JLabel lblStock = new JLabel("Stock");
		lblStock.setBounds(12, 139, 57, 15);
		panel_2.add(lblStock);
		lblStockKF94 = new JLabel("150");
		lblStockKF94.setBounds(431, 139, 57, 15);
		panel_2.add(lblStockKF94);
		
		lblStockTA = new JLabel("150");
		lblStockTA.setBounds(88, 137, 57, 15);
		panel_2.add(lblStockTA);
		
		lblStockTC = new JLabel("150");
		lblStockTC.setBounds(185, 134, 57, 15);
		panel_2.add(lblStockTC);
		
		lblStockGM = new JLabel("150");
		lblStockGM.setBounds(325, 137, 57, 15);
		panel_2.add(lblStockGM);
		
		lblStockKF80 = new JLabel("150");
		lblStockKF80.setBounds(520, 139, 57, 15);
		panel_2.add(lblStockKF80);
		
		JLabel lblNewLabel_11 = new JLabel("New label");
		lblNewLabel_11.setIcon(new ImageIcon("C:\\Users\\\uB808\uB178\uBC84NT\\Desktop\\KakaoTalk_20210609_020726042.png"));
		lblNewLabel_11.setBounds(646, 357, 290, 287);
		contentPane.add(lblNewLabel_11);
		
		
	}
}