public class InviteProject {
    public static class Invitation{
        private String hostName;
        private String address;
        public Invitation(String n, String a){
            this.hostName = n;
            this.address = a;
        }
        public Invitation(String a){
            this.hostName = "Host";
            this.address = a;
        }
        public String returnName(){
            return hostName;
        }
        public void updateAddress(String a){
            address = a;
        }
        public String invite(String invitee){
            return "Dear " + invitee + ", please attend my event at " + address + ". See you then, " + hostName + ".";
        }
    }
    public static void main(String[] args) {
        Invitation person1 = new Invitation("Jim", "Hwy 257");
        Invitation person2 = new Invitation("697 clearwater way");
        System.out.println("Does my returnName work: "+ person1.returnName());
        //lets update an address now
        person2.updateAddress("288 county rd 87");
        //How about my invite method? Make sure it formats
        //exactly like directions indicate!!!
        System.out.println("\nperson1:\n"+person1.invite("Gary"));
        System.out.println("\nperson2:\n"+person2.invite("Susie"));
    }
}
