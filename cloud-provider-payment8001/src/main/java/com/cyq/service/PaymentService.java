package com.cyq.service;

import com.cyq.domain.Payment;

/**
 * Payment服务层接口
 */
public interface PaymentService {

    /**
     * 添加一条数据
     * @param payment
     * @return
     */
    int addPayment(Payment payment);

    /**
     * 获取一条数据
     * @param id
     * @return
     */
    Payment getPayment(Long id);

}
