import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LogLevels {
    private static final Pattern LOG_PATTERN = Pattern.compile("\\[(ERROR|WARNING|INFO)\\]:\\s*(.+?)\\s*$");
    
    public static String message(String logLine) {
        Matcher matcher = LOG_PATTERN.matcher(logLine);

        if (matcher.matches()) {
            return matcher.group(2).trim();
        }

        return logLine.trim();
    }

    public static String logLevel(String logLine) {
        Matcher matcher = LOG_PATTERN.matcher(logLine);
        
        if (matcher.matches()) {
            return matcher.group(1).toLowerCase();
        }

        return "UNKNOWN";
    }

    public static String reformat(String logLine) {
        return String.format("%s (%s)", message(logLine), logLevel(logLine));
    }
}
