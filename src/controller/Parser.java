package controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import model.Agent;
import model.Database;

public class Parser {
    final static String csvFile = "cc-maps-data-set.csv";

	public static void CSVreader(Database roster) {
		String line = "";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] agent = line.split(","); // separate with comma
                roster.add(new Agent(agent[0], agent[1], agent[2], agent[3], agent[4]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
// credit to https://www.mkyong.com/java/how-to-read-and-parse-csv-file-in-java/ for help with parsing a CSV file
