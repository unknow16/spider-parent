package com.unknow.spiderparent.common;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @Date 2019/4/10 17:18
 * @Created by fuyi
 */
@Data
@AllArgsConstructor
public class PageData<T> implements Serializable {

    private List<T> rows;
    private Integer total;

    public static PageData create(List rows, Integer total) {
        return new PageData(rows, total);
    }
}
