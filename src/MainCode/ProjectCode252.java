package MainCode;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author asmaabdullah
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// Factory
import Factory.EventFactory;
import Factory.Event;

// Bridge
import Bridge.Sunday;
import Bridge.Monday;
import Bridge.Tuesday;
import Bridge.Wednesday;
import Bridge.Thursday;
import Bridge.Friday;
import Bridge.Saturday;

// Strategy
import Strategy.PaymentFactory;
import Strategy.Payment;

// Decorator
import Decorator.Ticket;
import Decorator.FastPassTicket;
import Decorator.BasicTicket;
import Decorator.TicketDecorator;



public class ProjectCode252 {

    static final int BPrice = 20, PPrice = 15, DPrice = 25, GPrice = 30, SPrice = 30;
    public static int BQua = 0, PQua = 0, DQua = 0, SQua = 0, GQua = 0, total = 0;
    public static int B = 12, P = 20, Da = 5, S = 20, G = 25;
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        boolean flag = true;
        Scanner in = new Scanner(System.in);
        while (flag) {

            System.out.print(displayWelcomeMessage());

            System.out.print("Enter your selection: ");
            String select = input.next().toUpperCase();

            if (select.equalsIgnoreCase("E")) {
                if (BQua == 0 && PQua == 0 && SQua == 0 && GQua == 0 && DQua == 0) {
                    System.out.println("Nothing Selected. See you again.");
                    System.exit(0);
                }
                flag = false;
            } else {
                selectEvent(select, in);
            }

        }

        System.out.print("Enter your name: ");
        String userName = in.nextLine();

        String mobileNum = "";

        while (!isCorrectMobile(mobileNum)) {
            System.out.print("Enter your Mobile Number (must start with 05): ");
            mobileNum = input.next();
        }

        String userEmail = "";
        while (!isCorrectEmail(userEmail)) {
            System.out.print("Enter your Email: ");
            userEmail = in.next();
        }

        System.out.println("");

        // Prompt the user for Fast Pass Ticket choice
        System.out.print("Do you want to add Fast Pass ticket? (yes/no): ");
        String fastPassChoice = input.next();
        boolean hasFastPass = fastPassChoice.equalsIgnoreCase("yes");

        calculatePrice(hasFastPass);

        System.out.println("");

        Payment(in);

        System.out.println(invoice(userName, hasFastPass));
    }

    public static void calculatePrice(boolean hasFastPass) {
        int itemTotal;
        itemTotal = BQua * BPrice;
        total += itemTotal;
        itemTotal = PQua * PPrice;
        total += itemTotal;
        itemTotal = SQua * SPrice;
        total += itemTotal;
        itemTotal = GQua * GPrice;
        total += itemTotal;
        itemTotal = DQua * DPrice;
        total += itemTotal;

        // Adding Fast Pass Ticket feature
        if (hasFastPass) {
            total += 20; // Add 20 SR for the Fast Pass Ticket
        }
    }

    public static String displayWelcomeMessage() {

        String WelcomeMsg = "";

        WelcomeMsg += "----------------------------------------------------------\n";
        WelcomeMsg += "\t\tWelcome to STLA World\n";
        WelcomeMsg += "----------------------------------------------------------\n";

        WelcomeMsg += "B: Bumper cars          20SR          " + B + " Tickets left\n";
        WelcomeMsg += "P: Pirate Ship          15SR          " + P + " Tickets left\n";
        WelcomeMsg += "D: Drop tower           25SR          " + Da + " Tickets left\n";
        WelcomeMsg += "G: Giant Wheel          30SR          " + G + " Tickets left\n";
        WelcomeMsg += "S: Ice skating          30SR          " + S + " Tickets left\n";
        WelcomeMsg += "E: Confirm and Exit\n";

        WelcomeMsg += "----------------------------------------------------------\n";
        return WelcomeMsg;

    }

    public static boolean isCorrectMobile(String mobileNum) {
        return mobileNum.startsWith("05") && mobileNum.length() == 10;
    }

    public static boolean isCorrectEmail(String userEmail) {
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(userEmail);
        return matcher.matches();
    }

    public static int selectDate(Scanner in) {

        ArrayList<String> dateList = new ArrayList<>();
        dateList.add("18/06/2023  Sunday");
        dateList.add("19/06/2023  Monday");
        dateList.add("20/06/2023  Tuesday");
        dateList.add("21/06/2023  Wednesday");
        dateList.add("22/06/2023  Thursday");
        dateList.add("23/06/2023  Friday");
        dateList.add("24/06/2023  Saturday");

        System.out.println("\nSelect the date of the event:");
        for (int i = 0; i < dateList.size(); i++) {
            System.out.println((i + 1) + ". " + dateList.get(i));
        }

        System.out.print("\nEnter your selection: ");
        int selection = in.nextInt();
        while (selection < 1 || selection > dateList.size()) {
            System.out.println("Invalid selection. Please choose a valid option.");
            selection = in.nextInt();
        }
        return selection;
    }

    public static String generateTicket(String date) {
        String ticket = "";
        String dateNo = date.substring(0, 10);
        String day = date.substring(10);

        ticket += "\n\n\t\tSTLA WORLD\n";
        ticket += "------------------TICKET---------------------\n";
        ticket += " Date: " + dateNo + " | " + day;
        ticket += "\n\t 4:00pm - 11:30pm";
        ticket += "\n\t TICKET CODE: " + 543 + "-" + 876 + "-" + 001;
        ticket += "\n---------------------------------------------\n\n";
        return ticket;
    }

    public static void Payment(Scanner in) {
        PaymentFactory paymentFactory = new PaymentFactory();

        System.out.println("Payment Options:");
        System.out.println("1. Apple Pay");
        System.out.println("2. Credit Card");
        System.out.println("3. Visa");
        System.out.print("Choose a payment option: ");
        int option = input.nextInt();

        Payment payment = paymentFactory.getPay(option);
        if (payment != null) {
            payment.Pay();
        } else {
            System.out.println("Invalid payment option selected.");
        }
    }

    public static void selectEvent(String select, Scanner in) {
        EventFactory eventFactory = new EventFactory();
        Event event = eventFactory.createEvent(select);
        int quaTemp;

        if (event == null) {
            System.out.println("Wrong selection!");
            return;
        }

        int chooseDay = selectDate(in);
        switch (chooseDay) {
            case 1:
                event.chosenDay(new Sunday());
                break;
            case 2:
                event.chosenDay(new Monday());
                break;
            case 3:
                event.chosenDay(new Tuesday());
                break;
            case 4:
                event.chosenDay(new Wednesday());
                break;
            case 5:
                event.chosenDay(new Thursday());
                break;
            case 6:
                event.chosenDay(new Friday());
                break;
            case 7:
                event.chosenDay(new Saturday());
                break;
        }
        event.getDay();

        System.out.println("");

        quaTemp = askQuantity(in);
        event.updateQuantity(quaTemp);

        System.out.println("");

    }

    private static int askQuantity(Scanner in) {
        System.out.print("Quantity: ");
        return in.nextInt();
    }

    public static String invoice(String userName, boolean hasFastPass) {
        String invoicePrint = "";
        invoicePrint += "\n\n****************** INVOICE ********************";
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        invoicePrint += "\nDate: " + dtf.format(now);
        invoicePrint += "\nBill to: " + userName + "\n";
        invoicePrint += "\nItem              Quantity          Item Total";

        if (BQua != 0) {
            invoicePrint += "\nBumper cars          " + BQua + "                 " + BQua * BPrice;
        }
        if (PQua != 0) {
            invoicePrint += "\nPirate Ship          " + PQua + "                 " + PQua * PPrice;
        }
        if (SQua != 0) {
            invoicePrint += "\nIce skating          " + SQua + "                 " + SQua * SPrice;
        }
        if (GQua != 0) {
            invoicePrint += "\nGiant Wheel          " + GQua + "                 " + GQua * GPrice;
        }
        if (DQua != 0) {
            invoicePrint += "\nDrop tower           " + DQua + "                 " + DQua * DPrice;
        }

        // Add Fast Pass ticket information if applicable
        if (hasFastPass) {
            invoicePrint += "\nFast Pass Ticket     1                 " + 20;
        }

        invoicePrint += "\n\nTotal: " + total + " SR";
        invoicePrint += "\n****************************************************";
        return invoicePrint;
    }

}
