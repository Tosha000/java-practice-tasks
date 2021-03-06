package lesson05.part02;

/**
 * «Исправь код», часть 2
 * Расскомментируй затем исправь код, чтобы программа компилировалась.
 * <p>
 * <p>
 * Требования:
 * 1. Класс Pet должен быть статическим.
 * 2. Класс Pet должен иметь два метода.
 * 3. Метод getChild() должен быть абстрактным.
 * 4. Класс Pet должен быть объявлен с модификатором, который запрещает создавать конкретные объекты этого класса.
 */

public class Task13 {
    public static void main(String[] args) {

    }

    //    public static class Pet {
//        public String getName() {
//            return "Я - котенок";
//        }
//
//        public Pet getChild();
//    }
    public abstract static class Pet {
        public String getName() {
            return "Я - котенок";
        }

        public abstract Pet getChild();
    }
}
