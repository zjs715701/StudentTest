package com.student.test.entity;

import lombok.Data;

import java.util.List;

/**
 * @author ：Super张
 * @date ：Created in 2020/9/30 11:29
 * @description：
 * @modified By：
 * @version:
 */
@Data
public class LayuiTable {
    private Integer code;
    private String msg;
    private Integer count;
    private List<?> data;


}
