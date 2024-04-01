package com.chan.chan1.entity.data;

import com.chan.chan1.entity.Base;
import jakarta.persistence.*;

public class Test extends Base {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int num;

    @Column
    private String filePath; //파일 저장 경로

    @Column
    private String fileName; //저장된 파일 이름

}
