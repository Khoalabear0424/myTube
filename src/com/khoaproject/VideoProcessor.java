package com.khoaproject;

public class VideoProcessor {
    private VideoEncoder encoder;
    private VideoDatabase database;
    private NotificationService emailService;

    public VideoProcessor(VideoEncoder encoder, VideoDatabase database, EmailService emailService) {
        this.encoder = encoder;
        this.database = database;
        this.emailService = emailService;
    }

    public void process(Video video) {
        //class should not be responsible for instantiating Video classes
        //encode and store methods should be in an interface
        encoder.encode(video);
        database.store(video);
        emailService.sendEmail(video.getUser());
    }
}

