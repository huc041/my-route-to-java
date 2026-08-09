package com.learning.lesson3;

import com.learning.lesson3.objects.Order;
import com.learning.lesson3.objects.OrderSourceInterface;
import com.learning.lesson3.objects.OrderSourceFactory;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        Path pathFile1 = Paths.get("discount_day.txt");
        Path pathFile2 = Paths.get("discount_day_without_ext");

        OrderSourceInterface orderSourceInterface = OrderSourceFactory.create(pathFile2);
        List<Order> orders = orderSourceInterface.read();
        for (Order order : orders) {
            System.out.println(order.getCompanyMane());
        }

        // OrderSourceFactory вызываем метод с параметром Path файла, в ответ
        // даем коллекцию объектов Orders

        // конкретный адаптер TxtOrderSource или NoExtensionOrderSource разбирает
        // файл по разделителям и записывает результат в коллекцию Orders

        // далее должен быть отдельный класс расчета скидок DiscountEstimator,
        // который принимает объекты Orders и возвращает Map (key - companyName,
        // value - totalPrice)

        // отдельный класс WriteDataToFile который принимает Map(companyName, totalPrice)
        // и возвращает например Path файла записи, или boolean переменную с результатом
        // записи по заранее известному пути
    }

}
