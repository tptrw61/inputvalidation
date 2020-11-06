
public class IVExt extends IV {
    
    protected static String intInRangeWarning = "Please enter an integer in range [%d, %d]";
    protected static String doubleInRangeWarning = "Please enter a number in range [%lf, %lf]";
    
    protected static String intGEWarning = "Please enter an integer greater than or equal to %d";
    protected static String intLEWarning = "Please enter an integer less than or equal to %d";
    protected static String intGTWarning = "Please enter an integer greater than to %d";
    protected static String intLTWarning = "Please enter an integer less than to %d";
    
    protected static String doubleGEWarning = "Please enter an number greater than or equal to %lf";
    protected static String doubleLEWarning = "Please enter an number less than or equal to %lf";
    protected static String doubleGTWarning = "Please enter an number greater than to %lf";
    protected static String doubleLTWarning = "Please enter an number less than to %lf";
    
    //gets an int in the range [low, high] (inclusive both)
    public static int getIntInRange(String question, int low, int high) {
        int x = getInt(question);
        while (x < low || x > high) {
            System.out.printf(intInRangeWarning+"\n", low, high);
            x = getInt(question);
        }
        return x;
    }
    //gets a double in the range [low, high] (inclusive both)
    public static double getDoubleInRange(String question, int low, int high) {
        double x = getDouble(question);
        while (x < low || x > high) {
            System.out.printf(doubleInRangeWarning+"\n", low, high);
            x = getDouble(question);
        }
        return x;
    }
    
    public static int getIntGE(String question, int low) {
        int x = getInt(question);
        while (x < low) {
            System.out.printf(intGEWarning+"\n", low);
            x = getInt(question);
        }
        return x;
    }
    public static int getIntLE(String question, int high) {
        int x = getInt(question);
        while (x > high) {
            System.out.printf(intLEWarning+"\n", high);
            x = getInt(question);
        }
        return x;
    }
    public static int getIntGT(String question, int low) {
        int x = getInt(question);
        while (x <= low) {
            System.out.printf(intGTWarning+"\n", low);
            x = getInt(question);
        }
        return x;
    }
    public static int getIntLT(String question, int high) {
        int x = getInt(question);
        while (x >= high) {
            System.out.printf(intLTWarning+"\n", high);
            x = getInt(question);
        }
        return x;
    }
    
    public static double getDoubleGE(String question, int low) {
        double x = getInt(question);
        while (x < low) {
            System.out.printf(doubleGEWarning+"\n", low);
            x = getInt(question);
        }
        return x;
    }
    public static double getDoubleLE(String question, int high) {
        double x = getInt(question);
        while (x > high) {
            System.out.printf(doubleLEWarning+"\n", high);
            x = getInt(question);
        }
        return x;
    }
    public static double getDoubleGT(String question, int low) {
        double x = getInt(question);
        while (x <= low) {
            System.out.printf(doubleGTWarning+"\n", low);
            x = getInt(question);
        }
        return x;
    }
    public static double getDoubleLT(String question, int high) {
        double x = getInt(question);
        while (x >= high) {
            System.out.printf(doubleLTWarning+"\n", high);
            x = getInt(question);
        }
        return x;
    }
    
    public static int getPositiveInt(String question) {
        return getIntGT(question, 0);
    }
    public static int getNegativeInt(String question) {
        return getIntLT(question, 0);
    }
    public static int getNonNegativeInt(String question) {
        return getIntGE(question, 0);
    }
    public static double getPositiveDouble(String question) {
        return getDoubleGT(question, 0);
    }
    public static double getNegativeDouble(String question) {
        return getDoubleLT(question, 0);
    }
    public static double getNonNegativeDouble(String question) {
        return getDoubleGE(question, 0);
    }
}