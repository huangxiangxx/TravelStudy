package com.accp.mapper;

import com.accp.domain.Basepay;
import com.accp.domain.BasepayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BasepayMapper {
    long countByExample(BasepayExample example);

    int deleteByExample(BasepayExample example);

    int insert(Basepay record);

    int insertSelective(Basepay record);

    List<Basepay> selectByExample(BasepayExample example);

    int updateByExampleSelective(@Param("record") Basepay record, @Param("example") BasepayExample example);

    int updateByExample(@Param("record") Basepay record, @Param("example") BasepayExample example);
}