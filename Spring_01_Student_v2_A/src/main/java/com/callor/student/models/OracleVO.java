package com.callor.student.models;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;

public class OracleVO {

    /*
    SEQ_ORACLE 이라는 이름으로 Sequence 를 만들고 증가값을 1씩 증가시켜라
    이 프로젝트에서 O_SEQ 라는 별명으로 사용하겠다
     */
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "O_SEQ")
    @SequenceGenerator(name = "O_SEQ", sequenceName = "SEQ_ORACLE",
            allocationSize = 1)
    private Long o_seq;
}
