from itertools import permutations


def euler43():
    #n = '1406357289'
    ssum = 0
    n = [''.join(p) for p in permutations('0123456789')]
    divisors = [2, 3, 5, 7, 11, 13, 17]
    for term in n:
        tester = True
        x, y = 1, 4
        while x < 8:
            #print(int(n[x:y]))
            if int(term[x:y]) % divisors[x-1] != 0:
                tester = False
                break
            x += 1
            y +=1
        if tester:
            ssum += int(term)
    print(ssum)

euler43()
