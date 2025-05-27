package com.example.demo.config;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;



public class BoundaryProerty {

    private String name;

    private PropertyChangeSupport support=new PropertyChangeSupport(this);

    public String getName(){
        return name;
    }

    public void setName(String newName){
   String oldName=this.name;

    this.name=newName;   
   support.firePropertyChange("shakti", oldName, newName);
    }

    public void addPropertyChangeListener(PropertyChangeListener  listener){
support.addPropertyChangeListener(listener);
    }

    public static void main(String[] args) {
        BoundaryProerty boundaryProerty=new BoundaryProerty();

        boundaryProerty.addPropertyChangeListener(event->{System.out.println("Name changed from"+event.getOldValue()+"to"+event.getNewValue());});

        boundaryProerty.setName("shakti");
        boundaryProerty.setName("amu");
    }

 

}
