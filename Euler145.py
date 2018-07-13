# Brute forcing this takes 22 mins on my machine.


def is_reversible(n):
    rev = str(n)[::-1]
    if rev[0] == '0':
        return False

    return is_odd_digits(n + int(rev))


def is_odd_digits(n):
    while n > 0:
        if (n % 10) % 2 == 0:
            return False
        n = n // 10
    return True


def euler():
    count = 0
    for i in range(1000000000):
        if is_reversible(i):
            count += 1
    return count


print(euler())
