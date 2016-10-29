# Project Euler Problem: 017

# If the numbers 1 to 5 are written out in words: one, two, three, four, five, 
# then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.

# If all the numbers from 1 to 1000 (one thousand) inclusive were written out in 
# words, how many letters would be used?

# NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two) 
# contains 23 letters and 115 (one hundred and fifteen) contains 20 letters. The 
# use of "and" when writing out numbers is in compliance with British usage.

# Completed 2016/10/29

num_names = {1: 'one', 2: 'two', 3: 'three', 4: 'four', 5: 'five', 6: 'six', 
             7: 'seven', 8: 'eight', 9: 'nine', 10: 'ten', 11: 'eleven', 
             12: 'twelve', 13: 'thirteen', 14: 'fourteen', 15: 'fifteen', 
             16: 'sixteen', 17: 'seventeen', 18: 'eighteen', 19: 'nineteen', 
             20: 'twenty', 30: 'thirty', 40: 'forty', 50: 'fifty', 60: 'sixty', 
             70: 'seventy', 80: 'eighty', 90: 'ninety'}


# I really don't like lots of ifs and elifs like this. Think about another way.
def num_to_word(n):
    """ For 1 <= n <= 1000 returns string name for given number. """
    if n < 20:
        return num_names[n]
    elif n < 100 and n % 10 == 0:
        return num_names[n]
    elif n < 100:
        tens_place = (n // 10) * 10
        return num_names[tens_place] + '-' + num_names[n % 10]
    elif n < 1000 and n % 100 == 0:
        return num_names[n // 100] + ' hundred'
    elif n < 1000:
        hundreds_place = n // 100
        ones_place = n % 10
        tens_place = (n % 100) - ones_place
        if tens_place < 20:
            return num_names[hundreds_place] + ' hundred and ' + num_names[ones_place + tens_place]
        elif tens_place % 10 == 0 and ones_place == 0:
            return num_names[hundreds_place] + ' hundred and ' + num_names[tens_place]
        else:
            return num_names[hundreds_place] + ' hundred and ' + num_names[tens_place] + '-' + num_names[ones_place]
    else:
        return 'one thousand'


def letter_count(x):
    """ Sums the amount of letters used in counting from 1 to x using English words. """
    sum = 0
    for n in range(1, x):
        # str.translate method creates copies of strings each time called. I 
        # don't like this with immutable strings. Added with the bit of Python 
        # hackery at the end makes this really meh. Think about another way to 
        # do this.
        temp = num_to_word(n).translate({ord(c): None for c in ' -'})
        sum += len(temp)
    print(sum)

letter_count(1001)




