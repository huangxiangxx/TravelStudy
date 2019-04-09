package com.accp.mapper;

import com.accp.domain.Noticepicture;
import com.accp.domain.NoticepictureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NoticepictureMapper {
    long countByExample(NoticepictureExample example);

    int deleteByExample(NoticepictureExample example);

    int insert(Noticepicture record);

    int insertSelective(Noticepicture record);

    List<Noticepicture> selectByExample(NoticepictureExample example);

    int updateByExampleSelective(@Param("record") Noticepicture record, @Param("example") NoticepictureExample example);

    int updateByExample(@Param("record") Noticepicture record, @Param("example") NoticepictureExample example);
}