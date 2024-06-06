package org.giorop.cloud.controller;

import cn.hutool.core.bean.BeanUtil;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.giorop.cloud.entities.Pay;
import org.giorop.cloud.entities.PayDto;
import org.giorop.cloud.service.PayService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author giorop
 * @date 2024/6/6_7:46
 * @description
 */
@RestController
@Tag(name="支付微服务模块",description = "支付crud")
@Slf4j
public class PayController {
    @Resource
    private PayService payService;

    @PostMapping("/pay/add")
    @Operation(summary = "新增",description = "新增支付流水，json串传参")
    public String addPay(@RequestBody PayDto payDto){
        Pay pay=new Pay();
        BeanUtil.copyProperties(payDto,pay);
        int r=payService.add(pay);
        return "成功返回"+r;
    }
    @DeleteMapping("/pay/del/{id}")
    public Integer deletePay(@PathVariable("id")Integer id){
        return payService.delete(id);
    }
    @PutMapping("/pay/update")
    public String updatePay(@RequestBody PayDto payDto){
        Pay pay=new Pay();
        BeanUtil.copyProperties(payDto,pay);
        int r=payService.update(pay);
        return "成功返回"+r;
    }
    @GetMapping("/pay/get/{id}")
    public Pay selectPayById(@PathVariable("id") Integer id){
        return payService.getById(id);
    }
    @GetMapping("/pay/getAll")
    public List<Pay> selectAll(){
        return payService.getAll();
    }
}


























