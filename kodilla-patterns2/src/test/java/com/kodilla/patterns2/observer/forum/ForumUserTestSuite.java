package com.kodilla.patterns2.observer.forum;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ForumUserTestSuite {

    @Test
    public void testUpdate() {
        //Given
        ForumTopic javaHelpForum = new JavaHelpForumTopic();
        ForumTopic javaToolsForum = new JavaToolsForumTopic();
        ForumUser johnSmith = new ForumUser("John Smith");
        ForumUser rayKowaczew = new ForumUser("Ray Kowaczew");
        ForumUser amandaCook = new ForumUser("Amanda Cook");
        javaHelpForum.registerObserver(johnSmith);
        javaToolsForum.registerObserver(rayKowaczew);
        javaHelpForum.registerObserver(rayKowaczew);
        javaToolsForum.registerObserver(amandaCook);
        //When
        javaHelpForum.addPost("Hello. Please help me with if statement");
        javaHelpForum.addPost("Yeah, what's the problem");
        javaToolsForum.addPost("My Intelij IDE doesn't run. I don't know why");
        javaHelpForum.addPost("I don't know how it works");
        javaToolsForum.addPost("Have you checked source folder?");
        //
        assertEquals(3, johnSmith.getUpdateCount());
        assertEquals(5, rayKowaczew.getUpdateCount());
        assertEquals(2, amandaCook.getUpdateCount());

    }
}
