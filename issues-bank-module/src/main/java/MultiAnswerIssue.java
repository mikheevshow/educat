import java.time.OffsetDateTime;
import java.util.Map;

//@Entity
public class MultiAnswerIssue extends AbstractIssue {

    //@
    private long id;

    private final Map<String, String> answers;

    public MultiAnswerIssue(OffsetDateTime creationDate, String issueText, Map<String, String> answers) {
        super(creationDate, issueText);
        this.answers = answers;
    }

    public Map<String, String> getAnswers() {
        return answers;
    }
}
