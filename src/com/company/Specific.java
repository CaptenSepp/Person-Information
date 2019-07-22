package com.company;

import java.util.ArrayList;

public class Specific {
    private ArrayList<String> workFields;
    private ArrayList<String> studyFields;
    private String workField;
    private String studyField;

    public ArrayList<String> getWorkFields() {
        return workFields;
    }

    public ArrayList<String> getStudyFields() {
        return studyFields;
    }
    /**
     * add a work field in workFields ArrayList
     * @param workField will add to workFields ArrayList.*/
    public void addWorkField(String workField) {
        workFields.add(workField);
    }
    /**
     * add a studyField in studyFields ArrayList.
     * @param studyField will add to studyFields ArrayList.*/
    public void addStudyField(String studyField) {
        studyFields.add(studyField);
    }
}
