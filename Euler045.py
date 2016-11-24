def t(n):
    return n*(n+1) / 2


def p(n):
    return n*(3*n-1) / 2


def h(n):
    return n*(2*n-1)


def euler45():
    pentagonal = set()
    hexagonal = set()
    # Fill sets.
    for n in range(2, 286):
        pentagonal.add(p(n))
        hexagonal.add(h(n))
    # Find next solution, guessing upper bound.
    for n in range(286, 100000):
        pentagonal.add(p(n))
        hexagonal.add(h(n))
        curr = t(n)
        if curr in pentagonal and curr in hexagonal:
            return curr
    return False


print euler45()