package com.mibu.factorymethod;

import java.util.Arrays;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    List<String> languages = Arrays.asList("pr", "es", "en");

    LanguageFile languageFile = new LanguageFileGenerator();

    for (String language : languages) {
      // crea un Objeto espeficio para el idioma seleccionado)
      SpecificFileGenerator creator = languageFile.defineLanguage(language);

      File audio = creator.generate(FileType.AUDIO);
      audio.play();

      File video = creator.generate(FileType.VIDEO);
      video.play();
    }
  }
}
