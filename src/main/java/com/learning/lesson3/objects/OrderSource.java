package com.learning.lesson3.objects;

import java.nio.file.Path;
import java.util.List;

public interface OrderSource {
    List<Order> orderPath(Path path);
}
