package com.accp.mapper;

import com.accp.domain.Noticesecond;
import com.accp.domain.NoticesecondExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NoticesecondMapper {
    long countByExample(NoticesecondExample example);

    int deleteByExample(NoticesecondExample example);

    int insert(Noticesecond record);

    int insertSelective(Noticesecond record);

    List<Noticesecond> selectByExample(NoticesecondExample example);

    int updateByExampleSelective(@Param("record") Noticesecond record, @Param("example") NoticesecondExample example);

    int updateByExample(@Param("record") Noticesecond record, @Param("example") NoticesecondExample example);
}