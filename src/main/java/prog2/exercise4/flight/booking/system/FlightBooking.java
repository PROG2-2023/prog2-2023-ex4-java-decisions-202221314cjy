package prog2.exercise4.flight.booking.system;
import java.time.LocalDate;

public class FlightBooking {
    private final String PassengerFullName;
    private LocalDate ReturnDate;
    private LocalDate depart;
    private final String TicketNumber="A87787423";
    private String FlightCompany="Flights-of-Fancy";
    private int TotalPassengers;
    private double TotalTicketPrice;
    private final int ChildPassenger;
    private final int AdultPassenger;
    private String bookingClass;
    private String tripType;
    private String tripSource="";
    private final String tripDestination="";
    private String tripDestination1;
    private String ch;
    private String cho;
    private String choic;
    private String choi1;
    private String choic2;
    double DepartingTicketPrice1;
    double DepartingTicketPrice;
    double ReturnTicketPrice1;
    double ReturnTicketPrice;
public String getCh()
{
    return this.ch;
}
    public String getCho()
    {
        return this.cho;
    }
    public String getChoi1(){return this.choi1;}
{}    FlightBooking(String PassengerFullName, LocalDate DepartureDate, LocalDate ReturnDate,int ChildPassenger,int AdultPassenger){
        this.PassengerFullName = PassengerFullName;
        this.depart= DepartureDate;
        this.ReturnDate = ReturnDate;
        this.ChildPassenger=ChildPassenger;
        this.AdultPassenger=AdultPassenger;
        setTotalPassengers(ChildPassenger,AdultPassenger);
    }

    public void setTotalPassengers(int ChildPassenger, int AdultPassenger) {
        this.TotalPassengers=ChildPassenger+AdultPassenger;
    }
    enum BookingClass{FIRST,BUSINESS,ECONOMY}
    public void setBookingClass(String bookingClass){
        switch(bookingClass){
            case "1":
                ch=String.valueOf(BookingClass.FIRST);
                break;
            case "2":
                ch=String.valueOf(BookingClass.BUSINESS);
                break;
            case "3":
                ch=String.valueOf(BookingClass.ECONOMY);
                break;
        }
    }
    enum TripType{ONE_WAY,RETURN}
    public void setTripType(String tripType){
    switch (tripType){
        case "1":
            cho=String.valueOf(TripType.ONE_WAY);
            break;
        case "2":
            cho=String.valueOf(TripType.RETURN);
            break;
    }

    }
    enum TripSource{NANJING,BEIJING,SHANGHAI,OULU,HELSINKI,PARIS}
    enum Sourceairport{Nanjing_Lukou_International_Airport,Beijing_Capital_International_Airport, Shanghai_Pudong_International_Airport, Oulu_Airport,Helsinki_Airport,Paris_Charles_de_Gaulle_Airport}
    public void setTripSource(String tripSource){
    switch (tripSource){
        case "1":
            this.tripSource=String.valueOf(TripSource.NANJING);
            choic=String.valueOf(Sourceairport.Nanjing_Lukou_International_Airport);
            break;
        case "2":
            this.tripSource=String.valueOf(TripSource.BEIJING);
            choic=String.valueOf(Sourceairport.Beijing_Capital_International_Airport);
            break;
        case "3":
            this.tripSource=String.valueOf(TripSource.SHANGHAI);
            choic=String.valueOf(Sourceairport.Shanghai_Pudong_International_Airport);
            break;
        case "4":
            this.tripSource=String.valueOf(TripSource.OULU);
            choic=String.valueOf(Sourceairport.Oulu_Airport);
            break;
        case "5":
            this.tripSource=String.valueOf(TripSource.HELSINKI);
            choic=String.valueOf(Sourceairport.Helsinki_Airport);
            break;
        case "6":
            this.tripSource=String.valueOf(TripSource.PARIS);
            choic=String.valueOf(Sourceairport.Paris_Charles_de_Gaulle_Airport);
            break;
    }
    }
    enum TripDestination{NANJING,BEIJING,SHANGHAI,OULU,HELSINKI,PARIS}
    enum Destinationairport{Nanjing_Lukou_International_Airport,Beijing_Capital_International_Airport, Shanghai_Pudong_International_Airport, Oulu_Airport,Helsinki_Airport,Paris_Charles_de_Gaulle_Airport}
    public void setTripDestination(String tripDestination,String tripDestination1){
        switch (tripDestination){
            case "1":
                choi1=String.valueOf(TripDestination.NANJING);
                choic2=String.valueOf(Destinationairport.Nanjing_Lukou_International_Airport);
                break;
            case "2":
                choi1=String.valueOf(TripDestination.BEIJING);
                choic2=String.valueOf(Destinationairport.Beijing_Capital_International_Airport);
                break;
            case "3":
                choi1=String.valueOf(TripDestination.SHANGHAI);
                choic2=String.valueOf(Destinationairport.Shanghai_Pudong_International_Airport);
                break;
            case "4":
                choi1=String.valueOf(TripDestination.OULU);
                choic2=String.valueOf(Destinationairport.Oulu_Airport);
                break;
            case "5":
                choi1=String.valueOf(TripDestination.HELSINKI);
                choic2=String.valueOf(Destinationairport.Helsinki_Airport);
                break;
            case "6":
                choi1=String.valueOf(TripDestination.PARIS);
                choic2=String.valueOf(Destinationairport.Paris_Charles_de_Gaulle_Airport);
                break;
        }
        if(tripSource.equals(choi1)){
            switch (tripDestination1){
                case "1":
                    choi1=String.valueOf(TripDestination.NANJING);
                    choic2=String.valueOf(Destinationairport.Nanjing_Lukou_International_Airport);
                    break;
                case "2":
                    choi1=String.valueOf(TripDestination.BEIJING);
                    choic2=String.valueOf(Destinationairport.Beijing_Capital_International_Airport);
                    break;
                case "3":
                    choi1=String.valueOf(TripDestination.SHANGHAI);
                    choic2=String.valueOf(Destinationairport.Shanghai_Pudong_International_Airport);
                    break;
                case "4":
                    choi1=String.valueOf(TripDestination.OULU);
                    choic2=String.valueOf(Destinationairport.Oulu_Airport);
                    break;
                case "5":
                    choi1=String.valueOf(TripDestination.HELSINKI);
                    choic2=String.valueOf(Destinationairport.Helsinki_Airport);
                    break;
                case "6":
                    choi1=String.valueOf(TripDestination.PARIS);
                    choic2=String.valueOf(Destinationairport.Paris_Charles_de_Gaulle_Airport);
                    break;
            }
        }
    }

    public String getBookingClass() {
        return bookingClass;
    }
    public String getTripType(){return tripType;}

    public TripSource getTripSource(){return TripSource.valueOf(tripSource);}
    public String getTripDestination(){return tripDestination;}
    public String getTripDestination1(){return tripDestination1;}
    public String getPassengerFullName() {
        return PassengerFullName;
    }

    public String getFlightCompany() {
        return FlightCompany;
    }

    public LocalDate getDepartureDate() {return depart;
    }

    public LocalDate getReturnDate() {return ReturnDate;
    }





    public int getTotalPassengers() {
        return TotalPassengers;
    }

    public double getTotalTicketPrice() {
        return TotalTicketPrice;
    }

    public int getChildPassengers() {
        return ChildPassenger;
    }

    public String getTicketNumber() {
        return TicketNumber;
    }

    public int getAdultPassengers() {
        return AdultPassenger;
    }

    public void setDepartureDate(LocalDate depart){
        this.depart=depart;
    }
    public void setReturnDate(LocalDate returnDate){
    this.ReturnDate=returnDate;
    }
    public void setTripSource(){
    this.tripSource=tripSource;
    }
    public void setFlightCompany(String FlightCompany) {
        this.FlightCompany = FlightCompany;
    }
    public void setDepartingTicketPrice(int ChildPassenger,int AdultPassenger) {
        int x = Integer.parseInt(tripSource);
        int y = Integer.parseInt(tripDestination);
        int z = Integer.parseInt(bookingClass);
        if (x <= 3&&y<=3) {
            DepartingTicketPrice1=(300+300*0.1+300*0.05)*(ChildPassenger+AdultPassenger);
        }
        if(x>=4&&x<=5&&y>=4&&y<=5){
            DepartingTicketPrice1=(300+300*0.1+300*0.05)*(ChildPassenger+AdultPassenger);
        }
        else{
            DepartingTicketPrice1=(300+300*0.15+0.1*300)*(ChildPassenger+AdultPassenger);
        }
        if(z==1){
            DepartingTicketPrice=DepartingTicketPrice1+250;
        }
        if(z==2){
            DepartingTicketPrice=DepartingTicketPrice1+150;
        }
        if(z==3){
            DepartingTicketPrice=DepartingTicketPrice1+50;
        }
    }
    public void setReturnTicketPrice() {
        int x = Integer.parseInt(tripSource);
        int y = Integer.parseInt(tripDestination);
        int z = Integer.parseInt(bookingClass);
        if (x <= 3&&y<=3) {
            ReturnTicketPrice1= (300+300*0.1+300*0.05)*(ChildPassenger+AdultPassenger);
        }
        else if(x>=4&&x<=5&&y>=4&&y<=5){
            ReturnTicketPrice1=(300+300*0.1+300*0.05)*(ChildPassenger+AdultPassenger);
        }
        else{
            ReturnTicketPrice1=(300+300*0.15+0.1*300)*(ChildPassenger+AdultPassenger);
        }
        if(z==1){
            ReturnTicketPrice=ReturnTicketPrice1+250;
        }
        if(z==2){
            ReturnTicketPrice=ReturnTicketPrice1+150;
        }
        if(z==3){
            ReturnTicketPrice=ReturnTicketPrice1+50;
        }
    }
    public void setTotalTicketPrice(){
    this.TotalTicketPrice=DepartingTicketPrice+ReturnTicketPrice;
    }
    public String toString(){
        return  "Thank you for booking your flight with " + FlightCompany + "." +"\n"+
                "Following are the details of your booking and the trip:" + "\n" +
                "Ticket Number: " + TicketNumber + "\n" +"Passenger Fullname: "+PassengerFullName+"\n"+
                "From "+tripSource+" to "+choi1+"\n"+
                "Date of departure: " + depart + "\n" +
                "Date of return: " + ReturnDate + "\n" +
                "Total passengers: " + TotalPassengers + "\n" +
                "Total ticket price in Euros: " + TotalTicketPrice;
    }
}
