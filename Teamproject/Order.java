package Teamproject;


	public class Order {

	private boolean Adult;
	private boolean Children;
	private String freegift;
	private String CommentsforDeliveryman;
	private String Payment;
	private char Delivery;
	private int GeneralMask;
    private int KF94;
    private int KF80;
    int t_f;
    int t_c;
    int m_f;
    int d_variable;
    int d_f;
    
	private final int priceGeneralMask = 1500;
	private final int priceKF80 = 1800;
	private final int priceKF94 = 2000;
	private final int DeliveryFee = 2500;
	private final int PickFee = 0;
	private final int a_t = 3500;
	private final int c_t = 2500;

	public  Order(boolean a, boolean c,int gm, int kf94, int kf80, char d,String p, String cfs, String cfd )
	{	
		Adult = a;
		Children = c;
		GeneralMask = gm;
		KF94 = kf94;
		KF80 = kf80;
		Delivery = d;
		Payment =p;
		freegift = cfs;
		CommentsforDeliveryman = cfd;
		
	  
	  
	}
	
	public char getAdult() {
	 if(Adult)
	   return 'O';
	 else 
	   return 'X';
	}

	public char getChildren() {
		if(Children)
			return 'O';
		else 
			return 'X';
		
	}

	public int getGeneralMask() {
	 return GeneralMask;
	}

	public int getKF94() {
	 return KF94;
	}

	public int getKF80() {
	 return KF80;
	}

	public String getfreegift() {
		 return freegift;
		 
		}
	public String getCommentsforDeliveryman() {
		 return CommentsforDeliveryman;
		 
		}
	public String getPayment() {
		 return Payment;
		 
		}

		public String getDeliveryString() {
		 if( Delivery== 'D')
		  return "Delivery";
		 else 
		  return "PickUp";
		}

		public char getDelivery() {
		 return Delivery;
		}

		public int getTotal() 
		{
		      {
		         if (Adult)
		         {
		            t_f = a_t;
		         }
		         else if (Children)
		         {
		            t_f = c_t;
		         }
		         if(Adult && Children) {
		            t_f = a_t+ c_t;
		         }
			
			
		
			m_f = 1500*GeneralMask + 2000*KF94 + 1800*KF80;
					 
		
			if (d_variable == 'D')
			{
				d_f = DeliveryFee;
			}
			else if (d_variable == 'P')
			{
				d_f = PickFee;
			}
			
			int total = t_f + m_f + d_f;
				
		 return total;
		}
	}
	}





