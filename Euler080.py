from decimal import Decimal, getcontext
import math


getcontext().prec = 102         # set precision


def get_num_as_str(n):
    s = str(Decimal(n).sqrt())
    return s[:101]


def sum_str(s):
    s = s.replace('.', '')
    return sum(int(s[i]) for i in range(len(s)))


total = 0
for i in range(101):
    if math.sqrt(i) % 1 != 0:
        total += sum_str(get_num_as_str(i))


print(total)
