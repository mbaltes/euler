from itertools import permutations

def euler38():
    n = [''.join(p) for p in permutations('123456789')]
    ns = set(n)
    results = []
    for x in range(2, 10000):
        case = ''
        for y in range(1, 50):
            case += str(x*y)
            if case in ns:
                results.append(case)
    print(max(results))


euler38()
