package com.callor.js.repository;

import org.apache.ibatis.annotations.Select;

public interface DDL_Dao {

    @Select(" ${create_table} ")
    public void create_table(String create_table);
}
