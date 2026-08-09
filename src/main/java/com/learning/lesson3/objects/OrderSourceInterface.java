package com.learning.lesson3.objects;

import java.io.IOException;
import java.util.List;

public interface OrderSourceInterface {
    List<Order> read() throws IOException;
}
