package com.example.mybatisplus.service;

import com.example.mybatisplus.entity.PersonalPerAddr;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author cowwa
 * @since 2019-12-09
 */
public interface IPersonalPerAddrService extends IService<PersonalPerAddr> {
    public void dataDumpRecord(List<PersonalPerAddr> list);
}
