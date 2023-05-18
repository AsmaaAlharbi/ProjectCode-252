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
import Builder.InvoiceBuilder;
import Builder.InvoiceDirector;
import Builder.Invoice;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.*;

// Factory
import Factory.EventFactory;
import Factory.Event;

//Bridge
import Bridge.Ticket;
import Bridge.STLATicket;
import Bridge.STLATicketImplementor;

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

        String date = selectDate(in);

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

        System.out.println(generateTicket(date));
        invoice(userName);

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

    public static String selectDate(Scanner in) {

        ArrayList<String> dateList = new ArrayList<>();
        dateList.add("01/03/2023  Wednesday ");
        dateList.add("02/03/2023  Thursday ");
        dateList.add("03/03/2023  Friday ");
        dateList.add("04/03/2023  Saturday ");
        dateList.add("05/03/2023  Sunday ");
        dateList.add("06/03/2023  Monday ");
        dateList.add("07/03/2023  Tuesday ");

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
        String selectedDate = dateList.get(selection - 1);
        System.out.println("You selected: " + selectedDate + "\n");
        return selectedDate;

    }

    public static void selectEvent(String select, Scanner in) {
        EventFactory eventFactory = new EventFactory();
        Event event = eventFactory.createEvent(select);
        int quaTemp;

        if (event == null) {
            System.out.println("Wrong selection!");
            return;
        }

        quaTemp = askQuantity(in);
        event.updateQuantity(quaTemp);

    }

    private static int askQuantity(Scanner in) {
        System.out.print("Quantity: ");
        return in.nextInt();
    }

    public static void invoice(String userName) {

        InvoiceBuilder invoiceBuilder = new InvoiceBuilder();
        InvoiceDirector invoiceDirector = new InvoiceDirector(invoiceBuilder);

        invoiceDirector.constructInvoice(userName, new String[][]{
            {"Bumper cars", Integer.toString(BQua), Integer.toString(BQua * BPrice)},
            {"Pirate Ship", Integer.toString(PQua), Integer.toString(PQua * PPrice)},
            {"Ice skating", Integer.toString(SQua), Integer.toString(SQua * SPrice)},
            {"Giant Wheel", Integer.toString(GQua), Integer.toString(GQua * GPrice)},
            {"Drop tower", Integer.toString(DQua), Integer.toString(DQua * DPrice)}
        });

        Invoice invoice = invoiceBuilder.getInvoice();
        System.out.println(invoice);

    }

    public static String generateTicket(String date) {
        Ticket ticket = new STLATicket(new STLATicketImplementor());
        return ticket.generateTicket(date);
    }

}
