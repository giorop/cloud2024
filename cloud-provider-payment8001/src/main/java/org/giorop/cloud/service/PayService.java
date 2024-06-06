package org.giorop.cloud.service;

import org.giorop.cloud.entities.Pay;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author giorop
 * @date 2024/6/6_7:36
 * @description
 */
@Repository
public interface PayService {
    public int add(Pay pay);
    public int delete(Integer id);
    public int update(Pay pay);
    public Pay getById(Integer id);
    public List<Pay> getAll();
}











































