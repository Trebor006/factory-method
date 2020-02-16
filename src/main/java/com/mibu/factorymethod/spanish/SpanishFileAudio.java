package com.mibu.factorymethod.spanish;

import com.mibu.factorymethod.File;

public class SpanishFileAudio implements File {
  public SpanishFileAudio() {}

  @Override
  public void play() {
    System.out.println("Reproduciendo archivo de audio en Español...");
  }
}
