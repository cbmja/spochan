package com.chan.chan1.entity.data;

import com.chan.chan1.entity.Base;
import jakarta.persistence.*;
import org.springframework.web.multipart.MultipartFile;

@Entity
@lombok.Data
public class Data extends Base {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int num;

    @Column
    private int year; //년도

    @Column
    private String type; //시험 종류

    private MultipartFile test;

    private MultipartFile answer;

}
