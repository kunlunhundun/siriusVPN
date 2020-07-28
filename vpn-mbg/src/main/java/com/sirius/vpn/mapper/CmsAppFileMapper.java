package com.sirius.vpn.mapper;

import com.sirius.vpn.model.CmsAppFile;
import com.sirius.vpn.model.CmsAppFileExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsAppFileMapper {
    long countByExample(CmsAppFileExample example);

    int deleteByExample(CmsAppFileExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CmsAppFile record);

    int insertSelective(CmsAppFile record);

    List<CmsAppFile> selectByExample(CmsAppFileExample example);

    CmsAppFile selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CmsAppFile record, @Param("example") CmsAppFileExample example);

    int updateByExample(@Param("record") CmsAppFile record, @Param("example") CmsAppFileExample example);

    int updateByPrimaryKeySelective(CmsAppFile record);

    int updateByPrimaryKey(CmsAppFile record);
}