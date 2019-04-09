package com.accp.mapper;

import com.accp.domain.Fieldtype;
import com.accp.domain.FieldtypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FieldtypeMapper {
    long countByExample(FieldtypeExample example);

    int deleteByExample(FieldtypeExample example);

    int insert(Fieldtype record);

    int insertSelective(Fieldtype record);

    List<Fieldtype> selectByExample(FieldtypeExample example);

    int updateByExampleSelective(@Param("record") Fieldtype record, @Param("example") FieldtypeExample example);

    int updateByExample(@Param("record") Fieldtype record, @Param("example") FieldtypeExample example);
}