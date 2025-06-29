print("Simple Calculator - Python\n")

print("What Do Calculation Do You Want to Perform?")

# options list
print("1. Addition")
print("2. Subtraction")
print("3. Multiplication")
print("4. Division")
print("5. Floor Division\n")

calc_option = input(" ")

if (calc_option == "1") or (str.lower(calc_option) == "addition"):
    print("List all numbers that you want to add. Enter '0' when you are ready to calculate the result.")
    num = 1 # initialize variable
    num_array = []

    # main loop: addition
    while num != 0:
        num = float(input(" "))
        num_array.append(num)
    print(" ") # space break
    
    # display equation
    for n in num_array:
        print(str(n) + " + ")
    
    print (" 0 = " + str(sum(num_array)))



if (calc_option == 2) or (str.lower(calc_option) == "subtraction"):
    //
if (calc_option == 3) or (str.lower(calc_option) == "multiplication"):
    //
if (calc_option == 4) or (str.lower(calc_option) == "division"):
    //
if (calc_option == 5) or (str.lower(calc_option) == "floor division"):