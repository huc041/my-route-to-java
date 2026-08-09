package com.learning.lesson3.objects;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OrderSourceFactory {
    public static OrderSource create(Path path) {
        if (path == null) {
            throw new IllegalArgumentException("path is NULL");
        }
        if (!Files.isRegularFile(path)) {
            throw new IllegalArgumentException("file does not exist");
        }
        String name = path.getFileName().toString();
        if (name.toLowerCase().endsWith(".txt")) {
            return new TxtOrderSource(path);
        }
        else if(!name.contains(".")) {
            return new NoExtensionOrderSource(path);
        }
        else {
            throw new IllegalArgumentException("unsupported file format: " + name);
        }
    }
}
