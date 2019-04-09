package com.accp.mapper;

import com.accp.domain.Orderdetails;
import com.accp.domain.OrderdetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderdetailsMapper {
    long countByExample(OrderdetailsExample example);

    int deleteByExample(OrderdetailsExample example);

    int insert(Orderdetails record);

    int insertSelective(Orderdetails record);

    List<Orderdetails> selectByExample(OrderdetailsExample example);

    int updateByExampleSelective(@Param("record") Orderdetails record, @Param("example") OrderdetailsExample example);

    int updateByExample(@Param("record") Orderdetails record, @Param("example") OrderdetailsExample example);
}