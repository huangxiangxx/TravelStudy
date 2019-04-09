package com.accp.mapper;

import com.accp.domain.Userfeedback;
import com.accp.domain.UserfeedbackExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserfeedbackMapper {
    long countByExample(UserfeedbackExample example);

    int deleteByExample(UserfeedbackExample example);

    int insert(Userfeedback record);

    int insertSelective(Userfeedback record);

    List<Userfeedback> selectByExample(UserfeedbackExample example);

    int updateByExampleSelective(@Param("record") Userfeedback record, @Param("example") UserfeedbackExample example);

    int updateByExample(@Param("record") Userfeedback record, @Param("example") UserfeedbackExample example);
}