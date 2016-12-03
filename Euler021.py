# https://projecteuler.net/problem=21

import math


def d(n):
    """
    Returns the sum of the proper divisors of a number.
    This can be made more efficient, but works for now.

    """
    return sum(x for x in range(1, n) if n % x == 0)


def amicable_sum(n):
    """Sums all amicable numbers < n."""
    total = 0
    for a in range(1, n):
        b = d(a)
        if d(b) == a and a != b:
            total += a
    return total


print amicable_sum(10000)
