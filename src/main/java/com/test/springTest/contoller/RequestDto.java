package com.test.springTest.contoller;

import jdk.jfr.DataAmount;
import lombok.Data;

@Data
public class RequestDto {
    private String id;
    private String name;
    private String email;
    private String userName ;
    private String course;
}
