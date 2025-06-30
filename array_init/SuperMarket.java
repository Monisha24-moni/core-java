class SuperMarket {
	
    static String iceCreams[] = {"Vanilla","Chocolate","Strawberry","Mango","Pista","Butterscotch","Choco Chips", 
	"Caramel","Blackcurrant","Orange"};
    static String perfumes[] = {"Dior","Chanel","Versace","Axe","Fogg","Denver","Nivea","Wild Stone", "Park Avenue","Skinn"};
    static String groceries[] = {"Rice","Wheat","Oil","Dal","Sugar","Salt","Spices","Tea","Coffee","Flour"};

    public static void main(String[] items) {
        System.out.println(iceCreams[0]+","+iceCreams[1]+","+iceCreams[2]+","+iceCreams[3]+","+iceCreams[4]+"," 
		+iceCreams[5]+","+iceCreams[6]+","+iceCreams[7]+","+iceCreams[8]+","+iceCreams[9]);

        System.out.println(perfumes[0]+","+perfumes[1]+","+perfumes[2]+","+perfumes[3]+","+perfumes[4]+"," 
		+perfumes[5]+","+perfumes[6]+","+perfumes[7]+","+perfumes[8]+","+perfumes[9]);

        System.out.println(groceries[0]+","+groceries[1]+","+groceries[2]+","+groceries[3]+","+groceries[4]+"," 
		+groceries[5]+","+groceries[6]+","+groceries[7]+","+groceries[8]+","+groceries[9]);
    }
}
