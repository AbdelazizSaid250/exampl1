package com.example.test.model.dto;

import lombok.*;

import java.util.Objects;

//@Getter
//@Setter
////@ToString(exclude = "id")
////@ToString(onlyExplicitlyIncluded = true)
//@ToString(of = {"name", "age"} )
//@EqualsAndHashCode
//@AllArgsConstructor
////@NoArgsConstructor
//@RequiredArgsConstructor
@Data
@RequiredArgsConstructor
@AllArgsConstructor
@ToString(exclude = {"id"})
public class Student {

    @NonNull
    private Integer id;

    @NonNull
    private String name;

    private int age;

}
