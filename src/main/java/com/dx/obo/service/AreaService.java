package com.dx.obo.service;

import com.dx.obo.entity.Area;

import java.util.List;

/**
 * @author: DuanXu
 * @date: 2019/8/28 16:19
 */
public interface AreaService {

    /**
     * 返回全部区域列表
     * @return
     */
    List<Area> getAllAreaList();
}
