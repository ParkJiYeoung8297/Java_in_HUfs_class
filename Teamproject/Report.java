package Teamproject;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Teamproject.Order;
import Teamproject.Report;

import java.awt.GridLayout;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.ScrollPaneConstants;
import javax.swing.UIManager;

public class Report extends JFrame {

	private JPanel contentPane;
	private JTextField txtOldSales;
	private JTextField txtNewSales;
	private JTextField txtSales;
	
	private String[][] data;
	private int totalSales;
	private Order order;
	private Report report;
	private TeamProject tp;
	
	private JTable newTable;
	private JTextField txtDelivery;
	private JTextField txtGm;
	private JTextField txtKF94;
	private JTextField txtKF80;
	private JTextField txtCd;
	private JTextField txtAd;
	private JTextField txtfreegift;
	private JTextField txtComments2;
	private JTextField txtPayment;
	JButton btnReturn = new JButton("Return");
	JScrollPane scrollPane = new JScrollPane();
	//private String[][] data;
	

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Report frame = new Report();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public Report() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 700, 494);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTotalOldSales = new JLabel("Total old Sales");
		lblTotalOldSales.setFont(new Font("FZYaoTi", Font.PLAIN, 14));
		lblTotalOldSales.setBounds(272, 24, 104, 16);
		contentPane.add(lblTotalOldSales);
		
		JLabel lblTotalNewSales = new JLabel("Total new Sales");
		lblTotalNewSales.setFont(new Font("FZYaoTi", Font.PLAIN, 14));
		lblTotalNewSales.setBounds(271, 50, 115, 16);
		contentPane.add(lblTotalNewSales);
		
		//JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(298, 86, 356, 267);
		contentPane.add(scrollPane);
		
		newTable = new JTable();
		scrollPane.setColumnHeaderView(newTable);
		
		txtOldSales = new JTextField();
		txtOldSales.setBackground(SystemColor.text);
		txtOldSales.setEditable(false);
		txtOldSales.setBounds(372, 20, 271, 26);
		contentPane.add(txtOldSales);
		txtOldSales.setColumns(10);
		
		txtNewSales = new JTextField();
		txtNewSales.setBackground(SystemColor.text);
		txtNewSales.setEditable(false);
		txtNewSales.setBounds(372, 50, 271, 26);
		contentPane.add(txtNewSales);
		txtNewSales.setColumns(10);
		
		JLabel lblMaskSort = new JLabel("DrugStore");
		lblMaskSort.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 22));
		lblMaskSort.setBounds(17, 10, 195, 36);
		contentPane.add(lblMaskSort);
		
		JLabel lblDelivery = new JLabel("Delivery");
		lblDelivery.setFont(new Font("FZShuTi", Font.PLAIN, 14));
		lblDelivery.setBounds(12, 259, 61, 16);
		contentPane.add(lblDelivery);
		
		JLabel lblfreegift = new JLabel("free gift");
		lblfreegift.setFont(new Font("FZShuTi", Font.PLAIN, 14));
		lblfreegift.setBounds(12, 384, 84, 16);
		contentPane.add(lblfreegift);
		
		JLabel lblSales = new JLabel("Sales");
		lblSales.setFont(new Font("FZShuTi", Font.PLAIN, 14));
		lblSales.setBounds(12, 295, 61, 16);
		contentPane.add(lblSales);
		
		txtSales = new JTextField();
		txtSales.setBackground(SystemColor.text);
		txtSales.setEditable(false);
		txtSales.setBounds(113, 291, 158, 26);
		contentPane.add(txtSales);
		txtSales.setColumns(10);
		btnReturn.setForeground(Color.DARK_GRAY);
		btnReturn.setBackground(UIManager.getColor("Button.disabledForeground"));
		btnReturn.setFont(new Font("HY헤드라인M", Font.PLAIN, 20));
		
		//JButton btnReturn = new JButton("Return");
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				report.setVisible(false);
				tp.setVisible(true);
			}
		});
		btnReturn.setBounds(447, 384, 207, 50);
		contentPane.add(btnReturn);
		
		JLabel lblGm = new JLabel("General Mask");
		lblGm.setFont(new Font("FZShuTi", Font.PLAIN, 14));
		lblGm.setBounds(12, 145, 95, 16);
		contentPane.add(lblGm);
		
		JLabel lblKF94 = new JLabel("KF94");
		lblKF94.setFont(new Font("FZShuTi", Font.PLAIN, 14));
		lblKF94.setBounds(12, 178, 61, 16);
		contentPane.add(lblKF94);
		
		JLabel lblKF80 = new JLabel("KF80");
		lblKF80.setFont(new Font("FZShuTi", Font.PLAIN, 14));
		lblKF80.setBounds(12, 204, 34, 16);
		contentPane.add(lblKF80);
		
		JLabel lblAd = new JLabel("Tylenol Adult");
		lblAd.setFont(new Font("FZShuTi", Font.PLAIN, 14));
		lblAd.setBounds(12, 81, 115, 16);
		contentPane.add(lblAd);
		
		JLabel lblCd = new JLabel("Tylenol Children");
		lblCd.setFont(new Font("FZShuTi", Font.PLAIN, 14));
		lblCd.setBounds(12, 109, 129, 16);
		contentPane.add(lblCd);
		
		JLabel lblComments2 = new JLabel("Comments2");
		lblComments2.setFont(new Font("FZShuTi", Font.PLAIN, 14));
		lblComments2.setBounds(12, 418, 84, 16);
		contentPane.add(lblComments2);
		
		txtDelivery = new JTextField();
		txtDelivery.setBackground(SystemColor.text);
		txtDelivery.setEditable(false);
		txtDelivery.setBounds(113, 255, 158, 26);
		contentPane.add(txtDelivery);
		txtDelivery.setColumns(10);
		
		txtGm = new JTextField();
		txtGm.setBackground(SystemColor.textHighlightText);
		txtGm.setEditable(false);
		txtGm.setBounds(178, 141, 34, 26);
		contentPane.add(txtGm);
		txtGm.setColumns(10);
		
		txtKF94 = new JTextField();
		txtKF94.setBackground(SystemColor.text);
		txtKF94.setEditable(false);
		txtKF94.setBounds(178, 174, 34, 26);
		contentPane.add(txtKF94);
		txtKF94.setColumns(10);
		
		txtKF80 = new JTextField();
		txtKF80.setBackground(SystemColor.text);
		txtKF80.setEditable(false);
		txtKF80.setBounds(178, 211, 34, 26);
		contentPane.add(txtKF80);
		txtKF80.setColumns(10);
		
		txtCd = new JTextField();
		txtCd.setBackground(SystemColor.text);
		txtCd.setEditable(false);
		txtCd.setColumns(10);
		txtCd.setBounds(178, 109, 34, 26);
		contentPane.add(txtCd);
		
		txtAd = new JTextField();
		txtAd.setBackground(SystemColor.text);
		txtAd.setEditable(false);
		txtAd.setColumns(10);
		txtAd.setBounds(178, 77, 34, 26);
		contentPane.add(txtAd);
		
		txtfreegift = new JTextField();
		txtfreegift.setBackground(SystemColor.text);
		txtfreegift.setEditable(false);
		txtfreegift.setBounds(113, 380, 292, 26);
		contentPane.add(txtfreegift);
		txtfreegift.setColumns(10);
		
		txtComments2 = new JTextField();
		txtComments2.setBackground(SystemColor.text);
		txtComments2.setEditable(false);
		txtComments2.setColumns(10);
		txtComments2.setBounds(112, 414, 293, 26);
		contentPane.add(txtComments2);
		
		JLabel lblPayment = new JLabel("Payment");
		lblPayment.setFont(new Font("FZShuTi", Font.PLAIN, 14));
		lblPayment.setBounds(12, 346, 84, 16);
		contentPane.add(lblPayment);
		
		txtPayment = new JTextField();
		txtPayment.setBackground(SystemColor.text);
		txtPayment.setEditable(false);
		txtPayment.setBounds(113, 344, 158, 26);
		contentPane.add(txtPayment);
		txtPayment.setColumns(10);
		
		JLabel lblProduct = new JLabel("Product");
		lblProduct.setFont(new Font("FZYaoTi", Font.PLAIN, 15));
		lblProduct.setBounds(23, 56, 57, 15);
		contentPane.add(lblProduct);
		
		JLabel lblAmount = new JLabel("Amount");
		lblAmount.setFont(new Font("FZYaoTi", Font.PLAIN, 15));
		lblAmount.setBounds(168, 48, 57, 30);
		contentPane.add(lblAmount);
	}
	public void send(Order order, TeamProject tp) throws FileNotFoundException
	   {

	   this.order = order;
	   this.tp = tp;
	   this.report = tp.report;
	   txtGm.setText(Integer.toString(order.getGeneralMask()));
	   txtKF94.setText(Integer.toString(order.getKF94()));
	   txtKF80.setText(Integer.toString(order.getKF80()));
	   txtAd.setText(Character.toString(order.getAdult()));
	   txtCd.setText(Character.toString(order.getChildren()));
	   txtDelivery.setText(order.getDeliveryString());
	   txtfreegift.setText(order.getfreegift());
	   txtComments2.setText(order.getCommentsforDeliveryman());
	   txtSales.setText(Integer.toString(order.getTotal()));
	   txtPayment.setText(order.getPayment());
	   saveToFile();
	   }
	
	public void saveToFile() throws FileNotFoundException
	   {
		
		Scanner input = new Scanner(new File("thisreport.txt"));
		int i = 0;

		Order[] lastOrder = new Order[1000];

		while (input.hasNextLine()) {
			char Adult = input.next().charAt(0);
			boolean a;
			if (Adult=='O') // T is take away, D is dine-in
				a = true;
			else
				a = false;

			char Children = input.next().charAt(0);
			boolean c;
			if (Children == 'O') // C is with cream, N is without cream
				c = true;
			else
				c = false;
			
			int GeneralMask = Integer.parseInt(input.next());
			int KF94 = Integer.parseInt(input.next());
			int KF80 = Integer.parseInt(input.next());
			
			char Delivery = input.next().charAt(0);
			String Payment = input.next();
			String freegift="";
			String Comment2="";
			int sales = Integer.parseInt(input.next());
			totalSales += sales;

			lastOrder[i] = new Order(a,c,GeneralMask,KF94,KF80,Delivery,Payment,freegift,Comment2);
			i++;

		}
		txtOldSales.setText(Integer.toString(totalSales));
		totalSales += order.getTotal();
		txtNewSales.setText(Integer.toString(totalSales));

		PrintStream toFile = new PrintStream(new File("thisreport.txt"));
		data = new String[i + 1][9]; // create an array with size i+1 and the column size = 5
		i = 0;
		
		while (i < data.length - 1) {
			System.out.println("i :" + i);
			String all = Character.toString(lastOrder[i].getAdult()) + " " + Character.toString(lastOrder[i].getChildren()) + " "
				+ lastOrder[i].getGeneralMask() + " " + lastOrder[i].getKF94()
				+ " " +lastOrder[i].getKF80()+" "+ Character.toString(lastOrder[i].getDelivery()) + " " 
				+ lastOrder[i].getPayment()+" "+lastOrder[i].getTotal();
				

			toFile.println(all);

			data[i][0] = Integer.toString(i);
			data[i][1] = Character.toString(lastOrder[i].getAdult());
			data[i][2] = Character.toString(lastOrder[i].getChildren());
			data[i][3] = Integer.toString(lastOrder[i].getGeneralMask()+lastOrder[i].getKF94()+lastOrder[i].getKF80());
			data[i][4] = Character.toString(lastOrder[i].getDelivery());
			data[i][5] = lastOrder[i].getPayment();
			data[i][6] = Integer.toString(lastOrder[i].getTotal());
			i++;

		}

		
		
		String newdata = Character.toString(order.getAdult()) + " " + Character.toString(order.getChildren()) + " "
				+ order.getGeneralMask() + " " + order.getKF94()
				+ " " +order.getKF80()+" "+ Character.toString(order.getDelivery()) + " " 
				+ order.getPayment()+" "+order.getTotal();

		toFile.print(newdata);

		data[i][0] = Integer.toString(i);
		data[i][1] = Character.toString(order.getAdult());
		data[i][2] = Character.toString(order.getChildren());
		data[i][3] = Integer.toString(order.getGeneralMask()+order.getKF94()+order.getKF80());
		data[i][4] = Character.toString(order.getDelivery());
		data[i][5] = order.getPayment();
		data[i][6] = Integer.toString(order.getTotal());

		String[] columnNames = {"No", "Ty.A","Ty.C", "Mask","Delivery","Payment","total" };
		newTable = new JTable(data, columnNames);
		newTable.setBounds(350, 30, 100, 90);
		newTable.setAutoCreateRowSorter(true);
		scrollPane.getViewport().setView(newTable);
		contentPane.add(scrollPane);

	  }
}
