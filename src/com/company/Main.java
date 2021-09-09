package com.company;

import java.util.Scanner;

public class Main {

    //Create 4 schools (one of each Type)
    static School preSchool= new PreSchool();
    static School ElementarySchool= new ElementarySchool();
    static School MiddleSchool= new MiddleSchool();
    static School HighSchool= new HighSchool();

    public static SchoolType determineSchoolBasedOnGrade(GradeType grade) throws NoSchoolAvailableForThisGradeException {
        switch (grade){
            case JK_GRADE:
            case SK_GRADE:
                return SchoolType.PRE_SCHOOL;
            case GRADE1:
            case GRADE2:
            case GRADE3:
            case GRADE4:
            case GRADE5:
                return SchoolType.ELEMENTARY_SCHOOL;
            case GRADE6:
            case GRADE7:
            case GRADE8:
                return SchoolType.MIDDLE_SCHOOL;
            case GRADE9:
            case GRADE10:
            case GRADE11:
            case GRADE12:
                return SchoolType.HIGH_SCHOOL;
            default:
                throw new NoSchoolAvailableForThisGradeException();
        }
    }


    public static GradeType determineGradeBasedOnAge(int age) throws NoSchoolAvailableForThisAgeException{
        switch (age){
            case 4:
                return GradeType.JK_GRADE;
            case 5:
                return GradeType.SK_GRADE;
            case 6:
                return GradeType.GRADE1;
            case 7:
                return GradeType.GRADE2;
            case 8:
                return GradeType.GRADE3;
            case 9:
                return GradeType.GRADE4;
            case 10:
                return GradeType.GRADE5;
            case 11:
                return GradeType.GRADE6;
            case 12:
                return GradeType.GRADE7;
            case 13:
                return GradeType.GRADE8;
            case 14:
                return GradeType.GRADE9;
            case 15:
                return GradeType.GRADE10;
            case 16:
                return GradeType.GRADE11;
            case 17:
                return GradeType.GRADE12;
            default:
                throw new NoSchoolAvailableForThisAgeException();
        }
    }

    public static School determineSchoolTypeBasedOnSchool(SchoolType school){
        switch (school){
            case PRE_SCHOOL:
                return preSchool;
            case ELEMENTARY_SCHOOL:
                return ElementarySchool;
            case MIDDLE_SCHOOL:
                return MiddleSchool;
            case HIGH_SCHOOL:
                return HighSchool;
            default:
                throw new IllegalArgumentException("wrong school type");
        }
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("***********************************************************");
            System.out.println("Welcome to the School Admissions App !!!   Press X for exit");
            System.out.println("***********************************************************");


            System.out.println("Enter the Student Name: ");
            String student_name = sc.next();

            //Student name should have atleast 3 chars and maximum 50 chars
            while (student_name.length() <= 3 || student_name.length() > 50) {
                System.out.println("Name should not less than 3 chars and no more than 50 chars");
                student_name = sc.next();
            }
            System.out.println("Enter the student age. Age format should be mm/dd/yyyy : ");
            int student_age = sc.nextInt();
            while (student_age < 4 || student_age > 17) {
                System.out.println("Incorrect Age. Age should be between 4 and 17 :\n");
                student_age = sc.nextInt();
            }
            //Grade based on age
            GradeType grade= null;
            try {
                determineGradeBasedOnAge(student_age);
            }catch (NoSchoolAvailableForThisAgeException e){
                System.out.println("Incorrect Age. Age should be between 4 and 17 ");
            }

            //School based on Grade
            SchoolType schoolType= null;
            try{
                schoolType= determineSchoolBasedOnGrade(grade);
            }catch (NoSchoolAvailableForThisGradeException e){
                System.out.println("Grade is not correct");
            }

            //school admit student
            Student student= new Student(student_name,student_age,grade);
            School school= determineSchoolTypeBasedOnSchool(schoolType);
            try{
                school.adminStudent(student);
            }catch (Exception e){
                System.out.println("Sorry the class for grade#\" + grade + \" is full, please try another student");
            }
            System.out.println("Welcome");



            System.out.println("press y to use this application again. press x to exit from this application ");
            String input_user = sc.next();
            while (!input_user.equalsIgnoreCase("y") && !input_user.equalsIgnoreCase("x")) {
                System.out.println("Wrong selection.");
                System.out.println("press y to use this application again. press x to exit from this application ");
                input_user = sc.next();
            }
            if (input_user.equalsIgnoreCase("y")) {
                flag = true;
            }
            if (input_user.equalsIgnoreCase("x")) {
                flag = false;
                System.out.println("Thanks for using this application...");
                sc.close();
            }

        } while (flag);

    }


}
