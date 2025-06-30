class Court {
	
    static String jurisdiction = "Criminal";
    static String courtLevel = "High Court";
    static int judgeCount = 10;
    static int caseLoad = 500;
    static String type = "Civil";
    static String workingDays = "Mon-Fri";
    static String security = "Armed Guards";
    static int courtroomCount = 4;
    static String filingSystem = "eFiling";
    static boolean legalLibrary = true;
    static boolean eCourt = true;
    static String publicAccess = "Restricted";
    static String benchMaterial = "Wood";
    static String schedule = "9 AM to 4 PM";
    static int waitingCapacity = 100;

    public static void main(String[] args) {
        System.out.println("Court Properties:");
        System.out.println("Jurisdiction: " + jurisdiction);
        System.out.println("Court Level: " + courtLevel);
        System.out.println("Judge Count: " + judgeCount);
        System.out.println("Case Load: " + caseLoad);
        System.out.println("Type: " + type);
        System.out.println("Working Days: " + workingDays);
        System.out.println("Security: " + security);
        System.out.println("Courtroom Count: " + courtroomCount);
        System.out.println("Filing System: " + filingSystem);
        System.out.println("Legal Library: " + legalLibrary);
        System.out.println("eCourt Facility: " + eCourt);
        System.out.println("Public Access: " + publicAccess);
        System.out.println("Bench Material: " + benchMaterial);
        System.out.println("Schedule: " + schedule);
        System.out.println("Waiting Area Capacity: " + waitingCapacity);
    }
}
