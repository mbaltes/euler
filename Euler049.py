from eratosthenes import sieve_of_eratosthenes_set


def euler49():
    prime_set = sieve_of_eratosthenes_set(9999)

    for n in prime_set:
        a = n
        b = a + 3330
        c = b + 3330
        if a in prime_set and b in prime_set and c in prime_set:
            d = sorted(str(a))
            e = sorted(str(b))
            f = sorted(str(c))
            if d == e and e == f:
                print(str(a) + str(b) + str(c))


euler49()
