package com.company;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Path path = Paths.get("C:\\Users\\anmal\\greenfox\\Foundation-example-exam\\Foundation-example-exam\\SwearWords\\src\\com\\company\\SwearWords.txt");

        System.out.println("Number of swear words is: " + removeSwearWords(path));

    }

    public static int removeSwearWords(Path path) {

        String[] swearWords = {"fuck", "bloody", "cock", "shit", "fucker", "fuckstick", "asshole", "dick", "piss", "cunt"};
        int numberOfSwearWords = 0;

        try {

            List<String> fileList = Files.readAllLines(path);

            for (int i = 0; i < fileList.size(); i++) {

                String line = fileList.get(i).toLowerCase();
                line = line.replaceAll("[?!,.:]", "");
                String[] words = line.split(" ");

                for (int j = 0; j < swearWords.length; j++) {
                    for (int k = 0; k < words.length; k++) {
                        if (words[k].equals(swearWords[j])) {
                            numberOfSwearWords += 1;
                        }
                    }
                }

                for (int j = 0; j < swearWords.length; j++) {
                    for (int k = 0; k < words.length; k++) {
                        if (words[k].equals(swearWords[j])) {
                            line = line.replaceAll("\\b" + words[k] + "\\b", "");
                        }
                    }
                }

                fileList.set(i, line);

            }

        } catch (Exception e) {
            System.out.println("Cannot read the file");
        }

        return numberOfSwearWords;

    }

}
