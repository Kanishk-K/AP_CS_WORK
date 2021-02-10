package Unit_7;

public class TrailProject {
    public static class Trail {
        private int [] markers;
        public Trail (int [] m){
            markers = m;
        }
        public boolean isLevelTrailSegment(int start, int end){
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for (int i = start;i<end+1;i++){
                if (markers[i]>max){
                    max = markers[i];
                }
                if (markers[i]<min){
                    min = markers[i];
                }
            }
            return (max-min) <= 10;
        }
        public boolean isDifficult(){
            int count = 0;
            for (int i = 0;i<markers.length - 1;i++){
                if (Math.abs(markers[i] - markers[i+1]) >= 30){
                    count++;
                }
            }
            return count >= 3;
        }
    }
    public static void main(String[] args) {
        int [] marks = {100, 150, 105, 120, 90, 80, 50, 75, 75, 70, 80, 90, 100};
        Trail t1 = new Trail(marks);
        System.out.println("This trail segment is level: "+t1.isLevelTrailSegment(7, 10));
        System.out.println("This trail is deemed difficult: "+ t1.isDifficult());
        System.out.println("************Trail 2*************");
        int []marks2 = {-10, -4, 0, 1, 50, 79, 80, 75, 75, 60, 80, 90, 120, 125, 129, 158};
        t1 = new Trail(marks2);
        System.out.println("This trail segment is level: "+t1.isLevelTrailSegment(0, 3));
        System.out.println("This trail is deemed difficult: "+ t1.isDifficult());
    }
}
