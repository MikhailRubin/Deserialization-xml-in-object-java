package org.example;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.example.model.Testsuite;

import java.io.File;
import java.io.IOException;


public class Main {

    public static void main(String[] args) {

        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        xmlMapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        File file = new File("TEST-my.alex.tasks.TasksApplicationTests.xml");
        try {
            Testsuite testsuite = xmlMapper.readValue(file, Testsuite.class);
            System.out.println(testsuite);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}