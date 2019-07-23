package com.company;

import java.util.ArrayList;

public class Specific {
    private String workField;
    private String studyField;
    private ArrayList<String> studyFields = new ArrayList<>();
    private ArrayList<String> workFields = new ArrayList<>();

    public ArrayList<String> getWorkFields() {
        return workFields;
    }

    public ArrayList<String> getStudyFields() {
        return studyFields;
    }

    /**
     * add a workfield in workFields ArrayList
     *
     * @param workField will add to workFields ArrayList. TODO Question : i did't understand this 2
     */
    public void addWorkField(String workField) {
        workFields.add(workField);
    }

    /**
     * add a studyField in studyFields ArrayList.
     *
     * @param studyField will add to studyFields ArrayList.
     */
    public void addStudyField(String studyField) {
        studyFields.add(studyField);
    }

}
