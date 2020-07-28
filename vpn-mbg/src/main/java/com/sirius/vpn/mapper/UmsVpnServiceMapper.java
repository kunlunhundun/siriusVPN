package com.sirius.vpn.mapper;

import com.sirius.vpn.model.UmsVpnService;
import com.sirius.vpn.model.UmsVpnServiceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsVpnServiceMapper {
    long countByExample(UmsVpnServiceExample example);

    int deleteByExample(UmsVpnServiceExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UmsVpnService record);

    int insertSelective(UmsVpnService record);

    List<UmsVpnService> selectByExample(UmsVpnServiceExample example);

    UmsVpnService selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UmsVpnService record, @Param("example") UmsVpnServiceExample example);

    int updateByExample(@Param("record") UmsVpnService record, @Param("example") UmsVpnServiceExample example);

    int updateByPrimaryKeySelective(UmsVpnService record);

    int updateByPrimaryKey(UmsVpnService record);
}