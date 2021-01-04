package Unit_6.ProgrammingProjects2;
import java.lang.Comparable;
import java.text.NumberFormat;

public class TunesProject {
    public static class Sorts {
        //-----------------------------------------------------------------
        // Sorts the specified array of integers using the selection
        // sort algorithm.
        //-----------------------------------------------------------------
        public static void selectionSort (int[] numbers){
            int min, temp;
            for (int index = 0; index < numbers.length-1; index++){
                min = index;
                for (int scan = index+1; scan < numbers.length; scan++){
                    if (numbers[scan] < numbers[min]){
                        min = scan;
                    }
                }
                // Swap the values
                temp = numbers[min];
                numbers[min] = numbers[index];
                numbers[index] = temp;
            }
        }       
        //-----------------------------------------------------------------
        // Sorts the specified array of integers using the selection
        // sort algorithm.
        //-----------------------------------------------------------------
        public static void selectionSort (int[] numbers, int fillTo){
            int min, temp;
            for (int index = 0; index < fillTo-1; index++){
                min = index;
                for (int scan = index+1; scan < fillTo; scan++){
                    if (numbers[scan] < numbers[min]){
                        min = scan;
                    }
                }
                // Swap the values
                temp = numbers[min];
                numbers[min] = numbers[index];
                numbers[index] = temp;
            }
        }
        //-----------------------------------------------------------------
        // Sorts the specified array of integers using the insertion
        // sort algorithm.
        //-----------------------------------------------------------------
        public static void insertionSort (int[] numbers){
            for (int index = 1; index < numbers.length; index++){
                int key = numbers[index];
                int position = index;
                // shift larger values to the right
                while (position > 0 && numbers[position-1] > key){
                    numbers[position] = numbers[position-1];
                    position--;
                }
                numbers[position] = key;
            }
        }
        //-----------------------------------------------------------------
        // Sorts the specified array of objects using the insertion
        // sort algorithm.
        //-----------------------------------------------------------------
        public static void insertionSort (Comparable[] objects){
            for (int index = 1; index < objects.length; index++){
                Comparable key = objects[index];
                int position = index;
                // shift larger values to the right
                while (position > 0 && objects[position-1].compareTo(key) > 0){
                    objects[position] = objects[position-1];
                    position--;
                }
                objects[position] = key;
            }
        }
        //-----------------------------------------------------------------
        // Sorts the specified array of objects using the insertion
        // sort algorithm. Using a second parameter if the array isn't filled
        // To capacity
        //-----------------------------------------------------------------
        public static void insertionSort (Comparable[] objects, int fillTo){
            for (int index = 1; index < fillTo; index++){
                Comparable key = objects[index];
                int position = index;
                // shift larger values to the right
                while (position > 0 && objects[position-1].compareTo(key) > 0){
                    objects[position] = objects[position-1];
                    position--;
                }
                objects[position] = key;
            }
        }
    }
    public static class CD implements Comparable{
        private String title, artist;
        private double cost;
        private int tracks;
        //-----------------------------------------------------------------
        // Creates a new CD with the specified information.
        //-----------------------------------------------------------------
        public CD (String name, String singer, double price, int numTracks){
            title = name;
            artist = singer;
            cost = price;
            tracks = numTracks;
        }
        public int compareTo (Object obj){
            CD ob2 = (CD)obj;
            return title.compareTo(ob2.title);
        }
        //-----------------------------------------------------------------
        // Returns a description of this CD.
        //-----------------------------------------------------------------
        public String toString(){
            NumberFormat fmt = NumberFormat.getCurrencyInstance();
            String description;
            description = fmt.format(cost) + "\t" + tracks + "\t";
            description += title + "\t" + artist;
            return description;
        }
    }
    public static class CDCollection{
        private CD[] collection;
        private int count;
        private double totalCost;
        //-----------------------------------------------------------------
        // Creates an initially empty collection.
        //-----------------------------------------------------------------
        public CDCollection (){
            collection = new CD[100];
            count = 0;
            totalCost = 0.0;
        }
        //-----------------------------------------------------------------
        // Adds a CD to the collection, increasing the size of the
        // collection if necessary.
        //-----------------------------------------------------------------
        public void addCD (String title, String artist, double cost, int tracks){
            if (count == collection.length){
                increaseSize();
            }
            collection[count] = new CD (title, artist, cost, tracks);
            totalCost += cost;
            count++;
        }
        //-----------------------------------------------------------------
        // Returns a report describing the CD collection.
        //-----------------------------------------------------------------
        public String toString(){
            NumberFormat fmt = NumberFormat.getCurrencyInstance();
            String report = "******************************************\n";
            report += "My CD Collection\n\n";
            report += "Number of CDs: " + count + "\n";
            report += "Total cost: " + fmt.format(totalCost) + "\n";
            report += "Average cost: " + fmt.format(totalCost/count);
            report += "\n\nCD List:\n\n";
            // This was litterally all I added and it worked.
            Sorts.insertionSort(collection, count);
            for (int cd = 0; cd < count; cd++){
                report += collection[cd].toString() + "\n";
            }
            return report;
        }
        //-----------------------------------------------------------------
        // Doubles the size of the collection by creating a larger array
        // and copying the existing collection into it.
        //-----------------------------------------------------------------
        private void increaseSize (){
            CD[] temp = new CD[collection.length * 2];
            for (int cd = 0; cd < collection.length; cd++)
            temp[cd] = collection[cd];
            collection = temp;
        }
    }
    public static void main (String[] args){
        CDCollection music = new CDCollection ();
        music.addCD ("By the Way", "Red Hot Chili Peppers", 14.95, 10);
        music.addCD ("Come On Over", "Shania Twain", 14.95, 16);
        music.addCD ("Soundtrack", "The Producers", 17.95, 33);
        music.addCD ("Play", "Jennifer Lopez", 13.90, 11);
        System.out.println (music);
        music.addCD ("Double Live", "Garth Brooks", 19.99, 26);
        music.addCD ("Greatest Hits", "Stone Temple Pilots", 15.95, 13);
        System.out.println (music);
    }
}
