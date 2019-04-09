package com.accp.mapper;

import com.accp.domain.Social;
import com.accp.domain.SocialExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SocialMapper {
    long countByExample(SocialExample example);

	int deleteByExample(SocialExample example);

	int insert(Social record);

	int insertSelective(Social record);

	List<Social> selectByExample(SocialExample example);

	int updateByExampleSelective(@Param("record") Social record, @Param("example") SocialExample example);

	int updateByExample(@Param("record") Social record, @Param("example") SocialExample example);

	long countByExample(SocialExample example);

    int deleteByExample(SocialExample example);

    int insert(Social record);

    int insertSelective(Social record);

    List<Social> selectByExample(SocialExample example);

    int updateByExampleSelective(@Param("record") Social record, @Param("example") SocialExample example);

    int updateByExample(@Param("record") Social record, @Param("example") SocialExample example);
}