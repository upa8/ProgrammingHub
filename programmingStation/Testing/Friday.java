package Testing;

/*
ID: florian15
LANG: JAVA
TASK: friday
*/

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

class friday {


    public static final ArrayList<Integer> MONTH_WITH_30_DAYS = new ArrayList<Integer>();

    public static final Integer SATURDAY = Integer.valueOf(0);
    public static final Integer SUNDAY = Integer.valueOf(1);
    public static final Integer MONDAY = Integer.valueOf(2);
    public static final Integer TUESDAY = Integer.valueOf(3);
    public static final Integer WEDNESDAY = Integer.valueOf(4);
    public static final Integer THURSDAY = Integer.valueOf(5);
    public static final Integer FRIDAY = Integer.valueOf(6);


    public static void main(String[] args) throws IOException {
        // Use BufferedReader rather than RandomAccessFile; it's much faster
        BufferedReader f = new BufferedReader(new FileReader("friday.in"));
        // input file name goes above
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("friday.out")));
        // Use StringTokenizer vs. readLine/split -- lots faster

        MONTH_WITH_30_DAYS.add(4);
        MONTH_WITH_30_DAYS.add(6);
        MONTH_WITH_30_DAYS.add(9);
        MONTH_WITH_30_DAYS.add(11);

        friday problem = new friday();


        HashMap<Integer, Integer> daysCount = problem.initializeDaysCountMap();
        int numberOfYears = Integer.parseInt(f.readLine());

        int startYear = 1900;
        int currentDay = MONDAY;

        for (int year = startYear; year < startYear + numberOfYears; year++) {
            for (int month = 1; month <= 12; month++) {
                for (int day = 1; day <= getNumberOfDaysForMonth(month, year); day++) {
                    if (day == 13) {
                        int dayCounter = daysCount.get(currentDay);
                        daysCount.put(currentDay, ++dayCounter);
                        //System.out.println("The 13th " + day + "." + month + '.' + year + " falls on day " + currentDay);
                    }
                    currentDay = ++currentDay % 7;
                }
            }

        }


        out.println(daysCount.get(SATURDAY) + " " + daysCount.get(SUNDAY) + " " + daysCount.get(MONDAY) + " " + daysCount.get(TUESDAY) + " " + daysCount.get(WEDNESDAY) + " " + daysCount.get(THURSDAY) + " " + daysCount.get(FRIDAY));                           // output result
        out.close();                                  // close the output file
        System.exit(0);                               // don't omit this!
    }


    private static int getNumberOfDaysForMonth(int month, int year) {
        if (month == 2) {
            return isLeapYear(year) ? 29 : 28;
        } else {
            return MONTH_WITH_30_DAYS.contains(Integer.valueOf(month)) ? 30 : 31;
        }
    }


    private static boolean isLeapYear(int year) {
        if (year % 100 == 0) {
            return year % 400 == 0;
        }
        return year % 4 == 0;
    }


    private HashMap<Integer, Integer> initializeDaysCountMap() {
        HashMap<Integer, Integer> daysCount = new LinkedHashMap<Integer, Integer>();
        daysCount.put(SATURDAY, 0);
        daysCount.put(SUNDAY, 0);
        daysCount.put(MONDAY, 0);
        daysCount.put(TUESDAY, 0);
        daysCount.put(WEDNESDAY, 0);
        daysCount.put(THURSDAY, 0);
        daysCount.put(FRIDAY, 0);
        return daysCount;
    }
}