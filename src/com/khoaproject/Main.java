package com.khoaproject;

public class Main {

    public static void main(String[] args) {
        //set params in constructor of Video class
        var video = new Video("birthday.mp4", "Jennifer's birthday", new User("john@domain.com"));
        var processor = new VideoProcessor(new VideoEncoder(), new VideoDatabase(), new EmailService());
        processor.process(video);
    }
}
