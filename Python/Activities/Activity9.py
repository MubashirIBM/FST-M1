listOne = [10, 20, 23, 11, 17]
listTwo = [13, 43, 24, 36, 12]

print("First list: ",listOne)
print("Second list: ",listTwo)

listThree = []

for num in listOne:
    if num % 2 != 0:
        listThree.append(num)

for num in listTwo:
    if num % 2 == 0:
        listThree.append(num)
print("The result is: ", listThree)
