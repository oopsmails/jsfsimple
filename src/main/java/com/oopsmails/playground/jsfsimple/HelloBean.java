package com.oopsmails.playground.jsfsimple;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean 
@SessionScoped
public class HelloBean {
    public String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

	public String getMessage() {
        String response = "";
        if(name != null) {
            response = "Ajax Message: Hello, " + name +"!";
        }
        return response;
    }
}