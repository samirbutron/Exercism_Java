public class LogLevels {
    public static String message(String logLine) {
        return logLine.split("]: ")[1].trim();
    }
    public static String logLevel(String logLine) {
        return logLine.split("]")[0].replace("[", "").trim().toLowerCase();
    }
    public static String reformat(String logLine) {
        return String.format("%s (%s)", LogLevels.message(logLine), LogLevels.logLevel(logLine));
    }
}
