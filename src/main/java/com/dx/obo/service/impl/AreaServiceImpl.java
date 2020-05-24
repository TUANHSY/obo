package com.dx.obo.service.impl;

import com.dx.obo.dao.AreaDao;
import com.dx.obo.entity.Area;
import com.dx.obo.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: DuanXu
 * @date: 2019/8/28 16:20
 */
@Service
public class AreaServiceImpl implements AreaService {

    final
    AreaDao areaDao;

    public AreaServiceImpl(AreaDao areaDao) {
        this.areaDao = areaDao;
    }

    @Override
    public List<Area> getAllAreaList() {
        return areaDao.listAllArea();
    }
}
