/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.midterm;

/**
 *
 * @author gowtham
 */
public class MidTerm {

    public static void main(String[] args) {
        Voice voice = new Voice(100, true);
        Radio radio = new Radio(voice);
        radio.adjustVolume(100, true);
}
}