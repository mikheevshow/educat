package ink.educat.Issues;

import java.time.OffsetDateTime;

public class RegularIssue extends AbstractIssue {

    private final String answer;

    public RegularIssue(OffsetDateTime creationDate, String issueText, String answer) {
        super(creationDate, issueText);
        this.answer = answer;
    }

    public String getAnswer() {
        return answer;
    }
}
