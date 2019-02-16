package ink.educat.publication;

import java.io.Serializable;
import java.util.List;

public class Publication implements Serializable {

    private String Header;

    private List<CommentListItem> comments;

    private int likesAmount;

}
