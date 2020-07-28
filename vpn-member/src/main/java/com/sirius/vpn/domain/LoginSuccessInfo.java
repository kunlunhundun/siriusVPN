package com.sirius.vpn.domain;

import com.sirius.vpn.model.UmsMember;
import lombok.Data;

@Data
public class LoginSuccessInfo extends UmsMember {
    private String token;
    private int expireDay;
    private String tokenHead;
}
