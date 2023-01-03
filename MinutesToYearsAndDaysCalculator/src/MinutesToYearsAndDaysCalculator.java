public class MinutesToYearsAndDaysCalculator {
    private static final String INVALID_VALUE = "Invalid value";
    private static final long MINUTES_IN_DAY = 60 * 24;
    private static final long DAYS_IN_YEAR = 365;

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println(INVALID_VALUE);
        } else {
            long years = minutes / (MINUTES_IN_DAY * DAYS_IN_YEAR);
            long remainingDays = minutes % (MINUTES_IN_DAY * DAYS_IN_YEAR);
            long days = remainingDays / MINUTES_IN_DAY;

            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    }
}
