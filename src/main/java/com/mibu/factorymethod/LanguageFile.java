package com.mibu.factorymethod;

public interface LanguageFile {
  SpecificFileGenerator defineLanguage(String language);
}
