import java.lang.Comparable;
import java.util.Scanner;

public class QuizTimeProject {
    public static class Question implements Comparable{
        private String question, answer;
        private int complexityLevel;
        //-----------------------------------------------------------------
        // Sets up the question with a default complexity.
        //-----------------------------------------------------------------
        public Question (String query, String result){
            question = query;
            answer = result;
            complexityLevel = 1;
        }
        //-----------------------------------------------------------------
        // Sets the complexity level for this question.
        //-----------------------------------------------------------------
        public void setComplexity (int level){
            complexityLevel = level;
        }
        //-----------------------------------------------------------------
        // Returns the complexity level for this question.
        //-----------------------------------------------------------------
        public int getComplexity(){
            return complexityLevel;
        }
        //-----------------------------------------------------------------
        // Returns the question.
        //-----------------------------------------------------------------
        public String getQuestion(){
            return question;
        }
        //-----------------------------------------------------------------
        // Returns the answer to this question.
        //-----------------------------------------------------------------
        public String getAnswer(){
            return answer;
        }
        //-----------------------------------------------------------------
        // Returns true if the candidate answer matches the answer.
        //-----------------------------------------------------------------
        public boolean answerCorrect (String candidateAnswer){
            return answer.equalsIgnoreCase(candidateAnswer);
        }
        //-----------------------------------------------------------------
        // Returns this question (and its answer) as a string.
        //-----------------------------------------------------------------
        public String toString(){
            return question + "\n" + answer;
        }
        public int compareTo(Object obj){
            Question q2 = (Question)obj;
            return this.getComplexity()-q2.getComplexity();
        }
    }
    public static class Quiz{
        private Question[] list; //Your array used to store Question objects
        private int count;
        public Quiz()
        {
            count = 0;
            list = new Question[25];
        }
        public void add(String question, String result, int complexity)
        {
            if (count < list.length){
                Question newQuestion = new Question(question,result);
                newQuestion.setComplexity(complexity);
                list[count] = newQuestion;
                count++;
            }
        }
        public void giveQuiz()
        {
            Scanner scan = new Scanner(System.in);
            int correct = 0;
            for (int i = 0;i<count;i++){
                System.out.println(list[i].getQuestion());
                if (list[i].answerCorrect(scan.nextLine())){
                    correct++;
                }
            }
            System.out.println("You got " + correct + " questions correct.");
            scan.close();
        }
        //The method below will be implemented for 6.10
        //When ready for that uncomment the header and grouping brackets
        /*public void giveQuiz(int small, int biggest)
        {
        }*/
    }
    public static void main(String args[]){
        Quiz Q1 = new Quiz();
        Q1.add("What language are we programming in?", "Java", 8);
        Q1.add("How many weeks did we have off for winter break?", "2", 1);
        Q1.add("Who will win the super bowl, Vikings or Packers?", "Vikings", 2);
        Q1.add("What type of positive number must be placed in [] of an array?", "integer", 7);
        //This will be the non-sorted quiz we give 6.9 test
        Q1.giveQuiz();
        //Now we will give the same quiz again sorted by comlexity with questions
        //within a certian complexity range being applied to the usuer quiz for 6.10
        //uncomment the code below when you updated the Quiz class
        //Q1.giveQuiz(7, 9);
    }
}
