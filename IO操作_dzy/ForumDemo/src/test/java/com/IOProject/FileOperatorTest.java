package com.IOProject;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

import static org.junit.jupiter.api.Assertions.*;

class FileOperatorTest {

    @Test
    void createDir() {
        String path = "D:/Users/Administrator/Desktop/TestDir/study";
        boolean res = FileOperator.createDir(path);
        assertTrue(res);

    }

    @Test
    void createFile() {
        String path = "D:/Users/Administrator/Desktop/TestDir/hello.txt";
        boolean res = false;
        try {
            res = FileOperator.createFile(path);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        assertTrue(res);

    }

    @Test
    void getFileInfo() {
        File file = new File("D:/Users/Administrator/Desktop/TestDir/hello.txt");
        Properties fileProperties = FileOperator.getFileInfo(file);
        assertEquals(4, fileProperties.size());
    }

    @Test
    void deleteFile() {
        boolean res = FileOperator.deleteFile("D:/Users/Administrator/Desktop/TestDir/hello.txt");
        assertTrue(res);
    }
}
