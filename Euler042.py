"""
Project Euler Problem 042
The nth term of the sequence of triangle numbers is given by, tn = ½n(n+1); so 
the first ten triangle numbers are:

1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...

By converting each letter in a word to a number corresponding to its 
alphabetical position and adding these values we form a word value. For example,
the word value for SKY is 19 + 11 + 25 = 55 = t10. If the word value is a 
triangle number then we shall call the word a triangle word.

Using words.txt (right click and 'Save Link/Target As...'), a 16K text file 
containing nearly two-thousand common English words, how many are triangle 
words?

Note: The related file is Euler042.txt in this directory.

"""

import string  # For string.ascii_uppercase

# Forming a set of triangle numbers for constant time inclusion check in euler42().
tri_nums = set()
for n in range(1, 3000):
    tri_nums.add(0.5*n*(n+1))


def get_name_score(s):
    """
    Returns the word value of given string. Word value is defined in this files 
    header comment.

    """
    return sum(string.ascii_uppercase.index(c) + 1 for c in s)


def euler42(file):
    count = 0
    with open(file) as f:
        names = f.read().replace('"', '').split(',')
        for name in names:
            if get_name_score(name) in tri_nums:
                count += 1
    return count


print(euler42("Euler042.txt"))
