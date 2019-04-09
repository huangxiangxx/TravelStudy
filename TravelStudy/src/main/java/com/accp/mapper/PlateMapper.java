package com.accp.mapper;

import com.accp.domain.Plate;
import com.accp.domain.PlateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PlateMapper {
    long countByExample(PlateExample example);

	int deleteByExample(PlateExample example);

	int insert(Plate record);

	int insertSelective(Plate record);

	List<Plate> selectByExample(PlateExample example);

	int updateByExampleSelective(@Param("record") Plate record, @Param("example") PlateExample example);

	int updateByExample(@Param("record") Plate record, @Param("example") PlateExample example);

	long countByExample(PlateExample example);

	int deleteByExample(PlateExample example);

	int insert(Plate record);

	int insertSelective(Plate record);

	List<Plate> selectByExample(PlateExample example);

	int updateByExampleSelective(@Param("record") Plate record, @Param("example") PlateExample example);

	int updateByExample(@Param("record") Plate record, @Param("example") PlateExample example);

	long countByExample(PlateExample example);

    int deleteByExample(PlateExample example);

    int insert(Plate record);

    int insertSelective(Plate record);

    List<Plate> selectByExample(PlateExample example);

    int updateByExampleSelective(@Param("record") Plate record, @Param("example") PlateExample example);

    int updateByExample(@Param("record") Plate record, @Param("example") PlateExample example);
}