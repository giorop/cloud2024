package org.giorop.cloud.service.impl;

import jakarta.annotation.Resource;
import org.giorop.cloud.entities.Pay;
import org.giorop.cloud.mapper.PayMapper;
import org.giorop.cloud.service.PayService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author giorop
 * @date 2024/6/6_7:40
 * @description
 */
@Service
public class PayServiceImpl implements PayService {
    @Resource
    private PayMapper payMapper;

    @Override
    public int add(Pay pay) {
        return payMapper.insertSelective(pay);//pay中Null值不会保存 会使用数据库中的默认值
    }

    @Override
    public int delete(Integer id) {
        return payMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int update(Pay pay) {
        return payMapper.updateByPrimaryKeySelective(pay);
    }

    @Override
    public Pay getById(Integer id) {
        return payMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Pay> getAll() {
        return payMapper.selectAll();
    }
}
