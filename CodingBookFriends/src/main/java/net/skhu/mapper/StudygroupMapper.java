package net.skhu.mapper;

import java.math.BigInteger;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import net.skhu.dto.Studygroup;

@Mapper
public interface StudygroupMapper {

    @Select("SELECT * FROM studygroup")
    List<Studygroup> findAll();

    @Select("SELECT * FROM studygroup WHERE studyGroup_id = #{studyGroup_id}")
    Studygroup findOne(BigInteger studyGroup_id);

    @Insert("INSERT studygroup (title,contents,leader,totalNum,currentNum)"
    		+ " VALUES (#{title},#{contents},#{leader},#{totalNum}, #{currentNum})")
    @Options(useGeneratedKeys=true, keyProperty="studyGroup_id")
    void insert(Studygroup studygroup);

    @Update("UPDATE studygroup SET "
    		+ "title = #{title} "
    		+ "contents = #{contents}"
    		+ "leader = #{leader}"
    		+ "totalNum = #{totalNum}"
    		+ "currentNum = #{currentNum}"
    		+ "WHERE studyGroup_id = #{studyGroup_id}")
    void update(Studygroup studygroup);

    @Delete("DELETE FROM studygroup WHERE studyGroup_id = #{studyGroup_id}")
    void delete(BigInteger studyGroup_id);
}
