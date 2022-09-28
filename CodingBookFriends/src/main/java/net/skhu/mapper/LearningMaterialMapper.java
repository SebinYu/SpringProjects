package net.skhu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import net.skhu.dto.LearningMaterial;

@Mapper
public interface LearningMaterialMapper {

    @Select("SELECT * FROM learningmaterial")
    List<LearningMaterial> findAll();

    @Select("SELECT * FROM learningmaterial WHERE learningMaterial_id = #{learningMaterial_id}")
    LearningMaterial findOne(int learningMaterial_id);

    @Insert("INSERT learningmaterial (learningMaterial_id) VALUES (#{learningMaterial_id})")
    @Options(useGeneratedKeys=true, keyProperty="learningMaterial_id")
    void insert(LearningMaterial learningMaterial);

    @Update("UPDATE learningmaterial SET learningMaterial_id = #{learningMaterial_id} ")
    void update(LearningMaterial learningMaterial);

    @Delete("DELETE FROM learningmaterial WHERE learningMaterial_id = #{learningMaterial_id}")
    void delete(LearningMaterial learningMaterial);
}
