package com.sirius.vpn.service.impl;

import com.github.pagehelper.PageHelper;
import com.sirius.vpn.mapper.UmsMemberStatisticsInfoMapper;
import com.sirius.vpn.mapper.UmsVpnServiceMapper;
import com.sirius.vpn.mapper.UmsVpnWireguardMapper;
import com.sirius.vpn.model.*;
import com.sirius.vpn.service.UmsMemberService;
import com.sirius.vpn.service.UmsVpnMachinesService;
import com.sirius.vpn.service.UmsVpnSSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class UmsVpnMachinesServiceImpl implements UmsVpnMachinesService {

    @Autowired
    UmsVpnServiceMapper serviceMapper;
    @Autowired
    UmsVpnWireguardMapper vpnWireguardMapper;

    @Autowired
    UmsMemberService memberService;

    @Autowired
    UmsMemberStatisticsInfoMapper statisticsInfoMapper;

    @Override
    public int add(UmsVpnService vpnService) {

        UmsVpnServiceExample example = new UmsVpnServiceExample();
        example.createCriteria().andIpEqualTo(vpnService.getIp());
        List<UmsVpnService> vpnServiceList = serviceMapper.selectByExample(example);
        if (!CollectionUtils.isEmpty(vpnServiceList)){
            return serviceMapper.updateByExampleSelective(vpnService,example);
        }
        return serviceMapper.insert(vpnService);
    }

    @Override
    public int update(UmsVpnService vpnService) {
        UmsVpnServiceExample example = new UmsVpnServiceExample();
        example.createCriteria().andIpEqualTo(vpnService.getIp()).andIdEqualTo(vpnService.getId());
        return serviceMapper.updateByExampleSelective(vpnService,example);
    }

    @Override
    public int delete(UmsVpnService vpnService) {
        return serviceMapper.deleteByPrimaryKey(vpnService.getId());
    }

    @Override
    public List<Map<String,Object>> getWireGuardLine() {

       /* UmsMember member = memberService.getCurrentMember();
        UmsMemberStatisticsInfoExample statisticsInfoExample = new UmsMemberStatisticsInfoExample();
        statisticsInfoExample.createCriteria().andMemberIdEqualTo(member.getId());
        List<UmsMemberStatisticsInfo> statisticsInfoList =  statisticsInfoMapper.selectByExample(statisticsInfoExample);
        if (!CollectionUtils.isEmpty(statisticsInfoList)) {
            UmsMemberStatisticsInfo statisticsInfo = statisticsInfoList.get(0);
            Long wireguardId = statisticsInfo.getWireguardId();
            UmsVpnWireguard vpnWireguard = vpnWireguardMapper.selectByPrimaryKey(wireguardId);
            if (vpnWireguard.getUseStatus() != 1) {
                UmsVpnService vpnService = serviceMapper.selectByPrimaryKey(vpnWireguard.getServiceId());
                Map<String,Object> map = new HashMap<String,Object>();
                map.put("lineName",vpnService.getLineName());
                List<UmsVpnWireguard> vpnWireguardList =  new ArrayList();
                vpnWireguardList.add(vpnWireguard);
                map.put("wireguards",vpnWireguardList);
                List<Map<String,Object>> lists = new ArrayList<>();
                lists.add(map);
                return lists;
            }
        } */

       UmsVpnServiceExample example = new UmsVpnServiceExample();
       example.createCriteria().andDeleteStatusNotEqualTo(1);
       example.setOrderByClause("line_name desc");
       List<UmsVpnService> vpnServiceList = serviceMapper.selectByExample(example);
        List<UmsVpnService> usaList = new ArrayList<>();
        // usaList = vpnServiceList.stream().filter(vpnService -> vpnService.getLineName().toLowerCase().contains("usa")).collect(Collectors.toList());
        for (int i = 0; i< vpnServiceList.size(); i++) {
            UmsVpnService vpnService = vpnServiceList.get(i);
            if (vpnService.getLineName().toLowerCase().contains("tik")) {
                usaList.add(vpnService);
            }
        }
        vpnServiceList.removeAll(usaList);
        vpnServiceList.addAll(0,usaList);
        usaList.clear();
        List<Map<String,Object>> lists = new ArrayList<>();
       for (int i = 0; i< vpnServiceList.size(); i++) {
           UmsVpnService vpnService = vpnServiceList.get(i);
           PageHelper.startPage(0, 10);
           UmsVpnWireguardExample wireguardExample = new UmsVpnWireguardExample();
           wireguardExample.createCriteria()
                   .andServiceIdEqualTo(vpnService.getId())
                   .andUseStatusEqualTo(0);
           wireguardExample.setOrderByClause("update_time desc");
           List<UmsVpnWireguard> vpnWireguardList = vpnWireguardMapper.selectByExample(wireguardExample);
           Map<String,Object> map = new HashMap<String,Object>();
           List<UmsVpnWireguard> tempList = new ArrayList<>();
           if (vpnWireguardList.size() > 0) {
               tempList.add(vpnWireguardList.get(0));
           } else if (vpnWireguardList.size() > 1) {
               tempList.add(vpnWireguardList.get(1));
           }
           map.put("lineName",vpnService.getLineName());
           map.put("wireguards",tempList);
           lists.add(map);
       }
       return lists;
   }

}
