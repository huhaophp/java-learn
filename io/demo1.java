package io;

import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;

public class demo1 {
    public static void main(String[] args) {
        try {
            String filename = ((int) (Math.random() * 10)) + ".txt";
            File file = fileDoesNotExistCreate(filename);
            getDirectoryTree("/Users/huhao/wwwroot/local/java/test");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

    }

    public static File fileDoesNotExistCreate(String filename) throws IOException {
        if (filename.trim().equals("")) {
            throw new IllegalArgumentException("filename fail");
        }
        File file = new File(filename);
        if (file.isFile()) {
            return file;
        }
        if (!file.createNewFile()) {
            return file;
        }
        return file;
    }

    public static void getDirectoryTree(String dirname) {
        if (dirname.trim().equals("")) {
            throw new IllegalArgumentException("dirname fail");
        }
        File file = new File(dirname);
        if (!file.isDirectory()) {
            throw new IllegalArgumentException("is not directory");
        }
        traverseTheFileDirectoryAndPrintFiles(file);

    }


    public static void traverseTheFileDirectoryAndPrintFiles(File file) {
        File[] list = file.listFiles();
        for (File item : list) {
            if (item.isDirectory()) {
                traverseTheFileDirectoryAndPrintFiles(item);
            } else {
                System.out.println(item.getName().toString());
            }
        }
    }

    public static void printFiles(File[] files) {
        System.out.println("----------------");
        if (files != null) {
            for (File f : files) {
                System.out.println(f);
            }
        }
        System.out.println("----------------");
    }
}
