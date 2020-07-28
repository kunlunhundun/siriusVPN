package com.sirius.vpn.mapper;

import com.sirius.vpn.model.UmsMemberLoginFromIp;
import com.sirius.vpn.model.UmsMemberLoginFromIpExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsMemberLoginFromIpMapper {
    long countByExample(UmsMemberLoginFromIpExample example);

    int deleteByExample(UmsMemberLoginFromIpExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UmsMemberLoginFromIp record);

    int insertSelective(UmsMemberLoginFromIp record);

    List<UmsMemberLoginFromIp> selectByExample(UmsMemberLoginFromIpExample example);

    UmsMemberLoginFromIp selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UmsMemberLoginFromIp record, @Param("example") UmsMemberLoginFromIpExample example);

    int updateByExample(@Param("record") UmsMemberLoginFromIp record, @Param("example") UmsMemberLoginFromIpExample example);

    int updateByPrimaryKeySelective(UmsMemberLoginFromIp record);

    int updateByPrimaryKey(UmsMemberLoginFromIp record);
}