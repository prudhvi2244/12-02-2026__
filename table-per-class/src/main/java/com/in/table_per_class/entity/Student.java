package com.in.table_per_class.entity;

import lombok.*;

import java.util.Objects;

@Setter
@Getter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    private Long sid;
    private String sname;
    private String scity;


}
