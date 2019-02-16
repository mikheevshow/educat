package ink.educat.publication;

import java.util.Collection;

public interface Classbook extends Publishable {

    Collection<PublicationListItem> showSubjectsList();

    Collection<PublicationListItem> showSubjectThemesList(final long subjectId);

}
