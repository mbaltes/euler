# Takes around 2 minutes.
# Same implementation in C++ is around 15s!


def euler092():
    count = 0
    for i in range(1, 10000000):
        #temp = square_of_digits(i)
        temp = i
        while temp != 1 and temp != 89:
            temp = square_of_digits(temp)
        if temp == 89:
            count += 1
    return count


def square_of_digits(n):
    res = 0
    while n > 0:
        #res = res + ((n % 10)**2)
        res = res + (n % 10)*(n % 10)
        n = n // 10
    return res


print(euler092())
