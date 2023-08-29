# This is a sample Python script.
from utils import is_more_then_seven, is_correct_name, get_multiples_three

# Press Shift+F10 to execute it or replace it with your code.
# Press Double Shift to search everywhere for classes, files, tool windows, actions, and settings.


# Задание №1
print(is_more_then_seven(input('введите число: ')))

# Задание №2
print(is_correct_name(input('введите имя: ')))

# Задание №3
array = [value for value in input('введите последовательность чисел, разделяя их пробелом: ').split()]

for i in get_multiples_three(array):
    print(i)

# Задание №4
# [((())()(())]] нет, она не правильна
# Пример исправленной последовательности
# [((())()(()))]
