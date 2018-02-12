def euler29():
    n = 100
    ans_set = set()
    for i in range(2, n+1):
        for j in range(2, n+1):
            ans_set.add(i ** j)
    print(len(ans_set))


euler29()
