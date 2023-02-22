package Pojo;


//作用于密保问题的实体类
public class Safe {

    private int uid;    //用户ID
    private String question;
    private String answer;

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "Safe{" +
                "uid=" + uid +
                ", question='" + question + '\'' +
                ", answer='" + answer + '\'' +
                '}';
    }
}
