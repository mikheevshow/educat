package ink.educat.publication;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
@Scope("prototype")
public class FeedImpl implements Feed {

    private long accountId;

    public FeedImpl() {
    }

    @Override
    public Collection<PublicationListItem> showPopularPublicationList() {
        return null;
    }

    @Override
    public Collection<PublicationListItem> showPublicationListBasedOnUserHistory() {
        return null;
    }

    @Override
    public Collection<PublicationListItem> showNewsPublicationList() {
        return null;
    }

    @Override
    public Collection<PublicationListItem> topicsListForUser() {
        return null;
    }

    @Override
    public void publish(Publication publication) {

    }

    @Override
    public Publication loadPublication(long id) {
        return null;
    }

    public long getAccountId() {
        return accountId;
    }

    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }

}
