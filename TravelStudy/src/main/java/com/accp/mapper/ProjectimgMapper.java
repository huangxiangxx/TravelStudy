package com.accp.mapper;

import com.accp.domain.Projectimg;
import com.accp.domain.ProjectimgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProjectimgMapper {
    long countByExample(ProjectimgExample example);

    int deleteByExample(ProjectimgExample example);

    int insert(Projectimg record);

    int insertSelective(Projectimg record);

    List<Projectimg> selectByExample(ProjectimgExample example);

    int updateByExampleSelective(@Param("record") Projectimg record, @Param("example") ProjectimgExample example);

    int updateByExample(@Param("record") Projectimg record, @Param("example") ProjectimgExample example);
}