package com.sirius.vpn.domain;

import com.sirius.vpn.model.CmsComment;
import com.sirius.vpn.model.CmsCommentOfficialReply;
import lombok.Data;

import java.util.List;

@Data
public class MessageInfo {

    CmsComment comment;

    List<CmsCommentOfficialReply> officialReplyList;

}
