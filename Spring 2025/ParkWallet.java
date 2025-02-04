class ParkWallet{
    //attributes
    private int tickets; //the absence of "static" allows each instance's value to be unique
    private static boolean holiday = false;  //having this as a static variable sets it the same for all instances of the class

    //constructor w/o parameter
    public ParkWallet(){
        this.tickets = 0;
    }

    //constructor w/ parameter
    public ParkWallet(int balance){
        this.tickets = balance;
    }

    //behavior
    public void addTickets(int additional){
        if (tickets >= 0){
            tickets += additional;
        }
        else if (tickets < 0 ){
            System.out.println("No negative values.");
        }
    }

    //behavior
    public boolean setTickets(){
        return tickets > 0;
    }

    //getter functions (allow for the private attributes to be accessed/modified outside of the file)
    public int getTickets(){
        return tickets;
    }

    public boolean getHoliday() {
        return holiday;
    }
}