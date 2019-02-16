package ink.educat.publication;

import java.util.Collection;

public interface Feed extends Publishable {

    Collection<PublicationListItem> showPopularPublicationList();

    Collection<PublicationListItem> showPublicationListBasedOnUserHistory();

    Collection<PublicationListItem> showNewsPublicationList();

    Collection<PublicationListItem> topicsListForUser();

}
