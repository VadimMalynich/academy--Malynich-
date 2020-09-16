package by.academy.homework.homework6.task1;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*Stream/Lambda.
Не использовать циклы (for/while/do-while). Сгенерировать 100 рандомных Long чисел в диапазоне от 0 до 100.
Каждое число умножить на PI и отнять 20. Отфильтровать, оставив числа меньшие 100. Отсортировать по возрастанию.
Пропустив первые 3 числа произвести следующие операции:
Преобразовать лист чисел в Map (операция collect), где ключем является само число а значением строка: ("Number: " + value).*/

public class Main {
    public static void main(String[] args) {
        List<Long> list = generateList(100);
        for (Long l : list) {
            System.out.print(l + " ");
        }
        System.out.println();
        Map<Long, String> map = parseToMap(list);
        for (Map.Entry<Long, String> m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }

    public static List<Long> generateList(Integer size) {
        return Stream.generate(() -> 0 + (long) (Math.random() * 100))
                .limit(size)
                .map((s) -> s * (long) Math.PI + 20)
                .filter((s) -> s < 100)
                .sorted()
                .distinct()
                //.skip(3)
                .collect(Collectors.toList()/*Map((s) -> s, (s) -> ("Number: " + s))*/);
    }

    public static Map<Long, String> parseToMap(List<Long> lst) {
        Collection<Long> collection = lst;
        Stream<Long> stream = collection.stream();
        return stream.skip(3).collect(Collectors.toMap(s -> s, s -> ("Number: " + s)));
    }
}