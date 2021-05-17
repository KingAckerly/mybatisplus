package com.lsm.mybatisplus.controller;


import com.lsm.mybatisplus.service.ICarService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "/car")
public class CarController {

    @Resource
    ICarService carService;

    @RequestMapping(value = "/mybatisPlusAdd", method = RequestMethod.GET)
    public String mybatisPlusAdd() {
        carService.mybatisPlusAdd();
        return "mybatisPlusAdd!";
    }

    @RequestMapping(value = "/mybatisPlusDel", method = RequestMethod.GET)
    public String mybatisPlusDel() {
        carService.mybatisPlusDel();
        return "mybatisPlusDel!";
    }

    @RequestMapping(value = "/mybatisPlusUpdate", method = RequestMethod.GET)
    public String mybatisPlusUpdate() {
        carService.mybatisPlusUpdate();
        return "mybatisPlusUpdate!";
    }

    @RequestMapping(value = "/mybatisPlusGet", method = RequestMethod.GET)
    public String mybatisPlusGet() {
        carService.mybatisPlusGet();
        return "mybatisPlusGet!";
    }

    @RequestMapping(value = "/mybatisPlusList", method = RequestMethod.GET)
    public String mybatisPlusList() {
        carService.mybatisPlusList();
        return "mybatisPlusList!";
    }

    @RequestMapping(value = "/mybatisPlusListPage", method = RequestMethod.GET)
    public String mybatisPlusListPage() {
        carService.mybatisPlusListPage();
        return "mybatisPlusListPage!";
    }

}
