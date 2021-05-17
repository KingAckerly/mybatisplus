package com.lsm.mybatisplus.entity;


import com.baomidou.mybatisplus.annotation.TableName;

@TableName("car")
public class CarEntity {
    private Long id;
    private String brand;

    public Long getId() {
        return id;
    }

    public CarEntity setId(Long id) {
        this.id = id;
        return this;
    }

    public String getBrand() {
        return brand;
    }

    public CarEntity setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    @Override
    public String toString() {
        return "CarEntity{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                '}';
    }
}
