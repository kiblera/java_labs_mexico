package part_06;

class AirportController {

    public static void main(String[] args) {
//        Airport SFO = new Airport();
//        Airport ORD = new Airport(150);
//        Airport CUN = new Airport(5000, 60);

        Regional JFK = new Regional(60000, 70, false, true);

        JFK.setCheckpoints(6);
        JFK.setName("JFK");

        System.out.println(JFK.getCapacity());
        System.out.println(JFK.isNopassport());
        System.out.println(JFK.isDutyfree());


        // dynamic method dispatch
        Airport airport = new Airport();
        airport.takeOff();

        airport = new Domestic();
        airport.takeOff();

        airport = new Regional();
        airport.takeOff();


    }



}

class Airport {

    //creating variables of super class
    private int capacity;
    private int flightnum;
    public int gates;
    private int checkpoints;
    private String name;

    public void takeOff(){
        System.out.println("shwoooosh!!!");
    }

    //creating constructors
    public Airport(int capacity, int gates) {
        this.capacity = capacity;
        this.gates = gates;
    }

    public Airport(int gates) {
        this.gates = gates;

    }

    public Airport() { }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getFlightnum() {
        return flightnum;
    }

    public void setFlightnum(int flightnum) {
        this.flightnum = flightnum;
    }

    public int getGates() {
        return gates;
    }

    public void setGates(int gates) {
        this.gates = gates;
    }

    public int getCheckpoints() {
        return checkpoints;
    }

    public void setCheckpoints(int checkpoints) {
        this.checkpoints = checkpoints;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Domestic extends Airport {

    private boolean nopassport;

    public Domestic(int capacity, int gates, boolean nopassport) {
        super(capacity, gates);
        this.nopassport = nopassport;
    }

    public Domestic(int gates, boolean nopassport) {
        super(gates);
        this.nopassport = nopassport;
    }

    public Domestic(boolean nopassport) {
        this.nopassport = nopassport;
    }


    public void takeOff(){
        System.out.println("shwosh!!!");
    }

    public boolean isNopassport() {
        return nopassport;
    }

    public void setNopassport(boolean nopassport) {
        this.nopassport = nopassport;
    }

    public Domestic() {
    super.setCapacity(50000);
    super.setFlightnum(300);
    super.setGates(30);
    super.setCheckpoints(3);

    }
}

class Regional extends Domestic {

    private boolean dutyfree;

    public Regional(int capacity, int gates, boolean nopassport, boolean dutyfree) {
        super(capacity, gates, nopassport);
        this.dutyfree = dutyfree;
    }

    public Regional(int gates, boolean nopassport, boolean dutyfree) {
        super(gates, nopassport);
        this.dutyfree = dutyfree;
    }

    public Regional(boolean nopassport, boolean dutyfree) {
        super(nopassport);
        this.dutyfree = dutyfree;
    }

    public Regional(boolean dutyfree) {
        this.dutyfree = dutyfree;
    }

    public void takeOff(){
        System.out.println("shwish!!!");
    }

    public Regional() { }

    public boolean isDutyfree() {
        return dutyfree;
    }

    public void setDutyfree(boolean dutyfree) {
        this.dutyfree = dutyfree;
    }

    public String test() {
        String name = getName();
        int cap = getCapacity();
        int gatetest = gates;
        return "tesdt";
    }


}