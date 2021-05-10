
public class RouteCipherProject {
    public static class RouteCipher {
        /*
            Consider using a char array next time.
            It would save a lot more space in terms
            of memory. An empty or 1 item string costs 40 bytes
            of allocated memory while a char primitive
            would only cost 2 bytes. That's nearly 20x
            more efficient. If this was being used regularly
            with many users this small change could potentially
            save thousands of dollars in runtime and memory!
        */
        private String [][] letterBlock;
        private int numRows;
        private int numCols;
        RouteCipher(int r, int c){
            numRows = r;
            numCols = c;
            letterBlock = new String [r][c];
        }
        private void fillBlock(String str){
            /*
                Try and fill the array with as many
                chars avaliable in the string.
            */
            for (int i=0;i<str.length();i++){
                letterBlock[i/numCols][i%numCols] = str.substring(i, i+1);
            }
            /*
                Check in the array for any null values.
                If the value in a spot is not null let it remain.
                Otherwise replace it with a capital "A".
            */
            for (int i = 0;i<letterBlock.length;i++){
                for(int j = 0;j<letterBlock[i].length;j++){
                    letterBlock[i][j] = letterBlock[i][j] != null?letterBlock[i][j]:"A";
                }
            }
        }
        private String encryptBlock(){
            String returnValue = "";
            for (int i = 0;i<numCols;i++){
                for (int j = 0;j<numRows;j++){
                    returnValue += letterBlock[j][i];
                    letterBlock[j][i] = null;
                }
            }
            return returnValue;
        }
        public String encryptMessage(String mes){
            String returnValue = "";
            for (int i = 0;i<mes.length()/(numRows*numCols);i++){
                fillBlock(mes.substring(i*(numCols*numRows), (i+1) * (numCols*numRows)));
                returnValue += encryptBlock();
            }
            if (mes.length()%(numRows*numCols) > 0){
                fillBlock(mes.substring((numRows*numCols) * (mes.length()/(numRows*numCols)), mes.length()));
                returnValue += encryptBlock();
            }
            return returnValue;
        }
    }
    public static void main(String args[]){
        String p1 = "Meet at midnight";
        String p2 = "Finding a needle in hay stack is easy if you set hay on fire";
        RouteCipher r1 = new RouteCipher(2, 3);
        System.out.println(r1.encryptMessage(p1));
        RouteCipher r2 = new RouteCipher(3, 5);
        System.out.println(r2.encryptMessage(p2));
    }
}
