import java.awt.*;
import java.io.*;
import java.sql.Array;
import java.sql.SQLOutput;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FileCSV {

    public static void main(String[] args) {

        String[] header = {"Value 1", "Value 2", "Value 3"};
        int[][] date = {{100, 200, 123}, {300, 400, 500}};

        AppDate appDate = new AppDate(header, date);

        add("src/Test1.csv", appDate);
        AppDate appDate1 = fileRead("src/Test1.csv");
        System.out.println(appDate1);

    }

    //Запись в файл
    public static void add(String fileName, AppDate appDate) {
        try (PrintWriter writer = new PrintWriter(fileName)) {
            String[] header = appDate.getHeader();
            for (int i = 0; i < header.length; i++) {
                writer.write(header[i]);
                if (i + 1 < header.length) {
                    writer.print(";");
                } else {
                    writer.println();
                    break;
                }
            }
            for (int[] r : appDate.getDate()) {
                for (int j = 0; j < r.length; j++) {
                    writer.print(r[j]);

                    if (j + 1 < r.length) {
                        writer.print(";");
                    } else {
                        writer.println();
                        break;
                    }
                }

            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    // Чтение файла
    public static AppDate fileRead(String fileName) {
        String[] header = new String[0];
        AppDate appDate = new AppDate();
        List<String> list = new ArrayList<>();

        try (Scanner scanner = new Scanner(new FileReader(fileName))) {
            header = scanner.nextLine().split(";");
            String string;
            while (scanner.hasNext()) {
                string = scanner.nextLine();
                list.add(string);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int[][] date = new int[list.size()][];
        for (int i = 0; i < list.size(); i++) {
            String[] strings = list.get(i).split(";");
            int[] intA = new int[strings.length];

            for (int j = 0; j < strings.length; j++) {
                intA[j] = Integer.parseInt(strings[j]);
            }

            date[i] = intA;
        }

        appDate.setHeader(header);
        appDate.setDate(date);
        return appDate;
    }

}
