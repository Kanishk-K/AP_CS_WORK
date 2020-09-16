package Unit_2;
public class mini_project {
    public static void main(String[] args) {
        final int TD = 6;
        final int PAT = 1;
        final int FG = 3;
        int evTd, LsTd, evFg, LsFg;
        int evFinalScore, LsFinalScore;
        //asign 2 to evTd
        evTd = 2;
        //asign 3 to LsTd
        LsTd = 3;
        //asign 3 to evFg
        evFg = 3;
        //asign 0 to LsFg
        LsFg = 0;
        //assign the calculated final score for EV to evFinalScore assume all PAT's were made
        evFinalScore = evTd*TD + evTd*PAT + evFg*FG;
        //assign the calculated final score for ED to LsFinalScore assume all PAT's were made
        LsFinalScore = LsTd*TD + LsTd*PAT + LsFg*FG;
        /*how to calculate final score for confused non-football people:
        final_score = #TD*TD+#TD*PAT+#FG*FG
        */
        System.out.println("EV Team score: "+ evFinalScore);//Finish this for me!
        System.out.println("LS Team score: "+ LsFinalScore);//Finish this also!
        }
}
