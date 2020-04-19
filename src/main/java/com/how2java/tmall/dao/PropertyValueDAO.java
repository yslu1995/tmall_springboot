package com.how2java.tmall.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.how2java.tmall.pojo.Product;
import com.how2java.tmall.pojo.Property;
import com.how2java.tmall.pojo.PropertyValue;

public interface PropertyValueDAO extends JpaRepository<PropertyValue, Integer> {
    /**
     * 提供根据产品查询：
     *
     * @param product
     * @return
     */
    List<PropertyValue> findByProductOrderByIdDesc(Product product);

    /**
     * 根据产品和属性获取PropertyValue对象
     *
     * @param property
     * @param product
     * @return
     */
    PropertyValue getByPropertyAndProduct(Property property, Product product);

}