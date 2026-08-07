package com.learning.lesson3.objects;

import java.nio.file.Path;
import java.util.List;

public class NoExtensionOrderSource implements OrderSource{
    @Override
    public List<Order> orderPath(Path path) {
        return List.of();
    }
}
