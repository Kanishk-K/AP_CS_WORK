
public class HiddenWordProject {
    public static class  HiddenWord{
        private String secretWord;
        public HiddenWord(String secretWord){
            this.secretWord = secretWord;
        }
        public String getHint(String hint){
            String response = "";
            for(int i=0;i<hint.length();i++){
                if (hint.substring(i,i+1).equalsIgnoreCase(secretWord.substring(i,i+1))){
                    response += hint.substring(i,i+1);
                }
                /*
                    Since it failed the above if statement, that means the letter 
                    in the hint is not in the right position. Thus this else 
                    statement tries to find if the letter exists in the string 
                    at all. indexOf returns -1 if it does not exist in the 
                    string. Therefore if the character is not in the right position, 
                    yet is present in the string then it must be a  +.
                */
                else if (hint.indexOf(hint.substring(i,i+1)) != -1){
                    response += "+";
                }
                /*
                    If the character is not in the right location, and not in the 
                    string. It must return a "*" in that position.
                */
                else{
                    response += "*";
                }
            }
            return response;
        }
    }
    public static void main(String[] args) {
        HiddenWord tough = new HiddenWord("JAVAROCKS");
        System.out.println(tough.getHint("AAAAAAAAA")+"\n");
        System.out.println(tough.getHint("JAMMYBARF")+"\n");
        System.out.println(tough.getHint("JAVAYBARF")+"\n");
        System.out.println(tough.getHint("JAVAROOKS")+"\n");
        System.out.println(tough.getHint("JAVAROCKS"));
    }
}
