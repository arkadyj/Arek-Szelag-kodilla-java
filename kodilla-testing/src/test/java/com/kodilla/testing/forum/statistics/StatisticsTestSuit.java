package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.mockito.Mockito.*;

public class StatisticsTestSuit {

    @Test
    public void testPostCount0() {

        //Given
        Statistics statisticsMoc = mock(Statistics.class);
        int testPostsCount=0;
        ArrayList<String> users = new ArrayList<>();
        int testCommentsCount=5;

        when(statisticsMoc.postsCount()).thenReturn(testPostsCount);
        when(statisticsMoc.usersNames()).thenReturn(users);
        when(statisticsMoc.commentsCount()).thenReturn(testCommentsCount);
        CalculateStatistics calculateStatistics = new CalculateStatistics();

        //When
        calculateStatistics.calculateAdvStatistics(statisticsMoc);

        double postPerUser = calculateStatistics.getAvgPostPerUser();
        double commentsPerPost = calculateStatistics.getAvgCommentsPerPost();

        //Then
        Assert.assertEquals(0,postPerUser,0.0);
        Assert.assertEquals(0,commentsPerPost,0.0);


    }

    @Test
    public void testPostCount1000() {

        //Given
        Statistics statisticsMoc = mock(Statistics.class);
        int testPostsCount=1000;
        ArrayList<String> users = new ArrayList<>();
        users.add("Zbyszek");
        users.add("Roman");
        int testCommentsCount=5;

        when(statisticsMoc.postsCount()).thenReturn(testPostsCount);
        when(statisticsMoc.usersNames()).thenReturn(users);
        when(statisticsMoc.commentsCount()).thenReturn(testCommentsCount);
        CalculateStatistics calculateStatistics = new CalculateStatistics();

        //When
        calculateStatistics.calculateAdvStatistics(statisticsMoc);

        double postPerUser = calculateStatistics.getAvgPostPerUser();
        double commentsPerPost = calculateStatistics.getAvgCommentsPerPost();

        //Then

        Assert.assertEquals(500,postPerUser,0.0);
        Assert.assertEquals(0.005,commentsPerPost,0.0);

    }


    @Test
    public void testUserCount0() {

        //Given
        Statistics statisticsMoc = mock(Statistics.class);
        ArrayList<String> users = new ArrayList<>();
        int testPostsCount=1000;
        int testCommentsCount=5;

        when(statisticsMoc.postsCount()).thenReturn(testPostsCount);
        when(statisticsMoc.usersNames()).thenReturn(users);
        when(statisticsMoc.commentsCount()).thenReturn(testCommentsCount);
        CalculateStatistics calculateStatistics = new CalculateStatistics();

        //When
        calculateStatistics.calculateAdvStatistics(statisticsMoc);
        double postPerUser = calculateStatistics.getAvgPostPerUser();
        double commentsPerUser = calculateStatistics.getAvgCommentsPerUser();

        //Then
        Assert.assertEquals(0,postPerUser,0.0);
        Assert.assertEquals(0,commentsPerUser,0.0);

    }

    @Test
    public void testPostCount100() {

        Statistics statisticsMoc = mock(Statistics.class);
        ArrayList<String> users = new ArrayList<>();
        for (int i=0;i<100;i++){
            String userAdd = "User"+i;
            users.add(userAdd);
        }

        int testPostsCount=1000;
        int testCommentsCount=5;

        when(statisticsMoc.postsCount()).thenReturn(testPostsCount);
        when(statisticsMoc.usersNames()).thenReturn(users);
        when(statisticsMoc.commentsCount()).thenReturn(testCommentsCount);
        CalculateStatistics calculateStatistics = new CalculateStatistics();

        //When
        calculateStatistics.calculateAdvStatistics(statisticsMoc);
        double postPerUser = calculateStatistics.getAvgPostPerUser();
        double commentsPerUser = calculateStatistics.getAvgCommentsPerUser();

        //Then
        Assert.assertEquals(10,postPerUser,0.0);
        Assert.assertEquals(0.05,commentsPerUser,0.0);
    }

    @Test
    public void testCommentsCount0() {

        //Given
        Statistics statisticsMoc = mock(Statistics.class);
        int commentsCount=0;
        int testPostsCount=0;
        ArrayList<String> users = new ArrayList<>();
        users.add("Zbyszek");
        users.add("Roman");

        when(statisticsMoc.commentsCount()).thenReturn(commentsCount);
        when(statisticsMoc.postsCount()).thenReturn(testPostsCount);
        when(statisticsMoc.usersNames()).thenReturn(users);
        CalculateStatistics calculateStatistics = new CalculateStatistics();

        //When
        calculateStatistics.calculateAdvStatistics(statisticsMoc);
        double commentsPerUser = calculateStatistics.getAvgCommentsPerUser();
        double commentsPerPost = calculateStatistics.getAvgCommentsPerPost();


        //Then
        Assert.assertEquals(0,commentsPerUser,0.0);
        Assert.assertEquals(0,commentsPerPost,0.0);

    }



    @Test
    public void testNumbCommentsGreaterThanPosts() {

        //Given
        Statistics statisticsMoc = mock(Statistics.class);
        ArrayList<String> users = new ArrayList<>();
        for (int i=0;i<5;i++){
            String userAdd = "User"+i;
            users.add(userAdd);
        }
        int commentsCount=450;
        int testPostsCount=50;


        when(statisticsMoc.commentsCount()).thenReturn(commentsCount);
        when(statisticsMoc.postsCount()).thenReturn(testPostsCount);
        when(statisticsMoc.usersNames()).thenReturn(users);
        CalculateStatistics calculateStatistics = new CalculateStatistics();

        //When
        calculateStatistics.calculateAdvStatistics(statisticsMoc);
        double commentsPerUser = calculateStatistics.getAvgCommentsPerUser();
        double commentsPerPost = calculateStatistics.getAvgCommentsPerPost();
        double postPerUser = calculateStatistics.getAvgPostPerUser();

        //Then
        Assert.assertEquals(90,commentsPerUser,0.0);
        Assert.assertEquals(9,commentsPerPost,0.0);
        Assert.assertEquals(10,postPerUser,0.0);

    }

    @Test
    public void testNumbCommentsLesserThanPosts() {

        //Given
        Statistics statisticsMoc = mock(Statistics.class);
        ArrayList<String> users = new ArrayList<>();
        for (int i=0;i<5;i++){
            users.add("User nr " + i);
        }
        int testCommentsCount=100;
        int testPostsCount=400;


        when(statisticsMoc.commentsCount()).thenReturn(testCommentsCount);
        when(statisticsMoc.postsCount()).thenReturn(testPostsCount);
        when(statisticsMoc.usersNames()).thenReturn(users);
        CalculateStatistics calculateStatistics = new CalculateStatistics();

        //When
        calculateStatistics.calculateAdvStatistics(statisticsMoc);
        double commentsPerUser = calculateStatistics.getAvgCommentsPerUser();
        double commentsPerPost = calculateStatistics.getAvgCommentsPerPost();
        double postPerUser = calculateStatistics.getAvgPostPerUser();

        //Then
        Assert.assertEquals(20,commentsPerUser,0.0);
        Assert.assertEquals(0.25,commentsPerPost,0.0);
        Assert.assertEquals(80,postPerUser,0.0);

    }
}
