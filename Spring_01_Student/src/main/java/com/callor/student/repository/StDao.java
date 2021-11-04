package com.callor.student.repository;

import com.callor.student.model.StudentVO;

import java.util.List;

public interface StDao {
    public List<StudentVO> selectAll();
    public StudentVO findById();

    public void insert(StudentVO vo);
    public void update(StudentVO vo);
    public void delete(String st_num);
}
