package com.brunoyam.unit_1.utils;

import java.util.Random;

/*
Это служебный клас который просто генерирует массивы и заполняет их данными.
 */
public abstract class Generator {

    public static int[] getOneDimensionArray() { // создали целочисленный массив данных
        Random random = new Random(); // создали объект Random, ссылка на него хранится в переменной random,
        //сам объект Random хранится в куче

        int arraySize = random.nextInt(98) + 3; //объявили переменную arraySize и присвоили ей ссылку на объект
        //random, вызвали при помощи оператора доступа (.) метод nextInt, то что в скобочках это аргументы метода.
        //вопрос: где этод метод хранится? Он какой-то стандартный и мы его не видим? Хранится где то в библиотеке?
        //как я понимаю, он присваивает значение переменной random? Что означает операция bound: 98?

        int[] oneDimensionArray = new int[arraySize]; //объявили целочисл массив данных с именем переменной oneDemensionArray,
        // в этой переменной хранится ссылка на массив int [arraySize]
        for(int i = 0; i < oneDimensionArray.length; i++) { //обращаемся к ранее созданной переменной neDimensionArray,
            //в которой хранится ссылка на массив данных arraySize, в arraySize в свою очередь хранится ссылка на
            // объект Random, который обращается к методу nextInt, в котором заданы значения 98 + 3. Т.е. таким образом
            //через ссылки мы просто обращаемся к сумме 98+3
            oneDimensionArray[i] = random.nextInt(); // через [] обращаемся к элементу массива i, через оператор
            //присваивания присваиваем ему значение ссылаясь опять же на ссылку random, т.е. через ссылки мы снова
            //обращаемся к сумме 98 + 3?
        }

        int negativePosition = random.nextInt(arraySize); // объявили переменную примит типа, через ссылки также присвоили
        // какое то значение в сумме чисел от 98+3
        while (oneDimensionArray[negativePosition] >= 0) { //дословно: пока в массиве данных 98 + 3 переменная
            // negativePosition будет больше 0,...
            oneDimensionArray[negativePosition] = random.nextInt(); // negativePosition присваивается новое число из
            // массива данных 98 + 3
        }

        int positivePosition = random.nextInt(arraySize); // объявили переменную примит типа, через ссылки также присвоили
        // какое то значение в сумме чисел от 98+3
        while (positivePosition == negativePosition) { // пока присвоенное переменной positivePosition число  равно
            // числу присвоенному negativePosition
            positivePosition = random.nextInt(arraySize);// positivePosition присваивается новое число в массиве данных
            // 98 + 3
        }
        while (oneDimensionArray[positivePosition] <= 0) {//дословно: пока в массиве данных 98 + 3 переменная
            // positivePosition будет меньше 0,...
            oneDimensionArray[positivePosition] = random.nextInt();// присваивается другое число
        }

        int zeroPozition = random.nextInt(arraySize); // объявили переменная примитивного типа данных, ей присваевается
        //значение массива 98 + 3
        while (zeroPozition == positivePosition || zeroPozition == negativePosition) {
            zeroPozition = random.nextInt(arraySize); // если хотя бы zeroPozition == positivePosition,
            // то zeroPozition присваивается число из массива данных 98 + 3
        }
        oneDimensionArray[zeroPozition] = 0; // задаем переменной массива zeroPozition значение 0

        return oneDimensionArray;
    }

}
