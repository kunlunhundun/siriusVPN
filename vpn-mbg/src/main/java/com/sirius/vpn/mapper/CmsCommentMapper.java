package com.sirius.vpn.mapper;

import com.sirius.vpn.model.CmsComment;
import com.sirius.vpn.model.CmsCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsCommentMapper {
    long countByExample(CmsCommentExample example);

    int deleteByExample(CmsCommentExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CmsComment record);

    int insertSelective(CmsComment record);

    List<CmsComment> selectByExample(CmsCommentExample example);

    CmsComment selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CmsComment record, @Param("example") CmsCommentExample example);

    int updateByExample(@Param("record") CmsComment record, @Param("example") CmsCommentExample example);

    int updateByPrimaryKeySelective(CmsComment record);

    int updateByPrimaryKey(CmsComment record);
}