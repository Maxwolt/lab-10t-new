package ua.opnu;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class EasyTasks {

    public static void main(String[] args) {
        EasyTasks tasks = new EasyTasks();

        System.out.println("== Завдання 1 ==");
        System.out.println("doubling([1, 2, 3]) -> " + tasks.doubling(List.of(1, 2, 3)));
        System.out.println("doubling([6, 8, 6, 8, -1]) -> " + tasks.doubling(List.of(6, 8, 6, 8, -1)));
        System.out.println("doubling([]) -> " + tasks.doubling(List.of()));

        System.out.println();
        System.out.println("== Завдання 2 ==");
        System.out.println("square([1, 2, 3]) -> " + tasks.square(List.of(1, 2, 3)));
        System.out.println("square([6, 8, -6, -8, 1]) -> " + tasks.square(List.of(6, 8, -6, -8, 1)));
        System.out.println("square([]) -> " + tasks.square(List.of()));

        System.out.println();
        System.out.println("== Завдання 3 ==");
        System.out.println("moreY([a, b, c]) -> " + tasks.moreY(List.of("a", "b", "c")));
        System.out.println("moreY([hello, there]) -> " + tasks.moreY(List.of("hello", "there")));
        System.out.println("moreY([yay]) -> " + tasks.moreY(List.of("yay")));

        System.out.println();
        System.out.println("== Завдання 4 ==");
        System.out.println("noNeg([1, -2]) -> " + tasks.noNeg(List.of(1, -2)));
        System.out.println("noNeg([-3, -3, 3, 3]) -> " + tasks.noNeg(List.of(-3, -3, 3, 3)));
        System.out.println("noNeg([-1, -1, -1]) -> " + tasks.noNeg(List.of(-1, -1, -1)));

        System.out.println();
        System.out.println("== Завдання 5 ==");
        System.out.println("no9([1, 2, 19]) -> " + tasks.no9(List.of(1, 2, 19)));
        System.out.println("no9([9, 19, 29, 3]) -> " + tasks.no9(List.of(9, 19, 29, 3)));
        System.out.println("no9([1, 2, 3]) -> " + tasks.no9(List.of(1, 2, 3)));

        System.out.println();
        System.out.println("== Завдання 6 ==");
        System.out.println("noZ([aaa, bbb, aza]) -> " + tasks.noZ(List.of("aaa", "bbb", "aza")));
        System.out.println("noZ([hziz, hzello, hi]) -> " + tasks.noZ(List.of("hziz", "hzello", "hi")));
        System.out.println("noZ([hello, howz, are, youz]) -> "
                + tasks.noZ(List.of("hello", "howz", "are", "youz")));

        System.out.println();
        System.out.println("== Завдання 7 ==");
        System.out.println("refinedStrings([кіт, я, кіт, сова]) -> "
                + tasks.refinedStrings(List.of("кіт", "я", "кіт", "сова")));
        System.out.println("refinedStrings([ми]) -> " + tasks.refinedStrings(List.of("ми")));
        System.out.println("refinedStrings([]) -> " + tasks.refinedStrings(List.of()));

        System.out.println();
        System.out.println("== Завдання 8 ==");
        System.out.println("flatten([Тарас Шевченко, Леся Українка, ІванФранко]) -> "
                + tasks.flatten(List.of("Тарас Шевченко", "Леся Українка", "ІванФранко")));
        System.out.println("flatten([Ліна Костенко]) -> " + tasks.flatten(List.of("Ліна Костенко")));
        System.out.println("flatten([]) -> " + tasks.flatten(List.of()));
    }

    public List<Integer> doubling(List<Integer> nums) {
        return nums.stream()
                .map(n -> n * 2)
                .toList();
    }

    public List<Integer> square(List<Integer> nums) {
        return nums.stream()
                .map(n -> n * n)
                .toList();
    }

    public List<String> moreY(List<String> strings) {
        return strings.stream()
                .map(s -> "y" + s + "y")
                .toList();
    }

    public List<Integer> noNeg(List<Integer> nums) {
        return nums.stream()
                .filter(n -> n >= 0)
                .toList();
    }

    public List<Integer> no9(List<Integer> nums) {
        return nums.stream()
                .filter(n -> Math.abs(n % 10) != 9)
                .toList();
    }

    public List<String> noZ(List<String> strings) {
        return strings.stream()
                .filter(s -> !s.contains("z"))
                .toList();
    }

    public List<String> refinedStrings(List<String> strings) {
        return strings.stream()
                .distinct()
                .sorted(Comparator.comparingInt(String::length).reversed())
                .toList();
    }

    public List<String> flatten(List<String> strings) {
        return strings.stream()
                .flatMap(s -> Arrays.stream(s.split(" ")))
                .toList();
    }
}
