def is_more_then_seven(number: str) -> str:
    """
    Проверяет, является ли введенное значение числом и больше ли чем 7
    """
    try:
        if int(number) > 7:
            return 'Привет'
    except ValueError:
        print('*' * 50)
        print('input isn\'t int')
        return 'input isn\'t int'


def is_correct_name(name: str) -> str:
    """
    Проверяет, является ли введенное имя = "Вячеслав" независимо от регистра
    """
    if name.lower() == 'вячеслав':
        return 'Привет, Вячеслав'
    else:
        return 'Нет такого имени'


def get_multiples_three(arr: list[int]):
    """
    Фильтрует исходный массив и возвращает значения кратные 3,
    работает даже если массив не однороден и содержит не только числа
    """
    for i in arr:
        try:
            if int(i) % 3 == 0 and i != 0:
                yield i
        except ValueError:
            print(f'elem {i} isn\'t int')
