package com.callor.student.service.impl;

import com.callor.student.model.StudentVO;
import com.callor.student.repository.StDao;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StDaoImpl implements StDao {

    private final String[] stNames = {
            "코기는", "귀여워", "아침은", "졸립다", "오늘은", "8교시"};

    private final Random RND = new Random();

    @Override
    public List<StudentVO> selectAll() {

        List<StudentVO> stList = new ArrayList();

        for (int i = 0; i < 10; i++) {
            String stNum = String.format("2021%04d", i + 1);
            String stName = stNames[RND.nextInt(stNames.length)];

            StudentVO vo = StudentVO.builder()
                    .st_num(stNum).st_name(stName).st_dept("컴퓨터공학")
                    .st_grade((RND.nextInt(4) + 1) + "").st_address("광주광역시")
                    .st_tel(
                            String.format("062-%04d-%04d", RND.nextInt(9999) + 1, RND.nextInt(9999) + 1)
                    )
                    .build();
            stList.add(vo);
        }

        return stList;
    }

    @Override
    public StudentVO findById() {
        return null;
    }

    @Override
    public void insert(StudentVO vo) {

    }

    @Override
    public void update(StudentVO vo) {

    }

    @Override
    public void delete(String st_num) {

    }

    public List<StudentVO> findAll() {
        return null;
    }
}
