package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {

        //Given
        User facebookUser = new YGeneration("Michael Crain");
        User twitterUser = new ZGeneration("John Boil");
        User snapchatUser = new Millenials("Monica Cole");

        //When
        String facebook = facebookUser.sharePost();
        System.out.println("Michael " + facebook);
        String twitter = twitterUser.sharePost();
        System.out.println("John " + twitter);
        String snapchat = snapchatUser.sharePost();
        System.out.println("Monica " + snapchat);

        //Then
        Assert.assertEquals("publishing on facebook", facebook);
        Assert.assertEquals("publishing on twitter", twitter);
        Assert.assertEquals("publishing on snapchat", snapchat);
    }

    @Test
    public void testIndividualSharingStrategy() {

        //Given
        User facebookUser = new YGeneration("Michael Crain");

        //When
        String publishMedia = facebookUser.sharePost();
        System.out.println("Michael " + publishMedia);
        facebookUser.setSocialPublisher(new TwitterPublisher());
        publishMedia = facebookUser.sharePost();
        System.out.println("Michael " + publishMedia);

        //Then
        Assert.assertEquals("publishing on twitter", publishMedia);
    }
}
