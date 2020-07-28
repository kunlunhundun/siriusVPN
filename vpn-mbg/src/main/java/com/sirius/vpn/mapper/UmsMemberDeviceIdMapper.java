package com.sirius.vpn.mapper;

import com.sirius.vpn.model.UmsMemberDeviceId;
import com.sirius.vpn.model.UmsMemberDeviceIdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsMemberDeviceIdMapper {
    long countByExample(UmsMemberDeviceIdExample example);

    int deleteByExample(UmsMemberDeviceIdExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UmsMemberDeviceId record);

    int insertSelective(UmsMemberDeviceId record);

    List<UmsMemberDeviceId> selectByExample(UmsMemberDeviceIdExample example);

    UmsMemberDeviceId selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UmsMemberDeviceId record, @Param("example") UmsMemberDeviceIdExample example);

    int updateByExample(@Param("record") UmsMemberDeviceId record, @Param("example") UmsMemberDeviceIdExample example);

    int updateByPrimaryKeySelective(UmsMemberDeviceId record);

    int updateByPrimaryKey(UmsMemberDeviceId record);
}