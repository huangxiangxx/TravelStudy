package com.accp.mapper;

import com.accp.domain.Roleplate;
import com.accp.domain.RoleplateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleplateMapper {
    long countByExample(RoleplateExample example);

	int deleteByExample(RoleplateExample example);

	int insert(Roleplate record);

	int insertSelective(Roleplate record);

	List<Roleplate> selectByExample(RoleplateExample example);

	int updateByExampleSelective(@Param("record") Roleplate record, @Param("example") RoleplateExample example);

	int updateByExample(@Param("record") Roleplate record, @Param("example") RoleplateExample example);

	long countByExample(RoleplateExample example);

	int deleteByExample(RoleplateExample example);

	int insert(Roleplate record);

	int insertSelective(Roleplate record);

	List<Roleplate> selectByExample(RoleplateExample example);

	int updateByExampleSelective(@Param("record") Roleplate record, @Param("example") RoleplateExample example);

	int updateByExample(@Param("record") Roleplate record, @Param("example") RoleplateExample example);

	long countByExample(RoleplateExample example);

    int deleteByExample(RoleplateExample example);

    int insert(Roleplate record);

    int insertSelective(Roleplate record);

    List<Roleplate> selectByExample(RoleplateExample example);

    int updateByExampleSelective(@Param("record") Roleplate record, @Param("example") RoleplateExample example);

    int updateByExample(@Param("record") Roleplate record, @Param("example") RoleplateExample example);
}