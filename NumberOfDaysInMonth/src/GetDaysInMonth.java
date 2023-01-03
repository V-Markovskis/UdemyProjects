public class GetDaysInMonth {
    public static int getDaysInMonth(int month, int year) {
        if(month < 1 || month > 12) {
            return -1;
        } else if (year < 1 || year > 9999) {
            return -1;
        }

        int days;

        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                days = 31;
                return days;
            case 4: case 6: case 9: case 11:
                days = 30;
                return days;
            case 2:
                if (NumberOfDaysInMonth.isLeapYear(year)) {
                    days = 29;
                } else {
                    days = 28;
                }
                return days;
        }
        return -1;
    }
}
