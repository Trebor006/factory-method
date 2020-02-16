package com.mibu.factorymethod;

import com.mibu.factorymethod.english.EnglishSpecificFileGenerator;
import com.mibu.factorymethod.spanish.SpanishSpecificFileGenerator;

public class LanguageFileGenerator implements LanguageFile {

  public LanguageFileGenerator() {}

  @Override
  public SpecificFileGenerator defineLanguage(String language) {
    switch (language) {
      case "es":
        return new SpanishSpecificFileGenerator();
      case "en":
      default:
        return new EnglishSpecificFileGenerator();
    }
  }
}
