package trainedge.qaapp;

/**
 * Created by Nikita on 11-Jul-17.
 */

public class SubjectModel {
    String Subject;
    String Questions;

    public SubjectModel(String subject, String questions) {
        Subject = subject;
        Questions = questions;
    }

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String subject) {
        Subject = subject;
    }

    public String getQuestions() {
        return Questions;
    }

    public void setQuestions(String questions) {
        Questions = questions;
    }
}
