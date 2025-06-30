print("Simple Calculator - Python\n")

print("What Do Calculation Do You Want to Perform?")

# options list
print("1. Addition")
print("2. Subtraction")
print("3. Multiplication")
print("4. Division")
print("5. Floor Division\n")

calc_option = input(" ")


## ADDITION ##
if (calc_option == "1") or (str.lower(calc_option) == "addition"):
    print("List all numbers that you want to add. Enter '0' when you are ready to calculate the result.")
    numAdd = 1 # initialize variable
    num_array1 = []

    # main loop: addition
    while numAdd != 0:
        numAdd = float(input(" "))
        num_array1.append(numAdd)
    print(" ") # space break
    
    # calculate & display equation
    addition_equation = ""
    for n in num_array1:
        if (n != 0):
            addition_equation = addition_equation + str(n) + " + "
        elif (n == 0):
            addition_equation = addition_equation + "0.0 = "
    print (addition_equation + str(sum(num_array1)))


## SUBTRACTION ##
if (calc_option == "2") or (str.lower(calc_option) == "subtraction"):
    print("List all numbers that you want to subtract. Enter '0' when you are ready to calculate the result.")
    numSubtract = 1 # initialize variable
    num_array2 = []

    # main loop: subtraction
    while numSubtract != 0:
        numSubtract = float(input(" "))
        num_array2.append(numSubtract)
    print(" ") # space break
    
    # display equation
    subtraction_equation = ""
    for n in num_array2:
        if (n != 0):
            subtraction_equation = subtraction_equation + str(n) + " - "
        elif (n == 0):
            subtraction_equation = subtraction_equation + "0.0 = "

    # calculate equation
    firstN = num_array2[0]
    difference = firstN
    num_array2.remove(firstN)
    for n in num_array2:
        difference -= n

    print (subtraction_equation + str(difference))


## MULTIPLICATION ##
if (calc_option == "3") or (str.lower(calc_option) == "multiplication"):
    print("List all numbers that you want to multiply. Enter '1' when you are ready to calculate the result.")
numMultiply = 0
num_array3 = []

# main loop: multiplication
while (numMultiply != 1):
    numMultiply = float(input(" "))
    num_array3.append(numMultiply)

# display equation
multiplication_equation = ""
for n in num_array3:
    if (n != 1):
        multiplication_equation = multiplication_equation = str(n) + " x "
    elif (n == 1):
        multiplication_equation = multiplication_equation + "x 1 = "

# calculate
firstNum = num_array3[0]
product = firstNum
num_array3.remove(product)
for n in num_array3:
    product = product * n
