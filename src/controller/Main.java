package controller;

import model.Database;

public class Main {
	public static void main(String[] args) {
		Database roster = new Database();
		Parser.CSVreader(roster);
	}
}
