package com.afossey.companiescodingtest.writer;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "company.writer.csv")
public class CompaniesCsvWriterProperties {

  private String dirpath;
  private String alpharange; // authorised chars for csv categorization

  public String getFormattedCsvDirPath() {
    return this.dirpath + (this.dirpath.endsWith("/") ? "" : "/");
  }
}