package com.Simplon;

import java.util.ArrayList;
import java.util.List;

class Subject {

    String label;
    List<Double> markes;

    public Subject(String label/*, List markes*/) {
        this.label = label;
        this.markes = new ArrayList<>();
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public List<Double> getMarkes() {
        return markes;
    }

    public void setMarkes(List<Double> markes) {
        this.markes = markes;
    }

}
