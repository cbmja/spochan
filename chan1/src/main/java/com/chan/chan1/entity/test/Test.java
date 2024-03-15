package com.chan.chan1.entity.test;

import com.chan.chan1.entity.Base;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Test extends Base {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long num;

}
