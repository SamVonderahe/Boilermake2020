package com.mycompany.ehhsistant;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author spencerdouglas
 */
public class Presentation {
    String name;
    ArrayList<Speech> speechList;
    public Presentation(String name) {
        if (name == null)
            this.name = "untitled";
        else
            this.name = name;this.speechList = new ArrayList<Speech>(0);
            
         this.speechList = new ArrayList<Speech>(0);
    }
    public ArrayList<Speech> getSpeechList(){
        return this.speechList;
    }
    
    public String getName() {
        return this.name;
    }
    public String toString() {
        return this.getName();
    }
    public void addRecording(Speech recording) {
        if (recording != null)
            this.speechList.add(recording);
    }
}
   