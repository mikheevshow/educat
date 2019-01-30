package ink.educat.services.PostService;

import org.springframework.beans.factory.annotation.Autowired;

public class PostServiceImpl implements PostService {

    @Autowired
    private PostDAO postDAO;
}
