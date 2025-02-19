/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.midterm;

/**
 *
 * @author gowtham
 */
public class Voice{
    private int volume;
    private boolean isSpeaking;

    public Voice(int volume, boolean isSpeaking) {
        this.volume = volume;
        this.isSpeaking = isSpeaking;
    }

    public int getVolume() {
        return volume;
    }

    public boolean isSpeaking() {
        return isSpeaking;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setIsSpeaking(boolean isSpeaking) {
        this.isSpeaking = isSpeaking;
    }
    
    public void adjustVolume(int volume, boolean isSpeaking){
        if (isSpeaking == true){
            this.volume = volume/2;
        }
    }   
}