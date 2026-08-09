package com.learning.lesson3.objects;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class TxtOrderSource implements OrderSourceInterface {

    private final Path path;
    public TxtOrderSource(Path path) {
        this.path = path;
    }

    @Override
    public List<Order> read() throws IOException {
        List<String> lines = Files.readAllLines(path);
        ArrayList<Order> orders = new ArrayList<Order>();
        if (!lines.isEmpty()) {
            for (String s : lines) {
                if (s.contains("|")) {
                    List<String> parts = List.of(s.split("\\|"));
                    if (!parts.isEmpty() && parts.size() >= 2) {
                        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");
                        LocalDateTime time = LocalDateTime.parse((String) parts.get(0), formatter);

                        String company = parts.get(1);
                        int cementAm = Integer.parseInt(parts.get(2));

                        if (!company.isEmpty() && cementAm > 0 && time != null) {
                            Order newOrder = new Order(company, cementAm, time);
                            orders.add(newOrder);
                        }

                    }
                }
            }
        }
        return orders;
    }
}
