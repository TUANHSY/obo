package com.dx.obo.service;

import com.dx.obo.BaseTest;
import com.dx.obo.entity.Area;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author: DuanXu
 * @date: 2019/8/28 21:22
 */
public class AreaServiceTest extends BaseTest {
    @Autowired
    private AreaService areaService;
    @Test
    public void testGetAreaList(){
        List<Area> areaList=areaService.getAllAreaList();
        Assert.assertEquals("西苑",areaList.get(0).getAreaName());
    }
}
