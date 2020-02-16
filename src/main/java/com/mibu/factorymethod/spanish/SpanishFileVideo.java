package com.mibu.factorymethod.spanish;

import com.mibu.factorymethod.File;

public class SpanishFileVideo implements File {
  public SpanishFileVideo() {}

  @Override
  public void play() {
    System.out.println("Reproduciendo archivo de vídeo en Español...");
  }
}
