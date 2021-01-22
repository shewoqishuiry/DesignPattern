package com.example.prototypemodel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.xml.crypto.Data;
import java.util.Date;

@SpringBootApplication
public class PrototypemodelApplication {

    public static void main(String[] args) throws CloneNotSupportedException {
        Date date = new Date();
        Video video = new Video("狂神说java",date);
        System.out.println(video.toString());
        System.out.println("video的hashcode:"+ video.hashCode());

        Video video1 = (Video) video.clone();
        video1.setCreateTime(new Date(date.getTime() + 1000000L));
        System.out.println("克隆video1对象:" + video1.toString());
        System.out.println("video1的hashcode:"+ video1.hashCode());

        SpringApplication.run(PrototypemodelApplication.class, args);
    }

}
