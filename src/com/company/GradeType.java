package com.company;

public enum GradeType {
    JK_GRADE("JK"),
    SK_GRADE("SK"),
    GRADE1("1"),
    GRADE2("2"),
    GRADE3("3"),
    GRADE4("4"),
    GRADE5("5"),
    GRADE6("6"),
    GRADE7("7"),
    GRADE8("8"),
    GRADE9("9"),
    GRADE10("10"),
    GRADE11("11"),
    GRADE12("12");

    private String grade_type;

    GradeType(String grade_type){
        this.grade_type=grade_type;
    }


}