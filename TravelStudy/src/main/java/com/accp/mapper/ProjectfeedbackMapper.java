package com.accp.mapper;

import com.accp.domain.Projectfeedback;
import com.accp.domain.ProjectfeedbackExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProjectfeedbackMapper {
    long countByExample(ProjectfeedbackExample example);

    int deleteByExample(ProjectfeedbackExample example);

    int insert(Projectfeedback record);

    int insertSelective(Projectfeedback record);

    List<Projectfeedback> selectByExample(ProjectfeedbackExample example);

    int updateByExampleSelective(@Param("record") Projectfeedback record, @Param("example") ProjectfeedbackExample example);

    int updateByExample(@Param("record") Projectfeedback record, @Param("example") ProjectfeedbackExample example);
}