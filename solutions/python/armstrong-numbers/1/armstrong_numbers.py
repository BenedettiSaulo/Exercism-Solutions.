def is_armstrong_number(number):
    str_number = str(number)
    num_digits = len(str_number)
    sum_of_powers = 0
    for digit in str_number:
        sum_of_powers += int(digit) ** num_digits
    return sum_of_powers == number
