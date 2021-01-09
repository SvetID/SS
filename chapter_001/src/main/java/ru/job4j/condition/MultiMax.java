package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int resultFirstMax = first > second ? first : second;
        return resultFirstMax > third ? resultFirstMax : third;
    }
}
