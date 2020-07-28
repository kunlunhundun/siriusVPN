package com.sirius.vpn.mapper;

import com.sirius.vpn.model.UmsVpnWireguard;
import com.sirius.vpn.model.UmsVpnWireguardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsVpnWireguardMapper {
    long countByExample(UmsVpnWireguardExample example);

    int deleteByExample(UmsVpnWireguardExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UmsVpnWireguard record);

    int insertSelective(UmsVpnWireguard record);

    List<UmsVpnWireguard> selectByExample(UmsVpnWireguardExample example);

    UmsVpnWireguard selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UmsVpnWireguard record, @Param("example") UmsVpnWireguardExample example);

    int updateByExample(@Param("record") UmsVpnWireguard record, @Param("example") UmsVpnWireguardExample example);

    int updateByPrimaryKeySelective(UmsVpnWireguard record);

    int updateByPrimaryKey(UmsVpnWireguard record);
}