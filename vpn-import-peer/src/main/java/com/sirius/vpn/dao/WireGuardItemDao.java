package com.sirius.vpn.dao;

import com.sirius.vpn.model.UmsVpnWireguard;
import org.apache.ibatis.annotations.Param;
import java.util.List;

public interface WireGuardItemDao {

    int insertList(@Param("list") List<UmsVpnWireguard> list);

}
