package com.lambferret.design_pattern.document;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.List;

@Document
public class Server {
    String name;
    String serverId;
    LocalDate createdDate;
    List<ObjectId> subscribedStreamer;
    Status status;
    String prefix;

    enum Status {
        INIT, PLAYING
    }
}


