package com.accp.mapper;

import com.accp.domain.Usernotice;
import com.accp.domain.UsernoticeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsernoticeMapper {
    long countByExample(UsernoticeExample example);

    int deleteByExample(UsernoticeExample example);

    int insert(Usernotice record);

    int insertSelective(Usernotice record);

    List<Usernotice> selectByExample(UsernoticeExample example);

    int updateByExampleSelective(@Param("record") Usernotice record, @Param("example") UsernoticeExample example);

    int updateByExample(@Param("record") Usernotice record, @Param("example") UsernoticeExample example);
}