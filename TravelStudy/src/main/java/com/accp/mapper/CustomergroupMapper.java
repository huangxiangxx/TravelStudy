package com.accp.mapper;

import com.accp.domain.Customergroup;
import com.accp.domain.CustomergroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomergroupMapper {
    long countByExample(CustomergroupExample example);

    int deleteByExample(CustomergroupExample example);

    int insert(Customergroup record);

    int insertSelective(Customergroup record);

    List<Customergroup> selectByExample(CustomergroupExample example);

    int updateByExampleSelective(@Param("record") Customergroup record, @Param("example") CustomergroupExample example);

    int updateByExample(@Param("record") Customergroup record, @Param("example") CustomergroupExample example);
}