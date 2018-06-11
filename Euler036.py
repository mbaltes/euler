def is_pal_int(num):
    return str(num) == str(num)[::-1]


def is_pal_str(str):
    str = str.replace("0b", "")
    return str == str[::-1]


print(sum(n for n in range(1, 1000000) if is_pal_int(n) and is_pal_str(bin(n))))
