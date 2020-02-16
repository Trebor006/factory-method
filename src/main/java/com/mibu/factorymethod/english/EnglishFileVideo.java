package com.mibu.factorymethod.english;

import com.mibu.factorymethod.File;

public class EnglishFileVideo implements File {
  public EnglishFileVideo() {}

  @Override
  public void play() {
    System.out.println("Reproduciendo archivo de vídeo en Inglés...");
  }
}
