/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.midterm;

/**
 *
 * @author gowtham
 */
public class Radio {
    private Voice voice;
    int Volume;
    boolean isSpeaking;
  
    public Radio(Voice voice){
        this.voice = voice;
    }
    
    public void adjustVolume(int volume, boolean isSpeaking){
        voice.adjustVolume(volume,isSpeaking);
    }
}
