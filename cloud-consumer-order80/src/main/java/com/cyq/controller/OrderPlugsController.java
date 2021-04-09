package com.cyq.controller;

import com.cyq.commons.CommonResult;
import com.cyq.domain.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * 订单控制器
 */
@Slf4j
@RestController
@RequestMapping("/order/plugs")
public class OrderPlugsController {

    private static final String PAYMENT_URL = "http://CLOUD-PAYMENT-SERVICE/payment/plugs";

    @Autowired
    private RestTemplate restTemplate;

    /**
     * 通过id获取支付数据
     * @param id
     * @return
     */
    @GetMapping("/get/{id}")
    public CommonResult getPayment(@PathVariable("id") Integer id) {
        CommonResult commonResult = restTemplate.getForObject(PAYMENT_URL + "/get/" + id, CommonResult.class);
        log.info("订单控制器获取id为:" + id + "的数据成功...");
        return new CommonResult<>(200, "查询成功", commonResult);
    }

    /**
     * 新增支付数据
     * @param payment
     * @return
     */
    @PostMapping("/add")
    public CommonResult addPayment(@RequestBody Payment payment) {
        CommonResult commonResult = restTemplate.postForObject(PAYMENT_URL + "/add", payment, CommonResult.class);
        log.info("订单控制器新增支付数据成功...");
        return new CommonResult<>(200, "保存成功", commonResult);
    }

}
