package com.accp.mapper;

import com.accp.domain.Customer;
import com.accp.domain.CustomerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomerMapper {
    long countByExample(CustomerExample example);

	int deleteByExample(CustomerExample example);

	int insert(Customer record);

	int insertSelective(Customer record);

	List<Customer> selectByExample(CustomerExample example);

	int updateByExampleSelective(@Param("record") Customer record, @Param("example") CustomerExample example);

	int updateByExample(@Param("record") Customer record, @Param("example") CustomerExample example);

	long countByExample(CustomerExample example);

    int deleteByExample(CustomerExample example);

    int insert(Customer record);

    int insertSelective(Customer record);

    List<Customer> selectByExample(CustomerExample example);

    int updateByExampleSelective(@Param("record") Customer record, @Param("example") CustomerExample example);

    int updateByExample(@Param("record") Customer record, @Param("example") CustomerExample example);
}