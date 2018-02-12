from eratosthenes import sieve_of_eratosthenes_set


def euler35():
    count = 0
    primes = sieve_of_eratosthenes_set(1000000)

    for n in primes:
        rotation = make_rotation(n)
        tester = True
        for num in rotation:
            if num not in primes:
                tester = False
                break
        if tester:
            count += 1
    print(count)


def rotate(l, n):
    return l[n:] + l[:n]


def make_rotation(n):
    newlist = list()
    nlist = list(str(n))
    for x in range(len(nlist)):
        newlist.append(int(''.join(map(str,rotate(nlist,x)))))
    return newlist


euler35()
