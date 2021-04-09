package com.cyq.service.impl;

import com.cyq.dao.PaymentMapper;
import com.cyq.domain.Payment;
import com.cyq.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Payment服务层接口实现类
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentMapper paymentMapper;

    @Override
    public int addPayment(Payment payment) {
        return paymentMapper.addPayment(payment);
    }

    @Override
    public Payment getPayment(Long id) {
        return paymentMapper.getPaymentById(id);
    }
}
