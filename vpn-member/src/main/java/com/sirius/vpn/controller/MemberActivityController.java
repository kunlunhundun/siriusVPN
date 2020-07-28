package com.sirius.vpn.controller;

import com.sirius.vpn.common.api.CommonResult;
import com.sirius.vpn.domain.LoginRquestParam;
import com.sirius.vpn.domain.LoginSuccessInfo;
import com.sirius.vpn.service.MemberActivityService;
import com.sirius.vpn.service.UmsMemberService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

//用户统计数据
@Controller
@Api(tags = "MemberActivityController", description = "用户统计数据")
@RequestMapping("/activity")
public class MemberActivityController {


    @Autowired
    MemberActivityService activityService;

    @ApiOperation("新用户")
    @RequestMapping(value = "/newUser", method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public CommonResult newUser(HttpServletRequest request, @RequestParam  int day) {

        int  count = activityService.addNewUser(day);

        return CommonResult.success(count);

    }




}
