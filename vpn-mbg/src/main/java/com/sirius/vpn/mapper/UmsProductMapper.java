package com.sirius.vpn.mapper;

import com.sirius.vpn.model.UmsProduct;
import com.sirius.vpn.model.UmsProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsProductMapper {
    long countByExample(UmsProductExample example);

    int deleteByExample(UmsProductExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UmsProduct record);

    int insertSelective(UmsProduct record);

    List<UmsProduct> selectByExampleWithBLOBs(UmsProductExample example);

    List<UmsProduct> selectByExample(UmsProductExample example);

    UmsProduct selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UmsProduct record, @Param("example") UmsProductExample example);

    int updateByExampleWithBLOBs(@Param("record") UmsProduct record, @Param("example") UmsProductExample example);

    int updateByExample(@Param("record") UmsProduct record, @Param("example") UmsProductExample example);

    int updateByPrimaryKeySelective(UmsProduct record);

    int updateByPrimaryKeyWithBLOBs(UmsProduct record);

    int updateByPrimaryKey(UmsProduct record);
}