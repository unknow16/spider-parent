package com.unknow.spiderparent.vo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
public class PageData<T> implements Serializable {

    private List<T> rows;
    private Integer total;

    public static PageData create(List rows, Integer total) {
        return new PageData(rows, total);
    }
}
