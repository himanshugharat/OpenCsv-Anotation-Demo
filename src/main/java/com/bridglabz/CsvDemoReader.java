package com.bridglabz;


import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;


import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class CsvDemoReader {
    private static final String SAMPLE_CSV_PATH = "F:\\example.csv";

    public static void main(String[] args) throws IOException, CsvException {
        try (
            Reader reader = Files.newBufferedReader(Paths.get(SAMPLE_CSV_PATH)) ;
            CSVReader csvReader=new CSVReader(reader)
        ){
            List<String[]> nextRecord=csvReader.readAll();
            for (String[]record:nextRecord) {
                System.out.println(record[1]);
            }
            }
        }
    }

