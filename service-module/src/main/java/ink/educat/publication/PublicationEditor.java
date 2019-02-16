package ink.educat.publication;

import org.springframework.lang.NonNull;

import java.util.Collection;

public interface PublicationEditor {

    void saveToDrafts(@NonNull final Publication publication);

    Collection<PublicationListItem> loadDraftsList();

    void publish(@NonNull final Publishable publishable, @NonNull Publication publication);

}
