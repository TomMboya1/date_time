package org.example;

import java.time.LocalDate;
import java.time.Year;
public class Main {
    public static void main(String[] args) {
        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Calculate the number of days left till the end of the month
        int daysToEndOfMonth = currentDate.lengthOfMonth() - currentDate.getDayOfMonth();

        // Calculate the number of days left till the end of the year
        int daysToEndOfYear = Year.of(currentDate.getYear()).length() - currentDate.getDayOfYear();

        // Print the results
        System.out.println("Days left till the end of the month: " + daysToEndOfMonth);
        System.out.println("Days left till the end of the year: " + daysToEndOfYear);
    }
}