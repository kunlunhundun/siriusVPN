package com.sirius.vpn.service.impl;

import com.sirius.vpn.mapper.PmsSkuStockMapper;
import com.sirius.vpn.model.PmsSkuStock;
import com.sirius.vpn.model.PmsSkuStockExample;
import com.sirius.vpn.service.UmsVpnProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UmsVpnProductServiceImpl implements UmsVpnProductService {

    @Autowired
    private PmsSkuStockMapper skuStockMapper;

    @Override
    public List<PmsSkuStock> normalVipVpnList() {
        PmsSkuStockExample example = new PmsSkuStockExample();
        example.createCriteria().andProductIdEqualTo(20L);
        List<PmsSkuStock> skuStockList = skuStockMapper.selectByExample(example);
        return skuStockList;
    }

    @Override
    public List<PmsSkuStock> superVipVpnList() {
        PmsSkuStockExample example = new PmsSkuStockExample();
        example.createCriteria().andProductIdEqualTo(50L);
        List<PmsSkuStock> skuStockList = skuStockMapper.selectByExample(example);
        return skuStockList;    }
}
