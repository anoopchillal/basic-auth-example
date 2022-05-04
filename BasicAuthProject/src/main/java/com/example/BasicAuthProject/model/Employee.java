package com.example.BasicAuthProject.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "PostService")
@ToString

public class Employee {
    @Id
    private String employeeID;

    private String name;

    private String email;

    private String place;

}
