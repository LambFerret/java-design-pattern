package com.lambferret.design_pattern.document;

import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document
public class Streamer {
    String streamerName;
    String streamerNowPlaying;
    Boolean isStream;
    String createUser;
    LocalDate createdDate;
    LocalDate modifiedDate;
    Boolean isConfirmed;
    ConnectURL connectURL;
}

