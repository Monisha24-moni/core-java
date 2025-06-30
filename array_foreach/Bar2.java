class Bar2{
	
	static String liquorsName[] = {"The Glenrothes", "FireBall", "Rum","Black label", "Blenders pride", "Signature", "Black and White", "Magic Moments", "white Horse", 
	"Black Bottle", "Royal Salute", "Ardbeg"};
	
	public static void main(String[] liqour){
		
		System.out.println("The liqour names: ");
		
		for(String liquors : liquorsName){
			System.out.println(liquors);
		}
	}
}