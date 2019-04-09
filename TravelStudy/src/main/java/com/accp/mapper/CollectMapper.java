package com.accp.mapper;

import com.accp.domain.Collect;
import com.accp.domain.CollectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CollectMapper {
    long countByExample(CollectExample example);

	int deleteByExample(CollectExample example);

	int insert(Collect record);

	int insertSelective(Collect record);

	List<Collect> selectByExample(CollectExample example);

	int updateByExampleSelective(@Param("record") Collect record, @Param("example") CollectExample example);

	int updateByExample(@Param("record") Collect record, @Param("example") CollectExample example);

	long countByExample(CollectExample example);

    int deleteByExample(CollectExample example);

    int insert(Collect record);

    int insertSelective(Collect record);

    List<Collect> selectByExample(CollectExample example);

    int updateByExampleSelective(@Param("record") Collect record, @Param("example") CollectExample example);

    int updateByExample(@Param("record") Collect record, @Param("example") CollectExample example);
}