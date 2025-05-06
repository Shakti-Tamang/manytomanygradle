package com.example.demo.config;

import java.beans.PropertyChangeSupport;

public class BoundaryProerty {

    private String name;

    private PropertyChangeSupport support=new PropertyChangeSupport(this);

}
