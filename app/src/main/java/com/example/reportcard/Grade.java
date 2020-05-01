package com.example.reportcard;

/**
 *{@link Grade} represents the subject and each grade in grade/100 and Letter formats
 */
public class Grade {
    /** Subject*/
    private String mSubject;
    /** Grade under the grade/100 format*/
    private int mGradeOutOf100;
    /** Grade under the Lettering format*/
    private String mGradeLetterFormat;

    /**
     * Creates a new Grade object.
     *
     * @param subject is the subject
     * @param gradeOutof100  is the grade in grade/100 format
     * @param gradeLetterEquivalent  is the grade in Letter format
     * */
    public Grade(String subject, int gradeOutof100, String gradeLetterEquivalent) {
        mSubject = subject;
        mGradeOutOf100 = gradeOutof100;
        mGradeLetterFormat = gradeLetterEquivalent;
    }

    /**
     * Get the subject.
     */
    public String getSubject (){
        return mSubject;
    }

    /**
     * Get grade in the grade/100 format .
     */
    public int getGradeOutOf100 (){
        return mGradeOutOf100;
    }

    /**
     * Get the Grade in the Letter Format.
     */
    public String getGradeLetterFormat(){
        return mGradeLetterFormat;
    }

}
