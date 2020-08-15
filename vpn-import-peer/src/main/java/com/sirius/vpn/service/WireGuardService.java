package com.sirius.vpn.service;

import com.sirius.vpn.model.UmsVpnWireguard;

import java.util.List;

public interface WireGuardService {


    /**
     * 通过ip 和线路名写入到ums_vpn_service数据库中
     * @param ip
     * @param lineName
     * @return
     */

    int importVpnService(String ip, String lineName);


    /**
     * 通过IP 来修改线路名
     * @param ip
     * @param lineName
     */
    int updateVpnServiceLineName(String ip ,String lineName);

    /**
     *  通过ip来修改这台服务的线上是否可用， 1 删除不用这台服务 0 为可用
     * @param ip
     * @param deleteStatus
     */
    int updateVpnServiceDeleteStatue(String ip ,int deleteStatus);

    String getServiceId();

    String getVpnServiceId(String ip);

    /**
     * 批量插入数据库
     */
    int insertList(List<UmsVpnWireguard> wireguardList);
    /**
     * 增加一条wireguard 线路
     */
    int add(UmsVpnWireguard vpnWireguard);

    /**
     * 更新一条ss 线路
     */
    int update(UmsVpnWireguard vpnWireguard);

    /**
     * 删除一条ss线路
     */

    int delete(Long id);


}
