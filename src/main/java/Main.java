public class Main {
    public static void main(String[] args) {
        // Создание мамы
        Person mom = new PersonBuilder()
                .setName("Анна")
                .setSurname("Вольф")
                .setAge(31)
                .setAddress("Сидней")
                .build();

        // Создание сына через newChildBuilder
        Person son = mom.newChildBuilder()
                .setName("Антошка")
                .build();

        // Вывод информации
        System.out.println("У " + mom + " есть сын, " + son);

        // Дополнительная демонстрация: человек без возраста и адреса
        Person unknown = new PersonBuilder()
                .setName("Джон")
                .setSurname("Доу")
                .build();
        System.out.println("Человек без возраста и адреса: " + unknown);

        // Пример happyBirthday
        mom.happyBirthday();
        System.out.println("После дня рождения: " + mom);
    }
}