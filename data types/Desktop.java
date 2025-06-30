class Desktop {
	
    static String processor = "Intel i7";
    static int ramSize = 16;
    static int storage = 512;
    static String desktopName = "Windows 11";
    static String graphicsCard = "Nvidin GTX 1660";
    static double screenSize = 24.0;
    static int usbPorts = 4;
    static int powerSupply = 450;
    static String desktopBrand = "HP";
    static String coolingSystem = "Fan-based";
    static String audioOutput = "Stereo";
    static boolean wifiEnabled = true;
    static boolean expandable = true;
    static String monitorType = "LED";
    static String inputDevices = "Keyboard, Mouse";

    public static void main(String[] args) {
        System.out.println("Desktop Details are:");
        System.out.println("Processor: " + processor);
        System.out.println("RAM Size: " + ramSize + "GB");
        System.out.println("Storage: " + storage + "GB");
        System.out.println("Operating System: " + os);
        System.out.println("Graphics Card: " + graphicsCard);
        System.out.println("Screen Size: " + screenSize + " inches");
        System.out.println("USB Ports: " + usbPorts);
        System.out.println("Power Supply: " + powerSupply + "W");
        System.out.println("Brand: " + brand);
        System.out.println("Cooling System is: " + coolingSystem);
        System.out.println("Audio Output are: " + audioOutput);
        System.out.println("Wi-Fi Enabled: " + wifiEnabled);
        System.out.println("Expandable: " + expandable);
        System.out.println("Monitor Type is: " + monitorType);
        System.out.println("Input Devices are: " + inputDevices);
    }
}
