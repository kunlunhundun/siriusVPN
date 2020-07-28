package com.sirius.vpn.service.impl;

import com.sirius.vpn.common.utils.Utils;
import com.sirius.vpn.mapper.UmsMemberMapper;
import com.sirius.vpn.mapper.UmsMemberStatisticsInfoMapper;
import com.sirius.vpn.model.UmsMember;
import com.sirius.vpn.model.UmsMemberExample;
import com.sirius.vpn.model.UmsMemberStatisticsInfoExample;
import com.sirius.vpn.service.MemberActivityService;
import com.sirius.vpn.service.UmsMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class MemberActivityServiceImpl implements MemberActivityService {

    @Autowired
    UmsMemberService memberService;
    @Autowired
    UmsMemberMapper memberMapper;
    @Autowired
    UmsMemberStatisticsInfoMapper statisticsInfoMapper;

    @Override
    public int addNewUser(int day) {
        Date beforeDate = Utils.subDays(day);
        UmsMemberExample example = new UmsMemberExample();
        example.createCriteria().andCreateTimeGreaterThanOrEqualTo(beforeDate);
        List<UmsMember> memberList = memberMapper.selectByExample(example);
        int count = memberList.size();
        return  count;
    }


    @Override
    public int activityUser(int day) {
        Date beforeDate = Utils.subDays(day);
        UmsMemberStatisticsInfoExample statisticsInfoExample = new UmsMemberStatisticsInfoExample();
        statisticsInfoExample.createCriteria().andLastLoginTimeGreaterThanOrEqualTo(beforeDate);
        Long count = statisticsInfoMapper.countByExample(statisticsInfoExample);
        return count.intValue();
    }




}
