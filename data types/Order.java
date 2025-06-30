class Order{
static String orderId = "ORD123";                         
static String customerId = "CUST123";                        
static String orderDate = "23-6-2025";                       
static String shippingDate = "28-6-2025";                    
static String deliveryDate = "2-7-2025";                   
static double totalAmount = 5000.00;                          
static String paymentMethod = "cash and delivery";                  
static boolean isPaid = false;                                 
static String shippingAddress = "vivekananda road,dodballapura";                                  
static int itemCount = 3;                                 
static String couponCode = "SAVE20";                          
static int discountAmount = 100;                        
static int taxAmount = 50;                              
static int shippingFee = 100;                                                               
static String orderType = "Online";                           
static boolean isGift = false;                                                               
static boolean isReturnable = true;                           

public static void main(String[] args){
	System.out.println("Order Id:"+orderId);
	System.out.println("Customer Id:"+customerId);
	System.out.println("Order Date:"+orderDate);
	System.out.println("Order shipping Date:"+shippingDate);
	System.out.println("Order delivery Date:"+deliveryDate);
	System.out.println("Order totalAmount:"+totalAmount);
	System.out.println("Order paymentMethod:"+paymentMethod);
	System.out.println("Order is paid or not:"+isPaid);
	System.out.println("Order shippingAddress:"+shippingAddress);
	System.out.println("Order itemCount:"+itemCount);
	System.out.println("Order couponCode:"+couponCode);
	System.out.println("Order discountAmount:"+discountAmount);
	System.out.println("Order taxAmount:"+taxAmount);
	System.out.println("Order shippingFee:"+shippingFee);
	System.out.println("Order type:"+orderType);
	System.out.println("is Order contains any gift :"+isGift);
	System.out.println("is order can has return option"+isReturnable);
}   
}