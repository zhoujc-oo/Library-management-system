package com.zhoujc.domain;


import lombok.Data;

import javax.persistence.Column;

/**
 * 添加表单属性
 *
 * @Author zhoujc
 * @Date 2022/2/26
 */
@Data
public class User {
    private int id;
    private String type;
    private String name;
    private String description;
}
