package com.sirius.vpn.mapper;

import com.sirius.vpn.model.DataIp20200801Overseas;
import com.sirius.vpn.model.DataIp20200801OverseasExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DataIp20200801OverseasMapper {
    long countByExample(DataIp20200801OverseasExample example);

    int deleteByExample(DataIp20200801OverseasExample example);

    int insert(DataIp20200801Overseas record);

    int insertSelective(DataIp20200801Overseas record);

    List<DataIp20200801Overseas> selectByExample(DataIp20200801OverseasExample example);

    int updateByExampleSelective(@Param("record") DataIp20200801Overseas record, @Param("example") DataIp20200801OverseasExample example);

    int updateByExample(@Param("record") DataIp20200801Overseas record, @Param("example") DataIp20200801OverseasExample example);
}