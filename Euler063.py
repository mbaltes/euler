import math


count = 0
for i in range(1, 22):
    for j in range(1, 10):
        if len(str(int(math.pow(j, i)))) == i:
            count += 1


print(count)
