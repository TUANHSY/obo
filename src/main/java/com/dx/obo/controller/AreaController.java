package com.dx.obo.controller;

import com.dx.obo.entity.Area;
import com.dx.obo.service.AreaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * @author DX
 */
@Controller
/**
 * 访问/superadmin
 */
@RequestMapping("/superadmin")
public class AreaController {

    Logger logger = LoggerFactory.getLogger(AreaController.class);

    private AreaService areaService;
    @Autowired
    public AreaController(AreaService areaService) {
        this.areaService = areaService;
    }

    /**
     * 列出所有的区域
     * @return
     */
    @RequestMapping(value = "/listallarea",method = RequestMethod.GET)

    @ResponseBody
    private Map<String,Object> listAllArea(){
        logger.info("=====start=====");
        long startTime = System.currentTimeMillis();
        Map<String,Object> modelMap = new HashMap<>();

        List<Area> areaList;

        try {
            areaList=areaService.getAllAreaList();
            modelMap.put("rows",areaList);
            modelMap.put("total",areaList.size());
        }catch (Exception e){
            e.printStackTrace();
            modelMap.put("success",false);
            modelMap.put("errMsg",e.toString());
        }
        logger.error("test error!");
        long endTime = System.currentTimeMillis();
        logger.debug("costTime:[{}ms]",endTime-startTime);
        logger.info("=====end=====");

        return modelMap;
    }

}
