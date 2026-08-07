package com.learning.lesson3.objects;

import java.nio.file.Path;

public class OrderSourceFactory {
    static OrderSource create(Path path) {
        if (path == null){
            throw new IllegalArgumentException("path must not be NULL");
        }
        String pathString = path.getFileName().toString().toLowerCase();
        //System.out.println("file path is: " + pathString);
        if (pathString.endsWith(".txt")){
            return new TxtOrderSource();
        }
        else if(!pathString.contains(".")) {
            return new NoExtensionOrderSource();
        }
        else{
            throw new IllegalArgumentException("Неподдерживаемый тип файла");
        }

    }
}
