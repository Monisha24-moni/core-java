class Bank{
	
    static String location = "tumkur";
    static String branchCode = "tmk123";
    static String ifscCode = "SBI5678";
    static int numEmployees = 13;
    static String bankType = "Private";
    static String bankATM = "Yes";
    static String securitySystem = "CCTV";
    static String workingTime = "9AM-4PM";
    static String bankService = "Loans,Savings,FDs";
    static String accountTypes = "Savings,Current";
    static String currencyExchange = "yes";
    static String digitalBanking = "Yes";
    static int customerAccount = 250;
    static int totalCameras = 5;
	
	public static void main(String[] bank) {
        System.out.println("Bank Details are:");
        System.out.println("Location of the bank is: " +location);
        System.out.println("Branch Code is:" +branchCode);
        System.out.println("IFSC Code of the bank Holder: " +ifscCode);
        System.out.println("Number of Employees working: " +numEmployees);
        System.out.println("Type of the Bank: " +bankType);
        System.out.println("ATM Available: " +bankATM);
        System.out.println("Security System: " +securitySystem);
        System.out.println("Working hours for Employees: " +workingTime);
        System.out.println("Service of the bank: "+bankService);
        System.out.println("Account Types in bank:"+ accountTypes);
        System.out.println("Currency Exchange is available: " +currencyExchange);
        System.out.println("Digital Banking is available: " +digitalBanking);
        System.out.println("Customer account : " +customerAccount);
        System.out.println("working Cameras : " +totalCameras);
    }
}