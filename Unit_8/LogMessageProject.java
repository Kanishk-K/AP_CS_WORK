
import java.util.ArrayList;
import java.util.List;

public class LogMessageProject {
    public static class LogMessage{
        private String machineID;
        private String description;
        public LogMessage(String message){
            String[] split = message.split(":", 2);
            machineID = split[0];
            description = split[1];
        }
        public boolean containsWord(String keyword){
            String[] iterate = description.split(" ");
            for (String i : iterate){
                if (i.equals(keyword)){
                    return true;
                }
            }
            return false;
        }
        public String getMachineId(){
            return machineID;
        }
        public String getDescription(){
            return description;
        }
        public String toString(){
            return machineID + ":"+description;
        }
    }
    public static class SystemLog{
        private List<LogMessage> messageList;
        public SystemLog(ArrayList<LogMessage> list){
            messageList = list;
        }
        public List<LogMessage> removeMessages(String keyword){
            List<LogMessage> removed = new ArrayList<LogMessage>();
            for (int i = 0;i<messageList.size();i++){
                if (messageList.get(i).containsWord(keyword)){
                    removed.add(messageList.remove(i));
                    i--;
                }
            }
            return removed;
        }
    }
    public static void main(String args[]){
        LogMessage m1 = new LogMessage("server1:file not found @ disk1");
        LogMessage m2 = new LogMessage("server2:disk7 error");
        LogMessage m3 = new LogMessage("web3:disk3 read disk error");
        LogMessage m4 = new LogMessage("web5:disk");
        LogMessage m5 = new LogMessage("web3serv:disk3 read disk1 error @ Boot disk");
        System.out.println("Does your constructor work?");
        System.out.println("machineId: "+m1.getMachineId()+" description: "+ m1.getDescription());
        System.out.println("\n\nNow how about contains word???");
        System.out.println("test1: "+m1.containsWord("disk"));
        System.out.println("test2: "+m2.containsWord("disk"));
        System.out.println("test3: "+m3.containsWord("disk"));
        System.out.println("test4: "+m4.containsWord("disk"));
        System.out.println("test5: "+m5.containsWord("disk"));
        ArrayList<LogMessage> logs = new ArrayList<LogMessage>();
        List<LogMessage> removedLogs = new ArrayList<LogMessage>();
        logs.add(m1);
        logs.add(m2);
        logs.add(m3);
        logs.add(m4);
        logs.add(m5);
        System.out.println("************************************************");
        SystemLog logList = new SystemLog(logs);
        removedLogs = logList.removeMessages("disk");
        System.out.println("Here are the removed logs");
        for(LogMessage item : removedLogs)
        System.out.println(item);
        System.out.println("\nOur System logs after message of key word removal");
        for(LogMessage item : logs)
        System.out.println(item);
    }
}
