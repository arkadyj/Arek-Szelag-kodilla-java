package com.kodilla.testing.forum.statistics;

public class CalculateStatistics {

    Statistics statistics;

    private int userNumber;
    private int postNumber;
    private int commentNumber;
    private double avgPostPerUser;
    private double avgCommentsPerUser;
    private double avgCommentsPerPost;

    public CalculateStatistics() {

    }

    public int getUserNumber() {
        return userNumber;
    }

    public int getPostNumber() {
        return postNumber;
    }

    public int getCommentNumber() {
        return commentNumber;
    }

    public double getAvgPostPerUser() {
        return avgPostPerUser;
    }

    public double getAvgCommentsPerUser() {
        return avgCommentsPerUser;
    }

    public double getAvgCommentsPerPost() {
        return avgCommentsPerPost;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        this.userNumber = statistics.usersNames().size();
        this.postNumber = statistics.postsCount();
        this.commentNumber = statistics.commentsCount();

        if (statistics.usersNames() != null && statistics.usersNames().size() > 0) {
            this.avgPostPerUser = (double) statistics.postsCount() / statistics.usersNames().size();
            this.avgCommentsPerUser = (double) statistics.commentsCount() / statistics.usersNames().size();
        } else {
            this.avgPostPerUser = 0;
            this.avgCommentsPerUser = 0;
        }

        if (statistics.postsCount() > 0) {
            this.avgCommentsPerPost = (double) statistics.commentsCount() / statistics.postsCount();
        } else {
            this.avgCommentsPerPost = 0;
        }


    }

    public void showStatistics() {

        System.out.println("Forum stats:");
        System.out.println("Number of users: " + this.userNumber);
        System.out.println("Number of posts: " + this.postNumber);
        System.out.println("Number of comments: " + this.commentNumber);
        System.out.println("Average post per user: " + this.avgPostPerUser);
        System.out.println("Average comments per post: " + this.avgCommentsPerPost);
        System.out.println("Average comments per user: " + this.avgCommentsPerUser);
    }
}
