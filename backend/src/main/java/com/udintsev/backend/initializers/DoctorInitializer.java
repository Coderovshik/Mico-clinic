package com.udintsev.backend.initializers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.udintsev.backend.entities.Department;
import com.udintsev.backend.entities.Doctor;
import com.udintsev.backend.repositories.DoctorRepository;

import jakarta.annotation.PostConstruct;

@Component
public class DoctorInitializer {
    @Autowired
    private DoctorRepository doctorRepository;

    @PostConstruct
    public void init() {
        // department 1 
        Department dep1 = new Department();
        dep1.setId((long)(1));

        Doctor doc1 = new Doctor();
        doc1.setDoctorname("Иванова Анна Петровна");
        doc1.setDepartment(dep1);

        Doctor doc2 = new Doctor();
        doc2.setDoctorname("Смирнов Алексей Васильевич");
        doc2.setDepartment(dep1);

        Doctor doc3 = new Doctor();
        doc3.setDoctorname("Петрова Елена Игоревна");
        doc3.setDepartment(dep1);

        doctorRepository.save(doc1);
        doctorRepository.save(doc2);
        doctorRepository.save(doc3);

        // department 2
        Department dep2 = new Department();
        dep2.setId((long)(2));

        Doctor doc4 = new Doctor();
        doc4.setDoctorname("Козлов Владимир Анатольевич");
        doc4.setDepartment(dep2);

        Doctor doc5 = new Doctor();
        doc5.setDoctorname("Михайлова Ольга Александровна");
        doc5.setDepartment(dep2);

        Doctor doc6 = new Doctor();
        doc6.setDoctorname("Николаев Артем Сергеевич");
        doc6.setDepartment(dep2);

        doctorRepository.save(doc4);
        doctorRepository.save(doc5);
        doctorRepository.save(doc6);

        // department 3
        Department dep3 = new Department();
        dep3.setId((long)(3));

        Doctor doc7 = new Doctor();
        doc7.setDoctorname("Соколова Мария Дмитриевна");
        doc7.setDepartment(dep3);

        Doctor doc8 = new Doctor();
        doc8.setDoctorname("Волкова Анна Владимировна");
        doc8.setDepartment(dep3);

        Doctor doc9 = new Doctor();
        doc9.setDoctorname("Кузнецов Иван Даниилович");
        doc9.setDepartment(dep3);

        doctorRepository.save(doc7);
        doctorRepository.save(doc8);
        doctorRepository.save(doc9);
    }
}
