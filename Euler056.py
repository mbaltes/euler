def sum_of_digits(n):
    res = 0
    while n > 0:
        res += n % 10
        n = n // 10
    return res


def euler():
    largest = 0
    for i in range(100):
        for j in range(100):
            largest = max(sum_of_digits(i ** j), largest)
    return largest


print(euler())
