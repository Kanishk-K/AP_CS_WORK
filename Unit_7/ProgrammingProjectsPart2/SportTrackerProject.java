package Unit_7.ProgrammingProjectsPart2;

public class SportTrackerProject {
    public static class Sport{
        private int intensity,difficulty,players;
        public Sport(int intensity, int difficulty, int players){
            this.intensity = intensity;
            this.difficulty = difficulty;
            this.players = players;
        }
        public int getIntensity(){
            return intensity;
        }
        public int getDifficulty(){
            return difficulty;
        }
        public int getPlayers(){
            return players;
        }
        public String toString(){
            return "This sport is " + getIntensity() + " units intense.\nListed as " + getDifficulty() + " units difficult.\nCan allow " + getPlayers() + " Players.\n";
        }
    }
    public static class WaterSport extends Sport{
        private int distanceFromShore;
        public WaterSport(int intensity, int difficulty, int players,int distanceFromShore){
            super(intensity,difficulty,players);
            this.distanceFromShore = distanceFromShore;
        }
        public int getDistance(){
            return distanceFromShore;
        }
        public String toString(){
            return super.toString() + "It is performed " + getDistance() + " units away from shore.\n";
        }
    }
    public static class LandSport extends Sport{
        private String terrain;
        public LandSport(int intensity, int difficulty, int players,String terrain){
            super(intensity,difficulty,players);
            this.terrain = terrain;
        }
        public String getTerrain(){
            return terrain;
        }
        public String toString(){
            return super.toString() + "It is performed on " + getTerrain() + " terrain.\n";
        }
    }
    public static class AirSport extends Sport{
        private int altitude;
        public AirSport(int intensity, int difficulty, int players,int altitude){
            super(intensity,difficulty,players);
            this.altitude = altitude;
        }
        public int getAltitude(){
            return altitude;
        }
        public String toString(){
            return super.toString() + "It is performed " + getAltitude() + " units in the air.\n";
        }
    }
    public static class Surfing extends WaterSport{
        private String surfboardName;
        public Surfing(int intensity, int difficulty, int players,int distanceFromShore, String surfboardName){
            super(intensity,difficulty,players,distanceFromShore);
            this.surfboardName = surfboardName;
        }
        public String getSurfboardName(){
            return surfboardName;
        }
        public String toString(){
            return super.toString() + "The surfboard's name is " + getSurfboardName() + ".\n";
        }
    }
    public static class WakeBoarding extends WaterSport{
        private String boatName;
        public WakeBoarding(int intensity, int difficulty, int players,int distanceFromShore, String boatName){
            super(intensity,difficulty,players,distanceFromShore);
            this.boatName = boatName;
        }
        public String getBoatName(){
            return boatName;
        }
        public String toString(){
            return super.toString() + "The boat's name is " + getBoatName() + ".\n";
        }
    }
    public static class Soccer extends LandSport{
        private String teamName;
        public Soccer(int intensity, int difficulty, int players,String terrain, String teamName){
            super(intensity,difficulty,players,terrain);
            this.teamName = teamName;
        }
        public String getTeamName(){
            return teamName;
        }
        public String toString(){
            return super.toString() + "The team's name is " + getTeamName() + ".\n";
        }
    }
    public static class Basketball extends LandSport{
        private String league;
        public Basketball(int intensity, int difficulty, int players,String terrain, String league){
            super(intensity,difficulty,players,terrain);
            this.league = league;
        }
        public String getLeague(){
            return league;
        }
        public String toString(){
            return super.toString() + "The league's name is " + getLeague() + ".\n";
        }
    }
    public static class Skydiving extends AirSport{
        private double cost;
        public Skydiving(int intensity, int difficulty, int players,int altitude,double cost){
            super(intensity,difficulty,players,altitude);
            this.cost = cost;
        }
        public double getCost(){
            return cost;
        }
        public String toString(){
            return super.toString() + "It costs $" + getCost() + " to attend.\n";
        }
    }
    public static void main(String args[]){
        System.out.println(new Surfing(2, 3, 1, 200, "The Wave200"));
        System.out.println(new WakeBoarding(4, 5, 2, 50, "Lightning"));
        System.out.println(new Soccer(5, 3, 12, "Grass", "Thunder"));
        System.out.println(new Basketball(4, 5, 8, "Gym", "High-School"));
        System.out.println(new Skydiving(10, 2, 2, 3000, 200.24));
    }
}
