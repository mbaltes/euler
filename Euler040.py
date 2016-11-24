def euler40():
    temp = []
    for n in range(1, 1000001):
        temp.append(str(n))
    champ = ''.join(temp)
    return int(champ[0])*int(champ[9])*int(champ[99])*int(champ[999])*int(champ[9999])*int(champ[99999])*int(champ[999999])


print euler40()