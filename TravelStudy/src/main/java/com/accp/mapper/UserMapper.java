package com.accp.mapper;

import com.accp.domain.User;
import com.accp.domain.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.accp.domain.UserWithBLOBs;

public interface UserMapper {
    long countByExample(UserExample example);

	int deleteByExample(UserExample example);

	int insert(User record);

	int insertSelective(User record);

	List<User> selectByExample(UserExample example);

	int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

	int updateByExample(@Param("record") User record, @Param("example") UserExample example);

	long countByExample(UserExample example);

	int deleteByExample(UserExample example);

	int insert(User record);

	int insertSelective(User record);

	List<User> selectByExample(UserExample example);

	int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

	int updateByExample(@Param("record") User record, @Param("example") UserExample example);

	long countByExample(UserExample example);

	int deleteByExample(UserExample example);

	int insert(UserWithBLOBs record);

	int insertSelective(UserWithBLOBs record);

	List<UserWithBLOBs> selectByExampleWithBLOBs(UserExample example);

	List<User> selectByExample(UserExample example);

	int updateByExampleSelective(@Param("record") UserWithBLOBs record, @Param("example") UserExample example);

	int updateByExampleWithBLOBs(@Param("record") UserWithBLOBs record, @Param("example") UserExample example);

	int updateByExample(@Param("record") User record, @Param("example") UserExample example);

	long countByExample(UserExample example);

	int deleteByExample(UserExample example);

	int insert(User record);

	int insertSelective(User record);

	List<User> selectByExample(UserExample example);

	int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

	int updateByExample(@Param("record") User record, @Param("example") UserExample example);

	long countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);
}