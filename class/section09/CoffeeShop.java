package section09;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.awt.event.ActionEvent;
import java.awt.Scrollbar;

public class CoffeeShop extends JFrame {

	
	private JPanel contentPane;
	private JTextField txt;
	private JTextField txtSales;
	JComboBox comboBox = new JComboBox();//Ŀ����������
	JRadioButton rdbtnRegular = new JRadioButton("Regular");
	JRadioButton rdbtnLarge = new JRadioButton("Large");
	JCheckBox chckbxTakeAway = new JCheckBox("Take Away");
	JCheckBox chckbxWhipCream = new JCheckBox("Whip Cream");
	JSpinner spinner = new JSpinner();
	JButton btnReport = new JButton("Report");
	JButton btnOrder = new JButton("Order");
	//�������� ��������+(��ü)�ν��Ͻ� ����
	//JButton btnOrder;  +  btnOrder=new Jbutton("Order");
	private Order order;//Order �ڹ� �ҷ������� ����??
	private int sales;
	
	private static CoffeeShop frame;
	public Report report; //public �ڹ��̸� ��ü�̸�
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new CoffeeShop();//Coffeeshop frame=new CoffeeShop();���� �̹������� �ٲٸ� frame�� global������ ��
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
	public CoffeeShop() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel menuPanel = new JPanel();
		menuPanel.setBackground(Color.GREEN);
		menuPanel.setBounds(24, 10, 386, 152);
		contentPane.add(menuPanel);
		menuPanel.setLayout(null);
		
		JLabel lblMenu = new JLabel("Menu");
		lblMenu.setBounds(12, 14, 52, 15);
		menuPanel.add(lblMenu);
		
		JLabel lblSize = new JLabel("Size");
		lblSize.setBounds(12, 35, 52, 15);
		menuPanel.add(lblSize);
	

		
		JLabel lblSOption = new JLabel("Option");
		lblSOption.setBounds(12, 70, 52, 15);
		menuPanel.add(lblSOption);
		
		JLabel lblQty = new JLabel("Qty");
		lblQty.setBounds(12, 102, 52, 15);
		menuPanel.add(lblQty);
		
		JLabel lblSales = new JLabel("Sales");
		lblSales.setHorizontalAlignment(SwingConstants.LEFT);
		lblSales.setBounds(12, 127, 52, 15);
		menuPanel.add(lblSales);
		
		
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "Americano", "Cappuchino"}));
		comboBox.setBounds(76, 6, 123, 23);
		menuPanel.add(comboBox);
		
		
		rdbtnRegular.setBounds(72, 35, 119, 23);
		menuPanel.add(rdbtnRegular);
		
		
		rdbtnLarge.setBounds(218, 35, 119, 23);
		menuPanel.add(rdbtnLarge);
		
		//Group the radio buttons.
	    ButtonGroup group = new ButtonGroup(); ///���� �ؿ� ������ rbtn �ߺ������� ����
	    group.add(rdbtnRegular); ///rbtn variable(����) �̸��� ��ȣ�� �̸��� ���ƾ���
	    group.add(rdbtnLarge);
		
		chckbxTakeAway.setBounds(72, 66, 111, 23);
		menuPanel.add(chckbxTakeAway);
		
		chckbxWhipCream.setBounds(218, 66, 111, 23);
		menuPanel.add(chckbxWhipCream);
		
		spinner.setModel(new SpinnerNumberModel(new Integer(0), null, null, new Integer(1)));
		spinner.setBounds(76, 99, 31, 22);
		menuPanel.add(spinner);
		
		txtSales = new JTextField();
		txtSales.setEditable(false);
		txtSales.setBounds(76, 124, 106, 21);
		menuPanel.add(txtSales);
		txtSales.setColumns(10);
		
		JPanel orderPanel = new JPanel();
		orderPanel.setBackground(Color.ORANGE);
		orderPanel.setBounds(24, 190, 386, 63);
		contentPane.add(orderPanel);
		orderPanel.setLayout(null);
		
		//JButton btnOrder = new JButton("Order");
		btnOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String name = comboBox.getSelectedItem().toString();
				char size;
				if (rdbtnRegular.isSelected()) //regular��ư ������ regular�ƴϸ� large
				 size = 'R';
				else 
				 size = 'L';

				boolean t, c;//boolean�� true false �� ��Ÿ��
				if (chckbxTakeAway.isSelected())
				  t = true;
				else
					
				  t = false;

				if (chckbxWhipCream.isSelected())
				  c = true;
				else 
				  c = false;
				int qty = (Integer) spinner.getValue(); //spinner�� class �� ���ؼ� ��ȣ �ȿ� int ��� Integer�� ��
				 
				//Make a new object
				order = new Order(name, size, t, c, qty);
				sales = order.getTotal();
				txtSales.setText(Integer.toString(sales));
			}
		});
		btnOrder.setBounds(12, 10, 95, 43);
		orderPanel.add(btnOrder);
		
		JButton btnReport = new JButton("Report");
		btnReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				report = new Report();
				try {
				frame.setVisible(false);
				report.send(order, frame);
				} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				}
				report.setVisible(true);
			}
		});
		
		//JButton btnReport = new JButton("Report");
		btnReport.setBounds(146, 10, 95, 43);
		orderPanel.add(btnReport);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(265, 10, 95, 43);
		orderPanel.add(btnExit);
	}
}
