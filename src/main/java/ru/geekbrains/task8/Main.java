package ru.geekbrains.task8;

import java.util.Random;
public class Main {

        public static void main(String[] args) {
            //для генерации ограничений длины дорожки и высоты препятствия для каждого участника
            Random rand = new Random();
            //Массив ссылок на обьекты классов, реализующих интерфейс действий
            Actions[] actions = new Actions[3];
            int distance = rand.nextInt(3);
            int heigth = rand.nextInt(3);
            actions[0] = new Human("Иван", distance, heigth);
            distance = rand.nextInt(3);
            heigth = rand.nextInt(3);
            actions[1] = new Robot("Федор", distance, heigth);
            distance = rand.nextInt(3);
            heigth = rand.nextInt(3);
            actions[2] = new Cat("Лексус", distance, heigth);
            //Создаем массив с препятствими
            Barrier[] barriers = new Barrier[3];

            int i;
            for(i = 0; i < barriers.length; ++i) {
                //генерируем int для длины дорожки\высоты препятсивия
                distance = rand.nextInt(3);
                //генерируем вид препятствия, каждый элемент массива является сссылкой на обьект класса,
                // реализующего интерфейс препятствия(дорожка или стена)
                boolean isRoad = rand.nextBoolean();
                if (isRoad) {
                    barriers[i] = new Road("Дорога " + i, distance);
                } else {
                    barriers[i] = new Wall("Стена " + i, distance);
                }
            }
            //Для каждого участника мероприятия(объекта класса, реализующего интерфейс действия)
            for(i = 0; i < actions.length; ++i) {
                boolean result = true;
                //проходим в цикле по препятсвиям, проверяем к какому классу относится и
                // в качестве аргумента передаем действие соответствующего класса, проверяя результат
                for(int j = 0; j < barriers.length; ++j) {
                    if (Human.class == actions[i].getClass()) {
                        result = barriers[j].moving((Human)actions[i]);
                    }

                    if (Robot.class == actions[i].getClass()) {
                        result = barriers[j].moving((Robot)actions[i]);
                    }

                    if (Cat.class == actions[i].getClass()) {
                        result = barriers[j].moving((Cat)actions[i]);
                    }
                    //если препятствие не преодолели выходим из цикла и прекращаем участие
                    if (!result) {
                        break;
                    }
                }

                if (result) {
                    System.out.println("Успешно!");
                } else {
                    System.out.println("Неудачно!");
                }
            }

        }
}
