package com.callor.js.repository;

import com.callor.js.models.BookVO;
import com.callor.js.repository.sql.BookSQL;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface BookDao {

    @Select("SELECT * FROM tbl_members")
    public List<BookVO> selectAll();

    //    @Insert(BookSQL.book_insert_sql)
    @InsertProvider(type = BookSQL.class, method = "book_insert")
    public int insert(BookVO bookVO);

    //  @Update() : 문자열로 만든 SQL을 실행할 때
//   UpdateProvider : SQL 클래스로 만든 SQL을 실행할 때
    @UpdateProvider(type = BookSQL.class, method = "book_update_sql")
    public int update(BookVO bookVO);


    @Delete("DELETE FROM tbl_members WHERE username =#{isbn}")
    public int delete(String isbn);
}
