package ink.educat.Issues;

import java.io.Serializable;
import java.time.OffsetDateTime;



public abstract class AbstractIssue implements Serializable {

    private final OffsetDateTime creationDate;
    private final String issueText;

    public AbstractIssue(OffsetDateTime creationDate, String issueText) {
        this.creationDate = creationDate;
        this.issueText = issueText;
    }

    public OffsetDateTime getCreationDate() {
        return creationDate;
    }

    public String getIssueText() {
        return issueText;
    }
}
