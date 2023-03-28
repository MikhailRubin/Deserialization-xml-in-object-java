package org.example.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import lombok.Data;

import java.util.List;
@Data
public class Testsuite {
    String name;
    int tests;
    int skipped;
    int failures;
    int errors;
    String timestamp;
    String hostname;
    double time;

    @JacksonXmlElementWrapper(useWrapping = false) // достает всю коллекцию
    List<Testcase> testcase;

}
