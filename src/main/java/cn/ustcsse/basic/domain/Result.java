package cn.ustcsse.basic.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Result implements Serializable {

    public List<Student> getRecords() {
        return records;
    }

    public void setRecords(List<Student> records) {
        this.records = records;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    List<Student> records;
    Integer total;
}
