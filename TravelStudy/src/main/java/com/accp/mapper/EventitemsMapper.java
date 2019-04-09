package com.accp.mapper;

import com.accp.domain.Eventitems;
import com.accp.domain.EventitemsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventitemsMapper {
    long countByExample(EventitemsExample example);

    int deleteByExample(EventitemsExample example);

    int insert(Eventitems record);

    int insertSelective(Eventitems record);

    List<Eventitems> selectByExample(EventitemsExample example);

    int updateByExampleSelective(@Param("record") Eventitems record, @Param("example") EventitemsExample example);

    int updateByExample(@Param("record") Eventitems record, @Param("example") EventitemsExample example);
}