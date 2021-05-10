import java.util.ArrayList;
import java.util.Iterator;

public class SeatingChartProject {
    public static class Student{
        private String name;
        private int abs;
        public Student(String name,int abs){
            this.name = name;
            this.abs = abs;
        }
        public String getName(){
            return name;
        }
        public int getAbsenceCount(){
            return abs;
        }
    }
    public static class SeatingChart{
        private Student [][] chart;
        public SeatingChart(ArrayList<Student> list,int row, int col){
            chart = new Student [row][col];
            /*
            This will iterate through a list and allow me to peek at values
            through an array, an implementation could be done manually, however,
            this library offers faster processing as it operates closer to
            machine level.
            */
            Iterator<Student> iterator = list.iterator();
            /*
            The integer here is used as an index, if a value
            exists ahead, then it will continue.
            */
            for (int i=0;iterator.hasNext();i++){
                /*
                i divided by number of columns will give
                which column it is present in. i modulo column
                will give row. [12/6][12%6] -> [2][0]
                or [13/6][13%6] -> [2][1]
                */
                chart [i/col][i%col] = iterator.next();
            }
        }
        public void printChart(){
            for (int i=0;i<chart.length;i++){
                for (int j=0;j<chart[i].length;j++){
                    // If nothing exists in that location, skip over it.
                    if (chart[i][j] != null){
                        System.out.print(chart[i][j].getName() + "\t");
                    }
                }
                System.out.println();
            }
        }
        public int removeAbsentStudents(int allowedAbsences){
            int count = 0;
            for (int i=0;i<chart.length;i++){
                for (int j=0;j<chart[i].length;j++){
                    // Ensure we don't recieve a null-pointer exception.
                    if (chart[i][j] != null){
                        if (chart[i][j].getAbsenceCount() > allowedAbsences){
                            chart[i][j] = null;
                            count++;
                        }
                    }
                }
            }
            return count;
        }
    }
    public static void main(String args[]){
        final int allowAbs = 5;
        ArrayList<Student> list = new ArrayList<Student>();
        //giving you the data to work with....
        int row = 4;
        int col = 6;
        list.add(new Student("Sid", 3));
        list.add(new Student("Bob", 0));
        list.add(new Student("Mohamed", 1));
        list.add(new Student("Atri", 5));
        list.add(new Student("Ronit", 0));
        list.add(new Student("Anish", 3));
        list.add(new Student("Larry", 1));
        list.add(new Student("Jimmy", 2));
        list.add(new Student("Jeff", 6));
        list.add(new Student("Ruddy", 2));
        list.add(new Student("Alan", 0));
        list.add(new Student("Nathan", 0));
        list.add(new Student("Pratik", 6));
        list.add(new Student("Sally", 2));
        list.add(new Student("Sue", 7));
        list.add(new Student("Amy", 2));
        list.add(new Student("Jodi", 1));
        list.add(new Student("Sandra", 1));
        list.add(new Student("Margret", 0));
        list.add(new Student("Alice", 10));
        list.add(new Student("Shari", 0));
        list.add(new Student("Dorothy", 1));
        //The information is loaded into our ArrayList and here we go!!!!!
        SeatingChart grid = new SeatingChart(list, row, col);
        grid.printChart();
        grid.removeAbsentStudents(allowAbs);
        System.out.println();
        System.out.println("Our new seating chart after students were removed");
        grid.printChart();
    }
}
