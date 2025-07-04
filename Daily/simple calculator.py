print("Simple Calculator - Python\n")

print("What Calculation Do You Want to Perform?")
print("1. Addition")
print("2. Subtraction")
print("3. Multiplication")
print("4. Division")
print("5. Floor Division")
print("6. Modulo")
print("7. Exit Program\n")


# options list
def options_list():
    print("What Calculation Do You Want to Perform?")
    print("1. Addition")
    print("2. Subtraction")
    print("3. Multiplication")
    print("4. Division")
    print("5. Floor Division")
    print("6. Modulo")
    print("7. Exit Program\n")


calc_option = input(" ")

if (calc_option=="7") or (str.lower(calc_option)=="exit") or (str.lower(calc_option)=="exit program"):
    print("End of Calculator Program: Python")

else:
    while (calc_option != 7):

        ## ADDITION ##
        if (calc_option == "1") or (str.lower(calc_option) == "addition"):
            print("List all numbers that you want to add. Enter '0' when you are ready to calculate the result.")
            numAdd = 1 # initialize variable
            num_array1 = []

            # main loop: addition
            while numAdd != 0:
                numAdd = float(input(" "))
                num_array1.append(numAdd)
                if (numAdd == 0):
                    break
            print(" ") # space break
            
            # calculate & display equation
            addition_equation = ""
            for n in num_array1:
                if (n != 0):
                    addition_equation = addition_equation + str(n) + " + "
                elif (n == 0):
                    addition_equation = addition_equation + "0.0 = "
            print (addition_equation + str(sum(num_array1)) + "\n")

            options_list()
            calc_option = input(" ")
        


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

            print (subtraction_equation + str(difference) + "\n")

            options_list()
            calc_option = input(" ")


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
                    multiplication_equation = multiplication_equation + str(n) + " x "
                elif (n == 1):
                    multiplication_equation = multiplication_equation + "1 = "

            # calculate
            firstNum = num_array3[0]
            product = firstNum
            num_array3.remove(product)
            for n in num_array3:
                product = product * n

            print(multiplication_equation + str(product) + "\n")

            options_list()
            calc_option = input(" ")


        ## DIVISION ##
        if (calc_option == "4") or (str.lower(calc_option) == "division"):
            print("List all numbers that you want to divide. Enter '1' when you are ready to calculate the result.")
            numDivide = 0
            num_array4 = []

            # main loop: division
            while (numDivide != 1):
                numDivide = float(input(" "))
                num_array4.append(numDivide)

            # display equation
            division_equation = ""
            for n in num_array4:
                if (n!=1):
                    division_equation = division_equation + str(n)  + " / "
                elif (n==1):
                    division_equation = division_equation + "1 = "

            # calculations
            firstNumber = num_array4[0]
            quotient = firstNumber
            num_array4.remove(firstNumber)
            for n in num_array4:
                quotient = quotient / n

            print(division_equation + str(quotient) + "\n")

            options_list()
            calc_option = input(" ")



        ## FLOOR DIVISION ##
        if (calc_option == "5") or (str.lower(calc_option) == "floor division"):
            print("List all numbers that you want to floor divide. Enter '1' when you are ready to calculate the result.")

            numDivideF = 0
            num_array5 = []

            # main loop: division
            while (numDivideF != 1):
                numDivideF = float(input(" "))
                num_array5.append(numDivideF)

            # display equation
            floorDiv_equation = ""
            for n in num_array5:
                if (n!=1):
                    floorDiv_equation = floorDiv_equation + str(n)  + " // "
                elif (n==1):
                    floorDiv_equation = floorDiv_equation + "1 = "

            # calculations
            startNum = num_array5[0]
            quotient1 = startNum
            num_array5.remove(startNum)
            for n in num_array5:
                quotient1 = quotient1 // n

            print(floorDiv_equation + str(quotient1) + "\n")

            options_list()
            calc_option = input(" ")


        ## MODULO ##
        if (calc_option == "6") or (str.lower(calc_option) == "modulo"):
            print("List two (2) numbers that you want to find the modulo of.")

            num2 = float(input(" "))
            num3 = float(input(" "))

            # calculations
            quotient2 = num2 % num3

            # display equation
            modulo_equation = str(num2) + " % " + str(num3) + " = " + str(quotient2)
            print(modulo_equation + "\n")

            options_list()
            calc_option = input(" ")

            
    print("End of Calculator Program: Python")
