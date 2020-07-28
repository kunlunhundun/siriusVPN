package com.sirius.vpn.domain;

import com.sirius.vpn.model.OmsOrder;
import com.sirius.vpn.model.OmsOrderItem;

import java.util.List;

public class OmsOrderDetail extends OmsOrder {

    private List<OmsOrderItem> orderItemList;

    public List<OmsOrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(List<OmsOrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }
}
