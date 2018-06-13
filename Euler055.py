
def is_pal_int(n):
    return n == int(str(n)[::-1])

def not_lychrel(n):
    for i in range(1, 50):
        test = n + int(str(n)[::-1])
        if is_pal_int(test):
            return False
        else:
            n = test
    return True

count = 0
for n in range(1, 10000):
    if not_lychrel(n): count += 1


print(count)
