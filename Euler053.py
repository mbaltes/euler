from math import factorial as f

def nCr(n, r):
    return f(n) // f(r) // f(n-r)


s = 0
for i in range(1,101):
    for j in range(i, 0, -1):
        if nCr(i, j) > 1000000:
            s += 1


print(s)
