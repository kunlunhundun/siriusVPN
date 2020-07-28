package com.sirius.vpn.dao;

import com.sirius.vpn.model.OmsOrderItem;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WireguardUpdateConnectDao {

    int updateConnectStatus();

}
