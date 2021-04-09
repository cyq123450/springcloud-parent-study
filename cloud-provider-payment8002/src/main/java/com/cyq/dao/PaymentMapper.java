package com.cyq.dao;

import com.cyq.domain.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * Payment的持久层接口
 */
public interface PaymentMapper {

    /**
     * 新增一条数据
     * @param payment
     * @return
     */
    int addPayment(Payment payment);

    /**
     * 通过ID获取一条数据
     * @param id
     * @return
     */
    Payment getPaymentById(@Param("id") Long id);

}
