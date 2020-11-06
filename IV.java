
import java.util.Scanner;

public class IV {
    private static Scanner internalScanner = null;
    
    protected static String byteWarning = "Please enter a byte: ";
    protected static String shortWarning = "Please enter a short: ";
    protected static String intWarning = "Please enter an integer: ";
    protected static String longWarning = "Please enter a long: ";
    
    protected static String floatWarning = "Please enter a number: ";
    protected static String doubleWarning = "Please enter a number: ";
    
    protected static String nameWarning = "Please enter a name (no special characters or numbers or spaces): ";
    protected static String fullNameWarning = "Please enter a name (no special characters or numbers): ";
    
    protected static String ynWarning = "Please enter yes or no (y or n): ";
    
    //stuff to hold onto the scanner
    public final static void setScanner(Scanner scanner) {
        if (hasScanner())
            closeScanner();
        internalScanner = scanner;
    }
    //Will automatically create a scanner object using System.in if internal scanner is null
    public static Scanner getScanner() {
        if (!hasScanner()) {
            setScanner(new Scanner(System.in));
        }
        return internalScanner;
    }
    
    //closes the internal scanner and sets internal scanner to null
    public final static void closeScanner() {
        if (hasScanner()) {
            internalScanner.close();
            internalScanner = null;
        }
    }
    
    //returns true if IV contains an existing scanner
    public final static boolean hasScanner() {
        return internalScanner != null;
    }
    
    //input validation functions
    public static byte getByte(String question) {
        Scanner in = getScanner();
        System.out.print(question);
        while (!in.hasNextByte()) {
            System.out.print(byteWarning);
            in.nextLine();
        }
        byte x = in.nextByte();
        in.nextLine();
        return x;
    }
    public static short getShort(String question) {
        Scanner in = getScanner();
        System.out.print(question);
        while (!in.hasNextShort()) {
            System.out.print(shortWarning);
            in.nextLine();
        }
        short x = in.nextShort();
        in.nextLine();
        return x;
    }
    public static int getInt(String question) {
        Scanner in = getScanner();
        System.out.print(question);
        while (!in.hasNextInt()) {
            System.out.print(intWarning);
            in.nextLine();
        }
        int x = in.nextInt();
        in.nextLine();
        return x;
    }
    public static long getLong(String question) {
        Scanner in = getScanner();
        System.out.print(question);
        while (!in.hasNextLong()) {
            System.out.print(longWarning);
            in.nextLine();
        }
        long x = in.nextLong();
        in.nextLine();
        return x;
    }
    
    public static double getFloat(String question) {
        Scanner in = getScanner();
        System.out.print(question);
        while (!in.hasNextFloat()) {
            System.out.print(floatWarning);
            in.nextLine();
        }
        float x = in.nextFloat();
        in.nextLine();
        return x;
    }
    public static double getDouble(String question) {
        Scanner in = getScanner();
        System.out.print(question);
        while (!in.hasNextDouble()) {
            System.out.print(doubleWarning);
            in.nextLine();
        }
        double x = in.nextDouble();
        in.nextLine();
        return x;
    }
    
    public static String getName(String question) {
        Scanner in = getScanner();
        System.out.print(question);
        String s = in.nextLine();
        while (!isName(s)) {
            System.out.print(nameWarning);
            s = in.nextLine();
        }
        return s;
    }
    public static String getFullName(String question) {
        Scanner in = getScanner();
        System.out.print(question);
        String s = in.nextLine();
        while (!isFullName(s)) {
            System.out.print(fullNameWarning);
            s = in.nextLine();
        }
        return s;
    }
    public static boolean getYorN(String question) {
        Scanner in = getScanner();
        System.out.print(question);
        String s = in.nextLine();
        while (!isYorN(s)) {
            System.out.print(ynWarning);
            s = in.nextLine();
        }
        return s.equalsIgnoreCase("y") || s.equalsIgnoreCase("yes");
    }
    
    //flushes the scanners line, only use after getting input without using IV methods or
    //scanner.nextLine()
    public final static void flushScanner() {
        if (hasScanner()) {
            getScanner().nextLine();
        }
    }
    
    //setters and getters
    public static String getByteWarning() {
        return byteWarning;
    }
    public static void setByteWarning(String s) {
        if (!strIsEmpty(s))
            byteWarning = s;
    }
    public static String getShortWarning() {
        return shortWarning;
    }
    public static void setShortWarning(String s) {
        if (!strIsEmpty(s))
            shortWarning = s;
    }
    public static String getIntWarning() {
        return intWarning;
    }
    public static void setIntWarning(String s) {
        if (!strIsEmpty(s))
            intWarning = s;
    }
    public static String getLongWarning() {
        return longWarning;
    }
    public static void setLongWarning(String s) {
        if (!strIsEmpty(s))
            longWarning = s;
    }
    public static String getFloatWarning() {
        return floatWarning;
    }
    public static void setFloatWarning(String s) {
        if (!strIsEmpty(s))
            floatWarning = s;
    }
    public static String getDoubleWarning() {
        return doubleWarning;
    }
    public static void setDoubleWarning(String s) {
        if (!strIsEmpty(s))
            doubleWarning = s;
    }
    public static String getNameWarning() {
        return nameWarning;
    }
    public static void setNameWarning(String s) {
        if (!strIsEmpty(s))
            nameWarning = s;
    }
    public static String getFullNameWarning() {
        return fullNameWarning;
    }
    public static void setFullNameWarning(String s) {
        if (!strIsEmpty(s))
            fullNameWarning = s;
    }
    public static String getYnWarning() {
        return ynWarning;
    }
    public static void setYnWarning(String s) {
        if (!strIsEmpty(s))
            ynWarning = s;
    }
    
    //helper functions
    //returns true is string contains non-whitespace characters
    protected static boolean strIsEmpty(String s) {
        if (s == null)
            return true;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ' && s.charAt(i) != '\t') {
                return false;
            }
        }
        return true;
    }
    protected static boolean isYorN(String s) {
        if (s.equalsIgnoreCase("y") || s.equalsIgnoreCase("yes") 
                || s.equalsIgnoreCase("n") || s.equalsIgnoreCase("no"))
            return true;
        return false;
    }
    protected static boolean isLetter(char c) {
        if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z'))
            return true;
        return false;
    }
    protected static boolean isName(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!isLetter(s.charAt(i)))
                return false;
        }
        return true && s.length() > 0;
    }
    protected static boolean isFullName(String s) {
        boolean hasalpha = false;
        for (int i = 0; i < s.length(); i++) {
            if (isLetter(s.charAt(i)))
                    hasalpha = true;
            if (!isLetter(s.charAt(i)) && s.charAt(i) != ' ')
                return false;
        }
        return true && hasalpha;
    }
}