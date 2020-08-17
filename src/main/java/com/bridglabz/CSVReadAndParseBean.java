package com.bridglabz;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;

public class CSVReadAndParseBean {
    private static final String SAMPLE_CSV_PATH = "F:\\example1.csv";

    public static void main(String[] args) throws IOException {
        try (Reader reader = Files.newBufferedReader(Paths.get(SAMPLE_CSV_PATH));) {
            CsvToBean<CSVUser> csvToBean = new CsvToBeanBuilder(reader)
                    .withType(CSVUser.class)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();

            Iterator<CSVUser> csvUserIterator = csvToBean.iterator();
            while (csvUserIterator.hasNext()) {
                CSVUser csvUser = csvUserIterator.next();
                System.out.println(csvUser.toString());
            }
        }

    }
}