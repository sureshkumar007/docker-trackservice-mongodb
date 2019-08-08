package com.stackroute.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
//annotation class


@Document(collection = "tracks")

//used for docker.BY this it will generate getter and setter method
@Data

//add constructor with no arguments
@NoArgsConstructor

// will add constructor with all properties in the class*/
@AllArgsConstructor

@Builder

public class Track {


    //Id annotation make id variable as Primary key
    @Id
    private int id;
    private String trackName;
    private String comments;
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getTrackName() {
//        return trackName;
//    }
//
//    public void setTrackName(String trackName) {
//        this.trackName = trackName;
//    }
//
//    public String getComments() {
//        return comments;
//    }
//
//    public void setComments(String comments) {
//        this.comments = comments;
//    }
//
//    @Override
//    public String toString() {
//        return "Track{" +
//                "id=" + id +
//                ", trackName='" + trackName + '\'' +
//                ", comments='" + comments + '\'' +
//                '}';
//    }
}
