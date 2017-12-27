/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.io.FileNotFoundException;
import java.io.IOException;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;



/**
 *
 * @author Jhon Alex
 */
public class Sonido {
 
   Clip snd ;

    public Sonido() {
        snd = null;
    }
   
   
    public void sonidoPelea() throws LineUnavailableException, UnsupportedAudioFileException, IOException {
        
        int rdnsound = (int) (Math.random() * 30) + 1;
        
snd = AudioSystem.getClip();
snd.open(AudioSystem.getAudioInputStream(getClass().getResource("/snd/sonido.mp3")));
       snd.start();
        System.out.println("entroooo");
    }
    
    
}
