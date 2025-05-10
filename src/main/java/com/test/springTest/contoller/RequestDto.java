package com.test.springTest.contoller;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class RequestDto {
    private String id;
    private String name;
    private String email;
    private String userName ;
    private String course;

}

