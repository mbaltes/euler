def e052():
    for i in range(1, 200000):
        tmp = sorted(str(i))

        if sorted(str(i * 2)) != tmp:
            continue
        if sorted(str(i * 3)) != tmp:
            continue
        if sorted(str(i * 4)) != tmp:
            continue
        if sorted(str(i * 5)) != tmp:
            continue
        if sorted(str(i * 6)) != tmp:
            continue

        return i   


print(e052())


# Set version
# def e052():
#     for i in range(1, 200000):
#         s = set()
#         s.add(''.join(sorted(str(i))))

#         if ''.join(sorted(str(i * 2))) not in s:
#             continue
#         if ''.join(sorted(str(i * 3))) not in s:
#             continue
#         if ''.join(sorted(str(i * 4))) not in s:
#             continue
#         if ''.join(sorted(str(i * 5))) not in s:
#             continue
#         if ''.join(sorted(str(i * 6))) not in s:
#             continue

#         return i