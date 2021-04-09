package com.cyq.controller;

import com.cyq.commons.CommonResult;
import com.cyq.domain.Payment;
import com.cyq.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Payment控制器
 */
@Slf4j
@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    /**
     * 添加一条数据
     * @param payment
     * @return
     */
    @PostMapping("/add")
    public CommonResult addPayment(@RequestBody Payment payment) {
        int retVal = paymentService.addPayment(payment);
        log.info("数据保存成功，数据保存成功条数为：" + retVal);
        return new CommonResult(200, "保存成功", null);
    }

    /**
     * 获取一条数据
     * @param id
     * @return
     */
    @GetMapping("/get/{id}")
    public CommonResult getPayment(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPayment(id);
        log.info("id为：" + id + "的数据查询成功");
        return new CommonResult(200, "获取成功", payment);
    }

}
