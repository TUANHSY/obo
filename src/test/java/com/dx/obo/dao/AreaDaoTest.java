package com.dx.obo.dao;

import com.dx.obo.BaseTest;
import com.dx.obo.entity.Area;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * @author: DuanXu
 * @date: 2019/8/28 17:23
 */
public class AreaDaoTest extends BaseTest {
    @Autowired
    private AreaDao areaDao;
    @Test
    public void testListAllArea(){
        List<Area> areaList = areaDao.listAllArea();
        assertEquals(2,areaList.size());
    }

    @Test
    public void testGetAreaByName(){
        Area area;
        area = areaDao.getAreaByName("西苑");
        assertNotNull(area);
    }

    @Test
    public void testGetAreaById(){
        Area area;
        area = areaDao.getAreaById(3);
        assertNotNull(area);
    }
}
