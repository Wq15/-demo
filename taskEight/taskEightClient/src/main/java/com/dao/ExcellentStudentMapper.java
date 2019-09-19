package com.dao;

import com.pojo.ExcellentStudent;
import com.sun.corba.se.spi.presentation.rmi.IDLNameTranslator;

import java.util.List;

public interface ExcellentStudentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ExcellentStudent record);

    int insertSelective(ExcellentStudent record);

    ExcellentStudent selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ExcellentStudent record);

    int updateByPrimaryKey(ExcellentStudent record);

    List<ExcellentStudent> select();


}