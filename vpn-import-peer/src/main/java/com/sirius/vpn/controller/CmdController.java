package com.sirius.vpn.controller;


import com.sirius.vpn.common.api.CommonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sirius.vpn.service.VpnConnectStatusService;
import com.sirius.vpn.service.WireGuardService;

@Api(tags = "CmdController", description = "vpn服务管理")
@Controller
@RequestMapping("/cmd")
public class CmdController {

    @Autowired
    WireGuardService wireGuardService;
    @Autowired
    VpnConnectStatusService vpnConnectStatusService;

    @ApiOperation("导入服务，生成vpnservice 数据库")
    @RequestMapping(value = "/importService", method = RequestMethod.GET)
    @ResponseBody
    public String generateService(@RequestParam String ip, @RequestParam String lineName) {

        int result = wireGuardService.importVpnService(ip,lineName);
        if (result == 0) {
            return  "导入失败";
        }
        return "导入成功";
    }

    @ApiOperation("导入所有的用户peers 从.conf文件中 到数据库wireguard数据库中")
    @RequestMapping(value = "/importAllPeers", method = RequestMethod.GET)
    @ResponseBody
    public String importAllConf() {

         vpnConnectStatusService.importVpnDataFromConf();
        return "导入成功";
    }

    @ApiOperation("vpn 线路删除或上架")
    @RequestMapping(value = "/updateVpnStatus",method = {RequestMethod.GET,RequestMethod.POST})
    @ApiImplicitParam(name = "deleteStatus", value = "0 上架；1->删除",
            defaultValue = "0", allowableValues = "0,1",  dataType = "integer")
    @ResponseBody
    public CommonResult updateVpnStatus(@RequestParam(value = "deleteStatus", defaultValue = "0") Integer deleteStatus, @RequestParam String ip) {

        int ret = wireGuardService.updateVpnServiceDeleteStatue(ip,deleteStatus);
        if (ret >= 0) {
            return  CommonResult.success(ret);
        }
        return  CommonResult.failed();
    }

    @ApiOperation("vpn 修改线路名")
    @RequestMapping(value = "/updateVpnLineName",method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public CommonResult updateVpnLineName(@RequestParam String ip,@RequestParam String lineName) {

        int ret = wireGuardService.updateVpnServiceLineName(ip,lineName);
        if (ret >= 0) {
            return  CommonResult.success(ret);
        }
        return  CommonResult.failed();
    }


}
