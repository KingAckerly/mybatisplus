package com.lsm.mybatisplus.service.impl;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lsm.mybatisplus.entity.CarEntity;
import com.lsm.mybatisplus.mapper.CarMapper;
import com.lsm.mybatisplus.service.ICarService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CarServiceImpl implements ICarService {

    @Resource
    private CarMapper carMapper;

    @Override
    public void mybatisPlusAdd() {
        CarEntity carEntity = new CarEntity();
        carEntity.setId(1L);
        carEntity.setBrand("野马");
        carMapper.insert(carEntity);
    }

    @Override
    public void mybatisPlusDel() {
        carMapper.deleteById(1L);
    }

    @Override
    public void mybatisPlusUpdate() {
        CarEntity carEntity = new CarEntity();
        carEntity.setId(1L);
        carEntity.setBrand("哈雷");
        carMapper.updateById(carEntity);
    }

    @Override
    public void mybatisPlusGet() {
        CarEntity carEntity = carMapper.selectById(1L);
        System.out.println(carEntity);
    }

    @Override
    public void mybatisPlusList() {
        List<CarEntity> carEntityList = carMapper.selectList(null);
        System.out.println(carEntityList);
    }

    @Override
    public void mybatisPlusListPage() {
        Page<CarEntity> page = new Page<>(1, 2);
        IPage<CarEntity> carEntityIPage = carMapper.selectPage(page, null);
        System.out.println(carEntityIPage);
    }
}
