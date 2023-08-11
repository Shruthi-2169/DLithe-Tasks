n,m = int(input().split())
l1 = []
l2 = []
for i in range(n):
    l1.append(int(input()))
for j in range(m):
    l2.append(int(input()))
print(addArrays(l1,l2))

def addArrays(l1,l2):
    for num1 in l1:
        num1 = num1 * 10 + num1
    for num2 in l1:
        num2 = num2 * 10 + num2
    sum = num1 + num2
    res = []
    while 
        res.append(sum)
    return res