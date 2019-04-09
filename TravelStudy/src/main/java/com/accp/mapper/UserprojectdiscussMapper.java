package com.accp.mapper;

import com.accp.domain.Userprojectdiscuss;
import com.accp.domain.UserprojectdiscussExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserprojectdiscussMapper {
    long countByExample(UserprojectdiscussExample example);

    int deleteByExample(UserprojectdiscussExample example);

    int insert(Userprojectdiscuss record);

    int insertSelective(Userprojectdiscuss record);

    List<Userprojectdiscuss> selectByExample(UserprojectdiscussExample example);

    int updateByExampleSelective(@Param("record") Userprojectdiscuss record, @Param("example") UserprojectdiscussExample example);

    int updateByExample(@Param("record") Userprojectdiscuss record, @Param("example") UserprojectdiscussExample example);
}