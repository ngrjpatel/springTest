package com.test.springTest.contoller;

import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class RequestDto {
    private String id;
    private String name;
    private String email;
    private String userName ;
    private String course;
}
