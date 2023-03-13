package prog2.exercise4.flight.booking.system;
import java.time.LocalDate;

public class FlightBooking {
    private String PassengerFullName;
    private LocalDate ReturnDate;
    private LocalDate depart;
    private String ticketNumber;
    private final String TicketNumber="A87787423";
    private String FlightCompany="Flights-of-Fancy";
    private int TotalPassengers;
    private double TotalTicketPrice;
    private int ChildPassenger;
    private int AdultPassenger;
    private String bookingClass;
    private String tripType;
    private String tripSource="";
    private final String tripDestination="";
    private String tripDestination1;
    private String cho;
    private String choi;
    private String choic;
    private String choi1;
    private String choic2;
    double DepartingTicketPrice1;
    double DepartingTicketPrice;
    double ReturnTicketPrice1;
    double ReturnTicketPrice;
    public String getCho()
    {
        return this.cho;
    }
    public String getChoi(){
        return this.choi;
    }
    public String getChoi1(){return this.choi1;}

        public FlightBooking(String PassengerFullName, LocalDate DepartureDate, LocalDate ReturnDate,int ChildPassenger,int AdultPassenger){
        this.PassengerFullName = PassengerFullName;
        this.depart= DepartureDate;
        this.ReturnDate = ReturnDate;
        this.ChildPassenger=ChildPassenger;
        this.AdultPassenger=AdultPassenger;
        setTotalPassengers(ChildPassenger,AdultPassenger);
    }
    public String getBookingClass() {return bookingClass;}
    public String getTripType(){return tripType;}

    public TripSource getTripSource(){return TripSource.valueOf(tripSource);}
    public String getTripDestination(){return tripDestination;}
    public String getTripDestination1(){return tripDestination1;}
    public String getPassengerFullName() {return PassengerFullName;}

    public String getFlightCompany() {return FlightCompany;}

    public LocalDate getDepartureDate() {return depart;}

    public LocalDate getReturnDate() {return ReturnDate;}
    public int getTotalPassengers() {return TotalPassengers;}

    public double getTotalTicketPrice() {return TotalTicketPrice;}

    public int getChildPassengers() {return ChildPassenger;}
    public int getAdultPassengers() {return AdultPassenger;}
    public String getTicketNumber() {return TicketNumber;}
    public void setPassengerFullName(String PassengerFullName) {
        this.PassengerFullName = PassengerFullName;
    }
    public void setChildPassengers(int ChildPassenger) {
        this.ChildPassenger = ChildPassenger;
    }
    public void setAdultPassengers(int AdultPassenger) {
        this.AdultPassenger = AdultPassenger;
    }
    public void setTotalPassengers(int ChildPassenger, int AdultPassenger) {
        this.TotalPassengers=ChildPassenger+AdultPassenger;
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
    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }
    public void setFlightCompany(String FlightCompany) {
        this.FlightCompany = FlightCompany;
    }
    enum BookingClass{FIRST,BUSINESS,ECONOMY}
    public void setBookingClass(String o){
        switch(o){
            case "1":
                bookingClass=String.valueOf(BookingClass.FIRST);
                break;
            case "2":
                bookingClass=String.valueOf(BookingClass.BUSINESS);
                break;
            case "3":
                bookingClass=String.valueOf(BookingClass.ECONOMY);
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
                choi=String.valueOf(TripSource.NANJING);
                choic=String.valueOf(Sourceairport.Nanjing_Lukou_International_Airport);
                break;
            case "2":
                choi=String.valueOf(TripSource.BEIJING);
                choic=String.valueOf(Sourceairport.Beijing_Capital_International_Airport);
                break;
            case "3":
                choi=String.valueOf(TripSource.SHANGHAI);
                choic=String.valueOf(Sourceairport.Shanghai_Pudong_International_Airport);
                break;
            case "4":
                choi=String.valueOf(TripSource.OULU);
                choic=String.valueOf(Sourceairport.Oulu_Airport);
                break;
            case "5":
                choi=String.valueOf(TripSource.HELSINKI);
                choic=String.valueOf(Sourceairport.Helsinki_Airport);
                break;
            case "6":
                choi=String.valueOf(TripSource.PARIS);
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
        if(choi.equals(choi1)){
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
                "From "+choi+" to "+choi1+"\n"+
                "Date of departure: " + depart + "\n" +
                "Date of return: " + ReturnDate + "\n" +
                "Total passengers: " + TotalPassengers + "\n" +
                "Total ticket price in Euros: " + TotalTicketPrice;
    }
}

