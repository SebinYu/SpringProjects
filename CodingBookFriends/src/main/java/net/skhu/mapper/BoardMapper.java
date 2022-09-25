package net.skhu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import net.skhu.dto.Board;

@Mapper
public interface BoardMapper {

    @Select("SELECT * FROM studygroups")
    List<Board> findAll();

    @Select("SELECT * FROM studygroups WHERE studyGroup_id = #{studyGroup_id}")
    Board findOne(int studyGroup_id);

    @Insert("INSERT studygroups (title) VALUES (#{title})")
    @Options(useGeneratedKeys=true, keyProperty="studyGroup_id")
    void insert(Board studygroups);

    @Update("UPDATE studygroups SET title = #{title} WHERE id = #{id}")
    void update(Board studygroups);

    @Delete("DELETE FROM studygroups WHERE studyGroup_id = #{studyGroup_id}")
    void delete(int studyGroup_id);
}
