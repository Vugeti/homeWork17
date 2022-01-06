package streamapi;

import java.util.Arrays;
import java.util.List;

public class StreamApi {
    public static void main(String[] args) {
        List<People> peoples = Arrays.asList(
                new People("Вася", 16, Sex.MAN),
                new People("Егор", 18, Sex.APACHE_HELICOPTER),
                new People("Женя", 27, Sex.TRANSNIGGER),
                new People("Петя", 23, Sex.MAN),
                new People("Елена", 42, Sex.WOMEN),
                new People("Иван Иванович", 69, Sex.MAN));
        System.out.println("пойдут служить: " + peoples.stream().filter(goToArmy -> (goToArmy.age >= 18) && (goToArmy.age <= 27)).toList());
        System.out.println("средний возраст среди мужчин " + peoples.stream().filter(averageAgeMen -> averageAgeMen.sex.equals(Sex.MAN)).mapToInt(x -> x.age).average());
        System.out.println("потенциально работоспособные люди " + peoples.stream().filter(potentiallyWorkingPeople ->
                ((potentiallyWorkingPeople.sex.equals(Sex.MAN) && (potentiallyWorkingPeople.age < 60)))
                        || ((potentiallyWorkingPeople.sex.equals(Sex.WOMEN)) && (potentiallyWorkingPeople.age < 55))).toList());
    }
}

