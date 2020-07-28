package com.sirius.vpn.mapper;

import com.sirius.vpn.model.CmsCommentOfficialReply;
import com.sirius.vpn.model.CmsCommentOfficialReplyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsCommentOfficialReplyMapper {
    long countByExample(CmsCommentOfficialReplyExample example);

    int deleteByExample(CmsCommentOfficialReplyExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CmsCommentOfficialReply record);

    int insertSelective(CmsCommentOfficialReply record);

    List<CmsCommentOfficialReply> selectByExample(CmsCommentOfficialReplyExample example);

    CmsCommentOfficialReply selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CmsCommentOfficialReply record, @Param("example") CmsCommentOfficialReplyExample example);

    int updateByExample(@Param("record") CmsCommentOfficialReply record, @Param("example") CmsCommentOfficialReplyExample example);

    int updateByPrimaryKeySelective(CmsCommentOfficialReply record);

    int updateByPrimaryKey(CmsCommentOfficialReply record);
}