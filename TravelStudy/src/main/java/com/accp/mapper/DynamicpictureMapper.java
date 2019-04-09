package com.accp.mapper;

import com.accp.domain.Dynamicpicture;
import com.accp.domain.DynamicpictureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DynamicpictureMapper {
    long countByExample(DynamicpictureExample example);

    int deleteByExample(DynamicpictureExample example);

    int insert(Dynamicpicture record);

    int insertSelective(Dynamicpicture record);

    List<Dynamicpicture> selectByExample(DynamicpictureExample example);

    int updateByExampleSelective(@Param("record") Dynamicpicture record, @Param("example") DynamicpictureExample example);

    int updateByExample(@Param("record") Dynamicpicture record, @Param("example") DynamicpictureExample example);
}