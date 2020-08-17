package com.bridglabz;

import com.opencsv.CSVWriter;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class OpenCSVWriter {
    private static final String SAMPLE_CSV_PATH = "F:\\example1.csv";

    public static void main(String[] args) throws IOException, CsvDataTypeMismatchException, CsvRequiredFieldEmptyException {
        try (
                Writer writer = Files.newBufferedWriter(Paths.get(SAMPLE_CSV_PATH))
        ) {
            StatefulBeanToCsv<CSVUser> beanToCsv = new StatefulBeanToCsvBuilder(writer)
                    .withQuotechar(CSVWriter.NO_QUOTE_CHARACTER)
                    .build();
            List<CSVUser> csvUserList = new ArrayList<>();
            csvUserList.add(new CSVUser("himanshugharat", "himanshugharat@gmail.com", "111111111","india"));
            csvUserList.add(new CSVUser("himanshu", "himanshughara3t@gmail.com", "11111111133", "india"));
            beanToCsv.write(csvUserList);

        }
    }
}
