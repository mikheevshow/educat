package ink.educat.publication;

import org.springframework.lang.NonNull;

public interface Publishable {

    void publish(@NonNull final Publication publication);

    Publication loadPublication(final long id);

}
