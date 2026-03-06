class CsLab{
    static String labName = "TechLab";
    static int totalComputers = 5335;
    static double usageFee = 4646.76;
    static char labGrade = 'A';
    static boolean isWifiAvailable = true;
	
	public static void main(String[] args) {
		displayMessage();
        int students =studentCount();
        double collection =monthlyCollection();
        char equip =equipmentGrade();
        boolean open =openStatus();
        String course =topCourse();
        long contact =contactNumber();
        float cpu = cpuSpeed();
        short trainers =trainerCount();
        byte room =roomNumber();
        

        System.out.println("studentCount= "+students);
        System.out.println("monthlyCollection= "+collection);
        System.out.println("equipmentGrade= "+equip);
        System.out.println("openStatus= "+open);
        System.out.println("topCourse= "+course);
        System.out.println("contactNumber= "+contact);
        System.out.println("cpuSpeed= "+cpu);
        System.out.println("trainerCount= "+trainers);
        System.out.println("roomNumber= "+room);

        System.out.println("labName= "+labName);
        System.out.println("totalComputers= "+totalComputers);
        System.out.println("usageFee= "+usageFee);
        System.out.println("labGrade= "+labGrade);
        System.out.println("isWifiAvailable= "+isWifiAvailable);
    }
	

    public static int studentCount() {
        System.out.println("Running Method:studentCount");
        return 12556;
    }

    public static double monthlyCollection() {
        System.out.println("Running Method:monthlyCollection");
        return 55.4646d;
    }

    public static char equipmentGrade() {
        System.out.println("Running Method:equipmentGrade");
        return 'A';
    }

    public static boolean openStatus() {
        System.out.println("Running Method:openStatus");
        return true;
    }

    public static String topCourse() {
        System.out.println("Running Method:topCourse");
        return "web development";
    }

    public static long contactNumber() {
        System.out.println("Running Method:contactNumber");
        return 9425456l;
    }

    public static float cpuSpeed() {
        System.out.println("Running Method:cpuSpeed");
        return 354.45f;
    }

    public static short trainerCount() {
        System.out.println("Running Method:trainerCount");
        return 12;
    }

    public static byte roomNumber() {
        System.out.println("Running Method:roomNumber");
        return 122;
    }

    public static void displayMessage() {
        System.out.println("Running Method: displayMessage");
        System.out.println("Welcome to the Lab");
    }

    


}