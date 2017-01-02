# Works but needs to be more efficient. 

def is_abundant(n):
    sum = 0
    for i in range(1, n):
        if n % i == 0:
            sum += i
    return sum > n


def make_abundant_list(n):
    l = []
    for i in range(1, n):
        if is_abundant(i):
            l.append(i)
    return l


def set_of_abundant_num_sums(l):
    sum_set = set()
    i = 0
    while i < len(l):
        for j in range(i, len(l)):
            sum_set.add(l[i] + l[j])
        i += 1
    return sum_set


def euler23(s):
    sum = 0
    for i in range(1, 28124):
        if i not in s:
            sum += i
    return sum

l = make_abundant_list(28124)
s = set_of_abundant_num_sums(l)
print(euler23(s))