package com.dx.obo.entity;

import java.util.Date;
import java.util.Objects;

/**
 * @author: DuanXu
 * @date: 2019/8/28 15:31
 */
public class Area {
    private int areaId;
    private String areaName;
    private int priority;
    private Date createTime;
    private Date lastEditTime;

    public int getAreaId() {
        return areaId;
    }

    public void setAreaId(int areaId) {
        this.areaId = areaId;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public Date getcreateTime() {
        return createTime;
    }

    public void setcreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastEditTime() {
        return lastEditTime;
    }

    public void setLastEditTime(Date lastEditTime) {
        this.lastEditTime = lastEditTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Area)) {
            return false;
        }
        Area area = (Area) o;
        return getAreaId() == area.getAreaId() &&
                getPriority() == area.getPriority() &&
                Objects.equals(getAreaName(), area.getAreaName()) &&
                Objects.equals(getcreateTime(), area.getcreateTime()) &&
                Objects.equals(getLastEditTime(), area.getLastEditTime());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAreaId(), getAreaName(), getPriority(), getcreateTime(), getLastEditTime());
    }
}
