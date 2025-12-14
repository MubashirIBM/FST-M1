num_tuple = input("enter").split(',')
print("Given list is: ", num_tuple)

for num in num_tuple:
    if(int(num) % 5 ==0):
        print(num)