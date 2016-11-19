def euler13(f):
    with open(f) as f:
        return sum(long(n) for n in f)


print euler13('Euler013.txt')