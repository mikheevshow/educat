import java.io.Serializable;
import java.time.OffsetDateTime;

public class Issue implements Serializable {

    private final OffsetDateTime dateAdded;
    private final String issueText;
    private final String issueAnswer;
    

    public Issue(OffsetDateTime dateAdded, String issueText, String issueAnswer) {
        this.dateAdded = dateAdded;
        this.issueText = issueText;
        this.issueAnswer = issueAnswer;
    }

    public OffsetDateTime getDateAdded() {
        return dateAdded;
    }

    public String getIssueText() {
        return issueText;
    }

    public String getIssueAnswer() {
        return issueAnswer;
    }
}
