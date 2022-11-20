package cn.ustcsse.basic.domain;

import java.io.Serializable;
import java.util.List;

public class ResultT implements Serializable {

    public List<Teacher> getRecords() {
        return records;
    }

    public void setRecords(List<Teacher> records) {
        this.records = records;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    List<Teacher> records;
    Integer total;
}