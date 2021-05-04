package Review;
import java.util.ArrayList;

public class AirplanesProject {
    public static class Flight {
        private int passenger;
        private int capacity;
        private double price;
        public Flight(int pass, double pr, int c){
            passenger = pass;
            price = pr;
            capacity = c;
        }
        public int getNumPassengers(){
            return passenger;
        }
        public double getPrice(){
            return price;
        }
        public int getCapacity(){
            return capacity;
        }
        public String toString(){
            return "passengers: "+passenger + "\n" + "price: "+price + "\n" + "capacity: " + capacity +"\n\n";
        }
    }
    public static class Airport {
        private ArrayList<Flight> allFlights;
        public Airport(ArrayList<Flight> f){
            allFlights = f;
        }
        public double getTotalRevenue(){
            double response = 0;
            for (Flight i : allFlights){
                response += i.getNumPassengers() > i.getCapacity() ? (i.getCapacity()*i.getPrice()) : (i.getNumPassengers()*i.getPrice());
            }
            return response;
        }
        public int updateFlights(){
            int removedPass = 0;
            int end = allFlights.size();
            for (int i=0;i<end;i++){
                if (((double)allFlights.get(i).getNumPassengers())/((double)allFlights.get(i).getCapacity()) < .2){
                    removedPass += allFlights.remove(i).getNumPassengers();
                    i--;
                    end--;
                }
            }
            return removedPass;
        }
        public String toString()
        {
            return allFlights.toString();
        }
    }
    public static void main(String[] args) {
        ArrayList<Flight> airPort = new ArrayList<Flight>();
        airPort.add(new Flight(10, 100.50, 60));
        airPort.add(new Flight(25, 50, 30));
        airPort.add(new Flight(20, 100, 120));
        airPort.add(new Flight(50, 200, 40));
        Airport a1 = new Airport(airPort);
        System.out.println("Total Revenue: " + a1.getTotalRevenue());
        System.out.println("Total passengers Removed: " + a1.updateFlights());
        System.out.println("flights still existing....\n" + a1);
        airPort.add(0, new Flight(13, 210, 70));
        airPort.add(0, new Flight(11, 100.50, 60));
        System.out.println("\n\nTotal passengers Removed: " + a1.updateFlights());
    }
}
