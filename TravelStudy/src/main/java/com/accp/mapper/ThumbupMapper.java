package com.accp.mapper;

import com.accp.domain.Thumbup;
import com.accp.domain.ThumbupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ThumbupMapper {
    long countByExample(ThumbupExample example);

    int deleteByExample(ThumbupExample example);

    int insert(Thumbup record);

    int insertSelective(Thumbup record);

    List<Thumbup> selectByExample(ThumbupExample example);

    int updateByExampleSelective(@Param("record") Thumbup record, @Param("example") ThumbupExample example);

    int updateByExample(@Param("record") Thumbup record, @Param("example") ThumbupExample example);
}