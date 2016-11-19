def get_sum(n):
    '''Raises each digit of n to the 5th power and sums them.'''
    sum = 0
    while n > 0:
        sum += (n % 10) ** 5
        n = n // 10
    return sum


def euler30():
    sum = 0
    for n in range(2, 200000):  # Found upper bound by trial and error.
        if n == get_sum(n):
            print n
            sum += n
    return sum


print 'Sum: %d' % euler30()