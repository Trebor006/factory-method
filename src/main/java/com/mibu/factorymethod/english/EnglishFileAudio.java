package com.mibu.factorymethod.english;

import com.mibu.factorymethod.File;

public class EnglishFileAudio implements File {
  public EnglishFileAudio() {}

  @Override
  public void play() {
    System.out.println("Reproduciendo archivo de audio en Inglés...");
  }
}
