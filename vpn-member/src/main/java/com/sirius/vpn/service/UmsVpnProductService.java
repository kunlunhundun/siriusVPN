package com.sirius.vpn.service;

import com.sirius.vpn.model.PmsSkuStock;

import java.util.List;

public interface UmsVpnProductService {

    /**
     * 普通会员vip 充值金额列表
     * @return
     */
    List<PmsSkuStock> normalVipVpnList();

    /**
     * 超级vpn 充值金额的列表
     */
    List<PmsSkuStock> superVipVpnList();


}
