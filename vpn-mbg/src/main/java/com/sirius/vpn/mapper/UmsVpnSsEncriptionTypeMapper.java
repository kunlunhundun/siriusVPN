package com.sirius.vpn.mapper;

import com.sirius.vpn.model.UmsVpnSsEncriptionType;
import com.sirius.vpn.model.UmsVpnSsEncriptionTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsVpnSsEncriptionTypeMapper {
    long countByExample(UmsVpnSsEncriptionTypeExample example);

    int deleteByExample(UmsVpnSsEncriptionTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UmsVpnSsEncriptionType record);

    int insertSelective(UmsVpnSsEncriptionType record);

    List<UmsVpnSsEncriptionType> selectByExample(UmsVpnSsEncriptionTypeExample example);

    UmsVpnSsEncriptionType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UmsVpnSsEncriptionType record, @Param("example") UmsVpnSsEncriptionTypeExample example);

    int updateByExample(@Param("record") UmsVpnSsEncriptionType record, @Param("example") UmsVpnSsEncriptionTypeExample example);

    int updateByPrimaryKeySelective(UmsVpnSsEncriptionType record);

    int updateByPrimaryKey(UmsVpnSsEncriptionType record);
}