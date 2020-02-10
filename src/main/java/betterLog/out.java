package betterLog;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class out {
    //ANSI Color pack:
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    //include timestamp?
    public static boolean includeTimestamp = true;

    public static void log(String msg) {
        String out = ANSI_WHITE + msg + ANSI_RESET;
        if (includeTimestamp) out = getTimestamp() + " " + out;

        System.out.println(out);
    }

    public static void warn(String msg) {
        String out = ANSI_YELLOW + msg + ANSI_RESET;
        if (includeTimestamp) out = getTimestamp() + " " + out;

        System.out.println(out);
    }

    public static void danger(String msg) {
        String out = ANSI_RED + msg + ANSI_RESET;
        if (includeTimestamp) out = getTimestamp() + " " + out;

        System.out.println(out);
    }

    public static void success(String msg) {
        String out = ANSI_GREEN + msg + ANSI_RESET;
        if (includeTimestamp) out = getTimestamp() + " " + out;

        System.out.println(out);
    }

    public static void hidden(String msg) {
        String out = ANSI_BLACK + msg + ANSI_RESET;
        if (includeTimestamp) out = getTimestamp() + " " + out;

        System.out.println(out);
    }

    private static final DateFormat sdf = new SimpleDateFormat("HH:mm:ss");
    private static String getTimestamp() {
        Date date = new Date();
        return ANSI_PURPLE + "[" + sdf.format(date) + "]" + ANSI_RESET;
    }
}
