package com.dx.obo.dao;

import com.dx.obo.entity.Area;

import java.util.List;

/**
 * 对Area的增删改查
 * @author: DuanXu
 * @date: 2019/8/28 15:34
 */
public interface AreaDao {

    /**
     * 添加区域
     * @param area
     * @return
     */
    int addArea(Area area);

    /**
     * 通过areaId删除area
     * @param areaId
     * @return
     */
    int deleteAreaByAreaId(int areaId);

    /**
     * 通过areaName删除area
     * @param areaName
     * @return
     */
    int deleteAreaByAreaName(String  areaName);

    /**
     * 通过areaId更新area
     * @param areaId
     * @return
     */
    int updateAreaByAreaId(int areaId);

    /**
     * 通过areaName更新area
     * @param areaName
     * @return
     */
    int updateAreaByAreaName(int areaName);

    /**
     * 返回所有区域列表
     * @return
     */
    List<Area> listAllArea();

    /**
     * 通过区域名称返回一个区域
     * @param areaName
     * @return
     */
    Area getAreaByName(String areaName);

    /**
     * 通过区域Id返回一个区域
     * @param id
     * @return
     */
    Area getAreaById(int id);

}
