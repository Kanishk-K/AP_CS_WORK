/*
 █████╗ ████████╗████████╗███████╗███╗   ██╗████████╗██╗ ██████╗ ███╗   ██╗
██╔══██╗╚══██╔══╝╚══██╔══╝██╔════╝████╗  ██║╚══██╔══╝██║██╔═══██╗████╗  ██║
███████║   ██║      ██║   █████╗  ██╔██╗ ██║   ██║   ██║██║   ██║██╔██╗ ██║
██╔══██║   ██║      ██║   ██╔══╝  ██║╚██╗██║   ██║   ██║██║   ██║██║╚██╗██║
██║  ██║   ██║      ██║   ███████╗██║ ╚████║   ██║   ██║╚██████╔╝██║ ╚████║
╚═╝  ╚═╝   ╚═╝      ╚═╝   ╚══════╝╚═╝  ╚═══╝   ╚═╝   ╚═╝ ╚═════╝ ╚═╝  ╚═══╝

- So it seems that this repository for classwork has gotten a lot more attention than I anticipated.

- There are more people accessing my code than I've given access to meaning that it's being shared around.

- I'm fine with this just let me know that you're sharing it with someone so I can keep track to how big this is.

- Also if you do plan on using any code from here at least make some changes in variable names/method names(when applicable)
or logic for pretty obvious reasons.

*/
public class CityProject{
    public static class City{
        private String cityName;
        private int population;
        public City(String cityNameInput, int populationInput){
            cityName = cityNameInput;
            population = populationInput;
        }
        public String getCity(){
            return cityName;
        }
        public static int biggerThan(City City1Input, City City2Input){
            char[] City1 = City1Input.getCity().toLowerCase().toCharArray();
            char[] City2 = City2Input.getCity().toLowerCase().toCharArray();
            int Smallest = City1.length > City2.length ? City2.length:City1.length;
            int Count = 0;
            for(int i = 0;i<Smallest;i++){
                if (City1[i] != City2[i]){
                    Count = (int)City1[i]-(int)City2[i];
                    break;
                }
            }
            if(Count == 0 && City1.length != City2.length){
                Count = City1.length > City2.length ? -1:1;
            }
            return Count;
        }
        public String toString(){
            return "City: "+ cityName + "\tPopulation: " + population;
        } 
    }
    public static void main(String args[]){
        City c1 = new City("Bowlus", 500);
        City c2 = new City("Pierz", 1200);
        City c3 = new City("Upsala", 600);
        City c4 = new City("upsala", 600);
        City c5 = new City("bowl", 300);
        System.out.println(City.biggerThan(c1, c2));
        System.out.println(City.biggerThan(c2, c1));
        System.out.println(City.biggerThan(c1, c5));
        System.out.println(City.biggerThan(c3, c4));
        System.out.println(c3);
    }
}