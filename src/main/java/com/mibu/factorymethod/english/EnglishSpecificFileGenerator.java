package com.mibu.factorymethod.english;

import com.mibu.factorymethod.File;
import com.mibu.factorymethod.FileType;
import com.mibu.factorymethod.SpecificFileGenerator;

public class EnglishSpecificFileGenerator implements SpecificFileGenerator {

  public EnglishSpecificFileGenerator() {}

  @Override
  public File generate(FileType fileType) {
    switch (fileType) {
      case AUDIO:
        return new EnglishFileAudio();
      case VIDEO:
        return new EnglishFileVideo();
      default:
        return null;
    }
  }
}
