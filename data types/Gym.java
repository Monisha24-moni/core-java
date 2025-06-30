class Gym {
	
    static String location = "tumkur";
    static String membershipPlan = "Monthly";
	static int monthlyfees=1500;
    static String equipment = "Treadmill,Weights,Rowing Machine";
    static boolean trainerAvailable = true;
    static String hours = "6AM-10PM";
    static int hygieneRating = 9;
    static boolean safetyFeatures = true;
    static int floorSpace = 1500;
    static int weightliftingArea = 700;
    static boolean lockerFacility = true;
    static String groupClasses = "Yoga,Zumba";
    static boolean airConditioning = true;
    static boolean musicSystem = true;
    static int monthlyVisitors = 300;

    public static void main(String[] args) {
        System.out.println("Gym Properties:");
        System.out.println("Gym Location: " +location);
        System.out.println("Membership Plan: " +membershipPlan);
        System.out.println("Gym Equipment:"+equipment);
        System.out.println("is any Trainer Available: " +trainerAvailable);
        System.out.println("Gym opening Time " +hours);
        System.out.println("Gym Hygiene Rating: " +hygieneRating);
        System.out.println("Safety Features in the Gym: " +safetyFeatures);
        System.out.println("Floor Space:" +floorSpace);
        System.out.println("Weightlifting Area:"+weightliftingArea);
        System.out.println("Locker Facility:"+lockerFacility);
        System.out.println("Group Classes:"+groupClasses);
        System.out.println(" is there Air Conditioning in gym:"+airConditioning);
        System.out.println("is there any Music System:"+musicSystem);
        System.out.println("Monthly Visitors are:"+monthlyVisitors);
    }
}
