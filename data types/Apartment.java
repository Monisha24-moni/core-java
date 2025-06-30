class Apartment {
	
    static String address = "123 Residency Tower, Pune";
    static int totalFlats = 60;
    static int floors = 15;
    static boolean hasLift = true;
    static boolean powerBackup = true;
    static String waterSupply = "24x7";
    static boolean security = true;
    static boolean parking = true;
    static String builder = "ABC Constructions";
    static boolean gymAvailable = true;
    static boolean swimmingPool = true;
    static boolean cctv = true;
    static String flatType = "2BHK";
    static String maintenanceCompany = "SafeHome Services";
    static double areaSqFt = 1250.0;

    public static void main(String[] args) {
        System.out.println("Apartment Properties:");
        System.out.println("Address: " + address);
        System.out.println("Total Flats: " + totalFlats);
        System.out.println("Floors: " + floors);
        System.out.println("Lift Available: " + hasLift);
        System.out.println("Power Backup: " + powerBackup);
        System.out.println("Water Supply: " + waterSupply);
        System.out.println("Security: " + security);
        System.out.println("Parking: " + parking);
        System.out.println("Builder: " + builder);
        System.out.println("Gym Available: " + gymAvailable);
        System.out.println("Swimming Pool: " + swimmingPool);
        System.out.println("CCTV Surveillance: " + cctv);
        System.out.println("Flat Type: " + flatType);
        System.out.println("Maintenance: " + maintenanceCompany);
        System.out.println("Area (sq ft): " + areaSqFt);
    }
}