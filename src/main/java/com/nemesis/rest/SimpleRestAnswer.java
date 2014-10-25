package com.nemesis.rest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Mac on 23/10/14.
 */
@XmlRootElement(name = "answer")
@XmlAccessorType(XmlAccessType.FIELD)
public class SimpleRestAnswer {

    private Map<String, Object> data;

    public SimpleRestAnswer() {
        this.data = new HashMap<String, Object>();
    }

    public SimpleRestAnswer add(String key, Object value){
        data.put(key, value);
        return this;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }

}
