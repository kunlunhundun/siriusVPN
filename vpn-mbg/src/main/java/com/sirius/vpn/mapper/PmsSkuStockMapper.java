package com.sirius.vpn.mapper;

import com.sirius.vpn.model.PmsSkuStock;
import com.sirius.vpn.model.PmsSkuStockExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsSkuStockMapper {
    long countByExample(PmsSkuStockExample example);

    int deleteByExample(PmsSkuStockExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PmsSkuStock record);

    int insertSelective(PmsSkuStock record);

    List<PmsSkuStock> selectByExampleWithBLOBs(PmsSkuStockExample example);

    List<PmsSkuStock> selectByExample(PmsSkuStockExample example);

    PmsSkuStock selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PmsSkuStock record, @Param("example") PmsSkuStockExample example);

    int updateByExampleWithBLOBs(@Param("record") PmsSkuStock record, @Param("example") PmsSkuStockExample example);

    int updateByExample(@Param("record") PmsSkuStock record, @Param("example") PmsSkuStockExample example);

    int updateByPrimaryKeySelective(PmsSkuStock record);

    int updateByPrimaryKeyWithBLOBs(PmsSkuStock record);

    int updateByPrimaryKey(PmsSkuStock record);
}