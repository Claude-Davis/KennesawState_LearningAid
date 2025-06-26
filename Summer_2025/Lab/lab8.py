# Starlan Davis
# Lab #8
# Due: 1 July 2025
# Purpose: a program that will combine two integer arrays into one larger array and remove any duplicate values.
# Resources: CSE 1321

# import Python method to allow for random number generation
import random


n = int(input("Enter a number greater than '1': "))

# create 2 arrays (size 'n') of numbers 0 to 500
arr0 = [] * n
arr1 = [] * n

# create random numbers to add to the arrays
loop = 0
while loop != n:
    x = random.randint(0, 500)
    y = random.randint(0, 500)

    arr0.append(x)
    arr1.append(y)

    loop += 1

print(arr0)
print(arr1)

# create 3rd array; ensure no duplicates
arr = []
for a in arr0:
    arr.append(a)

for a in arr1:
    if a not in arr:
        arr.append(a)

print(arr)

# sort in descending order
final_array = []


