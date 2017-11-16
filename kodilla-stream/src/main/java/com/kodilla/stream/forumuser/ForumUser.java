package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {

    private final int userID;
    private final String userName;
    private final char sex;
    private final LocalDate birthDate;
    private final int postCount;

    public ForumUser(final int userID,final String userName,final char sex,final int yearOfBirth,final int monthOfBirth,final int dayOfBirth,final int postCount) {

        if (yearOfBirth > LocalDate.now().getYear() || yearOfBirth < 1900 || monthOfBirth < 1 || monthOfBirth > 12 || dayOfBirth < 1 || dayOfBirth > 31) {
            this.birthDate = LocalDate.of(1899, 12, 31);
        } else {
            this.birthDate = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        }

        this.userID = userID;
        this.userName = userName;
        this.sex = sex;
        this.postCount = postCount;
    }

    public int getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getPostCount() {
        return postCount;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userID= " + userID +
                ", userName= '" + userName + '\'' +
                ", sex= " + sex +
                ", birthDate= " + birthDate +
                ", postNumber= " + postCount +
                '}';
    }

}
