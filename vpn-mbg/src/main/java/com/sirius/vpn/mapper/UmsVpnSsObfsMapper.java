package com.sirius.vpn.mapper;

import com.sirius.vpn.model.UmsVpnSsObfs;
import com.sirius.vpn.model.UmsVpnSsObfsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsVpnSsObfsMapper {
    long countByExample(UmsVpnSsObfsExample example);

    int deleteByExample(UmsVpnSsObfsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UmsVpnSsObfs record);

    int insertSelective(UmsVpnSsObfs record);

    List<UmsVpnSsObfs> selectByExample(UmsVpnSsObfsExample example);

    UmsVpnSsObfs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UmsVpnSsObfs record, @Param("example") UmsVpnSsObfsExample example);

    int updateByExample(@Param("record") UmsVpnSsObfs record, @Param("example") UmsVpnSsObfsExample example);

    int updateByPrimaryKeySelective(UmsVpnSsObfs record);

    int updateByPrimaryKey(UmsVpnSsObfs record);
}