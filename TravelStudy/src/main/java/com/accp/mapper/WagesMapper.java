package com.accp.mapper;

import com.accp.domain.Wages;
import com.accp.domain.WagesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WagesMapper {
    long countByExample(WagesExample example);

    int deleteByExample(WagesExample example);

    int insert(Wages record);

    int insertSelective(Wages record);

    List<Wages> selectByExample(WagesExample example);

    int updateByExampleSelective(@Param("record") Wages record, @Param("example") WagesExample example);

    int updateByExample(@Param("record") Wages record, @Param("example") WagesExample example);
}