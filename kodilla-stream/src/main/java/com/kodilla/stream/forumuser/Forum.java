package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> forumList = new ArrayList<>();

    public Forum() {
        forumList.add(new ForumUser(1, "mmajer", 'F', 1983, 7, 14, 13));
        forumList.add(new ForumUser(2, "cbauer", 'M', 1980, 10, 22, 58));
        forumList.add(new ForumUser(3, "spatyk", 'M', 1999, 2, 7, 18));
        forumList.add(new ForumUser(4, "mtopa", 'F', 2001, 11, 10, 44));
        forumList.add(new ForumUser(5, "kmazur", 'M', 1997, 11, 15, 1));

    }

    public List<ForumUser> getList() {
        return new ArrayList<>(forumList);
    }
}
