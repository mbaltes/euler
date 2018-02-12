def sieve_of_eratosthenes(max_integer):
    sieve = [True for _ in range(max_integer + 1)]
    sieve[0:1] = [False, False]
    for start in range(2, max_integer + 1):
        if sieve[start]:
            for i in range(2 * start, max_integer + 1, start):
                sieve[i] = False
    primes = []
    for i in range(1000, max_integer + 1): # 1000 value is where the primes start
        if sieve[i]:
            primes.append(i)
    return primes

# This version uses a set to hold the primes.
def sieve_of_eratosthenes_set(max_integer):
    sieve = [True for _ in range(max_integer + 1)]
    sieve[0:1] = [False, False]
    for start in range(2, max_integer + 1):
        if sieve[start]:
            for i in range(2 * start, max_integer + 1, start):
                sieve[i] = False
    primes = set()
    for i in range(1000, max_integer + 1): # 1000 value is where the primes start
        if sieve[i]:
            primes.add(i)
    return primes


