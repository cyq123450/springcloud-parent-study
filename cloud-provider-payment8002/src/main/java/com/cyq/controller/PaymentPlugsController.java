package com.cyq.controller;

import com.cyq.commons.CommonResult;
import com.cyq.domain.Payment;
import com.cyq.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * 支付增强版控制器
 */
@Slf4j
@RestController
@RequestMapping("/payment/plugs")
public class PaymentPlugsController {

    @Autowired
    private PaymentService paymentService;

    @Value("${server.port}")
    private int serverPort;

    /**
     * 添加一条数据
     * @param payment
     * @return
     */
    @PostMapping("/add")
    public CommonResult addPayment(@RequestBody Payment payment) {
        int retVal = paymentService.addPayment(payment);
        log.info("数据保存成功，数据保存成功条数为：" + retVal + "，Port：" + serverPort);
        return new CommonResult(200, "保存成功", "数据保存成功，Port：" + serverPort);
    }

    /**
     * 获取一条数据
     * @param id
     * @return
     */
    @GetMapping("/get/{id}")
    public CommonResult getPayment(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPayment(id);
        log.info("id为：" + id + "的数据查询成功，Port：" + serverPort);
        return new CommonResult(200, "获取成功", payment.toString() + "，数据查询成功，Port：" + serverPort);
    }

}
