package prog2.exercise4.flight.booking.system;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args ) {
        System.out.println("please enter your full name");
        Scanner getPassengerFullName = new Scanner(System.in);
        String passengerFullName = getPassengerFullName.nextLine();
        System.out.println("please enter your DepartureDate");
        Scanner getDepartureDate = new Scanner(System.in);
        String DepartureDate = getDepartureDate.nextLine();
        LocalDate depart = LocalDate.parse(DepartureDate);
        System.out.println("please enter your ReturnDate");
        Scanner getReturnDate = new Scanner(System.in);
        String ReturnDate = getReturnDate.nextLine();
        LocalDate returnDate = LocalDate.parse(ReturnDate);
        System.out.println("please enter the number of childPassengers");
        Scanner getChildPassengers = new Scanner(System.in);
        Integer ChildPassengers = getChildPassengers.nextInt();
        System.out.println("please enter the number of adultPassengers");
        Scanner getAdultPassengers = new Scanner(System.in);
        Integer AdultPassengers = getAdultPassengers.nextInt();
        System.out.println("please enter the number of your choice of class(only number)");
        System.out.println("1.First");
        System.out.println("2.Business");
        System.out.println("3.Economy");
        Scanner getBookingClass = new Scanner(System.in);
        String bookingClass = getBookingClass.nextLine();
        System.out.println("please enter the number of your choice of triptype(only number)");
        System.out.println("1.On way");
        System.out.println("2.Return");
        Scanner getTripType = new Scanner(System.in);
        String tripType = getTripType.nextLine();
        System.out.println("please enter the number of your choice of destination(only number)");
        System.out.println("1.Nanjing");
        System.out.println("2.Beijing");
        System.out.println("3.Shanghai");
        System.out.println("4.Oulu");
        System.out.println("5.Helsinki");
        System.out.println("6.Paris");
        Scanner getTripSource = new Scanner(System.in);
        String tripSource = getTripSource.nextLine();
        System.out.println("please enter the number of your choice of destination(only number)");
        System.out.println("1.Nanjing");
        System.out.println("2.Beijing");
        System.out.println("3.Shanghai");
        System.out.println("4.Oulu");
        System.out.println("5.Helsinki");
        System.out.println("6.Paris");
        Scanner getTripDestination = new Scanner(System.in);
        String tripDestination = getTripDestination.nextLine();
        String tripDestination1 = null;
        if (tripSource.equals(tripDestination)) {
            System.out.println("please enter the TripDestination1");
            Scanner getTripDestination1 = new Scanner(System.in);
            tripDestination = getTripDestination1.nextLine();
        }
        Long cha = returnDate.toEpochDay()-depart.toEpochDay();
        if (cha==0){
          returnDate=returnDate.plusDays(2);
        }
        if (cha==1){
            returnDate=returnDate.plusDays(1);
        }
        FlightBooking fb = new FlightBooking(passengerFullName, depart, returnDate, ChildPassengers, AdultPassengers);
        fb.setTotalPassengers(ChildPassengers, AdultPassengers);
        fb.setBookingClass(bookingClass);
        fb.setTripType(tripType);
        fb.setTripSource(tripSource);
        fb.setTripDestination(tripDestination, tripDestination1);
        fb.setTotalTicketPrice();
        System.out.println(fb);
        if (cha==0){
            System.out.println("\n"+"IMPORTANT NOTICE: As per our policy, the return date was changed because it was \n" +
                    "less than two days apart from your departure date.");
        }
        if (cha==1){
            System.out.println("\n"+"IMPORTANT NOTICE: As per our policy, the return date was changed because it was \n" +
                    "less than two days apart from your departure date.");
        }
    }
}
