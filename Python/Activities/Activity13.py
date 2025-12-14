def calculate_sum(numbers):
    sum = 0
    for number in numbers:
        sum += number
    return sum

numList = [10,23,27,18,98]
result = calculate_sum(numList)
print("Sum of all elements is: " + str(result))