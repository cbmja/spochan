package com.chan.chan1.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class File extends Base{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long num;

}
