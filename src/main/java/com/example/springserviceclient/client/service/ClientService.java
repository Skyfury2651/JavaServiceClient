package com.example.springserviceclient.client.service;

import com.example.springserviceclient.service.StudentService;
import com.example.springserviceclient.service.StudentServiceService;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
    @Bean
    public StudentService studentService(){
        StudentServiceService studentServiceService = new StudentServiceService();
        return  studentServiceService.getStudentServicePort();
    }
}
