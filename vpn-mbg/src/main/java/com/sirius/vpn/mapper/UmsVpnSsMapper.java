package com.sirius.vpn.mapper;

import com.sirius.vpn.model.UmsVpnSs;
import com.sirius.vpn.model.UmsVpnSsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsVpnSsMapper {
    long countByExample(UmsVpnSsExample example);

    int deleteByExample(UmsVpnSsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UmsVpnSs record);

    int insertSelective(UmsVpnSs record);

    List<UmsVpnSs> selectByExample(UmsVpnSsExample example);

    UmsVpnSs selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UmsVpnSs record, @Param("example") UmsVpnSsExample example);

    int updateByExample(@Param("record") UmsVpnSs record, @Param("example") UmsVpnSsExample example);

    int updateByPrimaryKeySelective(UmsVpnSs record);

    int updateByPrimaryKey(UmsVpnSs record);
}