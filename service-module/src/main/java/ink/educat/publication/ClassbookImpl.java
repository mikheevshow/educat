package ink.educat.publication;

import org.springframework.lang.NonNull;

import java.util.Collection;

public class ClassbookImpl implements Classbook {

    @Override
    public Collection<PublicationListItem> showSubjectsList() {
        return null;
    }

    @Override
    public Collection<PublicationListItem> showSubjectThemesList(final long subjectId) {
        return null;
    }

    @Override
    public void publish(@NonNull final Publication publication) {

    }

    @Override
    public Publication loadPublication(long id) {
        return null;
    }
}
