package com.mibu.factorymethod.spanish;

import com.mibu.factorymethod.File;
import com.mibu.factorymethod.FileType;
import com.mibu.factorymethod.SpecificFileGenerator;

public class SpanishSpecificFileGenerator implements SpecificFileGenerator {

  public SpanishSpecificFileGenerator() {}

  @Override
  public File generate(FileType fileType) {
    switch (fileType) {
      case AUDIO:
        return new SpanishFileAudio();
      case VIDEO:
        return new SpanishFileVideo();
      default:
        return null;
    }
  }
}
