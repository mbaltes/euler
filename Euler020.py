import math


def euler020():
    sum = 0
    n = math.factorial(100)
    while n > 0:
        sum += n % 10
        n = n // 10
    return sum


print euler020()