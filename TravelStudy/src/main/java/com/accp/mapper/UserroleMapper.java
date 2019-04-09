package com.accp.mapper;

import com.accp.domain.Userrole;
import com.accp.domain.UserroleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserroleMapper {
    long countByExample(UserroleExample example);

	int deleteByExample(UserroleExample example);

	int insert(Userrole record);

	int insertSelective(Userrole record);

	List<Userrole> selectByExample(UserroleExample example);

	int updateByExampleSelective(@Param("record") Userrole record, @Param("example") UserroleExample example);

	int updateByExample(@Param("record") Userrole record, @Param("example") UserroleExample example);

	long countByExample(UserroleExample example);

	int deleteByExample(UserroleExample example);

	int insert(Userrole record);

	int insertSelective(Userrole record);

	List<Userrole> selectByExample(UserroleExample example);

	int updateByExampleSelective(@Param("record") Userrole record, @Param("example") UserroleExample example);

	int updateByExample(@Param("record") Userrole record, @Param("example") UserroleExample example);

	long countByExample(UserroleExample example);

    int deleteByExample(UserroleExample example);

    int insert(Userrole record);

    int insertSelective(Userrole record);

    List<Userrole> selectByExample(UserroleExample example);

    int updateByExampleSelective(@Param("record") Userrole record, @Param("example") UserroleExample example);

    int updateByExample(@Param("record") Userrole record, @Param("example") UserroleExample example);
}