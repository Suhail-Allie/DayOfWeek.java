package org.example;
import java.util.Scanner;

public class DayOfWeek {

        // Enumeration for days of the week
        public enum Days {
            SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Display the list of days
            System.out.println("Days of the week:");
            for (Days day : Days.values()) {
                System.out.println(day);
            }

            // Prompt the user for a day
            System.out.print("\nEnter a day of the week: ");
            String userInput = scanner.nextLine().toUpperCase(); // Convert to uppercase for comparison

            try {
                // Convert user input to enum type
                Days chosenDay = Days.valueOf(userInput);

                // Display business hours based on the chosen day
                switch (chosenDay) {
                    case SUNDAY:
                        System.out.println("Business hours on Sunday: 11 AM to 5 PM");
                        break;
                    case MONDAY:
                    case TUESDAY:
                    case WEDNESDAY:
                    case THURSDAY:
                    case FRIDAY:
                        System.out.println("Business hours on " + chosenDay + ": 9 AM to 9 PM");
                        break;
                    case SATURDAY:
                        System.out.println("Business hours on Saturday: 10 AM to 6 PM");
                        break;
                }
            } catch (IllegalArgumentException e) {
                // If the user input is not a valid day, display an error message
                System.out.println("Error: Invalid day entered. Please enter a valid day of the week.");
            }

            scanner.close();
        }
    }


