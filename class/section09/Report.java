package section09;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;

public class Report extends JFrame {

	private JPanel contentPane;
	private JTextField txtOldSales;
	private JTextField txtNewSales;// ���� �ٲ� ���x

	private JTextField txtMenu;
	private JTextField txtSize;
	private JTextField txtTakeAway;
	private JTextField txtCream;
	private JTextField txtOption1;
	private JTextField txtOption2;
	private JTextField txtQty;
	private JTextField txtSales;

	private String[][] data;
	private int totalSales;
	private Order order;
	private Report report;
	private CoffeeShop cs;

	private JTable newTable;// private �����̸� variable�̸�;
	JScrollPane scrollPane = new JScrollPane();
	//�Ķ� �۾��� global�̰� ������ local�ε� label�� �Ű澵�� ���� �׿� ���� ������ �͵��� global �̾���� 
	//�װ� �ȵǸ� �� ������ private���� �����~=new~()���Ǹ� ������ ���� ���� �ؿ� global variable�� ��
	JButton btnReturn = new JButton("Return");

	/**
	 * Launch the application.
	 */
	/*
	 * �� �ؿ� �͵��� �� report �ڹٰ� �ٸ� ���� ���α׷����� ����ɰű� ������ �� �ڹ� ���Ͽ��� ���� �޼ҵ�� �ʿ����� ����
	 * ctrl+shift+/������ �̷��� ��ü�� �ּ�ǥ�õ� public static void main(String[] args) {
	 * EventQueue.invokeLater(new Runnable() { public void run() { try { Report
	 * frame = new Report(); frame.setVisible(true); } catch (Exception e) {
	 * e.printStackTrace(); } } }); }
	 */

	/**
	 * Create the frame.
	 */
	public Report() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 755, 422);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblTotalOldSales = new JLabel("Total Old Sales");  
		//����:Ŭ������ ��ü��or��ü��=new Ŭ������(����)
		lblTotalOldSales.setBounds(22, 45, 98, 15);
		contentPane.add(lblTotalOldSales);

		JLabel lblTotalNewSales = new JLabel("Total New Sales");
		lblTotalNewSales.setBounds(22, 312, 98, 15);
		contentPane.add(lblTotalNewSales);

		JLabel lblMenu = new JLabel("Menu"); // ��ȣ ���� text ��
		lblMenu.setBounds(12, 90, 52, 15);// ��ġ ũ�� ���
		contentPane.add(lblMenu);/// ��ȣ �� variable ��

		JLabel lblSize = new JLabel("Size");// ���⼭ text�ٲ㵵 �ݿ���
		lblSize.setBounds(12, 125, 52, 15);
		contentPane.add(lblSize);// variable ���� ���� variable ���ִ� ���� �� �ٲ���� ���� �ȶ�

		JLabel lblOption1 = new JLabel("OPtion1");
		lblOption1.setBounds(12, 160, 52, 15);
		contentPane.add(lblOption1);

		JLabel lblOption2 = new JLabel("OPtion2");
		lblOption2.setBounds(12, 198, 52, 15);
		contentPane.add(lblOption2);

		JLabel lblQty = new JLabel("Qty");
		lblQty.setBounds(12, 240, 52, 15);
		contentPane.add(lblQty);

		JLabel lblSales = new JLabel("Sales");
		lblSales.setBounds(12, 279, 52, 15);
		contentPane.add(lblSales);

		txtOldSales = new JTextField();
		txtOldSales.setEditable(false);
		txtOldSales.setBounds(131, 42, 106, 21);
		contentPane.add(txtOldSales);
		txtOldSales.setColumns(10);

		txtMenu = new JTextField();/// textfield variable�� design ���� ���� �ٲٱ�
		txtMenu.setEditable(false); // editable false �� ����â���� ���� text �Է�x
		txtMenu.setBounds(76, 87, 106, 21);
		contentPane.add(txtMenu);
		txtMenu.setColumns(10);

		txtSize = new JTextField();
		txtSize.setEditable(false);
		txtSize.setBounds(76, 122, 106, 21);
		contentPane.add(txtSize);
		txtSize.setColumns(10);

		txtOption1 = new JTextField();
		txtOption1.setEditable(false);
		txtOption1.setBounds(76, 157, 106, 21);
		contentPane.add(txtOption1);
		txtOption1.setColumns(10);

		txtOption2 = new JTextField();
		txtOption2.setEditable(false);
		txtOption2.setBounds(76, 195, 106, 21);
		contentPane.add(txtOption2);
		txtOption2.setColumns(10);

		txtQty = new JTextField();
		txtQty.setEditable(false);
		txtQty.setBounds(76, 234, 106, 21);
		contentPane.add(txtQty);
		txtQty.setColumns(10);

		txtSales = new JTextField();
		txtSales.setEditable(false);
		txtSales.setBounds(76, 276, 106, 21);
		contentPane.add(txtSales);
		txtSales.setColumns(10);

		txtNewSales = new JTextField();
		txtNewSales.setEditable(false);
		txtNewSales.setBounds(131, 306, 106, 21);
		contentPane.add(txtNewSales);
		txtNewSales.setColumns(10);

		// JScrollPane scrollPane = new JScrollPane(); ���� ������ local variable�̶� ������ �ű�
		scrollPane.setBounds(345, 26, 330, 180);// ����scrollPane�� ���п� �Ķ��۾���
		contentPane.add(scrollPane);

		newTable = new JTable();
		scrollPane.setColumnHeaderView(newTable);
		
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				report.setVisible(false);
				cs.setVisible(true);
			}
		});

		// JButton btnReturn = new JButton("Return");
		btnReturn.setBounds(120, 352, 95, 23);
		contentPane.add(btnReturn);
	}

	public void send(Order order, CoffeeShop cs) throws FileNotFoundException {
		this.order = order;
		this.cs = cs;
		this.report = cs.report;
		txtMenu.setText(order.getName());
		txtSize.setText(order.getSizeString());
		txtOption1.setText(Character.toString(order.getTake()));
		txtOption2.setText(Character.toString(order.getCream()));
		txtQty.setText(Integer.toString(order.getQty()));
		txtSales.setText(Integer.toString(order.getTotal()));
		saveToFile();
	}

	public void saveToFile() throws FileNotFoundException {
		Scanner input = new Scanner(new File("report.txt"));
		int i = 0;

		Order[] lastOrder = new Order[1000];

		while (input.hasNextLine()) {
			// menu name;
			String name = input.next();

			// size
			char size = input.next().charAt(0);

			char takeAway = input.next().charAt(0);
			boolean t;
			if (takeAway == 'T') // T is take away, D is dine-in
				t = true;
			else
				t = false;

			char cream = input.next().charAt(0);
			boolean c;
			if (cream == 'C') // C is with cream, N is without cream
				c = true;
			else
				c = false;

			int qty = Integer.parseInt(input.next());

			int sales = Integer.parseInt(input.next());
			totalSales += sales;

			lastOrder[i] = new Order(name, size, t, c, qty);
			//���� ��ȣ�� �̸��� �ٷ� ������ �����ѰŶ� ���⸸ �ϸ� �� (������ �� ������ ���°Ŵϱ�)
			///�̰� Order�� �ڹ� ���Ͽ��� ���ǵȴ�� ����ϴ� �Ű���
			//Order �ڹ����Ͽ��� Order(String,char,boolean,boolean, int)�� ���ǵ������� ���� ���� ���߾����
			i++;

		}
		txtOldSales.setText(Integer.toString(totalSales));
		totalSales += order.getTotal();
		txtNewSales.setText(Integer.toString(totalSales));
		PrintStream toFile = new PrintStream(new File("report.txt"));//updating the data
		//i+1�� ������ new data�� order ������ �Է� ���� ���ο ���� ĭ Ȯ���� ���ؼ�
		//5�� ������ �����Ͱ� 5���̴ϱ� name, size, t, c, qty
		data = new String[i + 1][5];///create an array with size i+1 and the column size = 5
		i = 0;

		while (i < data.length - 1) {
			System.out.println("i :" + i);
			String all = lastOrder[i].getName() + " " + Character.toString(lastOrder[i].getSize()) + " "
					+ Character.toString(lastOrder[i].getTake()) + " " + Character.toString(lastOrder[i].getCream())
					+ " " + lastOrder[i].getQty() + " " + lastOrder[i].getTotal();

			toFile.println(all);///report.txt�� all�� �ִ� ���� ��� ���
			
			//�� ���� �� report���� ������ �ڽ��� ����ϴ� ���� 
			data[i][0] = Integer.toString(i);
			data[i][1] = lastOrder[i].getName();
			data[i][2] = Integer.toString(lastOrder[i].getQty());
			data[i][3] = Integer.toString(lastOrder[i].getTotal());

			i++;

		}

		// additional data
		///order ��ư ������ �Է¹��� ���ο� �����͵�
		////order���� �������� �����̹Ƿ� [i]
		String newdata = order.getName() + " " + Character.toString(order.getSize()) + " "
				+ Character.toString(order.getTake()) + " " + Character.toString(order.getCream()) + " "
				+ order.getQty() + " " + order.getTotal();

		toFile.print(newdata);
		//���⼭ i ���� ���� data���� �����ϰ� i++�ް� while�� �������� i ����
		data[i][0] = Integer.toString(i);
		data[i][1] = order.getName();
		data[i][2] = Integer.toString(order.getQty());
		data[i][3] = Integer.toString(order.getTotal());

		String[] columnNames = { "Sales No", "Menu", "Qty", "Sales" };///report ������ ǥ�� ���� ����
		newTable = new JTable(data, columnNames);
		newTable.setBounds(350, 30, 100, 90);
		newTable.setAutoCreateRowSorter(true);
		scrollPane.getViewport().setView(newTable);
		contentPane.add(scrollPane);

	}
}
