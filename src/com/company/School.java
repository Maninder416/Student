package com.company;

public interface School {
    Student adminStudent(Student student)throws ClassFullException;
    Double chargeFees(Student student);
}
