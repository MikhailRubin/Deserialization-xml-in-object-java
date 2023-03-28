package org.example.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Testcase {
    String name;
    String classname;
    double time;
    Failure failure;
}
