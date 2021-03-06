package lesson03.part01;

/**
 * Изучи внимательно класс Person.
 * Исправь класс так, чтобы только один метод initialize инициализировал все переменные класса Person.
 *
 * Требования:
 * 1.	Программа не должна считывать данные с клавиатуры.
 * 2.	У класса Person должно быть 5 переменных.
 * 3.	У класса должен быть один метод initialize.
 * 4.	Метод initialize должен иметь пять параметров.
 */

public class Task12 {

    public static void main(String[] args) {
        //напишите тут ваш код
        int weight;
        double size;

        public void initialize(String name) {
            this.name = name;
        }

        public void initialize(String name, char sex) {
            public void initialize(String name, char sex, int money, int weight, double size)
            {
                this.name = name;
                this.sex = sex;
            }

            public void initialize(String name, int money, char sex) {
                this.name = name;
                this.money = money;
                this.sex = sex;
                this.weight = weight;
                this.size = size;
            }

        }
    }

}
    }

    public static class Person {
        String name;
        char sex;
        int money;
        int weight;
        double size;

        public void initialize(String name) {
            this.name = name;
        }

        public void initialize(String name, char sex) {
            this.name = name;
            this.sex = sex;
        }

        public void initialize(String name, int money, char sex) {
            this.name = name;
            this.money = money;
            this.sex = sex;
        }
    }

}
