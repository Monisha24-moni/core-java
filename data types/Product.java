class Product{
	static String id="PR01";
	static String name="bluetooth";
	static String category="electronics";
	static String brand="oneplus";
	static int price=3000;
	static String discount="10%";
	static String color="black";
	static String size="medium";
	static String material="plastic";
	static boolean isNoiceCanceler=true;
	static int warrantyyear=2;
	static boolean isReturnable=true;
	static boolean isAvailable=true;
	static String originCountry="india";
	static int minorderlimit=2;
	static int stock=25;
	
	public static void main(String[] args)
	{
		System.out.println("Product Id:"+id);
		System.out.println("Product name:"+name);
		System.out.println("Product category:"+category);
		System.out.println("Product brand:"+brand);
		System.out.println("Product price:"+price);
		System.out.println("Product discount:"+discount);
		System.out.println("Product color:"+color);
		System.out.println("Product size:"+size);
		System.out.println("Product material type:"+material);
		System.out.println("Product have noice-conceling featutre:"+isNoiceCanceler);
		System.out.println("Product can be returnable:"+isReturnable);
		System.out.println("Product is available for this pincode:"+isAvailable);
		System.out.println("Product warrantyyear:"+warrantyyear);
		System.out.println("Product manufactured original country name:"+originCountry);
		System.out.println("Product minimum order limit:"+minorderlimit);
		System.out.println("Product stock in this store:"+stock);
	}
	
}