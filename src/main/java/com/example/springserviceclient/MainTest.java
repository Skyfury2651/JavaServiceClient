package com.example.springserviceclient;

import com.example.springserviceclient.client.service.ClientService;
import com.example.springserviceclient.service.*;

public class MainTest {
    public static void main(String[] args) {
        ClientService clientService = new ClientService();

        Student student = new Student();
        student.setName("hello");
        student.setAddress("abc");
        student.setId(1);

        clientService.studentService().save(student);
    }
}
