package Challenge;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        LinkedList<Town> itinerary = new LinkedList<>();
        itinerary.add(new Town("Paris", 0));
        itinerary.add(new Town("Brussels", 320));
        itinerary.add(new Town("Amsterdam", 520));
        itinerary.add(new Town("Berlin", 1050));
        itinerary.add(new Town("Prague", 1350));
        itinerary.add(new Town("Vienna", 1550));
        itinerary.add(new Town("Budapest", 1750));

        itinerary.sort(Comparator.comparingInt(Town::getDistance));

        Scanner scan = new Scanner(System.in);
        ListIterator<Town> it = itinerary.listIterator();
        boolean forward = true;

        Town current = it.next();
        System.out.println("Starting trip...");
        printMenu();

        boolean running = true;
        while (running) {
            System.out.print("Choice: ");
            String cmd = scan.nextLine().trim().toUpperCase();

            switch (cmd) {
                case "F":
                    if (!forward && it.hasNext()) it.next();
                    forward = true;
                    if (it.hasNext()) {
                        current = it.next();
                        System.out.println("Now visiting: " + current);
                    } else {
                        System.out.println("You're at the last city.");
                    }
                    break;

                case "B":
                    if (forward && it.hasPrevious()) it.previous();
                    forward = false;
                    if (it.hasPrevious()) {
                        current = it.previous();
                        System.out.println("Now visiting: " + current);
                    } else {
                        System.out.println("You're at the start (Paris).");
                    }
                    break;

                case "L":
                    System.out.println("Travel itinerary:");
                    for (Town t : itinerary) System.out.println(" - " + t);
                    break;

                case "M":
                    printMenu();
                    break;

                case "Q":
                    System.out.println("Trip ended. Goodbye!");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice, press M for menu.");
            }
        }

        scan.close();
    }

    private static void printMenu() {
        System.out.println("""
========================
(F) Forward
(B) Backward
(L) List cities
(M) Menu
(Q) Quit
========================
""");
    }
}
