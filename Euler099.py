import math


with open('Euler099.txt') as f:
    largest, found = 0, 0
    count = 1
    for line in f:
        num = line.split(',')
        base, exponent = int(num[0]), int(num[1])
        temp = exponent * math.log(base, 2)
        if temp > largest:
            largest = temp
            found = count
        count += 1
    print(found, largest)
