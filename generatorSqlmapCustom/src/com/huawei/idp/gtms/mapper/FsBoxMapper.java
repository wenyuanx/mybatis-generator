package com.huawei.idp.gtms.mapper;

import com.huawei.idp.gtms.entity.FsBox;
import com.huawei.idp.gtms.entity.FsBoxExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FsBoxMapper {
    int countByExample(FsBoxExample example);

    int deleteByExample(FsBoxExample example);

    int deleteByPrimaryKey(Integer boxid);

    int insert(FsBox record);

    int insertSelective(FsBox record);

    List<FsBox> selectByExample(FsBoxExample example);

    FsBox selectByPrimaryKey(Integer boxid);

    int updateByExampleSelective(@Param("record") FsBox record, @Param("example") FsBoxExample example);

    int updateByExample(@Param("record") FsBox record, @Param("example") FsBoxExample example);

    int updateByPrimaryKeySelective(FsBox record);

    int updateByPrimaryKey(FsBox record);
}