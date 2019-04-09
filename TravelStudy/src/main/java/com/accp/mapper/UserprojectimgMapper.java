package com.accp.mapper;

import com.accp.domain.Userprojectimg;
import com.accp.domain.UserprojectimgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserprojectimgMapper {
    long countByExample(UserprojectimgExample example);

    int deleteByExample(UserprojectimgExample example);

    int insert(Userprojectimg record);

    int insertSelective(Userprojectimg record);

    List<Userprojectimg> selectByExample(UserprojectimgExample example);

    int updateByExampleSelective(@Param("record") Userprojectimg record, @Param("example") UserprojectimgExample example);

    int updateByExample(@Param("record") Userprojectimg record, @Param("example") UserprojectimgExample example);
}