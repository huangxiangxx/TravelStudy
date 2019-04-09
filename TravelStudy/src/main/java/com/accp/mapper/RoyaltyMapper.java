package com.accp.mapper;

import com.accp.domain.Royalty;
import com.accp.domain.RoyaltyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoyaltyMapper {
    long countByExample(RoyaltyExample example);

    int deleteByExample(RoyaltyExample example);

    int insert(Royalty record);

    int insertSelective(Royalty record);

    List<Royalty> selectByExample(RoyaltyExample example);

    int updateByExampleSelective(@Param("record") Royalty record, @Param("example") RoyaltyExample example);

    int updateByExample(@Param("record") Royalty record, @Param("example") RoyaltyExample example);
}