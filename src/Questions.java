public class Questions {

    private String question;
    private String option1;
    private String option2;
    private  String option3;
    private String option4;
    private String answer;

    public Questions(String question, String option1, String option2, String option3, String option4, String answer) {
        this.question = question;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
        this.answer = answer;
    }
    public void getQuestion() {
        System.out.print("Q : ");
        System.out.println(question);
        System.out.println("Option1 : "+option1);
        System.out.println("Option2 : "+option2);
        System.out.println("Option3 : "+option3);
        System.out.println("Option4 : "+option4);
        System.out.println("");
    }

    public int getAnswerIndex() {
        if(answer.equals(option1)) {
            return 1;
        }else if(answer.equals(option2)) {
            return 2;
        }else if(answer.equals(option3)) {
            return 3;
        }
        return 4;
    }
    public String getAnswer() {
        return answer;
    }
}
